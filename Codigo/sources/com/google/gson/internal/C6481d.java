package com.google.gson.internal;

/* renamed from: com.google.gson.internal.d */
/* loaded from: classes2.dex */
public final class C6481d {

    /* renamed from: a */
    private static final int f14233a = m18236a();

    /* renamed from: a */
    private static int m18236a() {
        return m18238c(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m18237b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb2.append(charAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    static int m18238c(String str) {
        int m18240e = m18240e(str);
        if (m18240e == -1) {
            m18240e = m18237b(str);
        }
        if (m18240e == -1) {
            return 6;
        }
        return m18240e;
    }

    /* renamed from: d */
    public static boolean m18239d() {
        return f14233a >= 9;
    }

    /* renamed from: e */
    private static int m18240e(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
