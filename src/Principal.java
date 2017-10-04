/**
 * @author 16550549
 */
public class Principal {

    public static void main(String[] args) {                            
        int aiArray3D[][][] = new int[10][2][7];
        
        System.out.println(aiArray3D.length);
        System.out.println(aiArray3D[0].length);
        System.out.println(aiArray3D[0][0].length);
        
        for (int i = 0; i < aiArray3D.length; i++) {
            for (int j = 0; j < aiArray3D[i].length; j++) {
                for (int k = 0; k < aiArray3D[i][j].length; k++) {
                    aiArray3D[i][j][k] =(int) (Math.random() *100 )+1;
                }
            }
        }
        // IMRPIMIR
        for (int i = 0; i < aiArray3D.length; i++) {
            for (int j = 0; j < aiArray3D[i].length; j++) {
                for (int k = 0; k < aiArray3D[i][j].length; k++) {
                    System.out.print("["  + aiArray3D[i][j][k] + "] ");
                }
                System.out.println("");
            }
             System.out.println("");
        }
       
    }
    
}
