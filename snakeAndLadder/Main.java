package snakeAndLadder;

import java.util.Scanner;

class Create{
	public int counter=0;
	public void roll() {
		int max = 6;
        int min = 1;
        int range = max - min + 1;
        int ex=counter;
        int rand = (int)(Math.random() * range) + min;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(rand);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(ex+rand >50) {
        	System.out.println("---You need "+(50-ex)+" to win---");
        }
        else {
        	counter=counter+rand;
        }
            
	}
	public void snake() {
		switch(this.counter) {
		case 12:System.out.println("^^^Oh.. You had stepped on a snake^^^");
		this.counter=9;
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		break;
		case 25:System.out.println("^^^Oh.. You had stepped on a snake^^^");
		this.counter=6;
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		break;
		case 33:System.out.println("^^^Oh.. You had stepped on a snake^^^");
		this.counter=9;
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		break;
		case 11:System.out.println("^^^Oh.. You had stepped on a snake^^^");
		this.counter=6;
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		break;
		case 48:System.out.println("^^^Oh.. You had stepped on a snake^^^");
		this.counter=9;
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		break;
		}
	}
	public void ladder() {
		switch(this.counter) {
		case 17:System.out.println("****Hurray.. You got a ladder****");
		this.counter=25;
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		break;
		case 2:System.out.println("****Hurray.. You got a ladder****");
		this.counter=18;
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		break;
		case 26:System.out.println("****Hurray.. You got a ladder****");
		this.counter=32;
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		break;
		case 39:System.out.println("****Hurray.. You got a ladder****");
		this.counter=41;
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		break;
		case 25:System.out.println("****Hurray.. You got a ladder****");
		this.counter=44;
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		break;
		}
	}
	public boolean win() {
		if(counter==50) {
			return false;
		}
		else {
			return true;
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select number of players");
		int num=sc.nextInt();
		Create ob[]=new Create[num];
		for(int i=0;i<num;i++) {
			ob[i]=new Create();
		}
		boolean b=true;
		int j=0;
		while(b) {
			while(true) {
				
				int p=j+1;
				System.out.println("Player "+p+" turn:");
				System.out.println("Enter r to roll the dice");
				String xyz=sc.next();
				ob[j].roll();
				ob[j].snake();
				ob[j].ladder();
				System.out.println("Player "+p+" You are at "+ob[j].counter);
				System.out.println("--------------------------------------------------");
				b=ob[j].win();
				if(b==false) {
					System.out.println();
					System.out.println("#######################################");
					System.out.println();
					System.out.println("******WINNER WINNER CHICKEN DINNER******");
					System.out.println("PLAYERS "+p+" WINS");
					System.out.println("CONGRATULATIONS");
					System.out.println();
					System.out.println("#######################################");
					break;
				}
				if(j==(num-1)) {
					j=0;
				}
				else {
					j++;
				}
			}
		}
	    sc.close();
	}

}
