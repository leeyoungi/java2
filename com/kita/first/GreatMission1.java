package com.kita.first;

import java.util.Scanner;

public class GreatMission1 {
//숫자 야구 게임//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int LEN=3;
		   int[] myArr = new int[LEN];

           int[] rArr = new int[LEN];

            int count=0;
           int strike = 0;

           int ball = 0;

           int out = 0;

          

           Scanner scan = new Scanner(System.in);


			 for (int i = 0; i < rArr.length; i++) { 

					rArr[i] = (int) (Math.random() * 9)+1; 

					for (int j = 0; j < i; j++) { 

						   if (rArr[j] == rArr[i]) {
                           
								 i--;

								 break;

						   }

					}
					

			 }


     

           while (true) {

                
        	   System.out.println("숫자입력:");
                  for (int i = 0; i < myArr.length; i++) { 
                       
                         myArr[i] = scan.nextInt();
                                   

                      


                  }

                

                  for (int i = 0; i < rArr.length; i++) { 


                         for (int j = 0; j < myArr.length; j++) {


                               if (rArr[i] == myArr[j]) {

                                      if (i == j) {

                                            strike += 1;

                                      } else

                                            ball += 1;

                               }
                         

                         }
                         

                  }

                  count++;
                  if (strike > 0 || ball > 0) { 

                      System.out.printf("S:%d / B:%d / O:%d\n", strike, ball, (LEN-strike-ball));
                         System.out.println();

                  } else { 
                	 
                         out++;

                         System.out.printf("S:%d / B:%d / O:%d\n", strike, ball, (LEN-strike-ball));
                         System.out.println(count+"번 시도 finish");

                         System.out.println();

                  }

                if ((LEN-strike-ball) == 3) { 

        

                         break;
                        

                  } 
                if (strike == 3) { 

                    
                 break;
            
             }

                  strike = 0;

                  ball = 0; 

           }

     }


   
   
	

}
