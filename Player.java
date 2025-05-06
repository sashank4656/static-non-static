public class Player
{
	public static int totalPlayers=0;
	public String playerName;
public static void main(String args[])
{
	Player a = new Player();
	Player b = new Player();
	a.playerName="Sai";
	Player.totalPlayers++;
	b.playerName="Kiran";
	Player.totalPlayers++;
	System.out.println("Total Players : "+Player.totalPlayers);
}
}
