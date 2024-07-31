package la;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: la.t */
/* loaded from: classes.dex */
public class C9475t {

    /* renamed from: a */
    private static final Pattern f23014a = Pattern.compile("\\$\\{(.*?)\\}");

    /* renamed from: a */
    public static String m28179a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m28180b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
