package phucduong.dev;

public class Circle extends Shape {
	double banKinh;

	public Circle(String name, double banKinh) {
		super(name);
		this.banKinh = banKinh;
	}
	
	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return Math.PI * 2 * banKinh;
	}
	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * banKinh * banKinh;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ten Hinh tron: %s, Ban Kinh: %f, Chu vi: %f, Dien Tich: %f", name,banKinh,chuVi(),dienTich());
	}
}
