package management;

public class ComputerScienceStudent extends Student{
	private int algorithm;
	private int dataStruct;
	
	public int getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(int algorithm) {
		this.algorithm = algorithm;
	}

	public int getDataStruct() {
		return dataStruct;
	}

	public void setDataStruct(int dataStruct) {
		this.dataStruct = dataStruct;
	}

	public ComputerScienceStudent(String name, int kor, int eng, int mat, int algorithm, int dataStruct) {
		super(name, kor, eng, mat);
		this.algorithm = algorithm;
		this.dataStruct = dataStruct;
//		total = kor + eng + mat;		
		setTotal(kor + eng + mat + algorithm + dataStruct);
		setAvg(getTotal()/5.0);
	}
	@Override
	public String toString() {

		return String.format("[%s] %s : %.2f","컴퓨터 공학", getName(), getAvg());
	}
}
