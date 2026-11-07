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

Notable parts that survived decompilation:

- `leakestan.Boot` — entrypoint/bootstrap
- `z.r` — core module and config classes
- `dev.jnic` — JNIC native-protector stubs (no natives shipped here)

## Requirements

- JDK 21+, Fabric Loader ≥ 0.16, Minecraft 1.21.11

## Building

Not buildable — obfuscated control flow and the missing native protector make a
rebuild impossible from this tree. Published for reference/audit only.

## Credits

All rights belong to the original authors.
