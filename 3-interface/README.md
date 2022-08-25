# 인터페이스와 람다 표현식

### 핵심 내용

> 1. 인터페이스는 구현 클래스에서 반드시 구현해야 하는 메서드를 명시한다.
> 2. 인터 페이스는 해당 인터페이스를 구현하는 모든 클래스의 슈퍼 타입이다. 따라서 구현 클래스의 인터페이스를 인터페이스 타입 변수에 할당할 수 있다.
> 3. 자바는 객체 지향과 함수형 프로그래밍 사이의 간극을 메우는 함수 표현식을 지원한다.

### 인터페이스

인터페이스는 개발 코드를 수정하지 않고, 사용하는 객체를 변경 할 수 있도록 하기위해서 사용합니다.

### 인터페이스 선언

IntSequence 시퀀스는 다양한 형태를 취할 수 있다.

* 사용자가 제공한 정수 시퀀스
* 임의의 정수 시퀀스
* 소수 시퀀스
* 정수 배열에 들어 있는 시퀀스

```java
public interface IntSequence {
    boolean hasNext();

    int next();
}


public static double average(IntSequence seq, int n) {
    int count = 0;
    double sum = 0;
    while (seq.hasNext() && count < n) {
        count++;
        sum += seq.next();
    }
    return count == 0 ? 0 : sum / count;
}
```

> 인터페이스의 모든 메서드는 public이 기본으로 설정 되어 있다.
> 선언 할 필요는 없지만 의도를 명학하게 드러내려면 public으로 선언하기도 한다. 

### 인터페이스 구현
average 메서드에 사용하는 클래스를 살펴보자
IntSequence 인터페이스를 구현해야 한다.

```java
public class SquareSequence implements IntSequence {
    private int i;
    
    public boolean hasNext() {
        return true;
    }
    
    public int next() {
        i++;
        return i * i;
    }
    
}
```



### 인터페이스의 정적 메서드, 기본 메서드, 비공개 메서드
