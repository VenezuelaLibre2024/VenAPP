package p363t8;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: t8.s */
/* loaded from: classes.dex */
public final class C11173s {

    /* renamed from: b */
    private static int f29056b = 0;

    /* renamed from: c */
    private static boolean f29057c = true;

    /* renamed from: a */
    private static final Object f29055a = new Object();

    /* renamed from: d */
    private static a f29058d = a.f29059a;

    /* renamed from: t8.s$a */
    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: a */
        public static final a f29059a = new C13255a();

        /* renamed from: t8.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C13255a implements a {
            C13255a() {
            }

            @Override // p363t8.C11173s.a
            /* renamed from: a */
            public void mo34972a(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // p363t8.C11173s.a
            /* renamed from: b */
            public void mo34973b(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // p363t8.C11173s.a
            /* renamed from: c */
            public void mo34974c(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // p363t8.C11173s.a
            /* renamed from: d */
            public void mo34975d(String str, String str2) {
                Log.i(str, str2);
            }
        }

        /* renamed from: a */
        void mo34972a(String str, String str2);

        /* renamed from: b */
        void mo34973b(String str, String str2);

        /* renamed from: c */
        void mo34974c(String str, String str2);

        /* renamed from: d */
        void mo34975d(String str, String str2);
    }

    /* renamed from: a */
    private static String m34962a(String str, Throwable th2) {
        String m34966e = m34966e(th2);
        if (TextUtils.isEmpty(m34966e)) {
            return str;
        }
        return str + "\n  " + m34966e.replace("\n", "\n  ") + '\n';
    }

    /* renamed from: b */
    public static void m34963b(String str, String str2) {
        synchronized (f29055a) {
            if (f29056b == 0) {
                f29058d.mo34974c(str, str2);
            }
        }
    }

    /* renamed from: c */
    public static void m34964c(String str, String str2) {
        synchronized (f29055a) {
            if (f29056b <= 3) {
                f29058d.mo34973b(str, str2);
            }
        }
    }

    /* renamed from: d */
    public static void m34965d(String str, String str2, Throwable th2) {
        m34964c(str, m34962a(str2, th2));
    }

    /* renamed from: e */
    public static String m34966e(Throwable th2) {
        synchronized (f29055a) {
            if (th2 == null) {
                return null;
            }
            if (m34969h(th2)) {
                return "UnknownHostException (no network)";
            }
            if (f29057c) {
                return Log.getStackTraceString(th2).trim().replace("\t", "    ");
            }
            return th2.getMessage();
        }
    }

    /* renamed from: f */
    public static void m34967f(String str, String str2) {
        synchronized (f29055a) {
            if (f29056b <= 1) {
                f29058d.mo34975d(str, str2);
            }
        }
    }

    /* renamed from: g */
    public static void m34968g(String str, String str2, Throwable th2) {
        m34967f(str, m34962a(str2, th2));
    }

    /* renamed from: h */
    private static boolean m34969h(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* renamed from: i */
    public static void m34970i(String str, String str2) {
        synchronized (f29055a) {
            if (f29056b <= 2) {
                f29058d.mo34972a(str, str2);
            }
        }
    }

    /* renamed from: j */
    public static void m34971j(String str, String str2, Throwable th2) {
        m34970i(str, m34962a(str2, th2));
    }
}
