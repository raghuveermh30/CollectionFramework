package javasessions;

public class Parameter {

    /*Maximum number of parameters we can take for a Method in Java?
    Suppose if we pass non Primitive DataTypes
    int, short, char, float classType(Object, String) -- 254 (non Static) and 255 (static)

    double, long - we can pass 127 (for static and non static Both)

    double and long will take 8 bytes
    integer will take 4 bytes

*/
    public void testing(int a, int b, int c){
    }

    public static void main(String[] args) {
        Parameter p1 = new Parameter();
    }
}
