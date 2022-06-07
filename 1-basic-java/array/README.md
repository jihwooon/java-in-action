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
```java
int[] primes = { 2, 3, 4, 7, 11, 13 };
```

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

### 배열 리스트

배열을 생성하려면 배열의 길이를 알아야 합니다.
배열을 한번 생성하면 절대로 길이를 변경할 수 없습니다. 이 문제는 `ArrayList`로 해결이 가능합니다.  
`ArrayList` 객체는 내부에서 배열을 관리합니다. 배열이 너무 작아지거나 배여르이 공간이 많아지면, 다른 내부 배열을 자동으로 생성해서 원본 배열의 요소를 옮깁니다.  
배열과 배열 리스트의 문법은 완전 다릅니다. 배열은 특수 문법을 사용합니다.
요소에 접근할 때는 [ ] 연산자를 사용하고, 배열 타입에는 Type[ ]문법, 배열을 생성 할 때는 new Type[n] 문법을 사용합니다.

이와 달리 배열 리스트는 클래스이므로 일반 인스턴스 생성 문법과 메서드 호출 문법을 사용합니다.
하지만 지금까지 살펴본 클래스와 달리 ArrayList는 제네릭 클래스 즉 타입 매개변수가 있는 클래스입니다.
배열 리스트 변수를 선언하려면 제네릭 클래스 문법을 사용해 `<>` 안에 타입을 지정해야 합니다.

```java
ArrayList<String> friends;
```
`<>` 부분은 컴파일러의 변수 타입에서 타입 매개변수를 추론합니다.
이 호출에는 생성 인수가 없지만, 그럼에도 끝에()를 붙여야 합니다. 결과는 크기가 0인 배열 리스트다. add 메서드로 요소를 끝에 추가할 수 있습니다.

```java
friends.add("Pater");
friends.add("Paul");
```

배열 리스트용 초깃값 지정 문법은 없습니다. 다음과 같이 배열 리스트르 생성하는 것이 최선입니다.
```java
ArrayList<String> friends = new ArrayList<>(List.of("Peter", "Paul"));
```
List.of 메서드는 지정한 요소들로 구성된 수정 불가능한 리스트를 반환합니다.
반환받은 리스트로 ArrayList를 생성합니다. ArrayList의 어느 위치든 요소를 추가하고 제거할 수 있습니다.

```java
friends.remove(1);
friends.add(0, "Paul"); // 인덱스 0 앞에 추가합니다.
```
배열 리스트의 요소에 접근하려면 [] 문법이 아니라 메서드 호출을 사용해야 합니다. get 메서드는 요소를 읽어 오고, set 메서드는 요소를 다른 값으로 교체합니다.

```java
String first = friends.get(0);
friends.set(1, "Mary");
```
size 메서드는 리스트의 현재 크기를 돌려줍니다. 모든 요소를 순회하고 싶다면 다음과 같이 루프를 사용합니다.

```java
for (int i = 0; i < friends.size(); i++){
    System.out.println(friends.get(i));
}
```



