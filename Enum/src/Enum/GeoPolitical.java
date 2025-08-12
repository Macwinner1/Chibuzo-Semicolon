package Enum;

public enum GeoPolitical {
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nassarawa", "Niger"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Jigawa", "Kano", "Katsina", "Kebbi", "Sokoto", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Delta", "Rivers", "Cross-River", "Bayelsa","Edo"),
    SOUTH_WEST("Ekiti", "Osun", "Oyo", "Ondo", "Ogun", "Lagos");

    private String[] states;

    GeoPolitical(String... states) {
        this.states = states;
    }
    public String[] getStates() {
        return states;
    }
    public void setStates(String... states) {
        this.states = states;
    }
    public static GeoPolitical getGeoPolitical(String userState) {
        for (GeoPolitical geoPolitical : GeoPolitical.values()) {
            for (String state : geoPolitical.getStates()) {
                if (state.equalsIgnoreCase(userState)) {
                    return geoPolitical;
                }
            }
        }
        return userState + " not found";
    }

}
