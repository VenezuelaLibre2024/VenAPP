package p036c4;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: c4.k */
/* loaded from: classes.dex */
public final class C1870k {
    /* renamed from: a */
    public static void m9947a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m9948b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m9949c(T t10) {
        if (t10.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t10;
    }

    /* renamed from: d */
    public static <T> T m9950d(T t10) {
        return (T) m9951e(t10, "Argument must not be null");
    }

    /* renamed from: e */
    public static <T> T m9951e(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }
}
