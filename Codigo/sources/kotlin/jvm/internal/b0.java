package kotlin.jvm.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class b0 {
    public static List a(Object obj) {
        if ((obj instanceof pk.a) && !(obj instanceof pk.b)) {
            j(obj, "kotlin.collections.MutableList");
        }
        return d(obj);
    }

    public static Map b(Object obj) {
        if ((obj instanceof pk.a) && !(obj instanceof pk.c)) {
            j(obj, "kotlin.collections.MutableMap");
        }
        return e(obj);
    }

    public static Object c(Object obj, int i10) {
        if (obj != null && !g(obj, i10)) {
            j(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static List d(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw i(e10);
        }
    }

    public static Map e(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw i(e10);
        }
    }

    public static int f(Object obj) {
        if (obj instanceof i) {
            return ((i) obj).getArity();
        }
        if (obj instanceof ok.a) {
            return 0;
        }
        if (obj instanceof ok.l) {
            return 1;
        }
        if (obj instanceof ok.p) {
            return 2;
        }
        if (obj instanceof ok.q) {
            return 3;
        }
        if (obj instanceof ok.r) {
            return 4;
        }
        if (obj instanceof ok.s) {
            return 5;
        }
        if (obj instanceof ok.t) {
            return 6;
        }
        if (obj instanceof ok.u) {
            return 7;
        }
        if (obj instanceof ok.v) {
            return 8;
        }
        if (obj instanceof ok.w) {
            return 9;
        }
        if (obj instanceof ok.b) {
            return 10;
        }
        if (obj instanceof ok.c) {
            return 11;
        }
        if (obj instanceof ok.d) {
            return 12;
        }
        if (obj instanceof ok.e) {
            return 13;
        }
        if (obj instanceof ok.f) {
            return 14;
        }
        if (obj instanceof ok.g) {
            return 15;
        }
        if (obj instanceof ok.h) {
            return 16;
        }
        if (obj instanceof ok.i) {
            return 17;
        }
        if (obj instanceof ok.j) {
            return 18;
        }
        if (obj instanceof ok.k) {
            return 19;
        }
        if (obj instanceof ok.m) {
            return 20;
        }
        if (obj instanceof ok.n) {
            return 21;
        }
        return obj instanceof ok.o ? 22 : -1;
    }

    public static boolean g(Object obj, int i10) {
        return (obj instanceof ck.c) && f(obj) == i10;
    }

    private static <T extends Throwable> T h(T t10) {
        return (T) n.j(t10, b0.class.getName());
    }

    public static ClassCastException i(ClassCastException classCastException) {
        throw ((ClassCastException) h(classCastException));
    }

    public static void j(Object obj, String str) {
        k((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void k(String str) {
        throw i(new ClassCastException(str));
    }
}
