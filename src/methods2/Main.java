package methods2;

public class Main {

	public static void main(String[] args) {
		int toplam = topla2(1, 2, 3, 5, 6, 8);
		System.out.println(toplam);
		Add();
		Remove();
		Update();

	}

	public static void Add() {
		System.out.println("Eklendi");
	}

	public static void Remove() {
		System.out.println("Silindi");
	}

	public static void Update() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

}
