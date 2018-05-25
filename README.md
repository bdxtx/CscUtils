# CscUtils
整理一下我自己用的比较舒服的开源框架
##日志框架使用的是logReport，https://github.com/wenmingvs/LogReport
###框架中直接将日志文件放到了公共文件夹，但是在Android6.0以后，文件写入公共目录下，需要申请动态权限，所以我将保存日志的目录放到了getExternalFilesDir("Logs").getAbsolutePath()，这样就不需要申请动态权限。
