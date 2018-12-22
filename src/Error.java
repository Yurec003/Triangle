public class Error {

public static void main(String[] args) throws  PointException1 {
Figure f=new Figure(3);
try {
System.out.println("Triangle 1");
f.setCoord(2, 1, 4);
System.out.println("Triangle 2");
f.setCoord(1, 3, 2);
System.out.println("Triangle 3");
f.setCoord(2, 4, 8);
System.out.println("Triangle 4");
f.setCoord(3, 1, 2);

}catch (PointException1 e) {
System.out.println(e.toString()+" N:"+e.getNum());
}

}
}