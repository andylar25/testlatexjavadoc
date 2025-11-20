# Javadoc LaTeX Integration Test

## Overview

This is a test project documenting the modifications required in `build.gradle` to integrate LaTeX math into Javadoc. It consists of:

1. Modified `build.gradle`: See the section labeled **INTEGRATE MATHJAX FOR LATEX SUPPORT** inside the `javadoc` task.
2. `mathjax-header.html`: The HTML fragment containing the MathJax configuration script.
3. `ScientificCalc`: A test class demonstrating how to embed LaTeX equations into Javadoc comments.

## Key Configurations

### build.gradle

The build file has been updated to:

- Detect if the Java toolchain is JDK 18 or higher.
- Inject the `--allow-script-in-comments` flag to prevent Javadoc security errors.
- Read `mathjax-header.html` and inject it into the header of every generated Javadoc page.

### Java Version

- **Target**: Java 21
- **Toolchain**: Configured in `build.gradle`

## Usage

To generate the documentation with rendered LaTeX equations:

```bash
./gradlew javadoc
```

The output will be available at `build/docs/javadoc/index.html`.