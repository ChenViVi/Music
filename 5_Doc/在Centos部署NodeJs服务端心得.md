---
title: 在Centos部署NodeJs服务端心得
date: 2017-12-20 16:01:37
tags: [网易云音乐,Linux,nodejs]
---

## 前言

因为项目需要，现需将[NeteaseCloudMusicApi](https://binaryify.github.io/NeteaseCloudMusicApi/#/?id=neteasecloudmusicapi)部署到服务器上运行，此项目是nodejs写的，所以服务器上需要安装nodejs。在实际操作的过程中，我遇到了一些问题，现记录于此文。

## 问题

### 运行时报错

原因：此项目对于nodejs版本有要求，不能使用5x以下的版本运行。

解决过程：安装不同版本的nodejs，直到找到可以运行程序的版本。

经验：nodejs迭代较快，下次遇到nodejs项目时一定要考虑其版本是否合适。


### 关闭控制台后程序停止运行

原因：需要运行forever命令来保持程序始终在后台运行

解决过程：安装forever命令

```
sudo npm install forever -g
```

```
forever start app.js
```

### npm安装forever命令失败

原因：npm版本过低

解决过程：安装nodejs-6x
