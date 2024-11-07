package huststack;
import java.util.*;

class NhanVien{
	String name;
	int dob;
	int work_time;
	int current_salary;
	public  NhanVien(String name, int dob, int work_time, int current_salary) {
		this.name = name;
		this.dob = dob;
		this.work_time = work_time;
		this.current_salary = current_salary;
	}
	public String toString() {
		return name + " " + dob +" "+ work_time + " " + current_salary;
	}
}
public class employee_management {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int MAX = sc.nextInt();
		int basic_salary = sc.nextInt();
		int heso1 = sc.nextInt();
		int heso2 = sc.nextInt();
		int totalSalary = 0;
		int current_salary = 0;
		ArrayList<NhanVien> employees = new ArrayList<>();
		sc.nextLine();
		for(int i = 0;i<n;i++) {
			String name = sc.nextLine();
			int dob = sc.nextInt();
			int work_time = sc.nextInt();
			sc.nextLine();
			if(work_time>10) {
			 current_salary = basic_salary*heso1 + (basic_salary * (work_time/5)*heso2);
			}
			else {
				current_salary = basic_salary*heso1 + (basic_salary* ((work_time-5)/5)*heso2);
			}
			if(current_salary > MAX) {
				current_salary = MAX;
			}
			employees.add(new NhanVien(name, dob, work_time, current_salary));
			totalSalary += current_salary;
		}
		for(NhanVien employee : employees) {
			System.out.print(employee + " ");
		}
		System.out.println(totalSalary);
		sc.close();
	}
}
