public class For{
	public static void main(String[] args){
		
		//int i = 1;
		/*while (i <= 5){
			System.out.print("*\n");
			i++;
		}*/
		
		/*do{
			System.out.print("*\n");
		}while(i <= 0);*/
		
		/*int j = 1;
		while(j <= 200){
			if(j%7 == 0 && j%5 == 0){
				System.out.print(j+"\n");
			}
			j++;
		}*/
		

		/*for(int i = 0; i <= 10; i++){
			System.out.print("*\n");
		}*/
		int line = 8;
		for(int i = 0;i < line;i++){
			for(int k = 0;k < line-i-1;k++){
				System.out.printf(" ");
			}
			for(int j = 0;j < 2*i+1;j++){

				System.out.print("*");
			}	
			System.out.printf("%n");
		}
		//reverse
  		for(int i = 1;i < line;i++){
			for(int k = line;k > line-i;k--){
				System.out.printf(" ");
			}
			for(int j = 2*line;j > (2*i+1);j--){
				System.out.printf("*");
			}
			System.out.printf("%n");
		}	

		//find maximum
		int[] score = {66,78,90,77,97,80,99};
		int max = score[0];
		/*for(int turn = 0;turn <6; turn++){
			if(score[turn] < score[turn+1]){
				max = score[turn+1];
			}
		}*/
		for(int i = 0;i <= 6;i++){
			if(max < score[i]){
				max = score[i];
			}
		}
		System.out.println(max);
		
		
	}
	

	
}
