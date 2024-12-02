package pisareff.Practice.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntryPoint {
    public static void main(String[] args) {

        String string = "+7 (962) 332-22-26 - pisareff \n" +
                        "+7 (903) 652-53-52 - pisareff's father\n"+
                        "8 (960) 102-82-99 - pisareff's mother";

        String regex = "(\\+7|8)\\s\\(9\\d{2}\\)\\s\\d{3}-\\d{2}-\\d{2}";

        System.out.println(Pattern.matches(regex,string));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        //System.out.println(matcher.matches()); // равнозначно вызову Pattern.matches(regex,string);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
