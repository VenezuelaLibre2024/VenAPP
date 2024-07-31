package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.compat.C0427d0;

/* renamed from: androidx.camera.camera2.internal.f2 */
/* loaded from: classes.dex */
class C0485f2 {

    /* renamed from: a */
    private final Object f2288a = new Object();

    /* renamed from: b */
    private final C0427d0 f2289b;

    /* renamed from: c */
    private int f2290c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0485f2(C0427d0 c0427d0, int i10) {
        this.f2289b = c0427d0;
        this.f2290c = i10;
    }

    /* renamed from: a */
    public int m2376a() {
        int i10;
        synchronized (this.f2288a) {
            i10 = this.f2290c;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2377b(int i10) {
        synchronized (this.f2288a) {
            this.f2290c = i10;
        }
    }
}
