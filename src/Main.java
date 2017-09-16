import java.util.Date;
public class Main {

	public static void main(String[] args) {


		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
	StudentGroup std=new StudentGroup(7);
	Date myDate = new Date("2015-03-07");

	Student m[];
	 m[0]=new Student(77,"medha",myDate,60.46);
	std.setStudents(m);
	//std.addFirst(m1);
	//std.addLast(m1);
	}

}
