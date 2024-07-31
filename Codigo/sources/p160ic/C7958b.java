package p160ic;

import android.util.Log;

/* renamed from: ic.b */
/* loaded from: classes.dex */
public class C7958b {

    /* renamed from: c */
    static final C7958b f19325c = new C7958b("FirebaseAppCheck");

    /* renamed from: a */
    private final String f19326a;

    /* renamed from: b */
    private int f19327b = 4;

    public C7958b(String str) {
        this.f19326a = str;
    }

    /* renamed from: a */
    private boolean m24443a(int i10) {
        return this.f19327b <= i10 || Log.isLoggable(this.f19326a, i10);
    }

    /* renamed from: f */
    public static C7958b m24444f() {
        return f19325c;
    }

    /* renamed from: b */
    public void m24445b(String str) {
        m24446c(str, null);
    }

    /* renamed from: c */
    public void m24446c(String str, Throwable th2) {
        if (m24443a(3)) {
            Log.d(this.f19326a, str, th2);
        }
    }

    /* renamed from: d */
    public void m24447d(String str) {
        m24448e(str, null);
    }

    /* renamed from: e */
    public void m24448e(String str, Throwable th2) {
        if (m24443a(6)) {
            Log.e(this.f19326a, str, th2);
        }
    }
}
