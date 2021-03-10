public class SnailProg {
	public static void main(String[] args) {
		snailPrint(5,5);
		snailPrint(10,6);
	}		

	private static void snailPrint(int row, int col) {
		int i, k = 0, l = 0;
		int num = 1;
		int [] [] snail = new int[row][col];
		
		while (k<row && l<col){
			for(i = l; i<col; i++){
				snail[k][i] = num;
				num++;
			}
			k++;
			for(i = col-1; i>=l; i--){
				snail[i][col-1] = num;
				num++;
			}
			col--;
			if(k<row){
				for(i =col-1; i>=l; i--){
					snail[row-1][i] = num;
					num++;
				}
				row--;
			}
			if(l<col){
				for(i = row-1; i>=k; i--){
					snail[i][l] = num;
					num++;
				}
				l++;
			}
			for(k=0; k<snail.length; k++){
				for(l=0; l<snail[k].length; l++){
					System.out.println(snail[k][l] +", ");
				}
				System.out.println();
			}
		}
		
	}

}
