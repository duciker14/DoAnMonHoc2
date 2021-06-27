package phucduong.dev;

public class Triangle extends Shape {// Hinh tam giac
	double canhA, canhB, canhC;

	public Triangle(String name, double canhA, double canhB, double canhC) {
		super(name);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return canhA + canhB + canhC;
	}
	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi()/2;
		return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ten hinh tron: %s, Do dai ba canh: %f %f %f, chu vi: %f, dien tich: %f", name,canhA,canhB,canhC,chuVi(),dienTich());
	}
}
