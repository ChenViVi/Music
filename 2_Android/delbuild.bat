@echo off&setlocal EnableDelayedExpansion
::�����еȺź�ɸ����������

set ddd=C:\Users\93294\Desktop
set sss=build
::------ȷ��Ҫɾ�ļ����ַ�����------
:loop
set /a m+=1
if not "!sss:~%m%,1!" equ "" goto :loop 
::��ʼ���Һ�ɾ��...
::cd /d %ddd%
for /f %%k in ('dir /s/b/ad') do (
  set aaa=%%k
  if "!aaa:~-%m%!" equ "%sss%" rd /s/q %%k 2>nul)