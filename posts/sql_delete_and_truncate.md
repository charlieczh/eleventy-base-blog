---
title: DELETE和TRUNCATE的区别
description: 
date: 2022-11-10
tags:
  - SQL
  - ORACLE
layout: layouts/post.njk
---
简单来说，**DELETE**和**TRUNCATE**都会删除表的所有行。
不过具体使用哪一个取决于你的需求。
下面详细列出了他们的分别(Oracle)：

|  比较因素   | DELETE  | TRUNCATE  |
|  ----  | ----  | ----  |
| 语句类别（Statement Type）  | DML(Data Manipulation Language) | DDL(Data Definition Language) |
| 还原 (Rollback) | 能 | 不能 |
| 资料对象身份 (Data Object Identity) | 不重置 | 重置 |
| 锁 (Lock) | 锁选中的行 | 锁整个表 |
| 触发程序 (Trigger) | 会触发 | 不会触发 |
| 语法 (Syntax) | DELETE FROM table_name | TRUNCATE TABLE table_name |