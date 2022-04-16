package action;

import java.util.ArrayList;
import java.util.Scanner;
import beans.QuanBai;

public class QuanBaiAction {
	static Scanner sc = new Scanner(System.in);
	public static void input(ArrayList<QuanBai> listQuanBai)
	{
		boolean check = true;
		int n=0;
		do {
			try {
				System.out.print("Nhap bao nhieu quan bai: ");
				n = Integer.parseInt(sc.nextLine());
				if(n<0)
					throw new NumberFormatException("loi");
				check = false;
			}  catch (NumberFormatException e) {
				System.out.println("loi dinh dang so!");
			}
		} while(check);
		
		for(int i = 1 ;i<=n;i++)
		{
			
			System.out.print("Nhap ten quan bai: ");
			String name = sc.nextLine();
			boolean c = true;
			int point =0;
			do {
				try {
					System.out.print("Nhap diem quan bai: ");
					point = Integer.parseInt(sc.nextLine());
					if(point < 1 || point > 4)
						throw new NumberFormatException("loi");
					c = false;
				}  catch (NumberFormatException e) {
					System.out.println("loi dinh dang so!");
				}
			} while(c);
			
//			System.out.print("Nhap he so quan bai: ");
//			int exp = Integer.parseInt(sc.nextLine());
			boolean b = true;
			int exp =0;
			do {
				try {
					System.out.print("Nhap he so quan bai: ");
					exp = Integer.parseInt(sc.nextLine());
					if(exp < 1 || exp>13)
						throw new NumberFormatException("loi");
					b = false;
				}  catch (NumberFormatException e) {
					System.out.println("loi dinh dang so!");
				}
			} while(b);
			
			QuanBai quanbai = new QuanBai(name, exp, point);
			listQuanBai.add(quanbai);
		}
	}
	
	public static void displayData(ArrayList<QuanBai> listQuanBai) {
		if (listQuanBai.size() == 0) {
			System.out.println("Danh sach quan bai trong!");
		} else {
			System.out.println("Ten quan bai\t\tdiem quan bai\t\the so quan bai");
			for (QuanBai objWord : listQuanBai) {
				System.out.println(objWord);
			}
		}
	}
}
