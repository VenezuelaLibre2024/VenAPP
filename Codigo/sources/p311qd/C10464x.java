package p311qd;

import java.util.concurrent.Executor;
import p029bk.InterfaceC1806a;
import p106fe.InterfaceC7337f;
import p334rd.InterfaceC10693b;
import p487zd.C12925i2;
import p487zd.C12947n;
import p487zd.C12970r2;
import p487zd.C12972s;
import p487zd.C12976t;

/* renamed from: qd.x */
/* loaded from: classes.dex */
public final class C10464x implements InterfaceC10693b<C10457q> {

    /* renamed from: a */
    private final InterfaceC1806a<C12925i2> f26002a;

    /* renamed from: b */
    private final InterfaceC1806a<C12970r2> f26003b;

    /* renamed from: c */
    private final InterfaceC1806a<C12947n> f26004c;

    /* renamed from: d */
    private final InterfaceC1806a<InterfaceC7337f> f26005d;

    /* renamed from: e */
    private final InterfaceC1806a<C12976t> f26006e;

    /* renamed from: f */
    private final InterfaceC1806a<C12972s> f26007f;

    /* renamed from: g */
    private final InterfaceC1806a<Executor> f26008g;

    public C10464x(InterfaceC1806a<C12925i2> interfaceC1806a, InterfaceC1806a<C12970r2> interfaceC1806a2, InterfaceC1806a<C12947n> interfaceC1806a3, InterfaceC1806a<InterfaceC7337f> interfaceC1806a4, InterfaceC1806a<C12976t> interfaceC1806a5, InterfaceC1806a<C12972s> interfaceC1806a6, InterfaceC1806a<Executor> interfaceC1806a7) {
        this.f26002a = interfaceC1806a;
        this.f26003b = interfaceC1806a2;
        this.f26004c = interfaceC1806a3;
        this.f26005d = interfaceC1806a4;
        this.f26006e = interfaceC1806a5;
        this.f26007f = interfaceC1806a6;
        this.f26008g = interfaceC1806a7;
    }

    /* renamed from: a */
    public static C10464x m31384a(InterfaceC1806a<C12925i2> interfaceC1806a, InterfaceC1806a<C12970r2> interfaceC1806a2, InterfaceC1806a<C12947n> interfaceC1806a3, InterfaceC1806a<InterfaceC7337f> interfaceC1806a4, InterfaceC1806a<C12976t> interfaceC1806a5, InterfaceC1806a<C12972s> interfaceC1806a6, InterfaceC1806a<Executor> interfaceC1806a7) {
        return new C10464x(interfaceC1806a, interfaceC1806a2, interfaceC1806a3, interfaceC1806a4, interfaceC1806a5, interfaceC1806a6, interfaceC1806a7);
    }

    /* renamed from: c */
    public static C10457q m31385c(C12925i2 c12925i2, C12970r2 c12970r2, C12947n c12947n, InterfaceC7337f interfaceC7337f, C12976t c12976t, C12972s c12972s, Executor executor) {
        return new C10457q(c12925i2, c12970r2, c12947n, interfaceC7337f, c12976t, c12972s, executor);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10457q get() {
        return m31385c(this.f26002a.get(), this.f26003b.get(), this.f26004c.get(), this.f26005d.get(), this.f26006e.get(), this.f26007f.get(), this.f26008g.get());
    }
}
