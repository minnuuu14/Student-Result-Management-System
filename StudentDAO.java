import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class StudentDAO{
	public static void insertStudent(Student s){
		String sql="INSERT INTO student_table"+"(name,roll_no,maths,science,english,computer,total,percentage,grade)"+"VALUES(?,?,?,?,?,?,?,?,?)";
		try{
			Connection con=DBConnect.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,s.name);
			ps.setInt(2,s.rollno);
			ps.setInt(3,s.maths);
			ps.setInt(4,s.science);
			ps.setInt(5,s.english);
			ps.setInt(6,s.computer);
			ps.setInt(7,s.total);
			ps.setDouble(8,s.percentage);
			ps.setString(9,String.valueOf(s.grade));

			ps.executeUpdate();
			System.out.println("Student added successfully!!");
		}catch(Exception e){
			System.out.println("Error:Database error occured");
			e.printStackTrace();
		}
	}
	public static void viewStudents(){
		String sql="SELECT * FROM student_table";
		try{
			Connection con=DBConnect.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt("roll_no")+"\t"+rs.getString("name")+"\t"+rs.getInt("maths")+"\t"+rs.getInt("science")+"\t"+rs.getInt("english")+"\t"+rs.getInt("computer")+"\t"+rs.getInt("total")+"\t"+rs.getDouble("percentage")+"\t"+rs.getString("grade"));
			}
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		
}








		


		