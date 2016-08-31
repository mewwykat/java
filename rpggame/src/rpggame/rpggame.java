package rpggame;

public class rpggame {
	
	// a static class or method does not require calling to be used
	public static void main(String[] args){
		// the object LivingThing is named L1, that object string name is Animal whose health is 100. What we're doing below from line 6-9 is to create objects
		LivingThing L1 = new LivingThing("Animal",100);
		LivingThing L2 = new LivingThing("Bird",200);
		Heroes Hero1 = new Heroes("Pikachu", 100, "helmet", 1000);
		Monster Monster1 = new Monster("Raichu", 500, "thunder");	
		System.out.println("Name: "+L1.getname());
		// below is the action of hero attackign monster
		System.out.println("Name: "+Monster1.gethealth());
		Hero1.fight(Monster1,  10);
		System.out.println("Health: "+Hero1.getname());
		Monster Monster2 = new Monster("something", 500, "ice");
		Heroes Hero2 = new Heroes("Charmander", 500, "fire");
		
		// this is to randomize, doesn't matter which hero or monster attacks which hero or monster, so we make a new array
		Monsters [] M_gp = {Monster1, Monster2}; 
		
	}
	
	// below are the fighting
	static void battlemode(Heros[] H_gp, Monsters[] M_gp){
		int h_no = (int)(Math.random()*H_gp.length);
	}
	
class LivingThing{
// below are fields, which are data
	private String name;
	private int health;
// below are constructors, even if I don't write it java will make up default for me.
	// so I can omit line 16 in this case
	LivingThing(){}
	LivingThing(String name, int health){
		this.name=name;
		this.health=health;
		// this. refers to the initialized name, health in line 17
	}
	
	//below is method. I can't change this name
	public String getname(){
		return this.name; 
	}
	public void sethealth(int health2){
		this.health = health2; 
	}
	public int gethealth(){
		return this.health;
	}
}

// below extend make the Hero inherit LivingThing
class Heroes extends LivingThing implements combat{
	private int money;
	private String weapons;
	Heroes(String name1, int health1, String weapons1, int money1) {
		// the super thing refers to the parent class
		super(name1, health1);
		this.money += money1; 
		this.weapons = weapons1;
	}
	public void setmoney(int money1){
		this.money += money1; 
	}
	
	public int getmoney(){
		return this.money;
	}
	public void setweapons(String weapons1){
		this.weapons = weapons1;
	}
	public String getweapon(){
		return this.weapons;
	}
	public void fight(combat c, int attack_pt){
		// this is to let heroes interact iwht monsters
		Monster M=(Monster) c;
		M.injury(attack_pt); 
	}
	public int injury(int attack_pt){
		sethealth(gethealth()-attack_pt);
		return gethealth();
	}
}

class Monster extends LivingThing implements combat{
	String skills; 
	Monster(String name2, int health2, String skills2){
		super(name2, health2);
		this.skills = skills2;
	}
	public void setskill(String skills2){
		this.skills = skills2;
	}
	public String getskill(){
		return this.skills; 
	}	
	public int injury(int attack_pt){
		sethealth(gethealth()-attack_pt);
		return gethealth();
	}
	@Override
	public void fight(combat c, int attack_pt) {
		Heroes Hero1 = (Heroes) c; 
		Hero1.injury(attack_pt);
		// TODO Auto-generated method stub
		
	}
}

// an interface is just like an 'index" telling us what characteristics there are between the interaction of differnet classes...this part doesn't really say much
interface combat{
	void fight(combat c, int attack_pt);
}

}
