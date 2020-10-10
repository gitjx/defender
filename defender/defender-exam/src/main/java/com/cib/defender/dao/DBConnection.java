package com.cib.defender.dao;

import java.sql.*;

/**
 * @ClassName:DBConnection
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/10/1 10:43 AM
 * @Version:1.0
 **/
public class DBConnection {
    // 定义Mysql的数据库驱动程序
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    // 定义Mysql的数据库连接地址
    public static final String DBURL = "jdbc:mysql://172.16.179.181:3306/defender?useUnicode=true&characterEncoding=utf8&useSSL=false";
    // Mysql数据库用户名、密码
    public static final String DBUSER = "root";
    public static final String DBPASS = "Test@1234";
    static {
        try{
            Class.forName(DRIVER);
            System.out.println("mysql数据库驱动加载成功!");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    public static void close(ResultSet rs, Statement st,Connection conn){
        try{
            if(rs != null){
                rs.close();
            }
            if(st != null){
                st.close();
            }
            if(conn != null){
                conn.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void close(Statement st,Connection conn){
        close(null,st,conn);
    }
}
