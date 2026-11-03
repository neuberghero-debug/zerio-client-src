# Zerio Client — (decompiled)

Decompiled Java sources of the **Zerio Client** Fabric mod (`ZerioClientCracked.jar`),
produced with [CFR](https://github.com/leibnitz27/cfr).

## What's here

- `src/main/java` — 418 decompiled classes (`z/`, `leakestan/`, `dev/jnic/`),
  plus resources (`fabric.mod.json`, mixin configs, access widener)

## Features

Fully obfuscated release (`z/*`, `dev.jnic` protector stubs, native JNIC loader).
The decompiled tree is partial — many methods were too obfuscated for CFR to
structure; see `summary.txt` in the source root for per-method failures.

## Requirements

- JDK 21+ (Minecraft 1.21.x runtime baseline — bytecode targets `--release 21`)
- Fabric Loader ≥ 0.16, Fabric API, Yarn `1.21.11+build.1`

## Notes on completeness

This jar is heavily obfuscated (commercial protector, JNIC bootstrapper,
MethodHandle-heavy control flow). Of ~726 classes, 418 decompiled — the rest
use constructs CFR cannot structure (see `summary.txt` from the decompiler run).
That's an inherent limit of the tooling on protected jars, not a redaction.
Names are the jar's own obfuscated identifiers (`z.*`, `aaaa…`).

Not buildable as-is; Gradle files are a reconstruction skeleton.

## Purpose

Reference and auditing. All rights belong to the original authors.
