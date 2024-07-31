package p174j6;

/* renamed from: j6.d */
/* loaded from: classes.dex */
public final class C8991d {
    /* renamed from: a */
    public static <T> void m26384a(T t10, Class<T> cls) {
        if (t10 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m26385b(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: c */
    public static <T> T m26386c(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }
}
