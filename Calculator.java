class Calculator {

    static int add(int a, int b) {
        return a+b;
    }

    static int sub(int a, int b) {
        return 0;
    }

    static int mul(int a, int b) {
        return 0;
    }

    static int div(int a, int b) {
        try{
           if (b == 0){
                throw new ArithmeticException("Division by zero");
              } else {
                return a/b;   
           }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    //Main function
    public static void main(String[] args) {
        // will call all functions later
    }
}
