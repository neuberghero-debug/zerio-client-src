# Zerio Client

Decompiled sources of the Zerio Client Fabric mod for Minecraft 1.21.11.

## Status

These sources were produced by decompiling the released jar with
[CFR](https://www.benf.org/other/cfr/) (the jar ships obfuscated;
roughly 58% of classes decompile, the rest fails at the control-flow
level). They are provided
for reference and auditing purposes. Decompiled code does not compile
cleanly out of the box — names are synthetic, some constructs need manual
cleanup, and bundled libraries are not separated.

## Layout

- `src/main/java` — decompiled Java sources
- `src/main/resources` — assets, mixins config, fabric.mod.json
- `build.gradle` / `gradle.properties` — standard Fabric Loom skeleton
  as a starting point for reconstruction
