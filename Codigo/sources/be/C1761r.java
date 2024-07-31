package be;

import java.util.concurrent.Executor;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.r */
/* loaded from: classes.dex */
public final class C1761r implements InterfaceC10693b<Executor> {

    /* renamed from: a */
    private final C1759q f7392a;

    public C1761r(C1759q c1759q) {
        this.f7392a = c1759q;
    }

    /* renamed from: a */
    public static C1761r m9450a(C1759q c1759q) {
        return new C1761r(c1759q);
    }

    /* renamed from: c */
    public static Executor m9451c(C1759q c1759q) {
        return (Executor) C10695d.m32564e(c1759q.m9444a());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m9451c(this.f7392a);
    }
}
