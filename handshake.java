import java.util.*;
class handshake{
public static void main(String[]args){
Scanner hs=new Scanner(System.in);
System.out.println("Enter total no. of students=");
float n=hs.nextFloat();//input for students no.

float shakes=(n * (n - 1)) / 2;//calculate total handshakes possible
System.out.println("Possible no. of handshakes= "+shakes);
}
}