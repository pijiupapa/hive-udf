# hive udf 
------
### 使用教程
下载代码
```
git clone 
```
maven编译打包
```
mvn package
```
hive 加载创建函数
```
add jar /project/hive-udf-1.0.jar;
create temporary function myuuid as 'com.bestmind.data.hive.udf.Uuid';
create temporary function mymd5sha1 as 'com.bestmind.data.hive.udf.Md5Sha1';
```
# hive-udf
