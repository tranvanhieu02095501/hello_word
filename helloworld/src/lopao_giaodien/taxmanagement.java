package lopao_giaodien;

public class taxmanagement {
	

		public static void main(String[] args) {
			
			Studentinterface student = new Studentinterface("19-09-2001", 'B', 0);
			Worker worker = new Worker("09-02-2000", 'O', 0);
			BusinessPerson bus = new BusinessPerson("22-02-2000",'A', 1);
			////////////////////////
			student.setName("Tộ");
			student.setStudentId("19t109887");
			student.setGender(0);
			////////////////////////////////////
			worker.setName("Trường");
			worker.setGender(0);
			worker.setSalary(1000000);
			worker.setOther_income(200000);
			////////////////////////////////
			bus.setName("Dũng");
			bus.setGender(0);
			bus.setSalary(50000000);
			bus.setOther_income(1000000);
			bus.setBusiness_income(20000000);
			
			/////////////////////////////////////
			System.out.println(student.getName());
			System.out.println(student.payTax(5000000, "29-03-2022", "29-04-2022"));
			System.out.println(worker.getName());
			System.out.println(worker.payTax(worker.getSalary() + worker.getOther_income(), "11-11-2021", "11-12-2021"));
			System.out.println(bus.getName());
			System.out.println(bus.payTax(bus.getSalary() + bus.getOther_income() + bus.getBusiness_income(), "11-11-2021", "11-12-2021"));
		}

	}

