package zk;

import gk.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class w2<U, T extends U> extends el.d0<T> implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f32942e;

    public w2(long j10, Continuation<? super U> continuation) {
        super(continuation.getContext(), continuation);
        this.f32942e = j10;
    }

    @Override // zk.a, zk.d2
    public String p0() {
        return super.p0() + "(timeMillis=" + this.f32942e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        w(x2.a(this.f32942e, u0.a(getContext()), this));
    }
}
