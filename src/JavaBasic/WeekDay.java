package JavaBasic;

public enum WeekDay implements Option {
    MONDAY(2, "on"){
        @Override
        public String getShortName(){
            return "Mon";
        }
    }, TUESDAY(3, "on") {
        @Override
        public String getShortName() {
            return null;
        }
    }, WEDNESDAY(4, "on") {
        @Override
        public String getShortName() {
            return "Wed";
        }
    }, THURSDAY(5, "on") {
        @Override
        public String getShortName() {
            return "Thu";
        }
    }, FRIDAY(6, "on") {
        @Override
        public String getShortName() {
            return "Fri";
        }
    }, SATURDAY(7, "off") {
        @Override
        public String getShortName() {
            return "Sat";
        }
    }, SUNDAY(1, "off") {
        @Override
        public String getShortName() {
            return "Sun";
        }
    };
    private final int value;
    private final String active;

    WeekDay(int value, String active) {
        this.value = value;
        this.active = active;
    }

    @Override
    public String toString() {
        if (value == 1) {
            return "Today is holiday";
        } else {
            return "Today is working day";
        }
    }
    public abstract String getShortName();


    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public String getActive() {
        return this.active;
    }
}
