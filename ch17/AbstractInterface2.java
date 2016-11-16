//package kr.hs.dgsw.ch17;
//
//interface PersonalNumberStorage
//{
//	void addPersonalInfo(String name,String perNum);
//	String searchName(String perNum);
//}
//
//class PersonalNumInfo
//{
//	String name;
//	String number;
//	
//	PersonalNumInfo(String name, String number)
//	{
//		this.name = name;
//		this.number = number;
//	}
//	
//	String getName(){ return name; }
//	String getNumber(){ return number; }
//}
//
//class PersonalNumberStorageImp1 implements PersonalNumberStorage
//{
//	PersonalNumInfo[] perArr;
//	int numOfPerInfo;
//	
//	PersonalNumberStorageImp1(int sz)
//	{
//		perArr = new PersonalNumInfo[sz];
//		numOfPerInfo=0;
//	}
//	
//	public void addPersonalInfo(String name, String perNum)
//	{
//		perArr[numOfPerInfo] = new PersonalNumInfo(name,perNum);
//		numOfPerInfo++;
// 	}
//	
//	public String searchName(String perNum)
//	{
//		for(int i=0; i<numOfPerInfo; i++)
//		{
//			if(perNum.compareTo(perArr[i].getNumber())==0)
//			{
//				return perArr[i].getName();
//			}
//		}
//		return null;
//	}
//}
//
//public class AbstractInterface2 {
//	public static void main(String[] args) {
//		PersonalNumberStorage storage = new PersonalNumberStorageImp1(100);
//		storage.addPersonalInfo("��⵿", "950000-1122333");
//		storage.addPersonalInfo("����", "970000-1122334");
//		
//		System.out.println(storage.searchName("950000-1122333"));
//		System.out.println(storage.searchName("970000-1122334"));
//	}
//}
