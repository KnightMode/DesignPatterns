public class stringbuildlearn {

    public static void main(String arg [] )
    {
//       Lunchorder.Buildcustom buildorder=new Lunchorder.Buildcustom();
//       buildorder.bread("Brown").meat("Ham");
//       Lunchorder order= buildorder.build();
//       order.getBread().getCondiments().getMeat();
//        orderwithoutbuilder builder=new orderwithoutbuilder("Ham","Lettuce");
//        builder.getBread().getMeat().getCondiments();
        orderwithoutbuilder builder1=new orderwithoutbuilder();
        builder1.Bread("Brown").Meat("Beef");
        builder1.getMeat().getBread().getCondiments();
    }
}
