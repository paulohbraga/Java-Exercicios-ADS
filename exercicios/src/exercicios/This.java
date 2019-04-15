package exercicios;

public class This {
    private int num;

    private This(int num){ // Construtor
        this.num = num; //
        System.out.println("Hello im a constructor");
        System.out.println("This.num in construtor: " + this.num);
    }
    private void show(int num){
        this.num = num;
        System.out.println(this.num);
    }

    public static void main(String[] args) {
        This newthis = new This(4);
        newthis.num = 10;
        System.out.println(newthis.num);
        newthis.show(1);
        This newthis2 = new This(3);
        newthis2.num = 20;
        System.out.println(newthis2.num);
        newthis2.show(2);
    }

}

