public class UltimatePlayer extends Person
{
  private static int jerseyNumberCount = 1;
  private int jerseyNumber;
  private String position;

  public UltimatePlayer(String fn, String ln, String pos)
  {
    super(fn, ln);
    if(!pos.equals("handler"))
    {
      pos = "cutter";
    }
    position = pos;
    jerseyNumber = jerseyNumberCount++;
  }

  public String getPosition()
  {
    return position;
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
    return power * 4;
  }

  public String toString()
  {
    return super.toString() + "\n  Jersey #: " + jerseyNumber + "\n  Position: " + position;
  }
}