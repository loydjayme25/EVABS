# EVABS (Extremely Vulnerable Android Labs by BrewSec)

---

[![Open Source Love](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](https://www.github.com/abhi-r3v0/EVABS)  [![GPL Licence](https://badges.frapsoft.com/os/gpl/gpl.png?v=103)](https://www.github.com/abhi-r3v0/EVABS)

An open source Android application that is intentionally vulnerable so as to act as a learning platform for Android application security beginners. The effort is to introduce beginners with very limited or zero knowledge to some of the major and commonly found real-world based Android application vulnerabilities in a story-based, interactive model. EVABS follows a level-wise difficulty approach and in each level, the player learns a new concept. This project is still under progress and aims at incorporating as many levels as possible.

---

### INSTALLATION

* Download the application file ([apk](https://github.com/abhi-r3v0/EVABS/blob/master/APPLICATION_FILE/EVABSv1.apk)).
* Install it in an Android device (rooted recommended) or emulator.

---

### SCREENSHOTS:

![1]docs/images/ss0.png)

![2]docs/images/ss1.png)

---

### REQUIREMENTS

* Android Emulator (Default/Genymotion) or a rooted Android device.
* [FRIDA](https://frida.re/)
* [ADB](https://www.xda-developers.com/install-adb-windows-macos-linux/)
* [apktool](https://ibotpeaches.github.io/Apktool/)
* [dex2jar](https://github.com/pxb1988/dex2jar)

or use [ADHRIT](https://github.com/abhi-r3v0/Adhrit) (all-in-one tool)

Confused? Read the [documentation]() on setting up the environment.

---

### BUILDING LOCALLY

* Clone the repository ```git clone https://github.com/abhi-r3v0/EVABS.git``` or download the zip.
* Create a new folder ```EVABS``` in your ``AndroidStudioProjects``` directory and move the contents to the new directory.
* Fire up Android Studio, ```File``` -> ```open``` and select the project.
* Go to ```Build``` -> ```Generate Signed APK```.
* Create a new signature, if it doesn't exist. Sign the APK.
* Install the APK using ```adb install EVABS.apk```

---

## THE SQUAD

#### PROJECT LEAD:

* Abhishek J M (jmabhishek4@gmail.com, [@abhi_r3v0](https://twitter.com/abhi_r3v0))

---

## From India, to the world :blue_heart:
