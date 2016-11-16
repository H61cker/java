package kr.hs.dgsw.ch15;

import java.util.Scanner;

/*
 * ���� ���� �� ���
 * �� ������ ��������� �����.
 * �� ��� ����
 */

abstract class Weapon{
	abstract void shot();
	int bullet;
	String name="����";
}

// ����
class Gun extends Weapon
{
	int bullet; // ������ �Ѿ��� ��
	
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

// ��� ��
class MachineGun extends Weapon
{
	int bullet; // ������ �Ѿ��� ��
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
		weapons = new Weapon[]{ new Gun(bullet,"���Ʊ���") , new MachineGun(bullet,"���� �����") };
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
//		System.out.println("�Ѿ� ü����");
//		addWeapon(weapons[1]);
//		weapons[1].shot();
//		removeWeapon(weapons[1]);
		for(int i=0; i<weapons.length; i++)
		{
			addWeapon(weapons[i]);
			weapons[i].shot();
			if(weapons[1]==weapons[i]){
				removeWeapon(weapons[i]);
				System.out.println("����??!??!?���������R����!");
				System.out.println("�Ѿ� �ٽμ�  �ʵ� ���� ��!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("���������������������������������������");
				System.out.println("GAME OVER");
				break;
			}
			removeWeapon(weapons[i]);
			System.out.println("�Ѿ� ü����");
		}
	}
	
	public void addWeapon(Weapon w)
	{
		System.out.println(w.name+"����!");
		
	}
	
	public void removeWeapon(Weapon w)
	{
		for(Weapon e : weapons){
			if(e==w){
				System.out.println(w.name + " ���� ����!");
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
