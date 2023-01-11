public class invertedandrotatedhalfpyramid{
    public static void inv_rot_half_py(int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       

    }

public static void main(String args[]){

inv_rot_half_py(4,4);

}
}


