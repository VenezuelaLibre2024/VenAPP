package kotlin.jvm.internal;

import ck.C2036u;
import java.util.Arrays;

/* renamed from: kotlin.jvm.internal.n */
/* loaded from: classes3.dex */
public class C9322n {
    private C9322n() {
    }

    /* renamed from: a */
    public static boolean m27777a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m27778b(Object obj) {
        if (obj == null) {
            m27788l();
        }
    }

    /* renamed from: c */
    public static void m27779c(Object obj, String str) {
        if (obj == null) {
            m27789m(str);
        }
    }

    /* renamed from: d */
    public static void m27780d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m27785i(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: e */
    public static void m27781e(Object obj, String str) {
        if (obj == null) {
            m27790n(str);
        }
    }

    /* renamed from: f */
    public static int m27782f(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    /* renamed from: g */
    public static int m27783g(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    /* renamed from: h */
    private static String m27784h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C9322n.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: i */
    private static <T extends Throwable> T m27785i(T t10) {
        return (T) m27786j(t10, C9322n.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static <T extends Throwable> T m27786j(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    /* renamed from: k */
    public static String m27787k(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: l */
    public static void m27788l() {
        throw ((NullPointerException) m27785i(new NullPointerException()));
    }

    /* renamed from: m */
    public static void m27789m(String str) {
        throw ((NullPointerException) m27785i(new NullPointerException(str)));
    }

    /* renamed from: n */
    private static void m27790n(String str) {
        throw ((NullPointerException) m27785i(new NullPointerException(m27784h(str))));
    }

    /* renamed from: o */
    public static void m27791o(String str) {
        throw ((C2036u) m27785i(new C2036u(str)));
    }

    /* renamed from: p */
    public static void m27792p(String str) {
        m27791o("lateinit property " + str + " has not been initialized");
    }
}
