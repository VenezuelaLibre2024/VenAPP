package androidx.work.impl;

import f2.m;

/* loaded from: classes.dex */
public class o implements f2.m {

    /* renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.r<m.b> f5884c = new androidx.lifecycle.r<>();

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<m.b.c> f5885d = androidx.work.impl.utils.futures.c.s();

    public o() {
        a(f2.m.f14892b);
    }

    public void a(m.b bVar) {
        this.f5884c.postValue(bVar);
        if (bVar instanceof m.b.c) {
            this.f5885d.o((m.b.c) bVar);
        } else if (bVar instanceof m.b.a) {
            this.f5885d.p(((m.b.a) bVar).a());
        }
    }

    @Override // f2.m
    public com.google.common.util.concurrent.f<m.b.c> getResult() {
        return this.f5885d;
    }
}
