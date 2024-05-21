# RClasses
Random collection of Java classes and utils in different submodules which together form a commons library

## Why another commons library?
I made this to prevent myself from copying pasting code from project to project, this repository contains random utils I need in my projects.

Note: This project is mainly for my own use, there won't be any deprecated methods and I won't guarantee any backwards compatibility. Breaking API changes with every version are to be expected.

### Projects that I can recommend
- [Lenni0451's commons](https://github.com/Lenni0451/commons)
- [Apache Commons](https://commons.apache.org/)
- [Google Guava](https://github.com/google/guava)

## Contact
If you encounter any issues, please report them on the [issue tracker](https://github.com/FlorianMichael/RClasses/issues).  
If you just want to talk or need help with RClasses feel free to join my [Discord](https://discord.gg/BwWhCHUKDf).

## How to add this to your project
### Gradle/Maven
To use RClasses with Gradle/Maven you can use [Maven Central](https://mvnrepository.com/artifact/de.florianmichael/RClasses), [Lenni0451's Maven](https://maven.lenni0451.net/#/releases/de/florianmichael/rclasses) or [Jitpack](https://jitpack.io/#FlorianMichael/RClasses).  
You can also find instructions how to implement it into your build script there.

### Jar File
If you just want the latest jar file you can download it from the GitHub [Actions](https://github.com/FlorianMichael/RClasses/actions) or use the [Release](https://github.com/FlorianMichael/RClasses/releases).

## Source tree
| Sub module name | Description                                                                       |
|-----------------|-----------------------------------------------------------------------------------|
| all             | Mainly for Maven and Gradle setups, includes all other sub modules at once.       |
| common          | Different utils you often need when developing average Java programs.             |
| functional      | Various functional interfaces and other data structs like vectors and pairs.      |
| io              | Debugging utilities and unsafe/native access.                                     |
| math            | Collection of math utils for different subareas of mathematics.                   |
| pattern         | Abstracted implementations of different patterns.                                 |
| kotlin-support  | Adds kotlin extensions for some useful methods provided by the common module      |
| main            | Adds common sub modules you often need, currently adding common, math and pattern |
