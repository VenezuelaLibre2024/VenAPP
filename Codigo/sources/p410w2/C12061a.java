package p410w2;

import java.util.StringTokenizer;

/* renamed from: w2.a */
/* loaded from: classes.dex */
public class C12061a {
    /* renamed from: a */
    public static String m38730a(String str) {
        if (str != null && !str.isEmpty()) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",", false);
            if (stringTokenizer.hasMoreTokens()) {
                return stringTokenizer.nextToken();
            }
        }
        return null;
    }
}
