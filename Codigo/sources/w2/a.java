package w2;

import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class a {
    public static String a(String str) {
        if (str != null && !str.isEmpty()) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",", false);
            if (stringTokenizer.hasMoreTokens()) {
                return stringTokenizer.nextToken();
            }
        }
        return null;
    }
}
