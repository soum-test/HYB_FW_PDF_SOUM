# HYB_FW_PDF (Hybrid Framework With PDF Reporting)

<p align="center">
  <img src="https://github.com/suneel944/HYB_FW_PDF/blob/master/hybrid_logo.png" width="500" title="Hybrid Framework">
</p>

## Features

* No library configuration requried
* Outputs beautiful pdf report with screenshots
  * Supports multiple iteration execution
* Consists of wide range of keywords which are essentials for testing platform
* Monolithic project structure : Contains libraries, Test data files, output reports everything in one workspace.
* Supports result writeback to spreadsheet
* Supports Microsoft Edge, Chrome, IE and Firefox browsers

## Background

HYB_FW_PDF, is a **hybrid framework** (Combination of **Data driven** and **Keyword**) along with **PDF reporting**.  One reason I created this project because there is a lack of complete end to end solution for a **Testing Framework** and people struggle to get **PDF** reports for the completed tasks (**in testing perspective**).

## Note

**Target Platform :** Testing : Functional and UI
Framework is built in : [Eclipse Neon IDE (For Java Developers)](https://www.eclipse.org/downloads/packages/release/neon/3/eclipse-ide-java-developers)<br>
<br>**From Microsoft Edge v18, MicrosoftWeDriver.exe is not required**<br>
As Microsoft WebDriver is a Windows feature on demand. 
<br>Hence to add this feature and to continue automating **Microsoft Edge** browser, execute the below code in the CMD with admin rights<br>
**CMD Code:**
<br>DISM.exe /Online /Add-Capability /CapabilityName:Microsoft.WebDriver~~~~0.0.1.0
<br>[Official information from Microsoft](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/)


## Requirements

1. [JDK 1.8.0_191 or Higher](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or [Open JDK](https://developers.redhat.com/products/openjdk/download)
2. [Eclipse Neon or Higher](https://www.eclipse.org/downloads/packages/release)
3. TestNG 6.9.9 or Higher. Instructions on how to install from official website [TestNG](https://testng.org/doc/download.html) or download from [mvnrepository - 6.9.9](https://repo1.maven.org/maven2/org/testng/testng/6.9.9/) or checkout other latest versions here [mvnrepository - TestNG Central](https://mvnrepository.com/artifact/org.testng/testng)

## Contributing

Check out my [contributing guidelines](/CONTRIBUTING.md) for ways to offer feedback and contribute.

## Licenses

Content is released under [GPL-3.0](https://www.gnu.org/licenses/gpl-3.0.en.html). See [notices](notices.md) for complete details, including attribution guidelines, contribution terms, and software and third-party licenses and permissions.

## Acknowledgments

A big thanks to GitHub and all of HYB_FW_PDF contributors.

## Upcoming Features

1. "opencv" implementation
2. PDF reporting to support batch run
