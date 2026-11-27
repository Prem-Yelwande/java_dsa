# java_dsa

I am an ML Engineer and a Django Backend Developer. This repository documents my journey of mastering Data Structures & Algorithms (DSA) through consistent problem solving in Java.

## About This Repository

This repository is not only for tracking my progress — it is also designed to help beginners understand Java for DSA from the ground up.

## How to Explore

- Browse the `src` folder for solved problems organised by topic.
- Each solution aims to be readable and well-commented so beginners can follow along.
- Feel free to use the code as a learning resource or as a starting point for your own practice.

## Suggested Structure

When adding new problems, consider organizing them as:
- `src/arrays/`
- `src/strings/`
- `src/trees/`
- `src/graphs/`
- `src/dynamic_programming/`

Keep class names descriptive (e.g. `TwoSum.java`, `BinaryTreeTraversal.java`).

## How to Compile and Run

From the repository root:

```bash
javac src/Main.java
java -cp src Main
```

If you add more `.java` files later, compile them all with `javac src/*.java` (or specify each file) and run with the same classpath.

To compile and run a specific file that contains its own `main` method (for example a problem under `src/arrays/TwoSum.java`):

```bash
javac src/arrays/TwoSum.java
java -cp src arrays.TwoSum   # adjust package/class name as needed
```

**Tip:** For a better development experience, use an IDE such as IntelliJ IDEA (Community Edition is free) which provides excellent Java support, code completion, and debugging.

## Tips for Practice

- Start with easy problems and gradually move to medium/hard.
- Write your own test cases before looking at the solution.
- Comment the time and space complexity of each solution (e.g. O(n) time, O(1) space).
- Practice consistently; even 1-2 problems a day builds strong fundamentals.
- Review edge cases carefully (empty inputs, single elements, large values).
- After solving, try to optimize further or explore alternative approaches.

## Resources

- [LeetCode](https://leetcode.com/) — excellent for practice problems.
- [GeeksforGeeks](https://www.geeksforgeeks.org/) — detailed explanations and Java examples.
- [Java Documentation](https://docs.oracle.com/en/java/) — official language reference.

Happy coding!
