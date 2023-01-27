### 자바 프로그램 컴파일 및 실행

자바 프로그램은 두 단계를 거쳐 실행한다.

1. **javac 명령**으로 자바 소스 코드를 특정 기계에 종속되지 않은 중간 표현인 **바이트 코드**로 **컴파일**해서 **클래스 파일**에 저장합니다.
2. java 명령어로 가상 머신을 구동하고 클래스 파일을 로드해서 바이트 코드를 실행한다.

바이트 코드로 한번 컴파일하면 모든 자바 가상 머신에서 실행할 수 있습니다. "한 번 작성하고, 어디서나 실행한다.”는 약속은 자바의 중요한 설계 기준입니다.

### 메서드 호출

`System.out.println("Hello World")`;

System.out 은 객체이며, PrintStream 클래스의 인스턴스다.

객체의 인스턴스 메서드를 호출하려면 **점(.)** 표기법을 사용해야 합니다.

`Object.methodName(argumnets)`

인수(argumnets)가 `“Hello Wrold”` 문자열이 출력이 됩니다.

자바는 객체 대부분을 생성해야 합니다.

- Random 클래스의 객체는 난수를 생성 할 수 있습니다.
- Random 객체는  **new 연산자**로 생성합니다.

```java
public class App {
    Random generator = new Random(); // 객체에서 메서드를 두 번 이상 호출하려면 해당 객체를 변수에 저장해야 합니다.
    System.out.println(generator.nextInt());
    System.out.println(generator.nextInt());
}
```
