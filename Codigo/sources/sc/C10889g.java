package sc;

import android.util.Log;

/* renamed from: sc.g */
/* loaded from: classes.dex */
public class C10889g {

    /* renamed from: c */
    static final C10889g f27591c = new C10889g("FirebaseCrashlytics");

    /* renamed from: a */
    private final String f27592a;

    /* renamed from: b */
    private int f27593b = 4;

    public C10889g(String str) {
        this.f27592a = str;
    }

    /* renamed from: a */
    private boolean m33215a(int i10) {
        return this.f27593b <= i10 || Log.isLoggable(this.f27592a, i10);
    }

    /* renamed from: f */
    public static C10889g m33216f() {
        return f27591c;
    }

    /* renamed from: b */
    public void m33217b(String str) {
        m33218c(str, null);
    }

    /* renamed from: c */
    public void m33218c(String str, Throwable th2) {
        if (m33215a(3)) {
            Log.d(this.f27592a, str, th2);
        }
    }

    /* renamed from: d */
    public void m33219d(String str) {
        m33220e(str, null);
    }

    /* renamed from: e */
    public void m33220e(String str, Throwable th2) {
        if (m33215a(6)) {
            Log.e(this.f27592a, str, th2);
        }
    }

    /* renamed from: g */
    public void m33221g(String str) {
        m33222h(str, null);
    }

    /* renamed from: h */
    public void m33222h(String str, Throwable th2) {
        if (m33215a(4)) {
            Log.i(this.f27592a, str, th2);
        }
    }

    /* renamed from: i */
    public void m33223i(String str) {
        m33224j(str, null);
    }

    /* renamed from: j */
    public void m33224j(String str, Throwable th2) {
        if (m33215a(2)) {
            Log.v(this.f27592a, str, th2);
        }
    }

    /* renamed from: k */
    public void m33225k(String str) {
        m33226l(str, null);
    }

    /* renamed from: l */
    public void m33226l(String str, Throwable th2) {
        if (m33215a(5)) {
            Log.w(this.f27592a, str, th2);
        }
    }
}
