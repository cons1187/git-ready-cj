public class Captain extends UltimatePlayer
{
  private boolean type;
  public Captain(String fn, String ln, String pos, boolean t)
  {
    super(fn, ln, pos);
    type = t;
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
    return power * 5;
  }

  public String toString()
  {
    String offOrD = "";
    if (type)
    {
      offOrD = "offense";
    }
    else
    {
      offOrD = "defense";
    }
    return super.toString() + "\n  Captain: " + offOrD;
  }
}