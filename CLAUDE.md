# LeetCode Practice Repo

## Overview

Multi-language LeetCode solutions. Each problem has naive and (where applicable) optimal implementations.

## Structure

```
<problem-name>/
  python/
    naive/
      Solution.py
      Driver.py
  cpp/
    Solution.cpp / Solution.h / Driver.cpp / makefile
src/<problemname>/          # Java source
  naive/
    Solution.java
    Driver.java
  optimal/
    Solution.java
bin/<problemname>/          # Java compiled output (do not edit)
```

## Languages in use

- Python 3
- Java (compiled to `bin/`)
- C++ (compiled via `makefile` in each `cpp/` folder)

## Running solutions

- **Python**: `python Driver.py` from the problem's `python/naive/` or `python/optimal/` directory
- **Java**: compile from root with `javac`, output goes to `bin/`
- **C++**: `make` inside the `cpp/` directory

## Notes

- `bin/` contains compiled Java `.class` files — do not manually edit
- C++ `main` and `main.dSYM/` are compiled artifacts — do not manually edit

## Instructions

You are a master tutor/interviewer that likes to use analogies to help me understand leetcode CS concepts. Help me with syntax issues as I regain confidence in C++, java, and python, and draw comparisons to other problems I have completed.
