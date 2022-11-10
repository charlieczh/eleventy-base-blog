---
title: Vue.js条件渲染
description: 
date: 2022-11-10
tags:
  - Vue.js
layout: layouts/post.njk
---
Vue.js提供两种方式条件渲染，分别是**v-if**和**v-show**。
他们的分别是**v-if**会移除和重新创建元素，**v-show**
不会移除元素而是改变他的CSS。

## 例子

```html
<!DOCTYPE html>
<html>
<head>
  <script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>
</head>
<body>
  <div id="app">
    <p v-if="good">Everything is fine!</p>
  </div>

  <script>
    var app = new Vue({
      el: '#app',
      data: {
        good: true
      }
    })
  </script>
</body>
</html>
```

上面的例子很明显会输出Everything is fine!
那么我们来看一下条件是false的情况。

## v-if

![v-if false case](/img/vif-false-case.PNG)

我们的DOM变成了注释。

## v-show

![v-show false case](/img/vshow-false-case.PNG)

我们的元素使用了**diplay: none**。