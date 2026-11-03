# Zerio Client — (decompiled)

Decompiled Java sources of the **Zerio Client** Fabric mod (`ZerioClientCracked.jar`),
produced with [CFR](https://github.com/leibnitz27/cfr).

## What's here

- `src/main/java` — 418 decompiled classes (`z/`, `leakestan/`, `dev/jnic/`),
  plus resources (`fabric.mod.json`, mixin configs, access widener)

## Notes on completeness

This jar is heavily obfuscated (commercial protector, JNIC bootstrapper,
MethodHandle-heavy control flow). Of ~726 classes, 418 decompiled — the rest
use constructs CFR cannot structure (see `summary.txt` from the decompiler run).
That's an inherent limit of the tooling on protected jars, not a redaction.
Names are the jar's own obfuscated identifiers (`z.*`, `aaaa…`).

Not buildable as-is; Gradle files are a reconstruction skeleton.

## Purpose

Reference and auditing. All rights belong to the original authors.
