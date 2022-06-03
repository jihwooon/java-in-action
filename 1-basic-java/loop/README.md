## 제어 흐름


### 분기

if문은 괄호 안에 조건이 들어가고, 그 뒤에 한 문장 또는 중괄호로 감산 문장 묶음이 온다.
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



### 루프
