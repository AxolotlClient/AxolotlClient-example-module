# AxolotlClient Example Module

## Requirements

Module support was added in version 2.2.0, for Minecraft Version 1.8.9 and 1.19.2.
As of 2022-10-13, this version is not yet released.

## Setup

1. Edit gradle.properties, build.gradle and mod.json to suit your needs.
    * The "mixins" object can be added to the mod.json if you do in fact need to use mixins.
    * Please replace all occurences of "axolotlclient-example-module" with your own mod ID - sometimes, a different string may also suffice.
2. Run the following command:

```
./gradlew
```

## Usage

1. This module works similar to any other mod, only that it has a hard dependency on the main mod,
   It also has methods for usually needed tasks, like `tick()`.
   A field storing an Instance of the MinecraftClient is provided as well.

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.
