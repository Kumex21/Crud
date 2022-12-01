import java.sql.*;




public class DBLogic {

    String DB = "jdbc:mysql://localhost:3306/liepa";
    String USER = "root";
    String PASS = "figarolu12";



// insert
/*public void insert() {
    try {
        //conn
        Connection conn = DriverManager.getConnection(DB, USER, PASS);
        Statement stmt = conn.createStatement();

        String sql = "INSERT INTO users (name) VALUES ('Aivis')";

        stmt.executeUpdate(sql);

        System.out.println("Dati ievadīti");

    } catch (SQLException e) {
        e.printStackTrace();

    }
    }*/

    //update
  /*  public void update() {

        try {
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "UPDATE users SET name = 'Edgars' WHERE id = 1";

            stmt.executeUpdate(sql);

            System.out.println("Dati atjaunoti");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        }*/

//delete
/*public void delete() {
        try {
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "DELETE FROM users WHERE name = 'Edgars'";

            stmt.executeUpdate(sql);

            System.out.println("Dati ir izdzēsti");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        }*/

//select
public void select(){
    try {
        Connection conn = DriverManager.getConnection(DB, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT name FROM users WHERE id = 2");

        while (rs.next()) {

            System.out.println("name: " + rs.getString("name"));
        }


    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
