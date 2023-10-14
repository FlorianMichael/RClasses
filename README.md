# RClasses
Random collection of Java classes and utils in different submodules which together form a commons library

## Why another commons library?
I started this project because I wanted to have a collection of classes that I use in my projects. 
I also wanted to have a place where I can test new concepts and ideas. 
I know that there are already a lot of libraries that do the same thing, but I wanted to do it myself, so I can only add stuff I really need. 

### Projects that I can recommend
- [Needle](https://github.com/sugisaru/Needle)
- [Lenni0451's commons](https://github.com/Lenni0451/commons)
- [Apache Commons](https://commons.apache.org/)
- [Google Guava](https://github.com/google/guava)

## Contact
If you encounter any issues, please report them on the
[issue tracker](https://github.com/FlorianMichael/RClasses/issues).  
If you just want to talk or need help with RClasses feel free to join my
[Discord](https://discord.gg/BwWhCHUKDf).

## How to add this to your project
### Gradle/Maven
To use RClasses with Gradle/Maven you can use [Maven Central](https://mvnrepository.com/artifact/de.florianmichael/RClasses), [Lenni0451 server](https://maven.lenni0451.net/#/releases/de/florianmichael/rclasses) or [Jitpack](https://jitpack.io/#FlorianMichael/RClasses).  
You can also find instructions how to implement it into your build script there.

### Jar File
If you just want the latest jar file you can download it from the GitHub [Actions](https://github.com/FlorianMichael/RClasses/actions) or use the [Release](https://github.com/FlorianMichael/RClasses/releases).

## Source tree
| Sub module name | Description                                                                                               |
|-----------------|-----------------------------------------------------------------------------------------------------------|
| all             | Only for the maven server, when included, all other sub modules will be loaded at one time.               |
| common          | Different utils for a specific topic/area                                                                 |
| functional      | Implementation of own STD types like throwable functional interfaces                                      |
| io              | Streams, File/Web access and Input/Output stuff that works with the Java STD                              |
| mappings        | Converter for formats and registries for default formats and conventions                                  |
| math            | Implementation of mathematical concepts and general formulas such as percentage calculation or stochastic |
| pattern         | Abstracted implementations of different patterns like Registry, Storage, ...                              |
| kotlin-support  | Adds kotlin extensions for some useful methods provided by the common module                              |
