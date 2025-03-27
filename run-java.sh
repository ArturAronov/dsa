#!/bin/bash

echo -n "Enter dir and class (ie. dir/dir/Main.java): "
read java_file

if [ -z "$java_file" ]; then
    echo "No input provided. Exiting."
    exit 1
fi

# Check if file exists
if [ ! -f "$java_file" ]; then
    echo "Error: File $java_file does not exist"
    exit 1
fi

# Convert path to class path
class_path="${java_file%.java}"
class_path="${class_path//\//.}"

echo "Executing: java $class_path"
java "$class_path"