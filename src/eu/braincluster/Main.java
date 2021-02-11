package eu.braincluster;

public class Main {

    public static void main(String[] args)
	{
	    Student student1 = new Student();
	    student1.setName("Feriba");
	    student1.setEmail("feriba@example.com");

	    System.out.println(student1);

	    StudentBuilder builder = new StudentBuilder()
				.setName("Pistaba")
				.setEmail("pistaba@example.com");

	    Student student2 = builder.build();
	    System.out.println(student2);

	    Student student3 =
				StudentBuilder.Builder()
				.setName("Bélabá")
				.setEmail("belaba@example.com")
				.build();

	    System.out.println(student3);
    }
}
