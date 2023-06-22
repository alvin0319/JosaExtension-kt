# JosaExtension
[JosaFormatter](https://github.com/b1uec0in/JosaFormatter)을 위한 Kotlin 확장

# Usage
```kotlin
import dev.minjae.josaextension.josa

val a = "'%s'는 사용중인 닉네임 입니다.".josa("닉네임")
val b = "%s으로 가보자!".josa("계곡")
val c = "%s가 좋아요".josa("코틀린")

```

# Installation
```groovy
repositories {
    maven { url 'https://repo.minjae.dev/snapshots' }
}

dependencies {
    implementation 'dev.minjae.josaextension:josaextension:1.0-SNAPSHOT'
}
```

```kotlin
repositories {
    maven { url = uri("https://repo.minjae.dev/snapshots") }
}

dependencies {
    implementation("dev.minjae.josaextension:josaextension:1.0-SNAPSHOT")
}
```