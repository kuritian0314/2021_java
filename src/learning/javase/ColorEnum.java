package learning.javase;

public enum ColorEnum {
    RED(1, "红色"), GREEN(2, "绿色"), BLUE(3, "蓝色");

    private Integer id;
    private String name;

    public static String getColor(Integer i) {
        for (ColorEnum c : ColorEnum.values()) {
            if (c.getId().equals(i)) {
                return c.getName();
            }
        }
        return null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ColorEnum(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
