//import java.util.Random;
public class Hero
{
	//Random ran=new Random();
	public int Hp1=0;
	public int att1=0;
	public int att2=0;
	public String Name="";
	public boolean dead1=false;
	
	public Hero()
	{
		Hp1=10;
		att1=2;
		att2=5;
		Name="John";
		dead1=false;
	}
	public Hero(String name,int hp,int at1,int at2)
	{
		Hp1=hp;
		att1=at1;
		att2=at2;
		Name=name;
		dead1=false;
	}
	public int Attack()
	{
		System.out.println("");
		System.out.println("You hit the Monster for "+att2+" damage!");
		return att2;
	}
	public boolean checkPulse()
	{
		return dead1;
	}
	public void stats()
	{
		System.out.println("Name: "+Name);
		System.out.println("HP: "+Hp1);
		System.out.println("Att: "+att2);
	}
	public void setHp(int dmg)
	{
		Hp1=Hp1-dmg;
		if(Hp1<=0)
		{
			dead1=true;
		}
	}
	public void getHp()
	{
		System.out.println("Hero HP: "+Hp1);
	}
}