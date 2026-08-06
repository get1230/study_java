package ex2_valueType;

public class Ex1_valueType1 {
    public static void main(String[] args) {

 /*
 자바의 기본 자료형
 논리형 : boolean .... 1bit
 문자형 : char .... 2byte
 정수형 : byte .... 1byte -> -128 ~ 127
 short .... 2byte -> -32768 ~ 32767
 int .... 4byte -> -21억 ~ 21억 (★자바 기본형)
 long .... 8byte -> -922경 ~ 922경
 실수형 : float .... 4byte
 double .... 8byte (★자바 기본형)
 
 변수 : 데이터를 저장하는 공간
 자료형 변수명;(선언)
 변수명 - 값; (대입)

자료형 변수명 = 값; (초기화)

 변수선언 규칙
 1. 숫자로 시작할 수 없다.
 2. _를 제외하고 특수문자를 사용할 수 없다.(공백도 x)
 3. 한글로 변수이름을 짓지 않는다.(기능은 존재)
 4. 반드시 소문자 알파벳으로 시작하도록 한다.
 */       
// 1. 카멜 표기법 (camelCase): 첫 단어는 소문자로, 이후 단어의 첫 글자를 대문자로 작성


// 2. 헝가리안 표기법 (Hungarian Notation): 자료형을 앞에 접두사로 붙임


// 3. 파스칼 표기법 (PascalCase): 모든 단어의 첫 글자를 대문자로 작성

// 4. 스네이크 표기법 (snake_case): 모든 단어를 소문자로 하고 언더스코어(_)로 구분


//논리형 : 참과 거짓(true, false)의 두 가지 값만을
//저장할 수 있는 자료형
boolean b1; //선언
b1 = true; //대입
b1 = false;
//b1 = 10; <- (정수 불가) 자료형 타입이 올바르지 않기 때문에 오류발생
System.out.println("b1 : " + b1);

//정수형 : 소수점이 없는 정수값만 저장하는 자료형
byte b = 127;
short s = 32767;
int n = 5000;
long lo = 2200000000L;
System.out.println("b:"+b);
System.out.println("s:"+s);
System.out.println("n:"+n);
System.out.println("lo:"+lo);
}
}
