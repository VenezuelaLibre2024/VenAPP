package be;

import cc.InterfaceC1940a;
import java.util.concurrent.Executor;
import p029bk.InterfaceC1806a;
import p043ce.InterfaceC1956a;
import p098f6.InterfaceC7303g;
import p106fe.InterfaceC7337f;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import p485zb.C12867g;
import p487zd.C12965q2;
import p487zd.C12972s;

/* renamed from: be.w0 */
/* loaded from: classes.dex */
public final class C1772w0 implements InterfaceC10693b<C12965q2> {

    /* renamed from: a */
    private final InterfaceC1806a<C12867g> f7399a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC7303g> f7400b;

    /* renamed from: c */
    private final InterfaceC1806a<InterfaceC1940a> f7401c;

    /* renamed from: d */
    private final InterfaceC1806a<InterfaceC7337f> f7402d;

    /* renamed from: e */
    private final InterfaceC1806a<InterfaceC1956a> f7403e;

    /* renamed from: f */
    private final InterfaceC1806a<C12972s> f7404f;

    /* renamed from: g */
    private final InterfaceC1806a<Executor> f7405g;

    public C1772w0(InterfaceC1806a<C12867g> interfaceC1806a, InterfaceC1806a<InterfaceC7303g> interfaceC1806a2, InterfaceC1806a<InterfaceC1940a> interfaceC1806a3, InterfaceC1806a<InterfaceC7337f> interfaceC1806a4, InterfaceC1806a<InterfaceC1956a> interfaceC1806a5, InterfaceC1806a<C12972s> interfaceC1806a6, InterfaceC1806a<Executor> interfaceC1806a7) {
        this.f7399a = interfaceC1806a;
        this.f7400b = interfaceC1806a2;
        this.f7401c = interfaceC1806a3;
        this.f7402d = interfaceC1806a4;
        this.f7403e = interfaceC1806a5;
        this.f7404f = interfaceC1806a6;
        this.f7405g = interfaceC1806a7;
    }

    /* renamed from: a */
    public static C1772w0 m9475a(InterfaceC1806a<C12867g> interfaceC1806a, InterfaceC1806a<InterfaceC7303g> interfaceC1806a2, InterfaceC1806a<InterfaceC1940a> interfaceC1806a3, InterfaceC1806a<InterfaceC7337f> interfaceC1806a4, InterfaceC1806a<InterfaceC1956a> interfaceC1806a5, InterfaceC1806a<C12972s> interfaceC1806a6, InterfaceC1806a<Executor> interfaceC1806a7) {
        return new C1772w0(interfaceC1806a, interfaceC1806a2, interfaceC1806a3, interfaceC1806a4, interfaceC1806a5, interfaceC1806a6, interfaceC1806a7);
    }

    /* renamed from: c */
    public static C12965q2 m9476c(C12867g c12867g, InterfaceC7303g interfaceC7303g, InterfaceC1940a interfaceC1940a, InterfaceC7337f interfaceC7337f, InterfaceC1956a interfaceC1956a, C12972s c12972s, Executor executor) {
        return (C12965q2) C10695d.m32564e(C1770v0.m9472e(c12867g, interfaceC7303g, interfaceC1940a, interfaceC7337f, interfaceC1956a, c12972s, executor));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12965q2 get() {
        return m9476c(this.f7399a.get(), this.f7400b.get(), this.f7401c.get(), this.f7402d.get(), this.f7403e.get(), this.f7404f.get(), this.f7405g.get());
    }
}
