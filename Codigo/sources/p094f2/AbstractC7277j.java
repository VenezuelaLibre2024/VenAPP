package p094f2;

import android.util.Log;

/* renamed from: f2.j */
/* loaded from: classes.dex */
public abstract class AbstractC7277j {

    /* renamed from: a */
    private static final Object f16309a = new Object();

    /* renamed from: b */
    private static volatile AbstractC7277j f16310b = null;

    /* renamed from: c */
    private static final int f16311c = 20;

    /* renamed from: f2.j$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC7277j {

        /* renamed from: d */
        private final int f16312d;

        public a(int i10) {
            super(i10);
            this.f16312d = i10;
        }

        @Override // p094f2.AbstractC7277j
        /* renamed from: a */
        public void mo21770a(String str, String str2) {
            if (this.f16312d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // p094f2.AbstractC7277j
        /* renamed from: b */
        public void mo21771b(String str, String str2, Throwable th2) {
            if (this.f16312d <= 3) {
                Log.d(str, str2, th2);
            }
        }

        @Override // p094f2.AbstractC7277j
        /* renamed from: c */
        public void mo21772c(String str, String str2) {
            if (this.f16312d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // p094f2.AbstractC7277j
        /* renamed from: d */
        public void mo21773d(String str, String str2, Throwable th2) {
            if (this.f16312d <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // p094f2.AbstractC7277j
        /* renamed from: f */
        public void mo21774f(String str, String str2) {
            if (this.f16312d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // p094f2.AbstractC7277j
        /* renamed from: g */
        public void mo21775g(String str, String str2, Throwable th2) {
            if (this.f16312d <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // p094f2.AbstractC7277j
        /* renamed from: j */
        public void mo21776j(String str, String str2) {
            if (this.f16312d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // p094f2.AbstractC7277j
        /* renamed from: k */
        public void mo21777k(String str, String str2) {
            if (this.f16312d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // p094f2.AbstractC7277j
        /* renamed from: l */
        public void mo21778l(String str, String str2, Throwable th2) {
            if (this.f16312d <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    public AbstractC7277j(int i10) {
    }

    /* renamed from: e */
    public static AbstractC7277j m21767e() {
        AbstractC7277j abstractC7277j;
        synchronized (f16309a) {
            if (f16310b == null) {
                f16310b = new a(3);
            }
            abstractC7277j = f16310b;
        }
        return abstractC7277j;
    }

    /* renamed from: h */
    public static void m21768h(AbstractC7277j abstractC7277j) {
        synchronized (f16309a) {
            f16310b = abstractC7277j;
        }
    }

    /* renamed from: i */
    public static String m21769i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f16311c;
        if (length >= i10) {
            str = str.substring(0, i10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    public abstract void mo21770a(String str, String str2);

    /* renamed from: b */
    public abstract void mo21771b(String str, String str2, Throwable th2);

    /* renamed from: c */
    public abstract void mo21772c(String str, String str2);

    /* renamed from: d */
    public abstract void mo21773d(String str, String str2, Throwable th2);

    /* renamed from: f */
    public abstract void mo21774f(String str, String str2);

    /* renamed from: g */
    public abstract void mo21775g(String str, String str2, Throwable th2);

    /* renamed from: j */
    public abstract void mo21776j(String str, String str2);

    /* renamed from: k */
    public abstract void mo21777k(String str, String str2);

    /* renamed from: l */
    public abstract void mo21778l(String str, String str2, Throwable th2);
}
