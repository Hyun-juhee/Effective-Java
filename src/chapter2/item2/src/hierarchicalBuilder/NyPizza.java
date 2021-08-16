package chapter2.item2.src.hierarchicalBuilder;

import java.util.Objects;
import java.util.Set;

public class NyPizza extends Pizza {
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        // 생성자 추가
        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return toppings + "로 토핑한 뉴욕 피자";
    }
}
