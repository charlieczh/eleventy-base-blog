---
title: Hibernate一级缓存和二级缓存
description: 
date: 2022-11-10
tags:
  - Hibernate
  - Java
layout: layouts/post.njk
---
## 一级缓存（First-level cache）
第一级缓存是与**Seesion**对象相关联，Hibernate默认开启第一级缓存。
第一级缓存是处于事务层面，所以是轻量级和生命周期短。

## 二级缓存（Second-level cache）
第二级缓存是与**Seesion Factory**对象相关联。Hibernate默认禁用第二级缓存，
用户需要自行配置开启和设置缓存框架例如**Ehcache**, **Redis**等等。
第二级缓存是处于整个应用层面，所有的用户都可以使用，所以是重量级和生命周期长。