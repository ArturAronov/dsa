- Array is continuous memory space that are of single type.

- a + width of the type (in bytes) \* offset (`a[0]`).

  - a is the base address (let's say 1000)
  - width is 4 bytes for integers
  - offset is the index (0, 1, 2, etc.)

  ```
    int a[5] = {10, 20, 30, 40, 50};

    // a[0] = 1000 + (4 * 0) = 1000 → value 10
    // a[1] = 1000 + (4 * 1) = 1004 → value 20
    // a[2] = 1000 + (4 * 2) = 1008 → value 30
  ```

- Traditional array doesn't have push & pop. The values get re-assigned (no new memory is allocated or freed).

- const a = [] in not an array.
