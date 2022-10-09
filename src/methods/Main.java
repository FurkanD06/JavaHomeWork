package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayilar = {1,2,3,4,5,7,8};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi=true;
				break;
			}
		}
		
		String mesaj = "";
		
		if(varMi) {
			mesaj = "Sayi mevcuttur: "+aranacak;
			mesajVer(mesaj);
		}
		else {
			mesajVer("Sayi mevcut değildir: "+aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
