# 문제 설명
정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.

제한사항
-50000 ≤ num1 ≤ 50000
-50000 ≤ num2 ≤ 50000
입출력 예
num1	num2	result
2	3	-1
100	2	98
입출력 예 설명
입출력 예 #1

num1이 2이고 num2가 3이므로 2 - 3 = -1을 return합니다.
입출력 예 #2

num1이 100이고 num2가 2이므로 100 - 2 = 98을 return합니다.

# 답1
public class Solution { 
    public int solution(int num1, int num2) { 
        int result = num1 - num2; 
        return result;
    }
}

# 답2
public class Solution {
    public int solution(int num200, int num100 ) { 
        int result = num200 - num100;
        return result;
    }
}

# 답3
public class Solution {
    public int solution(int x, int y) { 
        int result = x - y;
        return result;
    }
}

public int solution(int num1, int num2) 해석
- public : 접근제어자(어디서든 접근 가능)
- int : 메서드가 반환하는 값의 자료형. 여기서는 정수를 반환한다고 명시했음
- solution : 매서드의 이름 클래스와 이름이 같지 않아도 상관없음. (소문자 구분만 잘하면 됨) // 메서드 이름은 주로 **동작이나 행위**를 표현하기 때문에, 이 문제에서는 'solution'이라는 이름을 붙임.
- (int num1, int num2) 이 부분은 메서드가 입력으로 받을 매개 변수를 나타냄. 여기서는 두개의 정수를 입력받음.
- 매개변수의 구성 int num1, int num2 : int는 이 매개변수가 **정수형 데이터**라는 뜻. 
- **`num1`과 `num2`는 변수의 이름으로 이 이름들은 개발자가 원하는 대로 지을 수 있음. (예를 들어, `int x, int y`로 이름을 바꿔도 됨. 중요한 것은 이 이름이 그 변수의 역할을 잘 나타내야 한다는 것
- `num1`은 1이라는 숫자를 나타내는 자바의 단어인가? : `num1`은 자바의 특별한 예약어가 아님. 이 이름은 개발자가 자유롭게 정한 변수 이름일 뿐이고, 이 변수는 입력받는 값을 저장하기 위한 임시 공간으로, `num1`이라는 이름을 단순히 첫 번째 숫자를 표현하기 위해 사용한 것.
