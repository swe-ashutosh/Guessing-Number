package gamingproject.backend;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	//logic to generate random number
	public static int[] randomNumber() {
		int[] arr = new int[3];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(11);
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String uname=sc.nextLine();
		System.out.println("enter the phoneno");
		Long uphno=sc.nextLong();
		System.out.println("enter the amount");
		Double uamount=sc.nextDouble();
		double amountPerGame = uamount / 3;
		
	
		int[] sgn=randomNumber();
			
		double earnAmount=0;
		System.out.println("all the best lets start the game");
		int[] useramount = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("guess the number");
			useramount[i] = sc.nextInt();
			if (useramount[i] == sgn[i]) {
				earnAmount = earnAmount + amountPerGame * 2;
				System.out.println("great guess");
			} else {
				System.out.println("ooops better luck next time");
			}
		}
		System.out.println(earnAmount);
		
		EntityManagerFactory e = Persistence.createEntityManagerFactory("gaming");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();

		User u = new User();
		u.setName(uname);
		u.setPhno(uphno);
		u.setInvestedmoney(uamount);
		u.setRandomnumber(Arrays.toString(sgn));
		u.setUsernumber(Arrays.toString(useramount));
		u.setEarnmoney(earnAmount);

		t.begin();
		m.persist(u);
		t.commit();

	}

	}

