# ui-automation
An attempt to UI automation for Android App testing

Prequisite:
1. Java JDK
2. Eclipse IDE
3. Maven
4. Appium Server
5. Android Studio (for emulator)

How to:
1. Install prerequisite
2. Run emulator
3. Run appium server with configuration 
{
  "platformName": "Android",
  "deviceName": "Android Emulator",
  "app": "{os-path}/ui-automation\target\mda-1.0.13-15.apk"
}
4. Run MyApp.java class on appiumTest package
5. Look at the magic!

I automate a process of buying 2 blue backpack on a Demo App, mainly using appium and selenium. I tried to integrate it to Cucumber but the step definition seems to bugged, always undefined from the feature file, even though I already installed the cucumber eclipse plugin and changing the project to cucumber. So currently I left it halfway on the cucumber part. But the automation part is done :)
