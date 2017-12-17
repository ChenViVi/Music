@echo off&setlocal EnableDelayedExpansion
::下两行等号后可根据情况更改

set ddd=C:\Users\93294\Desktop
set sss=build
::------确定要删文件夹字符长度------
:loop
set /a m+=1
if not "!sss:~%m%,1!" equ "" goto :loop 
::开始查找和删除...
::cd /d %ddd%
for /f %%k in ('dir /s/b/ad') do (
  set aaa=%%k
  if "!aaa:~-%m%!" equ "%sss%" rd /s/q %%k 2>nul)