import java.util.Scanner;

public class Lines {
    public int x1,x2,x3,x4,y1,y2,y3,y4,k1,k2,b1,b2,x;
    Scanner scanner = new Scanner(System.in);
    public static  void  main(String args[]){
        Lines lines=new Lines();
        lines.Intersection();
    }
    public  void Intersection(){
        System.out.print("Coord x1 =");
        x1=scanner.nextInt();
        System.out.print("Coord y1 =");
        y1=scanner.nextInt();
        System.out.print("Coord x2 =");
        x2=scanner.nextInt();
        System.out.print("Coord y2 =");
        y2=scanner.nextInt();
        System.out.print("Coord x3 =");
        x3=scanner.nextInt();
        System.out.print("Coord y3 =");
        y3=scanner.nextInt();
        System.out.print("Coord x4 =");
        x4=scanner.nextInt();
        System.out.print("Coord y4 =");
        y4=scanner.nextInt();
        if (x1>=x2){
            x2=x1+x2;
            x1=x2-x1;
            x2=x2-x1;
            y2=y1+y2;
            y1=y2-y1;
            y2=y2-y1;
        }
        if (x3>=x4){
            x4=x3+x4;
            x3=x4-x3;
            x4=x4-x3;
            y4=y3+y4;
            y3=y4-y3;
            y4=y4-y3;
        }
        if(y1==y2){
            k1=0;
        }
        else {
            k1=(y2-y1)/(x2-x1);
        }
        if(y3==y4){
            k2=0;
        }
        else {
            k2=(y4-y3)/(x4-x3);
        }
        if (k1==k2){
            System.out.println("Not intersect");
            System.exit(0);
        }
        b1=y1-k1*x1;
        b2=y3-k2*x3;
        x=(b2-b1)/(k1-k2);
        if (k1*x+b1==k2*x+b2){
            System.out.println("intersect");
        }
        else {
            System.out.println("Not intersect");
        }


    }

}
