package kr.hs.dgsw.ch17;

class TV
{
	public void onTV()
	{
		System.out.println("���� ��� ��");
	}
}

interface Computer
{
	public void dataReceive();
}

class ComputerImp1
{
	public void dataReceive()
	{
		System.out.println("���� ������ ���� ��");
	}
}

class IPTV extends TV implements Computer
{
	ComputerImp1 comp = new ComputerImp1();
	
	public void dataReceive()
	{
		comp.dataReceive();
	}
	public void powerOn()
	{
		dataReceive();
		onTV();
	}
}

public class MultiInheriAlternative {
	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();
		
		TV tv=iptv;
		Computer comp=iptv;
	}
}
