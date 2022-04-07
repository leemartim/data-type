
public class Casting{

	public static void main(String[] args) {

		double a = 1.1; // 실수이기에 그대로 출력 
        double b = 1; // 값은 정수이지만 .0이 생략되어있고 의미가 다르지않기에 error가 나지않음 
        double b2 = (double) 1; // 정수를 casting을 통해 실수로 바꿔 선언 b와b2는 같은 의미 
         
        System.out.println(b);
         
        // int c = 1.1; // b와 반대이지만 이러한 경우 .1이 탈락되는 현상이 있기에 error를 띄움 
        double d = 1.1;
        int e = (int) 1.1; // .1이 탈락하는 현상이 발생함 
        System.out.println(e);
         
        // 1 to String 
        String f = Integer.toString(1); // 정수 1을 문자열로 바꿔주는 것 
        System.out.println(f.getClass()); // getClass는 현재의 데이터 타입을 알려줌 
	}

}
