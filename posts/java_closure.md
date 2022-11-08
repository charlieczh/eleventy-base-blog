---
title: 什么是Closure闭包，Java支持闭包吗？
description: 
date: 2022-11-07
tags:
  - Java
  - JavaScript
layout: layouts/post.njk
---
闭包是指任意函数，在定义的时候访问了其环境变量（自由变量），而非来自参数列表的变量。

## JavaScript例子

```js
function outer(a) {
    function inner(b) {
        return a + b;
    }
    return inner;
}

console.log(outer(1)(2)); // output 3
```

上面的例子中，我们定义了**outer**和**inner**函数，**inner**访问了自由变量**a**（来自**outer**函数的参数）
和本地变量**b**, 然后返回他们相加的结果，**inner**函数便是所谓的闭包。除此之外闭包也可以作为其他函数的参数。

## Java支持闭包吗

严格来说，Java并不支持闭包，但是可以用Lambda（Java 8）和匿名类实现相同的效果。

## Lambda例子
```java
public class ClosureLambda {
    public static void main(String[] args) {
        int localInt = 10;
        Runnable runnable = () -> System.out.println(localInt); // output 10
        runnable.run();
    }
}
```

## 匿名类例子
```java
public class ClosureAnonymousClass {
    public static void main(String[] args) {
        int localInt = 10;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(localInt); // output 10
            }
        };
        runnable.run();
    }
}
```
