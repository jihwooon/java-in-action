## 제어 흐름


### 분기

if문은 괄호 안에 조건이 들어가고, 그 뒤에 한 문장 또는 중괄호로 감싼 문장 묶음이 온다.
```java
if (count > 0) {
    double average = sum/count;
    System.out.println(average);
}
```

조건이 맞지 않을 경우 else 분기를 추가합니다.
```java
if (count > 0) {
    double average = sum/count;
    System.out.println(average);
} else {
    System.out.println(0);
}
```

else 분기에 또 다른 if문 을 둘 수도 있다.
```java
if (count > 0) {
    double average = sum/count;
    System.out.println(average);
} else {
    System.out.println(0);
} else {
    System.out.println("Huh?");
}
```

상수 값의 기준으로 검사 할 때 switch 문 사용한다.
```java
    switch (count) {
        case 0:
            output = "None";
            break;
        case 1:
            output = "One"
            break;
        case 2:
        case 3:
        case 4:
        case 5:
            output = Integer.toString(count);
            break;
        default:
            output = "Many";
            break;
    }
```
일치하는 case 레이블을 실행하고, 일치하는 케이스 항목이 없을 때 default 레이블을 실행합니다.

- char, byte, short, int 타입 클래스 (Character, Byte, Short, Integer) 상수 표현식
- 문자열 리터널
- 열거 값

### 루프

while 루프는 조건 검사 결과에 따라 수행할 작업이 남아 있는 동안 바디를 계속 실행합니다.

```java
Random generator = new Random();

int next = generator.nextInt(10);

while (sum < target) {
	int next = generator.nextInt(10);
	sum += next;
	count++;
}

```

조건을 평가하기 전에 루프 바디를 실행해야 할 때 있습니다. 특정 값을 얻기까지 소유ㅗ디는 시간을 알고 싶을 때 이런 조건을 검사하려면 그 전에 루프로 들어가서 값을 얻어야 합니다. 이때 do/while 루프를 사용합니다.

```java
int next;
do {
	next = generator.nextInt(10);
	count++;
} while (next != target);
```

루프 바디에 들어간 후 next를 설정합니다. 그런 다음 조건을 평가합니다. 조건을 만족하는 동안 루프 바디를 계속 반복합니다.

do/while 은 루프 반복 횟수를 알 수 없습니다.

실전에서는 for루프를 사용해서 반복 횟수를 고정 합니다.

```java
for (int i = 1; i <=20; i++) {
	int next = generator.nextInt(10);
	sum += next;
}
```

모든 for 루프를 while 루프로 고쳐 쓸 수 있습니다.

```java
int i = 1;
while (i <=20) {
	int next = generator.nextInt(10);
	sum += next;
	i++;
}
```

while 루프를 사용하면 i  변수의 초기화, 검사, 업데이트가 각각 다른 위치로 흩어집니다.

for 루프를 사용하면 깔끔하게 나란히 둘 수 있습니다. 초기화, 검사, 업데이트의 임의 형태로 작성할 수 있습니다.

```java
for (int i = 1; i < target; i *= 2) {
	System.out.println(i);
}
```
