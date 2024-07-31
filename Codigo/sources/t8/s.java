package t8;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    private static int f26760b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f26761c = true;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f26759a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static a f26762d = a.f26763a;

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26763a = new C0438a();

        /* renamed from: t8.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0438a implements a {
            C0438a() {
            }

            @Override // t8.s.a
            public void a(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // t8.s.a
            public void b(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // t8.s.a
            public void c(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // t8.s.a
            public void d(String str, String str2) {
                Log.i(str, str2);
            }
        }

        void a(String str, String str2);

        void b(String str, String str2);

        void c(String str, String str2);

        void d(String str, String str2);
    }

    private static String a(String str, Throwable th2) {
        String e10 = e(th2);
        if (TextUtils.isEmpty(e10)) {
            return str;
        }
        return str + "\n  " + e10.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f26759a) {
            if (f26760b == 0) {
                f26762d.c(str, str2);
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f26759a) {
            if (f26760b <= 3) {
                f26762d.b(str, str2);
            }
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        c(str, a(str2, th2));
    }

    public static String e(Throwable th2) {
        synchronized (f26759a) {
            if (th2 == null) {
                return null;
            }
            if (h(th2)) {
                return "UnknownHostException (no network)";
            }
            if (f26761c) {
                return Log.getStackTraceString(th2).trim().replace("\t", "    ");
            }
            return th2.getMessage();
        }
    }

    public static void f(String str, String str2) {
        synchronized (f26759a) {
            if (f26760b <= 1) {
                f26762d.d(str, str2);
            }
        }
    }

    public static void g(String str, String str2, Throwable th2) {
        f(str, a(str2, th2));
    }

    private static boolean h(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f26759a) {
            if (f26760b <= 2) {
                f26762d.a(str, str2);
            }
        }
    }

    public static void j(String str, String str2, Throwable th2) {
        i(str, a(str2, th2));
    }
}
