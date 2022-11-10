---
title: SQL中不同类型的Keys(键)
description: 
date: 2022-11-10
tags:
  - SQL
layout: layouts/post.njk
---
在关联式资料库（Relational Database）中有不同的键（Keys），
其中**Super Key超键**，**Candidate Key候选键**，**Primary Key主键**，
**Alternate Key次要键**和**Foreign Key外键**最为常见。

下面是对他们简单的解释：

**Super Key超键**: 不同列（字段）组成的集合可以用来判断行的唯一性

**Candidate Key候选键**: 候选键是最“短”的超键

**Primary Key主键**：从候选键中选出最具代表的关联键

**Alternate Key次要键**：没有被选中为主键的其他候选键

**Foreign Key外键**：关联其他表主键的关联键

## 例子
假设我们有用户表，定义为下:
```sql
UserId        unique
PhoneNumber   unique
LastName      not unique
FirstName     not unique
EmailAddress  not unique
```

**Super Key超键**: 因为**UserId**和**PhoneNumber**定义为唯一
任何集合包含**UserId**和**PhoneNumber**都可以称之为超键。所有超键如下：
```
UserId
PhoneNumber
UserId, PhoneNumber
UserId, LastName
UserId, FirstName
UserId, EmailAddress
PhoneNumber, LastName
PhoneNumber, FirstName
PhoneNumber, EmailAddress
UserId, PhoneNumber, LastName
UserId, PhoneNumber, FirstName
UserId, PhoneNumber, EmailAddress
UserId, LastName, FirstName
UserId, LastName, EmailAddress
UserId, FirstName, EmailAddress
PhoneNumber, LastName, FirstName
PhoneNumber, LastName, EmailAddress
PhoneNumber, FirstName, EmailAddress
UserId, PhoneNumber, LastName, FirstName
UserId, PhoneNumber, LastName, EmailAddress
PhoneNumber, LastName, FirstName, EmailAddress
UserId, PhoneNumber, LastName, FirstName, EmailAddress
```
**Candidate Key候选键**: 可以是{UserId} 或者 {PhoneNumber}
**Primary Key主键**：可以是{UserId} 或者 {PhoneNumber}，在这个例子中选{UserId}
比较恰当
**Alternate Key次要键**：如果{UserId}是主键，则{PhoneNumber}是次要键

假设我们有登入日志表，定义为下：
```sql
logId   unique
userId  not unique
actionType not unique
...
```

**Foreign Key外键**：日志表的userId字段便是外键
