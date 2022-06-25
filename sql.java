import java.sql.*;  
class Main{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav","root",""); //connection

Statement s=con.createStatement(); 

s.executeUpdate("create database mydb");// creating database

String t_sql = "create table Movies," +
                   "(actor varchar(10)," +
                   " actress varchar(10)," + 
                   " year integer,"+ 
                   " director_name varchar(10))"; 

    s.executeUpdate(t_sql);// creating table
    
    String sql = "insert into Movies values ('ali', 'Zara', 1998,'raj')"; // insertion data 
         s.executeUpdate(sql);
         sql = "insert into Movies values ('ntr', 'nainatara', 1999,'chopra')";
         s.executeUpdate(sql);
        sql = "insert into Movies values ('prabhas', 'anushka', 2020,'rajamouli')";
         s.executeUpdate(sql);
        sql = "insert into Movies values ('ntr','shreya', 2022,'rrr')";
         s.executeUpdate(sql);
    

    
ResultSet rs=s.executeQuery("select * from Movies");  
while(rs.next())  
{
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getString(4)); // printing the data
}

con.close();  

catch(Exception e)
{ System.out.println(e);
    
}  
}  
}  
