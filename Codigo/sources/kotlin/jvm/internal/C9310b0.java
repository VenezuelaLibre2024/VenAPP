package kotlin.jvm.internal;

import ck.InterfaceC2018c;
import java.util.List;
import java.util.Map;
import p280ok.InterfaceC10000n;
import p280ok.InterfaceC10001o;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC10003q;
import p280ok.InterfaceC10004r;
import p280ok.InterfaceC10005s;
import p280ok.InterfaceC10006t;
import p280ok.InterfaceC10007u;
import p280ok.InterfaceC10008v;
import p280ok.InterfaceC10009w;
import p280ok.InterfaceC9987a;
import p280ok.InterfaceC9988b;
import p280ok.InterfaceC9989c;
import p280ok.InterfaceC9990d;
import p280ok.InterfaceC9991e;
import p280ok.InterfaceC9992f;
import p280ok.InterfaceC9993g;
import p280ok.InterfaceC9994h;
import p280ok.InterfaceC9995i;
import p280ok.InterfaceC9996j;
import p280ok.InterfaceC9997k;
import p280ok.InterfaceC9998l;
import p280ok.InterfaceC9999m;
import pk.InterfaceC10201a;
import pk.InterfaceC10202b;
import pk.InterfaceC10203c;

/* renamed from: kotlin.jvm.internal.b0 */
/* loaded from: classes3.dex */
public class C9310b0 {
    /* renamed from: a */
    public static List m27757a(Object obj) {
        if ((obj instanceof InterfaceC10201a) && !(obj instanceof InterfaceC10202b)) {
            m27766j(obj, "kotlin.collections.MutableList");
        }
        return m27760d(obj);
    }

    /* renamed from: b */
    public static Map m27758b(Object obj) {
        if ((obj instanceof InterfaceC10201a) && !(obj instanceof InterfaceC10203c)) {
            m27766j(obj, "kotlin.collections.MutableMap");
        }
        return m27761e(obj);
    }

    /* renamed from: c */
    public static Object m27759c(Object obj, int i10) {
        if (obj != null && !m27763g(obj, i10)) {
            m27766j(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    /* renamed from: d */
    public static List m27760d(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw m27765i(e10);
        }
    }

    /* renamed from: e */
    public static Map m27761e(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw m27765i(e10);
        }
    }

    /* renamed from: f */
    public static int m27762f(Object obj) {
        if (obj instanceof InterfaceC9317i) {
            return ((InterfaceC9317i) obj).getArity();
        }
        if (obj instanceof InterfaceC9987a) {
            return 0;
        }
        if (obj instanceof InterfaceC9998l) {
            return 1;
        }
        if (obj instanceof InterfaceC10002p) {
            return 2;
        }
        if (obj instanceof InterfaceC10003q) {
            return 3;
        }
        if (obj instanceof InterfaceC10004r) {
            return 4;
        }
        if (obj instanceof InterfaceC10005s) {
            return 5;
        }
        if (obj instanceof InterfaceC10006t) {
            return 6;
        }
        if (obj instanceof InterfaceC10007u) {
            return 7;
        }
        if (obj instanceof InterfaceC10008v) {
            return 8;
        }
        if (obj instanceof InterfaceC10009w) {
            return 9;
        }
        if (obj instanceof InterfaceC9988b) {
            return 10;
        }
        if (obj instanceof InterfaceC9989c) {
            return 11;
        }
        if (obj instanceof InterfaceC9990d) {
            return 12;
        }
        if (obj instanceof InterfaceC9991e) {
            return 13;
        }
        if (obj instanceof InterfaceC9992f) {
            return 14;
        }
        if (obj instanceof InterfaceC9993g) {
            return 15;
        }
        if (obj instanceof InterfaceC9994h) {
            return 16;
        }
        if (obj instanceof InterfaceC9995i) {
            return 17;
        }
        if (obj instanceof InterfaceC9996j) {
            return 18;
        }
        if (obj instanceof InterfaceC9997k) {
            return 19;
        }
        if (obj instanceof InterfaceC9999m) {
            return 20;
        }
        if (obj instanceof InterfaceC10000n) {
            return 21;
        }
        return obj instanceof InterfaceC10001o ? 22 : -1;
    }

    /* renamed from: g */
    public static boolean m27763g(Object obj, int i10) {
        return (obj instanceof InterfaceC2018c) && m27762f(obj) == i10;
    }

    /* renamed from: h */
    private static <T extends Throwable> T m27764h(T t10) {
        return (T) C9322n.m27786j(t10, C9310b0.class.getName());
    }

    /* renamed from: i */
    public static ClassCastException m27765i(ClassCastException classCastException) {
        throw ((ClassCastException) m27764h(classCastException));
    }

    /* renamed from: j */
    public static void m27766j(Object obj, String str) {
        m27767k((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* renamed from: k */
    public static void m27767k(String str) {
        throw m27765i(new ClassCastException(str));
    }
}
