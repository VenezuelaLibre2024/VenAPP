package be;

import java.util.concurrent.Executor;
import p029bk.InterfaceC1806a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import p487zd.C12972s;

/* renamed from: be.o */
/* loaded from: classes.dex */
public final class C1755o implements InterfaceC10693b<C12972s> {

    /* renamed from: a */
    private final C1753n f7383a;

    /* renamed from: b */
    private final InterfaceC1806a<Executor> f7384b;

    public C1755o(C1753n c1753n, InterfaceC1806a<Executor> interfaceC1806a) {
        this.f7383a = c1753n;
        this.f7384b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C1755o m9432a(C1753n c1753n, InterfaceC1806a<Executor> interfaceC1806a) {
        return new C1755o(c1753n, interfaceC1806a);
    }

    /* renamed from: b */
    public static C12972s m9433b(C1753n c1753n, Executor executor) {
        return (C12972s) C10695d.m32564e(c1753n.m9427a(executor));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C12972s get() {
        return m9433b(this.f7383a, this.f7384b.get());
    }
}
