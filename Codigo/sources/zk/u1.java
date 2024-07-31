package zk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
final class u1 extends y1 {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f32935f = AtomicIntegerFieldUpdater.newUpdater(u1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    private final ok.l<Throwable, ck.v> f32936e;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(ok.l<? super Throwable, ck.v> lVar) {
        this.f32936e = lVar;
    }

    @Override // ok.l
    public /* bridge */ /* synthetic */ ck.v invoke(Throwable th2) {
        v(th2);
        return ck.v.f7137a;
    }

    @Override // zk.c0
    public void v(Throwable th2) {
        if (f32935f.compareAndSet(this, 0, 1)) {
            this.f32936e.invoke(th2);
        }
    }
}
