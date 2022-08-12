package week14;

public class Class_Teacher_Student {

	
	private Teacher t;
	private Student s;
	private Class c;
	
	public Class_Teacher_Student(Teacher t, Student s, Class c) {
		this.t=t;
		this.c=c;
		this.s=s;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s\t%s\t%s\n", t.toString(), s.toString(), c.toString());
	}

	public Teacher getT() {
		return t;
	}

	public void setT(Teacher t) {
		this.t = t;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	public Class getC() {
		return c;
	}

	public void setC(Class c) {
		this.c = c;
	}
	
	
	
}
