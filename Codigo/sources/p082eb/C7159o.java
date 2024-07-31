package p082eb;

/* renamed from: eb.o */
/* loaded from: classes2.dex */
public final class C7159o {
    /* renamed from: a */
    private static String m21298a(int i10, int i11, String str) {
        if (i10 < 0) {
            return C7165u.m21350c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C7165u.m21350c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    /* renamed from: b */
    private static String m21299b(int i10, int i11, String str) {
        if (i10 < 0) {
            return C7165u.m21350c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C7165u.m21350c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    /* renamed from: c */
    private static String m21300c(int i10, int i11, int i12) {
        return (i10 < 0 || i10 > i12) ? m21299b(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? m21299b(i11, i12, "end index") : C7165u.m21350c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    /* renamed from: d */
    public static void m21301d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m21302e(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m21303f(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(C7165u.m21350c(str, Character.valueOf(c10)));
        }
    }

    /* renamed from: g */
    public static void m21304g(boolean z10, String str, char c10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(C7165u.m21350c(str, Character.valueOf(c10), obj));
        }
    }

    /* renamed from: h */
    public static void m21305h(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(C7165u.m21350c(str, Integer.valueOf(i10)));
        }
    }

    /* renamed from: i */
    public static void m21306i(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(C7165u.m21350c(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    /* renamed from: j */
    public static void m21307j(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(C7165u.m21350c(str, Long.valueOf(j10)));
        }
    }

    /* renamed from: k */
    public static void m21308k(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(C7165u.m21350c(str, obj));
        }
    }

    /* renamed from: l */
    public static void m21309l(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(C7165u.m21350c(str, obj, obj2));
        }
    }

    /* renamed from: m */
    public static int m21310m(int i10, int i11) {
        return m21311n(i10, i11, "index");
    }

    /* renamed from: n */
    public static int m21311n(int i10, int i11, String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(m21298a(i10, i11, str));
        }
        return i10;
    }

    /* renamed from: o */
    public static <T> T m21312o(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: p */
    public static <T> T m21313p(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: q */
    public static <T> T m21314q(T t10, String str, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(C7165u.m21350c(str, obj));
    }

    /* renamed from: r */
    public static int m21315r(int i10, int i11) {
        return m21316s(i10, i11, "index");
    }

    /* renamed from: s */
    public static int m21316s(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m21299b(i10, i11, str));
        }
        return i10;
    }

    /* renamed from: t */
    public static void m21317t(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(m21300c(i10, i11, i12));
        }
    }

    /* renamed from: u */
    public static void m21318u(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: v */
    public static void m21319v(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: w */
    public static void m21320w(boolean z10, String str, char c10, char c11) {
        if (!z10) {
            throw new IllegalStateException(C7165u.m21350c(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    /* renamed from: x */
    public static void m21321x(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalStateException(C7165u.m21350c(str, Integer.valueOf(i10)));
        }
    }

    /* renamed from: y */
    public static void m21322y(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(C7165u.m21350c(str, obj));
        }
    }
}
