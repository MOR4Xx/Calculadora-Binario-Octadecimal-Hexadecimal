package Calculadora;
import java.util.Scanner;
import java.lang.Thread;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("---Menu---");
			System.out.println("1- Decimal para Binário");
			System.out.println("2- Decimal para Octal");
			System.out.println("3- Decimal para Hexadecimal");
			System.out.println("4- Binário para Decimal");
			System.out.println("5- Binário para Octal");
			System.out.println("6- Binário para Hexadecimal");
			System.out.println("7- Exit");
			System.out.print("Digite a opção do menu:");
			int menu = sc.nextInt();

			switch (menu) {
				case 1:
					binario(sc);
					break;
				case 2:
					octal(sc);
					break;
				case 3:
					hexa(sc);
					break;
				case 4:
					bidec(sc);
					break;
				case 5:
					biocta(sc);
					break;
				case 6:
					bihexa(sc);
					break;
				case 7:
					System.out.println("Saindo do programa...");
					return;
				default:
					System.out.println("Escolha uma das opções!!!");
					break;
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

	private static void binario(Scanner sc) {
		int j, i = 0, num;
		int[] bin = new int[50];
		System.out.print("Informe o número: ");
		num = sc.nextInt();
		while (num > 0) {
			bin[i++] = num % 2;
			num = num / 2;
		}
		System.out.print("Binário: ");
		for (j = (i - 1); j >= 0; j--) {
			System.out.printf("%d", bin[j]);
		}
	}

	private static void octal(Scanner sc) {
		int j, i = 0, num;
		int[] octa = new int[50];
		System.out.print("Informe o número: ");
		num = sc.nextInt();
		while (num > 0) {
			octa[i++] = num % 8;
			num = num / 8;
		}
		System.out.print("Octal: ");
		for (j = (i - 1); j >= 0; j--) {
			System.out.printf("%d", octa[j]);
		}
	}
	private static void hexa(Scanner sc) {
		int j, i = 0, num;
		int[] hexa = new int[50];
		System.out.print("Informe o número: ");
		num = sc.nextInt();
		while (num > 0) {
			hexa[i++] = num % 16;
			num = num / 16;
		}
		System.out.print("Hexadecimal: ");
		for (j = (i - 1); j >= 0; j--) {
			if (hexa[j] >= 10)
				System.out.printf("%c", hexa[j] - 10 + 'A');
			else
				System.out.printf("%d", hexa[j]);
		}
	}
	private static void bidec(Scanner sc){
		int j,i = 0, dec;
		long conv = 0;
		int[] bin = new int[50];
		System.out.print("Informe o número: ");
		dec = sc.nextInt();
		while (dec>0){
			bin[i++]= dec%10;
			dec= dec/10;
		}
		for (j= i-1;j>=0; j--){
			long result = bin[j];
			if(result==1){
				conv= conv+(long) Math.pow(2, j);
			}
		}
		System.out.println("Decimal: "+conv);
	}
	private static void biocta(Scanner sc){
		int j,i = 0, dec;
		long conv = 0;
		int[] bin = new int[50];
		System.out.print("Informe o número: ");
		dec = sc.nextInt();
		while (dec>0){
			bin[i++]= dec%10;
			dec= dec/10;
		}
		for (j= i-1;j>=0; j--){
			long result = bin[j];
			if(result==1){
				conv= conv+(long) Math.pow(2, j);
			}
		}
		int k, l = 0;
		long[] octa = new long[50];
		while (conv > 0) {
			octa[l++] = conv % 8;
			conv = conv / 8;
		}
		System.out.print("Octal: ");
		for (k = (l - 1); k >= 0; k--) {
			System.out.printf("%d", octa[k]);
		}

	}
	public static void bihexa(Scanner sc){
		int j,i = 0, dec;
		int conv = 0;
		int[] bin = new int[50];
		System.out.print("Informe o número: ");
		dec = sc.nextInt();
		while (dec>0){
			bin[i++]= dec%10;
			dec= dec/10;
		}
		for (j= i-1;j>=0; j--){
			long result = bin[j];
			if(result==1){
				conv= conv+(int) Math.pow(2, j);
			}
		}
		int k, l = 0;
		int[] hexa = new int[50];
		while (conv > 0) {
			hexa[l++] = conv % 16;
			conv = conv / 16;
		}
		System.out.print("Hexadecimal: ");
		for (k = (l - 1); k >= 0; k--) {
			if (hexa[k] >= 10)
				System.out.printf("%c", hexa[k] - 10 + 'A');
			else
				System.out.printf("%d", hexa[k]);
		}
	}
}
