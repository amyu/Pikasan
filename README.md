# Pikasan

[![Release](https://img.shields.io/github/release/amyu/Pikasan.svg?label=maven version)](https://github.com/amyu/Pikasan)

##Screenshots

<img src="./sc/sc.png" width="200">

## Requirements
Target Sdk Version : 21  
Min Sdk Version : 14

##How to use
1) Add this to your **build.gradle**.
```java
repositories {
    maven {
        url "https://jitpack.io"
    }
}

dependencies {
  compile 'com.github.amyu:Pikasan:1.0'
}
```

2) Add
```java
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    android:paddingBottom="@dimen/activity_vertical_margin"
    tools:context=".MainActivity">

  <com.list.view.amyu.pikasan.PikasanView
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      />

</RelativeLayout>
```


##License

    Copyright 2015 Yuki Mima

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
