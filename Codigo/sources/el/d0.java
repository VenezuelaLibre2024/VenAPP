package el;

import gk.Continuation;

/* loaded from: classes3.dex */
public class d0<T> extends zk.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: d, reason: collision with root package name */
    public final Continuation<T> f14761d;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(gk.f fVar, Continuation<? super T> continuation) {
        super(fVar, true, true);
        this.f14761d = continuation;
    }

    @Override // zk.a
    protected void N0(Object obj) {
        Continuation<T> continuation = this.f14761d;
        continuation.resumeWith(zk.e0.a(obj, continuation));
    }

    @Override // zk.d2
    protected final boolean e0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Continuation<T> continuation = this.f14761d;
        if (continuation instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) continuation;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zk.d2
    public void t(Object obj) {
        Continuation b10;
        b10 = hk.c.b(this.f14761d);
        k.c(b10, zk.e0.a(obj, this.f14761d), null, 2, null);
    }
}
