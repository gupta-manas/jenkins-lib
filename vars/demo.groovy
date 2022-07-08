def call(name){
  println "Hello, ${name}"
  def return_val = bat script: "@echo off && ${env.ORACLE_HOME}\sqlplus -s SYSTEM/pass@localhost:1521 @D:\Jenkins\demo.sql", returnStatus: true
  println return_val
}
