# [item5] 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라
### 의존 객체 주입
- 사용하는 자원에 따라 동작이 달라지는 클래스에는 정적 유틸리티 클래스나 싱글톤 방식이 적합하지 않다.
- 외부 자원을 사용해야 하고, 이에 따라 동작이 달라질 때 의존 객체 주입을 사용해야 한다.
- 의존 객체 주입은 인스턴스를 생성할 때 생성자에 필요한 자원을 넘겨주는 방식이다.
- 의존 객체 주입 프레임워크 중 하나가 스프링

```java
public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
        // dictionary가 final이므로 null일 때 예외
    }
}
```

### 팩터리 메서드 패턴
- 팩터리 : 호출할 때 마다 특정 타입의 인스턴스를 반복해서 만들어주는 객체
- 팩터리 메서드 패턴 : 생성자에 자원 팩터리를 넘겨주는 방식
- Supplier<T>를 주입받는 메서드는 한정적 와일드카드 타입을 사용해 팩터리의 매개변수 타입을 제한한다. 
```java
public SpellChecker(Supplier<Lexicon> dictionary) {
    this.dictionary = Objects.requireNonNull(dictionary.get());
}
```