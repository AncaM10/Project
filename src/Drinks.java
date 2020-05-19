//Builder pattern used in this project - it creates drinks for the user depending on the preferences, here we have tea as an option

public class Drinks {
    static class Tea {

        private Tea(Builder builder) {

            this.type = builder.type;
            this.sugar = builder.sugar;
            this.milk = builder.milk;
            this.size = builder.size;

        }

        private String type;
        private boolean sugar;
        private boolean milk;
        private String size;

        public static class Builder {
            private String type;
            private boolean sugar;
            private boolean milk;
            private String size;

            public Builder(String type) {
                this.type = type;
            }


            public Builder sugar(boolean value) {
                this.sugar = value;
                return this;
            }


            public Builder milk(boolean value) {
                this.milk = value;
                return this;
            }


            public Builder size(String value) {
                this.size = value;
                return this;
            }


            public Tea build() {

                return new Tea(this);

            }

        }


        @Override

        public String toString() {

            return String.format("Your tea [type=%s, sugar=%s, milk=%s, size=%s]", this.type, sugar, milk, size);

        }


    }


    public static void main(String[] args) {

        Tea tea = new Drinks.Tea.Builder("Earl Grey").milk(true).sugar(true).size("Medium").build();
        System.out.println(tea);


    }

}
