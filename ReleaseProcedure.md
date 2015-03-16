# Release Procedure #

The release procedure consists of three parts:
  1. _Prepare_: Update documentation and deploy to the testing environment.
  1. _Test_: Test the software.
  1. _Release_: Check in, label and package the release.
  1. _Publish_: Publish the release.

The result of the release procedure is a up-to-date and tested zip file that contains all the necessary files for running the DMS Desktop and DMS Desktop Editor.

## Prepare ##
To prepare the release, please follow these steps:
  1. _Update documentation_: Update all the documentation in the `C:\Projects\Digital Media Service\Desktop\Documents` folder to reflect the changes that you have made.
  1. _Deploy to test environment_: Run the `clean-test` and `deploy-test` targets of the `org.onceforall.dms.desktop.ui\build.xml` ant file. This creates a test environment in the  `org.onceforall.dms.desktop.ui\test` directory.
  1. _Deploy DMS Desktop Editor manually_: Although the `deploy-test` target should also deploy the DMS Desktop Editor, this step is not fully automated. To deploy the DMS Editor  to the test environment manually:
    1. Delete all files in the `C:\Projects\Digital Media Service\Desktop\Development\org.onceforall.dms.desktop.editor\test` directory, **except** the ´.svn´ version control directory.
    1. In DMS Development Environment goto `Package Explorer->org.onceforall.dms.desktop.editor->DMS Desktop Editor.product`.
    1. On the `Overview` tab of `DMS Desktop Editor.product`, select `Eclipse Product export wizard`.
    1. In the `Export` dialog, don't change the default settings, just click `Finish`.
    1. In the `C:\Projects\Digital Media Service\Desktop\Development\org.onceforall.dms.desktop.editor\test` directory, you should see now `editor.exe` together with some other folders.
    1. Test that editor starts by running the `editor.exe`.

## Test ##
Once the DMS Desktop and DMS Desktop Editor have been deployed to the test environment in the `org.onceforall.dms.desktop.ui\test` directory two types of tests have be executed:
  1. _Automatic tests_: Select `Run->Run History->DMS Desktop tests` to run the TestNG unit tests. Because one of them tests whether the software actually records what is being played back, a microphone and loud speakers have to be attached to the computer running the tests. Another test requires the CD-ROM burning software Nero 6.0 to be in the `org.onceforall.dms.desktop.ui\dev\Program Files\Nero 6.0\Nero` directory to be present (which is not part of the source code for copyright reasons) for the test to succeed.
  1. _Manual tests_: It's essential to also perform manual testing because the automated test do not cover the user interface and may not cover certain logic. Performing manual testing consists of two parts:
    1. _Change test_: Test all new features and bug fixes that have status of `Fixed`. Do not mark them as `Verified` until you successfully regression tested the application (see next step).
    1. _Regression test_: Run through whole process of entering information, recording and publishing a test web site to make sure that any change have not broken essential functionality.

## Release ##
To package the DMS Desktop and the DMS Desktop Editor into a software release, follow these steps:
  1. _Update build properties_: Update the `version` and `info` properties of the `org.onceforall.dms.desktop\src\build-info.properties`. The `info` property should point to the release notes page to created as part of the publishing (see below).
  1. _Check in all changed files (if you haven't already):_ **All commit comments have to link the checked in file to an issue** using the following pattern `Implemented issue `(Issue number)`.`, e.g. `Implemented issue 20 and issue 25.`, followed by an additional description of the changes. The only time you don't have to link the check in to an issues is when you made change that have either no or a minimal impact on the functionality, e.g. refactoring. All significant changes that the user may notice have to have an issue entry and have to linked to the check in.
  1. _Update issues_: Make sure that you change the status of all issues that are included in the release to `Released` and label it with `Implemented-`(Version number).
  1. _Label all projects_: Multi-select all projects -> right-click -> `Team` -> `Tag ...` and enter `Release `(Version number), e.g. `Release 1.1.0`, in the `Tag` field.
  1. _Create the zip files:_ Run the `deploy` target of `org.onceforall.dms.desktop.ui\build.xml`. This should create two zip files in the `C:\Projects\Digital Media Service\Desktop\Development\Release` directory.

## Publish ##
After creating the release, to publish the release, follow these steps:
  1. _Create release notes_: Create a web page that contains a detailed description of all changes since the last minor release (e.g. when moving from 1.1 to 1.2). Each change should be linked to its corresponding entry in the issue tracker (click [here](http://www.onceforall.org/dms-desktop/1.2/info.html) for an example). If the `info` property in the build properties points to this page, the application user will see the page when the DMS desktop starts up.
  1. _Upload release and notes_: Upload the release packages and the release notes to the FTP site. Email dms@onceforall.org for details.
  1. _Update project page_: Update the Google Code project page to make sure that the links point to the latest release packages and release notes.