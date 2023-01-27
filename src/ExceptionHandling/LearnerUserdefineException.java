package ExceptionHandling;

class Learner{
	String fname,Iname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getIname() {
		return Iname;
	}

	public void setIname(String iname) {
		this.Iname = iname;
	}
}

class LearnerNameException extends Exception{
	public LearnerNameException(String s){
		super(s);
		
	}
}
public class LearnerUserdefineException{
	void checkName(String fname,String Iname) throws LearnerNameException {
		if(fname.isEmpty() && Iname.isEmpty()) {
			throw new LearnerNameException("fname & Iname is empty");
		}
		else if(fname.isEmpty()) {
			throw new LearnerNameException("fname is empty");
		}
		else if(Iname.isEmpty()) {
			throw new LearnerNameException("Iname is empty");
	}
}

	public static void main(String[] args) throws LearnerNameException {
		// TODO Auto-generated method stub
		Learner l = new Learner();
		l.setFname("a");
		l.setIname("");
		LearnerUserdefineException lu= new LearnerUserdefineException();
		lu.checkName(l.getFname(),l.getIname());
		

	}

}
