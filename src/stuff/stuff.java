package stuff;

public class stuff {
    public static void main(String args[]){
    stuff123 ss1 =new stuff123("Abner","male","Taiwan","Operator");	 
    stuff123 ss2 =new stuff123("Ada","female","Taiwan","Operator");
    stuff123 ss3 =new stuff123("Ada1","female","Taiwan","Operator");
    setName st1=new setName("Andrew","01","boy");
	setName st2=new setName("Cupid","02","boy");
	setName st3=new setName("Alice","03","girl");
	TH tt1=new TH("1111","female","Taiwan");
	TH tt2=new TH("2222","female","Taiwan");
	TH tt3=new TH("3333","female","Taiwan");
	ss1.information();
    ss1.status1();
    ss1.dealer();
    ss1.dealer2();
    ss2.information();
    ss2.status();
    ss2.dealer();
    ss2.dealer2();
    ss3.information();
    ss3.status();
    ss3.dealer();
    ss3.dealer2();
    st1.showdata();
	st1.iddata();
	st1.genderdata();
	
	st2.showdata();
	st2.iddata();
	st2.genderdata();
	
	st3.showdata();
	st3.iddata();
	st3.genderdata();
    tt1.showdata();
    tt1.teachme();
    tt1.wherecome();
    tt2.showdata();
    tt2.teachme();
    tt2.wherecome();
    tt3.showdata();
    tt3.teachme();
    tt3.wherecome();
    }
}

class stuff123{
  private String name = "xxxxxx";
  private String sex = "male";
  private String position = "Oper";
  private String position2 = "Oper1";

  public stuff123(String name1,String sex1,String position1,String position3){
	  name = name1;
	  sex =  sex1;
	  position = position1;
	  position2 = position3;
  } 
  public void information(){
	  System.out.println("資料:"+name+" "+sex);
	  
  }
  public void status(){
	  System.out.println("pm10:00-am7:00");
	   
  }
  public void status1(){
	  System.out.println("pm12:00-am12:00");
	   
  }
  public void dealer(){
	  System.out.println("國籍:"+position+"nationality");
	  
}
  public void dealer2(){
	  System.out.println("工作:"+position2+" ");
}
}
class setName {
	private String name="xxx";
	private String id="01";
	private String gender="male,female";
	public setName(String name1,String id1,String gender1){
	name=name1;
	id=id1;
	gender=gender1;
	}
	public void showdata(){
		System.out.println("學生姓名:"+name);
	}
	public void  iddata(){
		System.out.println("學生id:"+id);
	}
	public void genderdata(){
		System.out.println("學生性別:"+gender);
	}
 		
}

class TH {

		private String name = "XXX";
		private String sex = "male";
		private String area = "Taiwan";
		
		public TH(String named,String sexd,String aread){
			name = named;
			sex = sexd;	
			area = aread;
		}
		
		public void showdata(){
			System.out.println("老師姓名:"+name+" 性別:"+sex);
		}
		
		public void teachme(){
			System.out.println("我很忙");
		}
		
		public void wherecome(){
			System.out.println("這老師是"+area+"人");
		}
}
  