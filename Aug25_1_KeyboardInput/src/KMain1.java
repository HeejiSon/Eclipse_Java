import java.util.Scanner;

public class KMain1 {

	public static void main(String[] args) throws InterruptedException {
		
//		Scanner : Java�� ����Ǿ� �ִ� ��� �� �ϳ�!
//		�� ����� ����ϱ� ���ؼ� 'import'��� ���� ����
		
//		Scanner : ȭ��(console)���κ��� �����͸� �Է� �޴� ���
		
//		Scanner��� ����� ���� �� �ؾ��ϴ� �� ��
		
		Scanner keyboard = new Scanner(System.in);
		
//		�ܼ�â�� �� �Է��ؾ� �ϴ��� ������Ѵ�.
		// 1. ���� �Է��� �츮�� ���� ��
		// 2. �Է¹��� ���� ������ ���
		// 3. ���� ���� ����ϱ�
		
		// �̸�
		System.out.print("�̸� : "); 		
		String name = keyboard.next();  	
											
		
		// Ű
		System.out.print("Ű : ");
		double height = keyboard.nextDouble();
		
		
		// �Ź� ������
		System.out.print("�Ź� ������ : ");
		int size = keyboard.nextInt();
		
		
		// ���డ�� ���� ���� 
		System.out.print("���డ�� ���� ���� : ");
		String trip = keyboard.next();
		;
		
		// �����ϴ� ����
		System.out.print("�����ϴ� ���� : ");
		int num = keyboard.nextInt();
		
		
		// ���� �������� ����
		System.out.print("���� �������� ���� : ");
		boolean now = keyboard.nextBoolean();
		
		System.out.println("==============================");
		System.out.printf("�̸� : %s\n", name);	
		System.out.printf("Ű : %.1f\n",height);
		System.out.printf("�Ź� ������ : %d\n", size);
		System.out.printf("���డ�� ���� ���� : %s\n", trip);
		System.out.printf("�����ϴ� ���� : %d\n", num);
		System.out.printf("���� �������� ���� : %b\n", now);
		System.out.println("==============================");
		
		System.out.println(size + num);
		// bat(��ġ) ���� ����
		System.out.print("���� ������ �ƹ��ų� �Է� : ");
		
		String quit = keyboard.next();
		keyboard.close(); // scanner ��� ����
		
		Thread.sleep(1000); // 1��
		System.out.print(".");
		Thread.sleep(1000); // 1��
		System.out.print(".");
		Thread.sleep(1000); // 1��
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println("���α׷��� �����մϴ�.");
		Thread.sleep(500); // 0.5��
		System.out.println("��¥ �ȳ�!!");
		Thread.sleep(500); // 0.5��
		
	}

}
