def call(name){
  println "Hello, ${name}"
  def return_val = powershell script: "D:\Jenkins\demo.bat", returnStatus: true
  println return_val
}
