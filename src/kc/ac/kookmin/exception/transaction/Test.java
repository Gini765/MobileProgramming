package kc.ac.kookmin.exception.transaction;

class Bank {
	private int balance = 1000;

	public void oneqTrade() {
		try {
			tradeWithA();
		} catch (Exception e) {
			System.out.println("A���� �ŷ� ���� �߻�");
			cancelA();
		}
		try {
			tradeWithB();
		} catch (Exception e) {
			System.out.println("B���� �ŷ� ���� �߻�");
			cancelB();
		}
		try {
			tradeWithC();
		} catch (Exception e) {
			System.out.println("C���� �ŷ� ���� �߻�");
			cancelC();
		}
		System.out.println("�ܿ� �ݾ� : " + balance); // ���� �߻��� �ܿ��ݾ��� ó�� �ݾװ� ����
	}

	public void tradeWithA() throws Exception {
		int m = 100; // A���¿��� ����� �ݾ�

		System.out.println("A ���¿��� ��� - " + m);
		balance -= m;
	}

	public void tradeWithB() throws Exception {
		int m = 200; // B���¿��� ����� �ݾ�

		System.out.println("B ���¿��� ��� - " + m);
		balance -= m;
	}

	public void tradeWithC() throws Exception {
		int m = 300; // C���¿��� ����� �ݾ�
		
		System.out.println("C ���¿��� ��� - " + m);
		balance -= m;
		
		Exception ex = new Exception();
		throw ex;
	}

	public void cancelA() {
		System.out.println("A ���� �ŷ� ���  ");
		balance += 100;
	}

	public void cancelB() {
		System.out.println("B ���� �ŷ� ���  ");
		balance += 200;
	}

	public void cancelC() {
		System.out.println("C ���� �ŷ� ���  ");
		balance += 300;
	}
}

public class Test {
	public static void main(String args[]) {
		Bank b = new Bank();
		b.oneqTrade();
	}
}