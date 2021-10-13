package DuoTai.Practise03;

/**
 * @Author Jason
 * @Date 2021/09/08
 * @Describe:
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricObject geometricObject1=new Circle(5,"红",5);
        GeometricObject geometricObject2=new MyRectangle(5,5,"黄",5);
        GeometricTest test=new GeometricTest();
        test.disPlayGeometricObject(geometricObject1);
        test.disPlayGeometricObject(geometricObject2);
        test.equalsArea(geometricObject1,geometricObject2);
    }


    public void disPlayGeometricObject(GeometricObject o){
        System.out.println("面积是"+o.findArea());
    }



    //测试两个对象的面积是否相等
    public boolean equalsArea(GeometricObject geometricObject1,GeometricObject geometricObject2){
        return geometricObject1.findArea() == geometricObject2.findArea();
    }
}
