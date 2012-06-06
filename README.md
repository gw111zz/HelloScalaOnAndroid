Getting Started
============
Assuming you have Ant and the Android SDK (with tools version r16) installed.

 * Create a local.properties and add a line "sdk.dir=<path to your sdk folder>"
 * $ ant clean debug
 * $ adb install -r bin/MyAndroidActivity-debug.apk

Introduction
============

This is a basic Android project written in Scala.

None of the tutorials/blogs on the web for writing an Android application in Scala worked for me out of the
box but by putting together information gathered from various sources, I managed to assemble a working configuration.

The interesting part is the build.xml which integrates the Scala compiler and Proguard into the Android build process using Ant.
MyAndroidActivity.scala contains the Android activity that is displayed. 

Versions used:

- Android SDK for Linux. r19 (To use it with r11 or r12, clone revision e8e44bb4d1fb82d8787506b4b44def34bbc911d6)
- Scala 2.9.0.1 (JARs included in the project)
- Proguard 4.4  (JARs included in the project)

How It Works
============

Diff the build.xml file with the one in <path to Android SDK>/tools/ant/main_rules.xml

The main changes are the addition of the Scala compile step to the build process and then Proguard to shrink the JAR file.

How To Build
============

Assuming the Android SDK is set up and working on the command line,
"ant clean debug" from the project directory will build and compile the project, then use "adb install <path to built APK file>" to install it on the running Android emulator.

Known Issues
============

The Scala activity does not get picked up by Android so a Java activity inherits from it and is the launcher activity instead.
This is not an ideal solution but does have the side effect of demonstrating that it is possible to have a mixed Java / Scala project in Android.

There are many Proguard warnings during the build process. These need to be removed.
