public class Lunchorder {

    public static class Buildcustom{
        private  String Bread;
        private  String Meat;
        private  String Condiments;

        public  Buildcustom(){
        }
        public Buildcustom meat(String meat)
        {
            this.Meat=meat;
            return this;
        }
        public Buildcustom Condiments(String Condiments)
        {
            this.Condiments=Condiments;
            return this;
        }
        public Buildcustom bread(String bread)
        {
            this.Bread=bread;
            return this;
        }
        public Lunchorder build()
        {
            return new Lunchorder(this);
        }
    }
    private  final String Bread;
    private  final String Meat;
    private  final String Condiments;
    private Lunchorder(Buildcustom buildcustom)
    {
        this.Meat=buildcustom.Meat;
        this.Condiments=buildcustom.Condiments;
        this.Bread=buildcustom.Bread;
    }

    public Lunchorder getBread() {
        System.out.println(Bread);
        return this;

    }

    public Lunchorder getMeat() {
        System.out.println(Meat);
        return this;
    }

    public Lunchorder getCondiments() {
        System.out.println(Condiments);
        return this;
    }
}
