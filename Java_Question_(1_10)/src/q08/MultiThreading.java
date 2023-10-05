package q08;

class test extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.print(i+" ");
		}
		System.out.println("printed all even number in range");
	}
}

class test1 extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1)
				System.out.print(i+ " ");
		}
		System.out.println("printed all odd number in range");
	}
}

public class MultiThreading {

	public static void main(String[] args) {

		test t = new test();
		test1 t1 = new test1();

		t.start();

		t1.start();

	}

}
