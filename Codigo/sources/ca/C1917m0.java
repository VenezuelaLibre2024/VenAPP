package ca;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ca.m0 */
/* loaded from: classes.dex */
public class C1917m0 {

    /* renamed from: e */
    private static final C1917m0 f7942e = new C1917m0(true, 3, 1, null, null);

    /* renamed from: a */
    final boolean f7943a;

    /* renamed from: b */
    final String f7944b;

    /* renamed from: c */
    final Throwable f7945c;

    /* renamed from: d */
    final int f7946d;

    private C1917m0(boolean z10, int i10, int i11, String str, Throwable th2) {
        this.f7943a = z10;
        this.f7946d = i10;
        this.f7944b = str;
        this.f7945c = th2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: b */
    public static C1917m0 m10114b() {
        return f7942e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C1917m0 m10115c(String str) {
        return new C1917m0(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C1917m0 m10116d(String str, Throwable th2) {
        return new C1917m0(false, 1, 5, str, th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C1917m0 m10117f(int i10) {
        return new C1917m0(true, i10, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C1917m0 m10118g(int i10, int i11, String str, Throwable th2) {
        return new C1917m0(false, i10, i11, str, th2);
    }

    /* renamed from: a */
    String mo10107a() {
        return this.f7944b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m10119e() {
        if (this.f7943a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f7945c != null) {
            Log.d("GoogleCertificatesRslt", mo10107a(), this.f7945c);
        } else {
            Log.d("GoogleCertificatesRslt", mo10107a());
        }
    }
}
