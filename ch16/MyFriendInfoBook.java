package kr.hs.dgsw.ch16;

import java.util.Scanner;

class Friend
{
	String name;
	String phoneNum;
	String addr;
	
	public Friend(String name, String phone, String addr)
	{
		this.name = name;
		this.phoneNum = phone; // this ���� ����
		this.addr = addr;
	}
	public void showData()
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+phoneNum);
		System.out.println("�ּ� : "+addr);
	}
	public void showBasicInfo(){ }
}

class HighFriend extends Friend // ���� ��â
{
	String work;
	public HighFriend(String name, String phone, String addr, String job)
	{
		super(name,phone,addr);
		this.work = job;
	}
	public void showData()
	{
		super.showData();
		System.out.println("���� : "+work);
	}
	public void showBasicInfo()
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+phoneNum);
	}
}

class UnivFriend extends Friend // ���е���
{
	String major; // �����а�
	public UnivFriend(String name , String phone, String addr, String major)
	{
		super(name,phone,addr);
		this.major = major;
	}
	public void showData()
	{
		super.showData();
		System.out.println("���� : "+major);
	}
	public void showBasicInfo()
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+phoneNum);
	}
}

class FriendInfoHandler
{
	private Friend[] myFriends;
	private int numOfFriends;
	
	public FriendInfoHandler(int num)
	{
		myFriends = new Friend[num];
		numOfFriends=0;
	}
	
	private void addFriendInfo(Friend fren)
	{
		myFriends[numOfFriends++]=fren;
	}
	
	public void addFriend(int choice)
	{
		String name , phoneNum, addr, job, major;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� : "); name=sc.nextLine();
		System.out.println("��ȭ : "); phoneNum=sc.nextLine();
		System.out.println("�ּ� : "); addr=sc.nextLine();
		
		if(choice==1)
		{
			System.out.println("���� : "); job=sc.nextLine();
			addFriendInfo(new HighFriend(name,phoneNum,addr,job));
		}
		else
		{
			System.out.print("�а� : "); major=sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("�Է� �Ϸ�! \n");
	}
	
	public void showAllData()
	{
//		for(int i=0; i<numOfFriends; i++)
//		{
//			myFriends[i].showData();
//			System.out.println("");
//		}
		for(Friend f : myFriends){
			if(f!=null) f.showData();
			System.out.println("");
		}
	}
	
	public void showAllSimpleData()
	{
//		for(int i=0; i<numOfFriends; i++)
//		{
//			myFriends[i].showBasicInfo();
//			System.out.println("");
//		}
		for(Friend f : myFriends){
			if(f!=null) f.showBasicInfo();
			System.out.println("");
		}
	}
	
}

public class MyFriendInfoBook {
	public static void main(String[] args) {
		
		FriendInfoHandler handler = new FriendInfoHandler(10);
		
		while(true)
		{
			System.out.println("*** �޴� ���� ***");
			System.out.println("1. ���� ���� ����");
			System.out.println("2. ���� ģ�� ����");
			System.out.println("3. ��ü ���� ���");
			System.out.println("4. �⺻ ���� ���");
			System.out.println("5. ���α׷� ����");
			System.out.println("����>> ");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showAllSimpleData();
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}