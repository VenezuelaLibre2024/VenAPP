package be;

import java.util.concurrent.Executor;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.s */
/* loaded from: classes.dex */
public final class C1763s implements InterfaceC10693b<Executor> {

    /* renamed from: a */
    private final C1759q f7393a;

    public C1763s(C1759q c1759q) {
        this.f7393a = c1759q;
    }

    /* renamed from: a */
    public static C1763s m9454a(C1759q c1759q) {
        return new C1763s(c1759q);
    }

    /* renamed from: c */
    public static Executor m9455c(C1759q c1759q) {
        return (Executor) C10695d.m32564e(c1759q.m9445b());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m9455c(this.f7393a);
    }
}
