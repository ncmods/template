<img src="src/main/resources/assets/template/icon.png" width="144" height="144" align="right">


# ncmods/template

[![Travis CI Build](https://img.shields.io/travis/ncmods/template?style=flat-square)](https://travis-ci.org/ncmods/template)
[![Minecraft Java Edition v1.15.2](https://img.shields.io/badge/minecraft-v1.15.2-blue.svg?style=flat-square)](https://www.minecraft.net/en-us/article/minecraft-java-edition-1-15-2)
[![Fabric API v0.4.29](https://img.shields.io/badge/fabric--api-v0.4.29-blue.svg?style=flat-square)](https://github.com/FabricMC/fabric/tree/1.15)
[![Gradle v5.5.1](https://img.shields.io/badge/gradle-v5.5.1-blue.svg?style=flat-square)](https://gradle.org/releases/#5.5.1)
[![Latest Release](https://img.shields.io/github/release/ncmods/template.svg?sort=semver&style=flat-square)](https://github.com/ncmods/template/releases)
[![MIT License](https://img.shields.io/github/license/ncmods/template.svg?style=flat-square)](#license)

> A template repository for Minecraft mods based on Fabric.



## Table of Contents
* [Features](#features)
* [Installation](#installation)
* [Frequently Asked Questions](#frequently-asked-questions)
* [Development](#development)
* [License](#license)



## Features
* A list of features ought to go here.



## Installation
1. Download the [latest release](https://github.com/ncmods/template/releases).
2. Extract the `*.jar` file to your Minecraft installation's `/mod` folder.



## Frequently Asked Questions
* [Will there ever be any support for Forge?](#will-there-ever-be-any-support-for-forge)

### Will there ever be any support for Forge?
Nope! **ncmods/template** was written with the Fabric API and there are no plans to support a Forge release. The source code is available under a permissive [license](#license), however, so anyone is free to port it at their leisure.



## Development
1. Clone this repository to your local environment.
2. `cd` into the project directory.
3. Run `./gradlew genSources`.
4. Run the Gradle task to generate project files for your IDE of choice:
    - `./gradlew idea` for IntelliJ IDEA
    - `./gradlew vscode` for Visual Studio Code
    - `./gradlew eclipse` for Eclipse
5. Import the project into your IDE. Ensure class paths and imports resolve correctly.
6. Run `./gradlew build`.
7. Run `./gradlew runClient`.



## License
**ncmods/template** is licensed under the [MIT license](LICENSE).
