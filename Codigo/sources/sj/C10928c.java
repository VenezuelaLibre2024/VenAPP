package sj;

import dj.AbstractC6994s;
import dj.InterfaceC6995t;
import p123gj.C7579c;

/* renamed from: sj.c */
/* loaded from: classes3.dex */
public final class C10928c<T> extends AbstractC6994s<T> {

    /* renamed from: a */
    final T f27820a;

    public C10928c(T t10) {
        this.f27820a = t10;
    }

    @Override // dj.AbstractC6994s
    /* renamed from: k */
    protected void mo20311k(InterfaceC6995t<? super T> interfaceC6995t) {
        interfaceC6995t.mo20313b(C7579c.m23024a());
        interfaceC6995t.onSuccess(this.f27820a);
    }
}
