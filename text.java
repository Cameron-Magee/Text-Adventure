import java.util.Scanner;
import java.util.Random;
public class text
{
	public static void main(String args [])
	{
		Scanner scan=new Scanner(System.in);
		boolean alive=true;
		Hero H1=new Hero("Cameron",10,2,2);
		Monster M1=new Monster("Anjanath",20,2,10);
		Engine Source=new Engine();
		Source.space();
		H1.stats();
		Source.space();
		M1.stats();
		while(!H1.checkPulse()&&!M1.checkPulse())
		{
			Source.space();
			System.out.println("Do you want to Attack?");
			String ans=scan.nextLine();
			if(ans.equalsIgnoreCase("Yes"))
			{
				M1.setHp(H1.Attack());
				Source.space();
				M1.getHp();
			}
			Source.space();
			System.out.println("The "+M1.getName()+" attacks You!");
			H1.setHp(M1.Attack());
			Source.space();
			H1.getHp();
		}
		Source.space();
		if(H1.checkPulse())
		{
			System.out.println("You have died!");
			Source.space();
			System.out.println("GAME OVER");
		}
		else if(M1.checkPulse())
		{
			System.out.println("You have defeated the "+M1.getName()+"!");
			Source.space();
			System.out.println("Congratulations!");
		}
	}
}