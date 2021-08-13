# [chapter2.item1] 생성자 대신 정적 팩토리 메소드를 고려하라
### 장점
1. 생성자와는 달리 이름을 가질 수 있다. 
2. 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다.
    - 싱글톤 
    - 인스턴스화 불가
    - 불변값 클래스에서 동치인 인스턴스가 단 하나뿐임 보장
3. 반환 타입의 하위 타입 객체를 반환할 수 있다.
4. 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
   ```java
    
    public class Student {
        ...
    
        public static Student getStudent(boolean flag) {
            return flag ? new PrizeStudent() : new Student();
        }
    
        static class PrizeStudent extends Student {
        }
    }
   ```
5. 정적 팩토리 메소드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다. 

### 단점
1. 정적 팩토리 메소드만 있는 클래스를 만들면, public이나 protected로 선언된 생성자가 없어서 하위 클래스를 만들 수 없다.
2. 정적 팩토리 메소드가 다른 메소드와 잘 구분되지 않는다. 