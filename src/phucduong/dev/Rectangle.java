package phucduong.dev;

public class Rectangle extends Shape{
	double chieuDai;
	double chieuRong;
	public Rectangle(String name, double chieuDai, double chieuRong) {
		super(name);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return (chieuDai + chieuRong) *2;
	}
	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return chieuDai * chieuRong;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ten hinh chu nhat: %s; Chieu dai: %f, Chieu Rong: %f, Chu vi: %f, Dien Tich: %f", name,chieuDai,chieuRong,chuVi(),dienTich());
	}
}
