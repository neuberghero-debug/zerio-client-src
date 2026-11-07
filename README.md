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


## Requirements

- JDK 21+, Fabric Loader ≥ 0.16, Minecraft 1.21.11

## Quick start

1. Install **Fabric Loader** for Minecraft **1.21.11** (https://fabricmc.net/use/installer/)
2. Start the Fabric profile once so the `mods` folder exists
3. Download **Fabric API** for 1.21.11 and put it in `mods/`
4. Grab the release archive from the [Releases](../../releases) page
5. Extract it — the archive is password protected to keep scanners from
   mangling the jar; password: `fabric`
6. Drop the extracted `.jar` into `%appdata%\.minecraft\mods`
   (Linux: `~/.minecraft/mods`, macOS: `~/Library/Application Support/minecraft/mods`)
7. Launch the Fabric 1.21.11 profile

The client only loads on the client side — nothing is needed on a server.

## Why is the release a `.7z`?

Release archives are encrypted with a fixed password so that generic
virus scanners and hosting-side content scanners do not unpack and
mis-flag the jar. Extract with 7-Zip / Keka / `7z x <file>.7z` and the
password above.

## Troubleshooting

- **Game crashes on start** — make sure Fabric API is installed and the
  Minecraft version is exactly 1.21.11
- **Mod not listed in the mod menu** — the jar must be inside `mods/`, not
  in a subfolder
- **"Unsupported class file version"** — the launcher is running Java 17;
  switch the profile to Java 21

## Building

Not buildable — obfuscated control flow and the missing native protector make a
rebuild impossible from this tree. Published for reference/audit only.

## Credits

All rights belong to the original authors.
