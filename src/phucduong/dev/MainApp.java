package phucduong.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	
	static List<Shape> readFromFile(String fileName) throws Exception{
		List<Shape> shapeList = new ArrayList<Shape>();
		FileInputStream fs = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(fs));
		
		String strLine;
		
		while ((strLine = br.readLine()) != null) {
			if (strLine.indexOf("#Rectangle") == 0) {
				String name = strLine.substring(1,strLine.length());
				double chieuDai = Double.parseDouble(br.readLine());
				double chieuRong = Double.parseDouble(br.readLine());
				Shape rectangle = new Rectangle(name, chieuDai, chieuRong);
				shapeList.add(rectangle);
			}
			if (strLine.indexOf("#Triangle") == 0) {
				String name = strLine.substring(1,strLine.length());
				double canhA = Double.parseDouble(br.readLine());
				double canhB = Double.parseDouble(br.readLine());
				double canhC = Double.parseDouble(br.readLine());
				Shape triangle = new Triangle(name, canhA, canhB, canhC);
				shapeList.add(triangle);
			}
			if (strLine.indexOf("#Circle") == 0) {
				String name = strLine.substring(1,strLine.length());
				double banKinh = Double.parseDouble(br.readLine());
				Shape circle = new Circle(name, banKinh);
				shapeList.add(circle);
			}
		}
		return shapeList;
	}
	
	static void print(List<Shape> shapeList) {
		Iterator<Shape> it = shapeList.iterator();
		while (it.hasNext()) {
			Shape shape = it.next();
			System.out.println(shape.toString());
		}
	}
	static void printCir(List<Shape> shapeList) {
		List<Circle> circleList = new ArrayList<Circle>();
		Iterator<Shape> it = shapeList.iterator();
		while (it.hasNext()) {
			Shape shape =  it.next();
			if ((shape instanceof Circle) == true) {
				Circle cir = (Circle) shape;
				circleList.add(cir);
			}
		}
	    for (Circle circle : circleList) {
			System.out.println(circle.toString());
		}
	}
	static void printRec(List<Shape> shapeList) {
		List<Rectangle> rectangleList = new ArrayList<Rectangle>();
		Iterator<Shape> it = shapeList.iterator();
		while (it.hasNext()) {
			Shape shape =  it.next();
			if ((shape instanceof Rectangle) == true) {
				Rectangle rect = (Rectangle) shape;
				rectangleList.add(rect);
			}
		}
	    for (Rectangle rectangle : rectangleList) {
			System.out.println(rectangle.toString());
		}
	}
	static void printTg(List<Shape> shapeList) {
		List<Triangle> tgList = new ArrayList<Triangle>();
		Iterator<Shape> it = shapeList.iterator();
		while (it.hasNext()) {
			Shape shape =  it.next();
			if ((shape instanceof Triangle) == true) {
				Triangle tg = (Triangle) shape;
				tgList.add(tg);
			}
		}
	    for (Triangle tg : tgList) {
			System.out.println(tg.toString());
		}
	}
	static void sortChuVi(List<Shape> shapeList) {
		Collections.sort(shapeList, new Comparator<Shape>() {
			@Override
			public int compare(Shape s1, Shape s2) {
				// TODO Auto-generated method stub
				if (s1.chuVi() < s2.chuVi()) {
					return -1;
				}else if (s1.chuVi() == s2.chuVi()) {
					return 0;
				}else return 1;
			}
		});
	}
	static void sortDienTich(List<Shape> shapeList) {
		Collections.sort(shapeList, new Comparator<Shape>() {
			@Override
			public int compare(Shape s1, Shape s2) {
				// TODO Auto-generated method stub
				if (s1.dienTich() < s2.dienTich()) {
					return -1;
				}else if (s1.dienTich() == s2.dienTich()) {
					return 0;
				}else return 1;
			}
		});
	}
	static void findMaxChuVi(List<Shape> shapeList) {
		Iterator<Shape> it = shapeList.iterator();
		Shape shapePrev = shapeList.get(0);
		while (it.hasNext()) {
			Shape shape = (Shape) it.next();
			if (shapePrev.chuVi() < shape.chuVi()) {
				shapePrev = shape;
			}
		}
		System.out.println("Chu vi lon nhat:");
		System.out.println(shapePrev.toString());
	}
	static void findMaxDienTich(List<Shape> shapeList) {
		Iterator<Shape> it = shapeList.iterator();
		Shape shapePrev = shapeList.get(0);
		while (it.hasNext()) {
			Shape shape = (Shape) it.next();
			if (shapePrev.dienTich() < shape.dienTich()) {
				shapePrev = shape;
			}
		}
		System.out.println("Dien tich lon nhat:");
		System.out.println(shapePrev.toString());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapeList = new ArrayList<Shape>();
		try {
			shapeList = readFromFile("input.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		print(shapeList);
//		printCir(shapeList);
//		printRec(shapeList);
//		printTg(shapeList);
//		sortChuVi(shapeList);
		
//		sortDienTich(shapeList);
//		printTg(shapeList);
//		findMaxChuVi(shapeList);
//		findMaxDienTich(shapeList);
	}

}
