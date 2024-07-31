package sc;

import android.util.Log;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    static final g f25472c = new g("FirebaseCrashlytics");

    /* renamed from: a, reason: collision with root package name */
    private final String f25473a;

    /* renamed from: b, reason: collision with root package name */
    private int f25474b = 4;

    public g(String str) {
        this.f25473a = str;
    }

    private boolean a(int i10) {
        return this.f25474b <= i10 || Log.isLoggable(this.f25473a, i10);
    }

    public static g f() {
        return f25472c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f25473a, str, th2);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f25473a, str, th2);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th2) {
        if (a(4)) {
            Log.i(this.f25473a, str, th2);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th2) {
        if (a(2)) {
            Log.v(this.f25473a, str, th2);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th2) {
        if (a(5)) {
            Log.w(this.f25473a, str, th2);
        }
    }
}
