# MimeType

[![](https://jitpack.io/v/serhatleventyavas/MimeType.svg)](https://jitpack.io/#serhatleventyavas/MimeType)
Mime Type library allows that you easily get mimetype with file's extension.

### Installation
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
Step 2. Add the dependency
```
dependencies {
    implementation 'com.github.serhatleventyavas:MimeType:1.0'
}
```

### Example
```
val result = MimeType.getMimeTypeFromExtension("jpeg") // returns image/jpeg
```

## License

ValidationManager is released under the MIT license. [See LICENSE](https://github.com/serhatleventyavas/MimeType/blob/master/LICENSE) for details.