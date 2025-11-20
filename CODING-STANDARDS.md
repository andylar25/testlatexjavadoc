# Personal Java Coding Standards

> **Last Updated**: October 25, 2025

This document defines the **personal coding style** used across all Java projects. It is enforced via Eclipse formatter, Checkstyle (`Google Checks`), and `.editorconfig`.

---

## 1. Language & Compliance
- **Java Version**: `21` (inferred from context; no explicit compiler settings in this export, but aligned with previous)
- **Compiler Compliance**: Source, target, and release all set to `21`
- **Enable preview features**: Only when explicitly required (not enabled by default)

---

## 2. Formatting (Eclipse JDT)

| Rule | Setting |
|------|---------|
| **Indentation** | 2 spaces (no tabs); size=2 |
| **Line Width** | 100 (comments and code wrap at 100) |
| **Braces** | Same line (K&R style): `if (...) {`, `class X {`; end_of_line for all (blocks, methods, arrays, enums, records, etc.) |
| **Blank Lines** | <ul><li>2 between top-level types</li><li>1 after package</li><li>1 after imports</li><li>1 before methods/abstract methods</li><li>0 before fields/first class body</li><li>0 before new chunk/member type</li><li>0 between import groups/statement groups in switch</li></ul> |
| **Spaces** | <ul><li>After commas, operators (additive, bitwise, logical, etc.), colons, semicolons</li><li>Before/after lambda arrow</li><li>No space before `(` or `[`; inside empty parens/braces/brackets: no</li><li>After `@` in annotations: no</li></ul> |
| **Arrays** | `int[] arr = {1, 2, 3};` — no space after `{`, before `}`; wrap if needed (alignment=16) |
| **Annotations** | New line after `@Annotation` on types/fields/methods/locals/enum constants (insert); no new line on parameters/packages |
| **Javadoc** | <ul><li>Format all comments (Javadoc, block, line, HTML, source, header)</li><li>Line length: 100</li><li>New lines at boundaries and before root tags</li><li>No indent for params/root tags/descriptions; no clear blank lines</li><li>No separation between different tags/block tags</li><li>Preserve whitespace between code/line comments: false</li></ul> |

- **Compact Structures**: Compact else-if: true; guardian clause on one line: false
- **Keep on One Line**: Methods/records/constructors: if empty; loops/switches/lambdas/arrays: never
- **Alignment**: 16 for most (arguments, parameters, expressions, throws); 0 for some (enum constants, conditionals chain, method decl); wrap when necessary
- **Parentheses**: Common lines for most (method invocation/declaration, if/while, try, lambda, etc.)
- **On/Off Tags**: Enabled (`@formatter:off` / `@formatter:on`)

---

## 3. Code Style (Checkstyle: Google Java Style)

- **Naming**:
  - Classes: `UpperCamelCase`
  - Methods/Variables: `lowerCamelCase`
  - Constants: `UPPER_CASE_WITH_UNDERSCORES`
  - No prefixes/suffixes (e.g., no `mField`, `sInstance` — empty in settings)
- **Imports**:
  - No wildcard imports
  - Organize on save (inferred from context)
- **Modifiers**: Remove redundant
- **Javadoc**: Required for public APIs; format as per Eclipse

---

## 4. Code Cleanup (On Save)

- Inferred from context: Format source code, organize imports, add annotations, remove unused, convert to modern features (lambdas, var, etc.)
- Use `is` for boolean getters (true)
- Add `@Override` (true)

---

## 5. Static Analysis

- **SpotBugs/Checkstyle**: Not specified in this formatter export; assume max effort/medium reporting and Google Checks from workspace context

---

## 6. Editor & IDE

- **Font**: Consolas (inferred)
- **Auto-save/Build**: As per workspace
- **Tools**: Gradle/Git/Maven (inferred)

---

## 7. Example

```java
package com.example;

import java.util.List;

/**
 * Example class demonstrating coding standards.
 */
public class Example {

    private static final int MAX_SIZE = 100;

    private final String name;

    public Example(String name) {
        this.name = name;
    }

    public void process(List<String> items) {
        for (String item : items) {
            if (item != null && !item.isBlank()) {
                System.out.println(item.toUpperCase());
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }
}