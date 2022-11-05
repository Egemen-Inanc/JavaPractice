package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 21;
		int sayi2 =25;
		int sayi3 =25;
		int enBuyuk =sayi1;
		if(enBuyuk<sayi2)
			enBuyuk=sayi2;
		else if(enBuyuk<sayi3)
			enBuyuk=sayi3;
		System.out.println("Greatest number given is "+ enBuyuk);
//		if(sayi1>sayi2)
//		{
//			if(sayi1>sayi3)
//			{
//				System.out.println("en buyuk sayi sayi1'dir");
//			}
//			else if(sayi1==sayi3)
//			{
//				System.out.println("sayi1, sayi2'den buyuktur ve sayi3'e esittir ");
//			}
//			else
//			{
//				System.out.println("en buyuk sayi sayi3'dur");
//			}
//		}
//		else
//		{
//			if(sayi2>sayi3)
//			{
//				System.out.println("en buyuk sayi sayi2'dir");
//			}
//			else if(sayi2==sayi3)
//			{
//				System.out.println("sayi2, sayi1'den buyuktur ve sayi3'e esittir ");
//			}
//			else
//			{
//				System.out.println("en buyuk sayi sayi3'dur");
//			}
		}
	}

