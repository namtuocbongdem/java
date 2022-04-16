package main;

import java.util.ArrayList;
import java.util.Scanner;

import action.QuanBaiAction;
import beans.QuanBai;

public class QuanBaiMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<QuanBai> listQuanBai = new ArrayList<>();
		QuanBaiAction.input(listQuanBai);
		QuanBaiAction.displayData(listQuanBai);
	}
}

