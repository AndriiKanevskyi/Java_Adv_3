public class HW_3 {
    public static void main(String[] args) {
        String original = "русский военный корабль иди на дно"; //просто
        String first = original.substring(0,original.length()/2);//просто
        String last = original.substring((original.length()/2));//просто

        System.out.println(original);//просто
        System.out.println(first);//просто
        System.out.println(last);//просто


        System.out.println("=====================================================");
        System.out.println("Теперь тоже самое с соблюдением правил переноса");
        System.out.println("=====================================================");


        //Сложно но с соблюдением правил переноса
        char lastliteral = original.charAt(original.length()/2);
        int oneMoreLiteral =0;
        while (!Character.isWhitespace(lastliteral)){
            oneMoreLiteral++;
            lastliteral=original.charAt(original.length()/2+oneMoreLiteral);
        }

         first = original.substring(0,original.length()/2+oneMoreLiteral);
         last = original.substring((original.length()/2+oneMoreLiteral));
         last=last.trim();

        System.out.println(original);
        System.out.println(first);
        System.out.println(last);

    }
}
