package cww527;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dataSource {
    public static void main(String[] args) throws SQLException {
            //先创建数据库
        //创建datasource对象
        DataSource dataSource = new MysqlDataSource(); //程序级，单例
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://localhost:3306/java15_cww?characterEncoding=utf8&&useSSl=true");                                        //建立连接
        ((MysqlDataSource)dataSource).setUser("root");                                        //建立连接
        ((MysqlDataSource)dataSource).setPassword("bk0467BKR");                                        //建立连接
        Connection connection = dataSource.getConnection();  //建立一次链接
        String sql = "insert into student1 values(?,?,?,?,?);";    //占位符
        PreparedStatement statement =connection.prepareStatement(sql);
//        statement.setString(1,"陈总");
//        statement.setString(2,"陈主席");
//        statement.setString(3,"陈上将");
//        System.out.println(statement);
        //  statement.setString(1,"蔡徐坤");
//          statement.setString(2，);
//          statement.setString();
//          statement.setString();
          //System.out.println(statement);
//         statement.setString(1,"蔡徐坤");
//         statement.setString(1,20);
        statement.setInt(1,1827);
        statement.setString(2,"陈大将");
        statement.setString(3,"男");
        statement.setInt(4,39);
        statement.setString(5,"将军");
        System.out.println(statement);
    }
}
