---
name: Refactor / Technical Debt
about: This ensures refactoring work has a clear motive and isn't just "cleaning up."
title: "[Refactor]: "
labels: refactor
assignees: andylar25

---

**Why is this refactor necessary?**

**Which files/modules are affected?**

**What will the code look like afterwards?**

**Crucial: Test that nothing broke.**
- [ ] All existing unit tests still pass.
- [ ] Order creation flow works as expected in staging.
- [ ] The new code is correctly commented.

**Branch Convention**
refactor/xxx
