package cl;

import ck.v;
import gk.Continuation;

/* loaded from: classes3.dex */
final class l<T> extends a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ok.p<c<? super T>, Continuation<? super v>, Object> f7173a;

    /* JADX WARN: Multi-variable type inference failed */
    public l(ok.p<? super c<? super T>, ? super Continuation<? super v>, ? extends Object> pVar) {
        this.f7173a = pVar;
    }

    @Override // cl.a
    public Object b(c<? super T> cVar, Continuation<? super v> continuation) {
        Object c10;
        Object invoke = this.f7173a.invoke(cVar, continuation);
        c10 = hk.d.c();
        return invoke == c10 ? invoke : v.f7137a;
    }
}
