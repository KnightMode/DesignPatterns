public class orderwithoutbuilder {
    private String Condiments;
    private String Meat;
    private String Bread;

    public orderwithoutbuilder() {
    }

    public orderwithoutbuilder(String Meat, String Condiments)
    {
        this.Meat=Meat;
        this.Condiments=Condiments;
    }
    public orderwithoutbuilder Meat(String Meat)
    {
        this.Meat=Meat;
        return this;
    }
    public orderwithoutbuilder Bread(String Bread)
    {
        this.Bread=Bread;
        return this;
    }
    public orderwithoutbuilder Condiments(String Condiments)
    {
        this.Condiments=Condiments;
        return this;
    }

    public orderwithoutbuilder getCondiments() {
        System.out.println(Condiments);
        return this;
    }

    public orderwithoutbuilder getMeat() {
        System.out.println(Meat);
        return this;
    }

    public orderwithoutbuilder getBread() {
        System.out.println(Bread);
        return this;
    }
}
