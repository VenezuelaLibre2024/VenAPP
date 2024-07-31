package f2;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f14886a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile j f14887b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final int f14888c = 20;

    /* loaded from: classes.dex */
    public static class a extends j {

        /* renamed from: d, reason: collision with root package name */
        private final int f14889d;

        public a(int i10) {
            super(i10);
            this.f14889d = i10;
        }

        @Override // f2.j
        public void a(String str, String str2) {
            if (this.f14889d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // f2.j
        public void b(String str, String str2, Throwable th2) {
            if (this.f14889d <= 3) {
                Log.d(str, str2, th2);
            }
        }

        @Override // f2.j
        public void c(String str, String str2) {
            if (this.f14889d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // f2.j
        public void d(String str, String str2, Throwable th2) {
            if (this.f14889d <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // f2.j
        public void f(String str, String str2) {
            if (this.f14889d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // f2.j
        public void g(String str, String str2, Throwable th2) {
            if (this.f14889d <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // f2.j
        public void j(String str, String str2) {
            if (this.f14889d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // f2.j
        public void k(String str, String str2) {
            if (this.f14889d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // f2.j
        public void l(String str, String str2, Throwable th2) {
            if (this.f14889d <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    public j(int i10) {
    }

    public static j e() {
        j jVar;
        synchronized (f14886a) {
            if (f14887b == null) {
                f14887b = new a(3);
            }
            jVar = f14887b;
        }
        return jVar;
    }

    public static void h(j jVar) {
        synchronized (f14886a) {
            f14887b = jVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f14888c;
        if (length >= i10) {
            str = str.substring(0, i10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th2);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th2);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th2);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th2);
}
