package kr.hs.dgsw.ch15;

import java.util.Scanner;

/*
 * ±ÇÃÑ ºÎÅÍ ´Ù ½î°í
 * ±× ´ÙÀ½ÀÇ ±â°üÃÑÀ¸·Î °¥±ä´Ù.
 * ´Ù ½î¸é ¿À¹ö
 */

abstract class Weapon{
	abstract void shot();
	int bullet;
	String name="¹«±â";
}

// ±ÇÃÑ
class Gun extends Weapon
{
	int bullet; // ÀåÂøµÈ ÃÑ¾ËÀÇ ¼ö
	
	public Gun(int bnum, String name){ 
		this.bullet=bnum; 
		this.name=name; 
	}
	
	public void shot()
	{
		while(this.bullet!=0){
			System.out.println("BBANG!");
			this.bullet--;
		}
	}
	public void my_name()
	{
		System.out.println(this.name);
	}
	
}

// ±â°ü ÃÑ
class MachineGun extends Weapon
{
	int bullet; // ÀåÂøµÈ ÃÑ¾ËÀÇ ¼ö
	public MachineGun(int bnum,String name){ 
		this.bullet=bnum; 
		this.name=name;
	}
	
	public void shot() {
		while(this.bullet!=0){
			System.out.println("DDADDADDA!");
			this.bullet--;
		}
	}
}
	
class Police
{
	
	int handcuffs;
	int bullet;
	
//	Weapon[] weapons = {
//		new Gun(30) , new MachineGun(30)
//	};
	Weapon[] weapons;
	
	public Police(int bcuff , int bullet)
	{
		this.handcuffs = bcuff;
		weapons = new Weapon[]{ new Gun(bullet,"¿µÈÆ±ÇÃÑ") , new MachineGun(bullet,"¿µÈÆ ±â°üÃÑ") };
	}
	
	public void shot()
	{
		shotAll(weapons);
	}
	public void shotAll(Weapon[] w)
	{
//		addWeapon(weapons[0]);
//		weapons[0].shot();
//		removeWeapon(weapons[0]);
//		System.out.println("ÃÑ¾Ë Ã¼ÀÎÁö");
//		addWeapon(weapons[1]);
//		weapons[1].shot();
//		removeWeapon(weapons[1]);
		for(int i=0; i<weapons.length; i++)
		{
			addWeapon(weapons[i]);
			weapons[i].shot();
			if(weapons[1]==weapons[i]){
				removeWeapon(weapons[i]);
				System.out.println("È÷Èý??!??!?È÷ÈýÈ÷È÷ÆRÈ÷Èý!");
				System.out.println("ÃÑ¾Ë ´Ù½Î¼­  ³Êµµ Á×À½ ²ó!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó²ó");
				System.out.println("GAME OVER");
				break;
			}
			removeWeapon(weapons[i]);
			System.out.println("ÃÑ¾Ë Ã¼ÀÎÁö");
		}
	}
	
	public void addWeapon(Weapon w)
	{
		System.out.println(w.name+"ÀåÂø!");
		
	}
	
	public void removeWeapon(Weapon w)
	{
		for(Weapon e : weapons){
			if(e==w){
				System.out.println(w.name + " ÀåÂø ÇØÁ¦!");
				e= null;
			}
		}
		
	}
}

public class HASComposite {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int bullet = sc.nextInt();
		Police police = new Police(10,bullet);
		police.shot();
	}	
}
