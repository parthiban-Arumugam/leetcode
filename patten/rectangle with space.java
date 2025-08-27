public class pattern {
    public static void main(String[] args) {

        for(int i=1;i<=4;i++) {
            for(int j=1;j<=7;j++){
                if(i==3 &&(j==2 || j==6 )  ){
                    System.out.print("_");}
                else if (i==4 &&(j==2 || j==3 || j==5 || j==6) ) {
                    System.out.print("_");
                }
                else {
                    System.out.print("*");
                }


            }
            System.out.println();
        }
    }
}
