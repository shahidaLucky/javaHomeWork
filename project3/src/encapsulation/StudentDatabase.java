package encapsulation;

public class StudentDatabase {

	public static void main(String[] args) {

      Students st1 = new Students();
      st1.setName("David Gongalez");
      st1.setStudentId(189765);
      st1.setSsn("107-34-6743");
      st1.setDob("09-05-1985");
      
      System.out.println(st1.getName()+" "+st1.getStudentId()+" "+st1.getSsn()+" "+st1.getDob());
      
      Students st2 = new Students();
      st2.setName("Jane Rick");
      st2.setStudentId(43598734);
      st2.setSsn("907-84-4534");
      st2.setDob("07-15-1995");
  
      
      System.out.println(st2.getName()+" "+st2.getStudentId()+" "+st2.getSsn()+" "+st2.getDob());

	}

}
