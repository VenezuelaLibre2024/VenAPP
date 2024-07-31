package androidx.core.util;

import java.util.Objects;

/* renamed from: androidx.core.util.c */
/* loaded from: classes.dex */
public class C0979c {

    /* renamed from: androidx.core.util.c$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static boolean m4817a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        static int m4818b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m4812a(Object obj, Object obj2) {
        return a.m4817a(obj, obj2);
    }

    /* renamed from: b */
    public static int m4813b(Object... objArr) {
        return a.m4818b(objArr);
    }

    /* renamed from: c */
    public static <T> T m4814c(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: d */
    public static <T> T m4815d(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static String m4816e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
