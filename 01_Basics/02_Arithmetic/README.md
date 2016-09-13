# Learn By Cloning
## Lesson: Basics
## Lab: 02

### Goal:
- Understand how Java handles arithmetic
- Understand the different mathematical operators
    - `a * b`: multiply `a` by `b`
    - `a / b`: divide `a` by `b`
    - `a % b`: compute the remainder when dividing `a` by `b`
    - `a + b`: add `a` and `b`
    - `a - b`: subtract `b` from `a`
- Understand the different relational operators
    - `a == b`: gets if `a` is equal to `b`
    - `a != b`: gets if `a` is not equal to `b`
    - `a > b`: gets if `a` is greater than `b`
    - `a >= b`: gets if `a` is greater than or equal to `b`
    - `a < b`: gets if `a` is less than `b`
    - `a <= b`: gets if `a` is less than or equal to `b`
- Understand the different logical operators
    - `a && b`: gets if `a` AND `b` is `true`, otherwise returns `false`
    - `a || b`: gets if either `a` OR `b` is `true`, otherwise returns `false`
    - `!a`: gets the opposite of `a` (if `a` is `true`, `!a` is `false`, and vice versa)
- Understand the different assignment operators
    - `a = b`: sets `a`'s value to `b`
    - `a [op]= b` is the same as `a = a [op] b`, but not for logical operators!
- (Bonus) Understand the different bitwise operators
    - `a & b`: perform a bitand on `a` and `b`
    - `a | b`: perform a bitor on `a` and `b`
    - `a ^ b`: perform a bitxor on `a` and `b`
    - `~a`: flips all bits in `a` (`0` becomes `1` and vice-versa)
    - `a >> b`: bitshift `a` by `b` bits to the right (also known as integer division by `2 ** b`)
    - `a >>> b`: bitshift `a` by `b` bits to the right (as above, but zero-filling left-most bits)
    - `a << b`: bitshift `a` by `b` bits to the left (also known as multiplication by `2 ** b`)

### What you need to do:
- Research the order of operation of Java operators
- (Bonus) Research two's complement

### Quick Quiz:
- What is the difference between mathematical operators and relational operators?
- Why do bitwise operators only work on `byte`s, `short`s, `int`s, and `long`s?
- Mathematical Operators
    - What does `1.0 * 2` give?
    - What does `1 / 2` give?
    - What does `1.0 / 2.0` give?
    - What does `1 / 0` give?
    - What does `1.0 / 0.0` give?
    - What does `2 % 2` give?
- Logical Operators
    - What does `true && true` give?
    - What does `true && false` give?
    - What does `false && false` give?
    - What does `true || true` give?
    - What does `true || false` give?
    - What does `false || false` give?
    - What does `!true` give?
    - What does `!false` give?
- (Bonus) Bitwise Operators
    - What does `1 & 1` give?
    - What does `2 & 1` give?
    - What does `3 & 1` give?
    - What does `1 | 1` give?
    - What does `2 | 1` give?
    - What does `3 | 1` give?
    - What does `1 ^ 1` give?
    - What does `2 ^ 1` give?
    - What does `3 ^ 1` give?
    - What does `~0` give? Why?
    - What does `1 << 2` give? Why?
    - What does `4 >> 2` give? Why?
    - What does `~0 >>> 31` give? Why?

### Conclusion:
- You should understand now how the different operators work.