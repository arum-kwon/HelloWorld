package classes;

public class FriendExample {
	public static void main(String[] args) {
		
		Friend[] fArray = new Friend[5];
		UnivFriend[] ufArray = new UnivFriend[5];
		ComFriend[] cfArray = new ComFriend[5]; 
		
		UnivFriend uf = new UnivFriend("alt", "111-2222-3333", "Yedam", "java");
		ComFriend cf = new ComFriend("eli", "111-2000-3000", "YDCompany", "Develop");
		Friend f = new Friend("toll", "111-1000-6000");
		
		Friend f1 = uf; //형 변환
		Friend f2 = cf;
		
		uf.getName();  //Friend class
		uf.getPhone();  //Friend class
		uf.getUniv();  //UnivFriend class
		uf.getMajor();  //UnivFriend class
		
		f1.getName();
		f1.getPhone();
		
		fArray[0] = uf;
		fArray[1] = cf;
		fArray[2] = f;

		
		for(int i=0; i<3 ; i++) {
			System.out.println(fArray[i]);
			fArray[i].introduce();
		}
	}

}
