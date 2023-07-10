# Project-Titan (for Fabric)

Project Titan is a Fabric 1.20 mod that implements a number of features,  
gadgets and Titans from the Attack on Titan series


## Installation

### Manual installation

You will need fabric loader 0.14.21 or later.  
If you have never installed a fabric mod before, you can find a guide [here](https://fabricmc.net/wiki/install).  

## Building from sources
No support is provided for setting up build environments or compiling the mod. We ask that users who wish to  
have a basic understanding of compiling Java/Gradle projects.  
A basic overview is provided here for those already familiar.

### Requirements
- JRE 17 or newer
- JDK 17
    - If you do not have JDK 8 in your shell path or have installed it using a supported package manager
      (such as [SDKMAN](https://sdkman.io/)), Gradle will automatically download an appropriate toolchain from the [AdoptOpenJDK](https://adoptium.net/de/) project and use it to compile the project.  
       For more information on which package managers are supported and how you can customise this behaviour on a system wide level,  
       see the [Gradle's Toolchain User Guide](https://docs.gradle.org/current/userguide/toolchains.html).
- Gradle 7 or newer
  - The Gradle wrapper provided in this repository can be used instead of installing a suitable version of Gradle yourself.
    However, if you are building many projects, you may prefer to install it yourself using a suitable package manager.
     to save disk space and avoid having lots of different Gradle daemons sitting around in memory.

## Building with Gradle
Project Titan uses a typical Gradle project structure and can be built by simply running the default build task.
After Gradle has finished building the project, you can find the build artefacts
(typical mod binaries and their sources) in build/libs.
