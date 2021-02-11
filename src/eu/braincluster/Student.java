package eu.braincluster;

public class Student
{
    private String name;
    private String email;
    private String ipAddress;
    private String creditCardNo;

    public Student()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getIpAddress()
    {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress)
    {
        this.ipAddress = ipAddress;
    }

    public String getCreditCardNo()
    {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo)
    {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", creditCardNo='" + creditCardNo + '\'' +
                '}';
    }
}
