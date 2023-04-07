package management;

public class ChaineseLinguistStudent extends Student{
	private int translation;
	
	public int getTranslation() {
		return translation;
	}

	public void setTranslation(int translation) {
		this.translation = translation;
	}


	public ChaineseLinguistStudent(String name, int kor, int eng, int mat, int translation) {
		super(name, kor, eng, mat);
		this.translation = translation;
		setTotal(kor + eng + mat + translation);
		setAvg(getTotal()/4.0);
	}
	
	@Override
	public String toString() {

		return String.format("[%s] %s : %.2f","중어중문", getName(), getAvg());
	}

}
