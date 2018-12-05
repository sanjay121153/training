package enums;

public enum Color {
    RED{
        public String getValue(){
            return "RED";
        }
    },
    ,GREEN{
        public String getValue(){
            return "GREEN";
        }
    },BLUE{
        public String getValue(){
            return "BLUE";
        }
    };

    public abstract String getValue();
}
