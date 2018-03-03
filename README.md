# 2018年刑侦科目推理试题解答
答案 ```BCACACDABA```

# 运行方式
```
mvn package
java -jar target/criminal-investigation-2018-0.1.0.jar
```

# 原理
穷举法：将10道题的答案，看做一个10位四进制数字，遍历所有的答案组合，直至找出符合条件的答案。