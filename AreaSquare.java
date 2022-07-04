/*
*@Author Pritam khan
*/
//calculate area of square


public class AreaSquare{      
     int area;
     void insert(int a){
          area=a;
     }
     void calculateArea(){
          System.out.println(area*area);
     }
     static class SquareArea1{
     public static void main (String args[]){
               AreaSquare r1 = new AreaSquare();
                    r1.insert(11);
                    r1.calculateArea();
               

          }
     }
}