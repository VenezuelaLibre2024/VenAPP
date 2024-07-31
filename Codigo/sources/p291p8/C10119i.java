package p291p8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p361t6.C11005b3;
import p363t8.C11146e0;
import p363t8.C11172r0;

/* renamed from: p8.i */
/* loaded from: classes.dex */
public final class C10119i {

    /* renamed from: a */
    private static final Pattern f24855a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static Matcher m30236a(C11146e0 c11146e0) {
        String m34694s;
        while (true) {
            String m34694s2 = c11146e0.m34694s();
            if (m34694s2 == null) {
                return null;
            }
            if (f24855a.matcher(m34694s2).matches()) {
                do {
                    m34694s = c11146e0.m34694s();
                    if (m34694s != null) {
                    }
                } while (!m34694s.isEmpty());
            } else {
                Matcher matcher = C10116f.f24829a.matcher(m34694s2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m30237b(C11146e0 c11146e0) {
        String m34694s = c11146e0.m34694s();
        return m34694s != null && m34694s.startsWith("WEBVTT");
    }

    /* renamed from: c */
    public static float m30238c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: d */
    public static long m30239d(String str) {
        String[] m34893S0 = C11172r0.m34893S0(str, "\\.");
        long j10 = 0;
        for (String str2 : C11172r0.m34891R0(m34893S0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (m34893S0.length == 2) {
            j11 += Long.parseLong(m34893S0[1]);
        }
        return j11 * 1000;
    }

    /* renamed from: e */
    public static void m30240e(C11146e0 c11146e0) {
        int m34683f = c11146e0.m34683f();
        if (m30237b(c11146e0)) {
            return;
        }
        c11146e0.m34677U(m34683f);
        throw C11005b3.m33715a("Expected WEBVTT. Got " + c11146e0.m34694s(), null);
    }
}
