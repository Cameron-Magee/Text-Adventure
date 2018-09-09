public class Monster
{
	public int Hp2=0;
	public int att1=0;
	public int att2=0;
	public String Name="";
	public boolean dead2=false;
	
	public Monster()
	{
		Hp2=10;
		att1=2;
		att2=5;
		Name="Bolrag";
		dead2=false;
	}
	public Monster(String name,int hp,int at1,int at2)
	{
		Hp2=hp;
		att1=at1;
		att2=at2;
		Name=name;
		dead2=false;
	}
	public int Attack()
	{
		System.out.println("");
		System.out.println("The "+Name+" hit You for "+att2+" damage!");
		return att2;
	}
	public boolean Die()
	{
		return false;
	}
	public void stats()
	{
		System.out.println("Name: "+Name);
		System.out.println("HP: "+Hp2);
		System.out.println("Att: "+att2);
	}
	public void setHp(int dmg)
	{
		Hp2=Hp2-dmg;
		if(Hp2<=0)
		{
			dead2=true;
		}
	}
	public void getHp()
	{
		System.out.println("Monster HP: "+Hp2);
	}
	public String getName()
	{
		return Name;
	}
	public boolean checkPulse()
	{
		return dead2;
	}
}