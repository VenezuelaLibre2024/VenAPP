package ic;

import android.util.Log;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    static final b f17664c = new b("FirebaseAppCheck");

    /* renamed from: a, reason: collision with root package name */
    private final String f17665a;

    /* renamed from: b, reason: collision with root package name */
    private int f17666b = 4;

    public b(String str) {
        this.f17665a = str;
    }

    private boolean a(int i10) {
        return this.f17666b <= i10 || Log.isLoggable(this.f17665a, i10);
    }

    public static b f() {
        return f17664c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f17665a, str, th2);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f17665a, str, th2);
        }
    }
}
