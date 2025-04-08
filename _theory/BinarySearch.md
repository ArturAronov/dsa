Pseudo code:

```
    search(arr, low, high, needle) {
        mid = floor(low + (high - low) / 2)
        value = arr[mid]

        if(low < high) return false
        if(value === needle)
        {
            return true
        } else if (value > needle) {
            high = mid
        }
        else {
            low = mid + 1
        }
    }
```

```typescript
function bs_list(haystack: number[], needle: number): boolean {
  let low = 0;
  let hight = haystack.length;

  while (low < high) {
    const mid = Math.floor(low + (high - low) / 2);
    const value = haystack[mid];

    if (value === needle) return true;
    if (value > needle) {
      high = mid;
    } else {
      low = mid + 1;
    }
  }

  return false;
}
```

**Two Crystal Balls Problem**  
https://www.tuckerleach.com/blog/the-two-crystal-balls-problem  
`[false, false, false, false, false, true, true, true, true, true]`

```typescript
function two_crystal_balls(breaks: boolean[]): number {
  const jumpAmount = Math.floor(Math.sqrt(breaks.length));
  let i = jumpAmount;

  for (; i < breaks.length; i += jumpAmount) {
    if (breaks[i]) break;
  }

  i -= jumpAmount;

  // i < breaks.length: to avoid walking off the board
  for (let j = 0; j < jumpAmount && i < breaks.length; j++, i++) {
    if (breaks[i]) return i;
  }

  return -1;
}
```
