# RClasses
Random collection of Java classes and utils

## Why another commons library?
I started this project because I wanted to have a collection of classes that I use in my projects. 
I also wanted to have a place where I can test new concepts and ideas. 
I know that there are already a lot of libraries that do the same thing, but I wanted to do it myself, so I can only add stuff I really need. 
I also merged some other projects into this one, so I can have everything in one place.

### Projects that are merged into RClasses
- [Consoomer](https://github.com/allinkdev/Consoomer)
- Parts of [Needle](https://github.com/sugisaru/Needle)

Disclaimer: I am not the original author of these projects and I don't claim to be. The license of these projects is still the same as before and they are working with the RClasses license.

## Contact
If you encounter any issues, please report them on the
[issue tracker](https://github.com/FlorianMichael/RClasses/issues).  
If you just want to talk or need help with RClasses feel free to join my
[Discord](https://discord.gg/BwWhCHUKDf).

## How to add this to your project
### Gradle/Maven
To use RClasses with Gradle/Maven you can use this [Maven server](https://maven.lenni0451.net/#/releases/de/florianmichael/rclasses) or [Jitpack](https://jitpack.io/#FlorianMichael/RClasses).  
You can also find instructions how to implement it into your build script there.

### Jar File
If you just want the latest jar file you can download it from the GitHub [Actions](https://github.com/FlorianMichael/RClasses/actions) or use the [Release](https://github.com/FlorianMichael/RClasses/releases).

## Source tree
| Sub module name     | Description                                                                                               |
|---------------------|-----------------------------------------------------------------------------------------------------------|
| RClasses-all        | Only for the maven server, when included, all other sub modules will be loaded at one time.               |
| RClasses-common     | Different utils for a specific topic/area                                                                 |
| RClasses-functional | Implementation of own STD types like throwable functional interfaces                                      |
| RClasses-io         | Streams, File/Web access and Input/Output stuff that works with the Java STD                              |
| Rclasses-mappings   | Converter for formats and registries for default formats and conventions                                  |
| RClasses-math       | Implementation of mathematical concepts and general formulas such as percentage calculation or stochastic |
| RClasses-pattern    | Abstracted implementations of different patterns like Registry, Storage, ...                              |
