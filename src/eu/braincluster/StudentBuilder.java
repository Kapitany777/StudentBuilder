package eu.braincluster;

public class StudentBuilder
{
    private Student student;

    public StudentBuilder()
    {
        this.student = new Student();
    }

    public static StudentBuilder Builder()
    {
        return new StudentBuilder();
    }

    public StudentBuilder setName(String name)
    {
        student.setName(name);
        return this;
    }

    public StudentBuilder setEmail(String email)
    {
        student.setEmail(email);
        return this;
    }

    public Student build()
    {
        return this.student;
    }
}
