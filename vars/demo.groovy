import groovy.sql.Sql

def call(name){
  println "Hello, ${name}"
  def url = 'jdbc:oracle:thin:@localhost:1521:xe'
  def user = 'SYSTEM'
  def password = 'pass'
  def driver = 'oracle.jdbc.OracleDriver'
  def sql = Sql.newInstance(url, user, password, driver)

  // use 'sql' instance ...
  def query= 'select * from USERS'
  def id, about, email, userName, pass
  sql.query(query) { resultSet ->
  while (resultSet.next()) {
    id = resultSet.getInt(1)
    about = resultSet.getString('about')
    email = resultSet.getString('about')
    userName = resultSet.getString('user_name')
    pass = resultSet.getString('password')
    }
  }
  
  def output= """
    ID=$id, about=$about, email=$email, userName=$userName, pass=$pass
  """
    
  println output
  sql.close()
}
