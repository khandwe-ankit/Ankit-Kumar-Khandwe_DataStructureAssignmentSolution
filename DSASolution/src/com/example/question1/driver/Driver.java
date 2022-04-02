package com.example.question1.driver;

import java.util.Scanner;

import com.example.question1.service.Service;

class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total no of floors in the building");
		int noOfFloor = sc.nextInt();
		int[] floors = new int[noOfFloor];

		for (int i = 0; i < noOfFloor; i++) {
			System.out.println("Enter the floor size on day : " + (i + 1));
			floors[i] = sc.nextInt();
		}
		System.out.println();

		Service service = new Service();
		service.printConstructionTable(floors, noOfFloor);

		sc.close();
	}
}