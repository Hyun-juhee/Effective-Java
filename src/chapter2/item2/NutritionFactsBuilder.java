package chapter2.item2;

public class NutritionFactsBuilder {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // 필수 매개변수
        private final int servingSize;
        private final int servings;

        // 선택 매개변수 - 기본값으로 초기화
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            // 필수 매개변수 초기화는 생성자에서
            this.servingSize = servingSize;
            this.servings = servings;
        }

        // 산텍 매개변수에 대한 Setter
        public Builder calories(int val) {
            calories = val;
            return this;
        }
        public Builder fat(int val) {
            fat = val;
            return this;
        }
        public Builder sodium(int val) {
            sodium = val;
            return this;
        }
        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        // NutritionFactsBuilder 생성자 호출
        public NutritionFactsBuilder build() {
            return new NutritionFactsBuilder(this);
        }
    }

    // Builder 를 매개변수로 넣는 생성자
    public NutritionFactsBuilder(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFactsBuilder nutritionFactsBuilder = new NutritionFactsBuilder.Builder(240, 9).calories(100).sodium(10).build();

        Builder builder = new Builder(240, 9);
        builder.calories(100);
        builder.sodium(10);
        NutritionFactsBuilder nutritionFactsBuilder1 = builder.build();
    }
}
