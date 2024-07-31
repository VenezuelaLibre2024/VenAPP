package p8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t6.b3;
import t8.e0;
import t8.r0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private static final Pattern f22922a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(e0 e0Var) {
        String s10;
        while (true) {
            String s11 = e0Var.s();
            if (s11 == null) {
                return null;
            }
            if (f22922a.matcher(s11).matches()) {
                do {
                    s10 = e0Var.s();
                    if (s10 != null) {
                    }
                } while (!s10.isEmpty());
            } else {
                Matcher matcher = f.f22896a.matcher(s11);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(e0 e0Var) {
        String s10 = e0Var.s();
        return s10 != null && s10.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] S0 = r0.S0(str, "\\.");
        long j10 = 0;
        for (String str2 : r0.R0(S0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (S0.length == 2) {
            j11 += Long.parseLong(S0[1]);
        }
        return j11 * 1000;
    }

    public static void e(e0 e0Var) {
        int f10 = e0Var.f();
        if (b(e0Var)) {
            return;
        }
        e0Var.U(f10);
        throw b3.a("Expected WEBVTT. Got " + e0Var.s(), null);
    }
}
