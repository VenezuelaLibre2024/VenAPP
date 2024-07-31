package sj;

import dj.s;
import dj.t;

/* loaded from: classes3.dex */
public final class c<T> extends s<T> {

    /* renamed from: a */
    final T f25676a;

    public c(T t10) {
        this.f25676a = t10;
    }

    @Override // dj.s
    protected void k(t<? super T> tVar) {
        tVar.b(gj.c.a());
        tVar.onSuccess(this.f25676a);
    }
}
