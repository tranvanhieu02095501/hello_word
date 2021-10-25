package lopao_giaodien;
//1: Hãy xây dựng một lớp ảo có tên là Person và gồm có các thuộc tính birthday, gender,
//blood_type. Hãy xây dựng các constructor, getter và setter cho lớp ảo này.

public class bai_lopao {
     private  String birthday ;
     private   String gender;
     private String blood_type;
    
	public bai_lopao() {
		super();
	}

	public bai_lopao(String birthday, String gender, String blood_type) {
		super();
		this.birthday = birthday;
		this.gender = gender;
		this.blood_type = blood_type;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBlood_type() {
		return blood_type;
	}

	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}
     
     
}
