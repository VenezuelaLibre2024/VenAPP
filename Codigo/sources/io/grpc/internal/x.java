package io.grpc.internal;

/* loaded from: classes3.dex */
abstract class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final vi.r f19195a;

    /* JADX INFO: Access modifiers changed from: protected */
    public x(vi.r rVar) {
        this.f19195a = rVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        vi.r b10 = this.f19195a.b();
        try {
            a();
        } finally {
            this.f19195a.f(b10);
        }
    }
}
