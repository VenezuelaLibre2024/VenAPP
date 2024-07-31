package ca;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m0 {

    /* renamed from: e, reason: collision with root package name */
    private static final m0 f6993e = new m0(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f6994a;

    /* renamed from: b, reason: collision with root package name */
    final String f6995b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f6996c;

    /* renamed from: d, reason: collision with root package name */
    final int f6997d;

    private m0(boolean z10, int i10, int i11, String str, Throwable th2) {
        this.f6994a = z10;
        this.f6997d = i10;
        this.f6995b = str;
        this.f6996c = th2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static m0 b() {
        return f6993e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 c(String str) {
        return new m0(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 d(String str, Throwable th2) {
        return new m0(false, 1, 5, str, th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 f(int i10) {
        return new m0(true, i10, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 g(int i10, int i11, String str, Throwable th2) {
        return new m0(false, i10, i11, str, th2);
    }

    String a() {
        return this.f6995b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.f6994a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f6996c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f6996c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
