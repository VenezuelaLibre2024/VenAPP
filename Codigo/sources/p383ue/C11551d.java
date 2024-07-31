package p383ue;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import re.C10696a;
import se.C10909h;

/* renamed from: ue.d */
/* loaded from: classes.dex */
public final class C11551d {

    /* renamed from: a */
    private static final Pattern f29990a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    /* renamed from: a */
    public static Long m36203a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C10696a.m32565e().m32566a("The content-length value is not a valid number");
            return null;
        }
    }

    /* renamed from: b */
    public static String m36204b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    /* renamed from: c */
    public static boolean m36205c(String str) {
        return str == null || !f29990a.matcher(str).matches();
    }

    /* renamed from: d */
    public static void m36206d(C10909h c10909h) {
        if (!c10909h.m33298g()) {
            c10909h.m33303o();
        }
        c10909h.m33294b();
    }
}
