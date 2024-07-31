package zk;

import java.util.concurrent.Future;

/* loaded from: classes3.dex */
final class b1 implements c1 {

    /* renamed from: a, reason: collision with root package name */
    private final Future<?> f32845a;

    public b1(Future<?> future) {
        this.f32845a = future;
    }

    @Override // zk.c1
    public void dispose() {
        this.f32845a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f32845a + ']';
    }
}
