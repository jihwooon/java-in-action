## 배열과 배열 리스트
배열은 프로그래밍의 기본요소로 타입이 같은 아이템을 모으는 데 사용합니다.  
자바는 언어 수준에 배열 타입을 포함하여, 필요에 따라 늘어나고 줄어드는 배열을 나타내는 ArrayList 클래스도 제공합니다.ArrayList 클래스는 컬렉션을 다루는 프레임워크의 일부이다.

### 배열 다루기

모든 타입에는 대응하는 배열 타입이 있다. 정수의 배열은 int[] 타입, String 객체의 배열은 String[] 타입이 되는 식이다.

```java
String[] name;
```

아직 변수가 초기화되지 않았으니 새 배열로 초기화 해 봅니다.
new 연산자가 필요합니다.

```java
names = new String[100];
```

다음과 같이 해볼 수 있습니다.
```java
String[] names = new String[100];
```

배열의 길이는 array.length로 얻을 수 있습니다. 다음 루프는 배열을 빈 문자열로 채울 수 있습니다.
```java
for(int i = 0; i < names.length; i++) {
    names[i] = "";
}
```

### 배열 생성
new 연산자로 배열을 선언하면 배열을 기본 값으로 채웁니다.
* 숫자 타입의 배열은 0으로 채웁니다.
* boolean의 배열은 false로 채웁니다.
* 객체의 배열은 null 참조로 채웁니다.

객체의 배열을 생성한 후에는 객체로 채워야 합니다.   
```java
BigInteger[] numbers = new BigInteger[100];
```
아직은 어떤 BigInteger 객체도 포함하지 않은 상태다. 그저 null 참조 100개로 채운 배여일 뿐이다. 이 null 참조를 BigInteger 객체 참조로 교체해야 합니다.  
```java
for (int i = 0; i < 100; i++) { 
    numbers[i] = BIgInteger.valueOf(i);
}
```
루프를 작성해서 배열의 값을 채울 수 있습니다. 원하는 값을 알고 있을 때 중괄호 안에 원하는 값을 나열하면 됩니다.  
`int[] primes = { 2, 3, 4, 7, 11, 13 };`

중괄호로 값을 채울 때 new 연산자를 사용하지 않으면 배열의 길이도 지정하지 않습니다.
```java
String[] authors = {
    "James Gosling",
    "Bill Joy",
    "Guy Steele"
};
```
배열에 이름을 붙이지 않을 때도 유사한 초기화 문법을 사용합니다.

```java
primes = new int[] { 17. 19, 23, 29 31 };
```

