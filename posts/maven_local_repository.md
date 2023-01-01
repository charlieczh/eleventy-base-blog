---
title: Maven本地仓库配置
description: 
date: 2023-01-01
tags:
  - Maven
  - Eclipse
  - Windows
layout: layouts/post.njk
---
通常有几个原因我们需要使用到Maven本地仓库。第一是公司项目往往都有自己的内部jars，
如果没有设置远程仓库的话，就需要透过本地仓库构建。第二是即使公司有自己的远程仓库，
但可能网路速度非常慢，就不得不使用本地仓库。

## settings.xml例子

首先我们可以在<b>${user.home}/.m2/</b>创建一个**settings.xml**文件，
然后复制以下内容，改为你的本地仓库位置。

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd">
    <localRepository>D:\localMavenRepo</localRepository>
</settings>
```

如果你是使用Eclipse IDE的话，更改完后需要在
**Window->Preferences->Maven->User Settings**
更新配置。

![maven local repository](/img/maven-local-repository.PNG)