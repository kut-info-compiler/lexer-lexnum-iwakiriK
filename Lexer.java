import java.util.*;
import java.util.regex.*;
public class Lexer {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] type = {
			"^(0|([1-9][0-9]*))",
			"^[0-9]*[a-fA-F][0-9a-fA-F]*",
            "^0[xX][0-9a-fA-F]+",
            "^(0|[1-9][0-9]*)\\.[0-9]*",
            "^\\.[0-9]+"
        };
        String input = scan.next(), ans = "ERR";
        for (int i = 0; i < 5; i++) {
            Pattern p = Pattern.compile(type[i]);
            Matcher m = p.matcher(input);
            if (m.find()) ans = (i < 3 ? "INT" : "DEC") + m.group();
        }
        System.out.println(ans);
    }
}
