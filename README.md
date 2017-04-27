# Agile Project Estimation and Management (APEMAN)

*APEMAN* (short for Agile Project Estimation and Management) is envisioned as a set of integrated tools to track
all aspects of an Agile project, adding as little overhead as possible while capturing and tracking project
measurements to support estimation, project tracking and project controls.

These are the essential links for the project:
* [APEMAN GitHub](https://github.com/alevat/apeman)
* [APEMAN Project Pages](https://alevat.github.io/apeman/)

## Pre-Requisites

### Install Java SE 8

If not present, install the latest [Java 8 SDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 
and set your `JAVA_HOME` environment variable accordingly.

### Install MySQL Community Server 5.7.x

If not present, install [MySQL Community Server 5.7.x](https://dev.mysql.com/downloads/mysql/)
using default options for a Developer Configuration.

### Install Gradle

APEMAN uses Gradle as its build tool. If not present, download and install 
[Gradle 3.5.x](https://gradle.org/install). Note that `gradlew` is present in 
the root of the APEMAN distribution and can be used in place of the system
`gradle` executable.

### Install Node.js

Node Package Manager (`npm`) is used for JavaScript dependency retrieval.

* Download and install [Node.js 6.10.x](https://nodejs.org/en/download/).

### Install PhantomJS

PhantomJS is required to run web-based tests.

* Download 
[PhantomJS 2.1.x](http://phantomjs.org/download.html)
* Add the executable to your system executable path
    * Windows: Add the folder containing phantomjs.exe to your System Path environement variable.
### Install ChromeDriver

ChromeDriver may be optionally used to run Serenity or Karma/Jasmine tests as it
provides a debugging environment.

* Download and install 
[ChromeDriver 2.x](https://sites.google.com/a/chromium.org/chromedriver/downloads)
* Add the driver to your system executable path
    * Windows: Add the folder containing chromedriver.exe to your System Path environement variable.

## Project Set Up

* Clone the `git` repository:

        git clone git@github.com:alevat/apeman.git
        
* Create a new MySQL database for APEMAN.
    * Create a new Schema named `apemandb`.
    * Create a new MySQL user named `apeman` with the password `apeman` allowed to connect
    from all hosts (`%`).
    * Grant all permissions on `apemandb` to `apeman`.
    
    