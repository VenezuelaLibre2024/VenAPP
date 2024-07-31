package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
class f2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1985a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final androidx.camera.camera2.internal.compat.d0 f1986b;

    /* renamed from: c, reason: collision with root package name */
    private int f1987c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f2(androidx.camera.camera2.internal.compat.d0 d0Var, int i10) {
        this.f1986b = d0Var;
        this.f1987c = i10;
    }

    public int a() {
        int i10;
        synchronized (this.f1985a) {
            i10 = this.f1987c;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i10) {
        synchronized (this.f1985a) {
            this.f1987c = i10;
        }
    }
}
