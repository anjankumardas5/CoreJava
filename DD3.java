class A{
private int x;
private static int y;//static variable always created first whether the object is created or not

void fun1(){
x=9;y=8;
}
 void fun2(){
System.out.println(x);
}
void fun3(){
y=34;
}
}
class DD3{
public static void main(String args[]){
A A1=new A();
A A2=new A();
A1.fun1();
A2.fun2();
}
}
