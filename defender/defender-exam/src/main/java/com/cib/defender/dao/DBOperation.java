package com.cib.defender.dao;

import com.cib.defender.dao.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:DBOperation
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/10/1 10:58 AM
 * @Version:1.0
 **/
public class DBOperation {
    public boolean addUser(User user){
        boolean flag = false;
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        String sql = "insert into t_user (username,password) values(?,?)";
        try {
            // 插上数据，主键自增
            pstm = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            pstm.setString(1,"chenhao");
            pstm.setString(2,"123456");
            int rows = pstm.executeUpdate();
            if(rows > 0)
                flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.close(pstm,conn);
        }
        return flag;
    }
    public List<User> getUsers(){
        List<User> list = new ArrayList<User>();
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        conn = DBConnection.getConnection();
        String sql = "select * from t_user";
        try {
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setId(rs.getLong("id"));
                user.setPassword(rs.getString("password"));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
//        User user = new User("kobe","123456");
    }
}
