package td;

/* renamed from: td.d */
/* loaded from: classes.dex */
public final class C11246d {
    /* renamed from: a */
    public static <T> void m35129a(T t10, Class<T> cls) {
        if (t10 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m35130b(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: c */
    public static <T> T m35131c(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    /* renamed from: d */
    public static <T> T m35132d(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
