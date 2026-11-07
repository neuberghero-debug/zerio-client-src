# Zerio Client — (decompiled)

Zerio Client is a heavily obfuscated Fabric client for Minecraft 1.21.11.
The tree below is the released jar opened with CFR.

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

## Installation

Drop the release jar from the [Releases](../../releases) page into
`.minecraft/mods` (Fabric Loader ≥ 0.16, Fabric API, Minecraft 1.21.11).

## Requirements

- JDK 21+, Fabric Loader ≥ 0.16, Minecraft 1.21.11

## Building

Not buildable — obfuscated control flow and the missing native protector make a
rebuild impossible from this tree. Published for reference/audit only.

## Credits

All rights belong to the original authors.
