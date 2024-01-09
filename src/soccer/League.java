package soccer;

public class League
{
    public static void main(String[] args)
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Team t1 = new Team();
        Game g1 = new Game();

        p1.playerName = "George Eliot";
        p2.playerName = "Graham Greene";
        p3.playerName = "Geoffrey Chaucer";
        Player[] thePlayers = { p1,p2,p3 };
        t1.teamName = "The Greens";
        t1.playerArray = thePlayers;
        //p1.playerName = "Robert Service";
        for(Player thePlayer : t1.playerArray)
        {
            System.out.println(thePlayer.playerName);
        }

        Team t2 = new Team();
        t2.teamName = "The Reds";
        t2.playerArray = new Player[3];
        t2.playerArray[0] = new Player();
        t2.playerArray[0].playerName = "Robert Service";
        t2.playerArray[1] = new Player();
        t2.playerArray[1].playerName = "Robbie Burns";
        t2.playerArray[2] = new Player();
        t2.playerArray[2].playerName = "Rafael Sabatini";


        for(Player thePlayer : t2.playerArray)
        {
            System.out.println(thePlayer.playerName);
        }

    }
}
