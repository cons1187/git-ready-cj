import java.util.ArrayList;
public class UltimateTeam
{
  private ArrayList<UltimatePlayer> players;
  private ArrayList<Coach> coaches;

  public UltimateTeam(ArrayList<UltimatePlayer> p, ArrayList<Coach> c)
    {
      players = p;
      coaches = c;
    }

  public String getCutters()
    {
      String s = "";
      for (int i = 0; i < players.size(); i++)
        {
          if (players.get(i).getPosition().equals("cutter"))
          {
            s += players.get(i).toString() + "\n";
          }
        }
      return s;
    }

  public String getHandlers()
  {
    String s = "";
    for (int i = 0; i < players.size(); i++)
      {
        if (players.get(i).getPosition().equals("handler"))
        {
          s += players.get(i).toString() + "\n";
        }
      }
    return s;
  }

  public String toString()
    {
      String s = "COACHES\n";
      for (int i = 0; i < coaches.size(); i++)
        {
          s += "\n" + coaches.get(i).toString() + "\n";
        }
      s += "\nPLAYERS\n";
      for (int i = 0; i < players.size(); i++)
        {
          s += "\n" + players.get(i).toString() + "\n";
        }
      return s;
    }
}