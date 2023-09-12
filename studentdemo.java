class student{
	String id;
	String name;
	int age;

	student(){
		id = "NULL";
		name = "NULL";
		age = 0;
	}

	student(String i, String n, int a){
		id = i;
		name = n;
		age = a;
	}

}

class studentdemo{
	public static void main(String args[]){
		student stud1 = new student();
		
		student stud2 = new student("ID-1","Rajnish Bardoloi", 22);
	
		System.out.println("Details of student 1:\nID   -> "+ stud1.id + "\nNAME -> " +stud1.name + "\nAGE  -> "+stud1.age+"\n");
		System.out.println("Details of student 2:\nID   -> "+ stud2.id + "\nNAME -> " +stud2.name + "\nAGE  -> "+stud2.age+"\n");

	}
}
