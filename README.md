# RClasses
Random collection of Java classes and utils

## Contact
If you encounter any issues, please report them on the
[issue tracker](https://github.com/FlorianMichael/RClasses/issues).  
If you just want to talk or need help with RClasses feel free to join my
[Discord](https://discord.gg/BwWhCHUKDf).

## How to add this to your project
Just copy this part to your *build.gradle*:
```groovy
repositories {
    maven {
        name = "Jitpack"
        url = "https://jitpack.io"
    }
}

dependencies {
    implementation "com.github.FlorianMichael:RClasses:1.0.0"
}
```

## Source tree
```
de.florianmichael.rlcasses
    /mappings - Converter for colors, keyboard formats and other standardized systems
    /math     - Implementation of mathematical concepts and general formulas such as percentage calculation or stochastics
    /model    - General valid model like color models or functions
    /sio      - Stream Input Output stuff that works with the Java STD
    /storage  - Concept of a general registry that manages itself
    /type     - Implementation of own STD types like throwable functional interfaces
    *Utils    - Different utils for a specific topic/area
```
