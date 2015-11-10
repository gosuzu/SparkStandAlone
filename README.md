# spark-submitを使用しstandaloneを作成

1.installしたsparkにpathを通す

``` bash:bash
echo 'alias spark-shell="~/work/spark/bin/spark-shell"' >>~/.bash_aliases
echo 'alias spark-submit="~/work/spark/bin/spark-submit"'>>~/.bash_aliases
source ~/.bash_alias
```

2.sbtをinstall

``` bash:bash
brew install sbt
``` 

3.jarファイルの作成 ※1

```
sbt assembly
```

4.spark-submitの実行

```
spark-submit --class ExampleApp target/scala-2.11/scala-assembly-0.1.jar
```

5.実行結果（結果のみ）

``` bash:bash
Lines with index.html: 141882
Lines with 1.html: 19996
Lines with 2.html: 18567
Lines with 3.html: 19291
Lines with 4.html: 19086
Lines with 5.html: 24868
Lines with 6.html: 20536
Lines with 7.html: 19764
Lines with 8.html: 18272
Lines with 9.html: 22656
Lines with 1.gif:  20996
Lines with 2.gif:  52393
```

6.etc

※

```
Name, Version, ScalaVersion, LibraryDependencies などを  
間に空行を入れて記述します。最後にも空行を入れます。
```
 
