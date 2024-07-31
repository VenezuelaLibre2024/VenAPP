package be;

import java.util.concurrent.Executor;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.t */
/* loaded from: classes.dex */
public final class C1765t implements InterfaceC10693b<Executor> {

    /* renamed from: a */
    private final C1759q f7395a;

    public C1765t(C1759q c1759q) {
        this.f7395a = c1759q;
    }

    /* renamed from: a */
    public static C1765t m9460a(C1759q c1759q) {
        return new C1765t(c1759q);
    }

    /* renamed from: c */
    public static Executor m9461c(C1759q c1759q) {
        return (Executor) C10695d.m32564e(c1759q.m9446c());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m9461c(this.f7395a);
    }
}
