public class Person 
{
  private String firstName;
  private String lastName;
  
  public Person(String fn, String ln) 
  {
    firstName = fn;
    lastName = ln;
  }

  public int throwDisc(int power)
  {
    if (power < 1)
    {
      power = 1;
    }
    else if (power > 10)
    {
      power = 10;
    }
    return (power * 2);
  }

  public String toString()
  {
    return lastName + ", " + firstName;
  }
}