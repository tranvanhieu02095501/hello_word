package lopao_giaodien;

public class manage {
	

		public static void main(String[] args) {
			
			Studentinterface student = new Studentinterface("09-11-1992", 'B', 0);
			Worker worker = new Worker("09-11-1992", 'O', 0);
			interface_tax bus = new interface_tax("09-11-1992",'B', 1);
			
			student.setName("Tộ");
			student.setStudentId("20t1033987");
			student.setGender(0);
			
			worker.setName("Đức");
			worker.setGender(0);
			worker.setSalary(1000000);
			worker.setOther_income(200000);
			
			bus.setName("Tài");
			bus.setGender(1);
			bus.setSalary(50000000);
			bus.setOther_income(1000000000);
			bus.setBusiness_income(20000000);
			
			//
			System.out.println(student.getName());
			System.out.println(student.payTax(3000000, "11-11-2021", "11-12-2021"));
			System.out.println(worker.getName());
			System.out.println(worker.payTax(worker.getSalary() + worker.getOther_income(), "11-11-2021", "11-12-2021"));
			System.out.println(bus.getName());
			System.out.println(bus.payTax(bus.getSalary() + bus.getOther_income() + bus.getBusiness_income(), "11-11-2021", "11-12-2021"));
		}

	}

