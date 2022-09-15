public class HomeT5 {
    public static void main(String[] args) {
        int[][] array = new int[5][7];
        for(int i =0;i<array.length;i++){
            for(int h=0;h<array[i].length;h++){
                array[i][h]=(int)((Math.random()*75)-2);
                System.out.print(array[i][h]+" ");
            }
        }
    }
}
