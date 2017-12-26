package chapter1.enums;

public enum Season2 {
    WINTER {
        public String getSeasonName(){ return "Winter"; }
    }, SUMMER {
        public String getSeasonName(){ return "Summer"; }
    }, SPRING {
        public String getSeasonName(){ return "Spring"; }
    }, FALL {
        public String getSeasonName(){ return "Fall"; }
    };
    abstract String getSeasonName();
}
