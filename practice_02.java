// variable ==> a placeholder for a vlaue that behaves as the value it contains

// primative                         reference
// 8 types (booleans, bytes,etc.)    unlimited (user defined)
// stores data                       stores an address
// can only hlod 1 value             could hold more than 1 value
// less memory                       more memory
// fast                              slower

// data type     size            value                      primitive/reference
// boolean       1 bit        true or false                  primitive
// byte          1 bytes      -128 to 128                    primitive 
// short         2 bytes      -32768 to 32768                primitive
// int           4 bytes  -2 billions to 2 billions          primitive 
// long          8 bytes  -9 quintillion to 9 quintillion    primitive
// float         4 bytes  fractional number up to 6-7 digit  primitive
// double        8 bytes  fraction number upto 15 digits     primitive
// string        varies   a sequance of the character        reference


public class practice_02 {
    public static void main(String[] args) {
        // data type
        int x; // declaration 
        // int is a short form of integer it is use to store a number 
        x = 123; // assignment
        System.out.println(x);
        // we can also write as 
        int y = 124;
        System.out.println(y);
        System.out.println("the walue of the y is " + y);

        // long
        long a = 1897612301384981321L;
        System.out.println(a);

        // float
        float b = 10.26f;
        System.out.println(b);

        // double
        double c = 10.2568954;
        System.out.println(c); 

        // character
        char d = '$';
        System.out.println(d);
        
        // string
        String e = "jayesh pandey";
        System.out.println(e);

        
        String H2O = "water";
        String CO2 = "carbon dioxide";
        System.out.println("H2O: " + H2O);
        System.out.println("CO2: " + CO2);

        String temp;
        temp = H2O;
        H2O = CO2;
        CO2 = temp;
        System.out.println("CO2: " + H2O);
        System.out.println("H2O: " + CO2);

    }
}
