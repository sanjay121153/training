package enums;


/**
 * We are declaring the abstract method over here and we need to override it here itself ,
 * because this can not extend another enum.
 */
public enum Animal {
    CAT {
        public String makeNoise() {
            return "MEOW!";
        }
    },
    DOG {
        public String makeNoise() {
            return "WOOF!";
        }
    };

    public abstract String makeNoise();
}