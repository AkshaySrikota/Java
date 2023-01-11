public class invertedhalfpyramidwithnumbers {
public static void invhalfpy(int n,int m){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m-i+1;j++){
            System.out.print(j);
        }

        System.out.println();
    }

}

    public static void main(String args[]){
invhalfpy(5,5);

    }
}
