Getting Started
============
Assuming you have Ant and the latest Android SDK installed.

 * Edit local.properties to point to your sdk folder (or remove it and use android update project --target 1 --path .)
 * $ ant install

Introduction
============

This is a basic Android project written in Scala.

None of the tutorials/blogs on the web for writing an Android application in Scala worked for me out of the
box but by putting together information gathered from various sources, I managed to assemble a working configuration.

The interesting part is the build.xml which integrates the Scala compiler and Proguard into the Android build process using Ant.
MyAndroidActivity.scala contains the Android activity that is displayed. 

Versions used:

- Android SDK for Linux. v2.2
- Scala 2.9.0 (JARs included in the project)
- Proguard 4.4 (JARs included in the project)

How It Works
============

Diff the build.xml file with the one in <path to Android SDK>/tools/ant/main_rules.xml

The main changes are the addition of the Scala compile step to the build process and then Proguard to shrink the JAR file.

How To Build
============

Assuming the Android SDK is set up and working on the command line,
"ant clean compile install" from the project directory will build and compile the project and install it on the running Android emulator.

Known Issues
============

The Scala activity does not get picked up by Android so a Java activity inherits from it and is the launcher activity instead.
This is not an ideal solution but does have the side effect of demonstrating that it is possible to have a mixed Java / Scala project in Android.

There are many Proguard warnings during the build process. These need to be removed.
