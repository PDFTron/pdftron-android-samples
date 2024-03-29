# Custom UI sample

|Light|Dark|
|--|--|
![light-theme](./art/light-theme.png) | ![dark-theme](./art/dark-theme.png)

This sample demonstrates how to customize the UI of PdfViewCtrlTabHostFragment which includes samples for: 

|Sample|Description|
|--|--|
|[Quick menu customization](https://docs.apryse.com/documentation/android/guides/advanced/customize-quick-menu/)|Adds a custom star to almost all of the annotation quick menus, adds a "Link" quick menu button when square annotations are selected, and adds an "UnLink" quick menu button when circle annotations are selected.|
|[Annotation toolbar customization](https://docs.apryse.com/documentation/android/guides/viewer-components/annotation-toolbar-a/)|Re-arranges items in the annotation toolbar grouping.| 
|[Options toolbar customization](https://docs.apryse.com/documentation/android/guides/basics/open/fragment/#customize-the-options-toolbar)|Creates a custom options toolbar from scratch by removing and adding new buttons.|
|[Adding custom views to the viewer](https://docs.apryse.com/documentation/android/guides/advanced/custom-relative-layout/)|Adds a custom view on top of a link annotation when the annotation is selected.|

## Project structure
```
app/
  src/                        - Project source files and resources.
  build.gradle                - Module level Gradle build file.
  res/menu                    - quick menu resources that will be modified (see guide).
build.gradle                  - Project level Gradle build file.
gradle.properties             - Project-wide Gradle settings. Contains Apryse license key and credentials.
```

## License
See [License](./../LICENSE)
