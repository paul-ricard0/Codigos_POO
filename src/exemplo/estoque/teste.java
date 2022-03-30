package exemplo.estoque;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1;
		int y= 2;
		int a= 1;
		int b = 1;
		for(int i=1; i>=99; i++) {
			if(i==1) {
				a = (x/y);
				
			}else {
				a = a * (x/y);
			}
			x++;
			y++;
		}
		System.out.print(a);
	}

}
