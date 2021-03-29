package entregable3;
import java.sql.Connection;
import java.sql.SQLException;


public class main {
	public static Connection conn=bd.conexion_bd();

	public static void main(String[] args) throws SQLException {
			menu.menu();
	}

}
