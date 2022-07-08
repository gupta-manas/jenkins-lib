def call(name){
  println "Hello, ${name}"
  def return_val = bat script: "@echo off && C:\app\manas.gupta\product\21c\dbhomeXE\bin\sqlplus -s SYSTEM/pass@localhost:1521 @D:\Jenkins\demo.sql", returnStatus: true
  println return_val
}
