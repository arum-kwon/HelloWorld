package common;

// 배열, 메서드 사용
//결과 : 두 컴퓨터가 원카드 하는 것

/* 카드 종류 : 49(1) 50(2) 51(3) 52(4) 53(5) 54(6) 55(7) 56(8) 57(9) 75(K) 74(J) 81(Q) X 35(#) 64(@)
* 룰
*  (1) 숫자와 패턴을 각각 char로 지정한다 총 카드는 12*2 = 24개, 각각 6개씩 들고 시작, 중앙패 12개
*  (2) 숫자와 패턴은 둘이 한 세트가 되어야함.
*  (3) 각각 p2/p2의 카드 1의 n/p ... 카드6의 n/p 구분
*  (4) p1, p2, 중앙 각각 소주할 수 있는 카드 목록 max 24개 
*  0. 시작할 때 각각 플레이어의 카드1에서 6까지 숫자와 패턴을 넣어준다.
*  1. p1,p2,중앙의 카드 배정은 수동으로 // char p1_c1_p = 35/char p1_c1_n = 50 
*  	(1) p1c1p = 35,	p1c1n = 50
*  		p1c1p = 35,	p1c1p = 53
*  				...
*  
*  2. 중복 패가 없는지 확인한다.
*  	(1) 모든 n의 합 707 (1~9:477, KJQ) * 2세트 = 1414 / 모든 p의 합 99 * 12세트 = 1188 p1와 p2, ce의 모든 np의 합을 비교
*  		(1-1) 위의 합이 다르면, 종료
*  		(1-2) 위의 합이 같으면, 다음 단계로 	
*  3. 화면 꾸리기
*      -----------------------------
*      p1: #6 @4 #1 @8 #7
*           #5             n턴
*      p2: @2 @7 @8 #4 @K   
*      -----------------------------
*      (1)" -----------------------------"
*      (2)"p1: "+ (char)p1c1p + (char)p1c1n + " " + (char)p1c1p + ... + p1c24n
*      (3)"   " + cec1p + cec1n + "        " + numTurn + "턴"
*      (4)"p1: "+ (char)p1c1p + (char)p1c1n + " " + (char)p1c1p + ... + p2c24n
*      (5)" -----------------------------"
* 
*  4. 턴 시작 (순서 p1 -> p2)
*  	//p1
* 		(1) if(p1c1p == cec1p || p1c1n == cec1n) //패턴이 존재하면, p1c->(cec1->cec)
* 			(1-1) if(cec2p == 0 && cec2n == 0) // 비어있는 c넘버 탐색
* 				  else if(cec3p == 0 && cec3n == 0)
* 							  ....
* 				  else if(cec24p == 0 && cec24n == 0)
* 				(1-1-1) (해당 조건문 안에)  //cec1을 비어있는 c넘버에 저장
* 						cec24p = cec1p;
* 						cec24n = cec1n;
* 			(1-2) cec1p = p1c1p; cec1n = p1c1n; //p1c를 cec1에 저장
* 			(1-3) p1c1p = 0; p1c1n =0; //p1c를 0으로 비워주기
* 		(2) else //만약 p1의 모든 패중에 일치하는 p or n 이 없으면 cec2->p1c
* 			(2-1) if(p1c1p == 0 && p1c1n == 0) //비어있는 p1c탐색
* 				  else if(p1c2p == 0 && p1c2n == 0)
* 				    			....
* 				  else if(p1c24p == 0 && p1c24n == 0)
* 				(1-1-1) (해당 조건문 안에) //cec2를 비어있는 p1c에 저장 
* 						p1c24p = cec2p;
* 						p1c24n = cec2n;
* 			(2-2) cec2p=cec3p; cec2n=cec3n; .. cec23p=cec24p; cec23n=cec24n; //cec(n-1) = cec(n) 다 대입  
* 		//p2 위 복붙
* 
* 구체적인 룰 추가
*	5. 가진 패가 없으면 승리 (191223)
*  
*
*
*
*
* */
public class OneCard1 {
	public static void main(String[] args) {

		// 초기화
		int nums = 12; //49(1) 50(2) 51(3) 52(4) 53(5) 54(6) 55(7) 56(8) 57(9) 75(K) 74(J) 81(Q)
		int pats = 2; //35(#) 64(@)
		int players = 3; //중앙,p1,p2
		//		c[players][pats][nums]
		//		c[0][1~2][1~12] => c[0][][]에 24가지의 배열이 있다.
		//		c[][1][6] = #7 이 됨. 결국 각 배열값을 bool로 표현 가능
		boolean[][][] card = new boolean[players][pats][nums];
		
		// 1. 카드 배분
		//할당하는 방법 #1~@Q 조합을 순차적으로 p0~2에게 할당, 총 카드는 12*2 = 24개, 각각 6개씩 들고 시작, 중앙패 12개
		int p1 =6;
		int p2 =6;
		int ce =12;
		for(int x=0 ; x<pats ; x++) {
			for(int y=0 ; y<nums ; y++) {
				boolean run = true;
				while(run) {
					int ePlayers = (int)(Math.random()*3);
					if(ePlayers==0) {
						if(ce>0) {
							ce--;
							card[ePlayers][x][y]=true;
							break;
						}
					}else if(ePlayers==1) {
						if(p1>0) {
							p1--;
							card[ePlayers][x][y]=true;
							break;
						}
					}else {
						if(p2>0) {
							p2--;
							card[ePlayers][x][y]=true;
							break;
						}
					}
				}
			}
		}

		//3.화면꾸리기 //1 2 3 4 5 6 7 8 9 J K Q | # @
		int openCardP =0;
		int openCardN =0;
		while(true) { //중앙에게 배정된 패 중에 임의로 1개 선택
			openCardP=(int)Math.random();
			openCardN=(int)(Math.random()*12);
			if(card[0][openCardP][openCardN]) {
				break;
			}
		}
		System.out.println("-------------------------------------");
		System.out.print("P1 : ");
		for(int pat=0 ; pat<pats ; pat++) {
			for(int n=0 ; n<nums ; n++) {
				if(card[1][pat][n]) {
					if(pat==0) { System.out.print("#");
					}else { System.out.print("@"); }
					if(n<9) {System.out.print(n+1);
					}else if(n==9) { System.out.print("J"); 
					}else if(n==10) { System.out.print("K"); 
					}else if(n==11) { System.out.print("Q"); }
					System.out.print(" ");
				}
			}
		}
		System.out.println();

		System.out.print("      ");
		if(openCardP==0) { System.out.print("#");
		}else { System.out.print("@"); }
		if(openCardN<9) {System.out.print(openCardN+1);
		}else if(openCardN==9) { System.out.print("J"); 
		}else if(openCardN==10) { System.out.print("K"); 
		}else if(openCardN==11) { System.out.print("Q"); }
		System.out.println(" ");
		
		System.out.print("P2 : ");
		for(int pat=0 ; pat<pats ; pat++) {
			for(int n=0 ; n<nums ; n++) {
				if(card[2][pat][n]) {
					if(pat==0) { System.out.print("#");
					}else { System.out.print("@"); }
					if(n<9) {System.out.print(n+1);
					}else if(n==9) { System.out.print("J"); 
					}else if(n==10) { System.out.print("K"); 
					}else if(n==11) { System.out.print("Q"); }
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
	
	
	//4. 턴 시작 (순서 p1 -> p2)
	//openCard와 같은 p|n이 존재하면, 
	/*최적의 해를 구하는 방법

1. 현재 상황 파악
2. 외부 상황 파악
3. 외부 상황에서 내가 선택할 수 있는 최선의 방법 탐색
 (1)k가 이
	 * */
	
	
	
	
	
	
	
	
	
}
