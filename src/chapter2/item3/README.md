# [item3] private 생성자나 열거 타입으로 싱글턴임을 보증하라

### 1. public static final field
생성자는 private으로 감추고, 유일한 인스턴스에 접근할 수 있는 public static 필드를 생성한다. 
- 해당 클래스가 싱글텀임이 명백히 드러난다.
- final이기 때문에 절대 다른 객체를 참조할 수 없다. 
```java
 public static final ElvisField INSTANCE = new ElvisField();
 private ElvisField() { }
```

### 2. public static factory
생성자는 private으로 감추고, 유일하게 인스턴스에 접근할 수 있게 하는 public static 메소드를 생성한다.
- 싱글턴이 아니게 변경하고 싶을 때 API를 바꾸지 않아도 된다.
- 제네릭 싱글턴 팩터리로 만들 수 있다. (item 30)
- 정적 팩터리의 메소드 참조를 Supplier로 사용할 수 있다. (매개값이 없고 리턴값만 있기 때문에 함수형 인터페이스 Supplier로)
```java
private ElvisStaticFactory() { }
public static ElvisStaticFactory getInstance() {
    return INSTANCE;
}
```

### 3. enum
원소가 하나인 열거 타입을 선언한다.
- 더 간결하고 추가 노력없이 직렬화할 수 있다. 
- 리플렉션(item 65) 공격에서도 추가 인스턴스가 생기는 일을 완벽히 막아준다. 
    - 위 두 가지 방법은 리플렉션 API인 AccessibleObject.setAccesible을 사용해서 Private 생성자를 호출할 수 있다.
    - 그러나 enum타입으로 선언하면 private 생성자도 없기 때문에 이런 공격이 성립하지 않는다. 
```java
public enum ElvisEnum {
    INSTANCE;
    ...
}
```