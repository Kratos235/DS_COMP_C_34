public class LAB_1A {
    public static void main(String[] args) {
        // Declarations
        byte a = 12;
        short b = 236;
        int n1 = 4695;
        int n2 = 639;
        float c = 25.3f;
        double d = 45.3;
        boolean flag = true;
        char letter = 'A';
        String str = "Programming";
        System.out.println("Byte: "+a);
        System.out.println("Short: "+b);
        System.out.println("Int: "+n1);
        System.out.println("Float: "+c);
        System.out.println("Double: "+d);
        System.out.println("Boolean: "+flag);
        System.out.println("Char: "+letter);
        System.out.println("String: "+str);

        // Arithmetic operators
        System.out.println("n1 + n2 = "+(n1+n2));
        System.out.println("n1 - n2 = "+(n1-n2));
        System.out.println("n1 * n2 = "+(n1*n2));
        System.out.println("n1 / n2 = "+(n1/n2));
        System.out.println("n1 % n2 = "+(n1%n2));

        // Unary Operators
        System.out.println("Pre increment: "+(++n1));
        System.out.println("Post increment: "+(n1++));
        System.out.println("Pre decrement: "+(--n2));
        System.out.println("Post decrement: "+(n2--));

        // Assignment operators
        System.out.println("n1 += 23 "+(n1+=23));
        System.out.println("n1 -= 45 "+(n1-=45));
        System.out.println("n2 *= 5 "+(n2*=5));
        System.out.println("n2 /= 8 "+(n2/=8));
        System.out.println("n2%=200 "+(n2%=200));
        System.out.println("n1&=49999 "+(n1&=49999));
        System.out.println("n2|=4985 "+(n2|=4985));
        System.out.println("n2^=3979 "+(n2^=3979));
        System.out.println("n1<<=4 "+(n1<<=4));
        System.out.println("n2>>=2 "+(n2>>=2));
        System.out.println("n1>>>=2 "+(n1>>>=2));

        // Logical Operators
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1 && b2 "+(b1&&b2));
        System.out.println("b1 || b2 "+(b1||b2));
        System.out.println("!b2"+(!b2));
        // ternary operator
        int n3 = 26;
        int result = (n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println("Max of three numbers = "+result);

        // Bitwise operators
        System.out.println("n1 & n2 = "+(n1&n2));
        System.out.println("n1 | n3 = "+(n1|n3));
        System.out.println("n2 ^ n3 = "+(n2^n3));
        System.out.println("~n3 = "+(~n3));
        System.out.println("n1<<2 "+(n1<<2));
        System.out.println("n2>>4 "+(n2>>4));
        System.out.println("n3>>>2 "+(n3>>>2));

        // Comparison Operators
        System.out.println("n1 > n3: "+(n1>n3));
        System.out.println("n2 < n3: "+(n2<n3));
        System.out.println("n1 >= n3: "+(n1>=n3));
        System.out.println("n1 <= n3: "+(n1<=n3));
        System.out.println("n1 == n2: "+(n1==n2));
        System.out.println("n2 != n3: "+(n2!=n3));
    }
}