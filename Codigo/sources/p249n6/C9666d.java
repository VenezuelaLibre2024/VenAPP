package p249n6;

import java.util.concurrent.Executor;
import p029bk.InterfaceC1806a;
import p154i6.InterfaceC7853e;
import p174j6.InterfaceC8989b;
import p266o6.InterfaceC9816x;
import p289p6.InterfaceC10067d;
import p305q6.InterfaceC10278b;

/* renamed from: n6.d */
/* loaded from: classes.dex */
public final class C9666d implements InterfaceC8989b<C9665c> {

    /* renamed from: a */
    private final InterfaceC1806a<Executor> f23749a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC7853e> f23750b;

    /* renamed from: c */
    private final InterfaceC1806a<InterfaceC9816x> f23751c;

    /* renamed from: d */
    private final InterfaceC1806a<InterfaceC10067d> f23752d;

    /* renamed from: e */
    private final InterfaceC1806a<InterfaceC10278b> f23753e;

    public C9666d(InterfaceC1806a<Executor> interfaceC1806a, InterfaceC1806a<InterfaceC7853e> interfaceC1806a2, InterfaceC1806a<InterfaceC9816x> interfaceC1806a3, InterfaceC1806a<InterfaceC10067d> interfaceC1806a4, InterfaceC1806a<InterfaceC10278b> interfaceC1806a5) {
        this.f23749a = interfaceC1806a;
        this.f23750b = interfaceC1806a2;
        this.f23751c = interfaceC1806a3;
        this.f23752d = interfaceC1806a4;
        this.f23753e = interfaceC1806a5;
    }

    /* renamed from: a */
    public static C9666d m28970a(InterfaceC1806a<Executor> interfaceC1806a, InterfaceC1806a<InterfaceC7853e> interfaceC1806a2, InterfaceC1806a<InterfaceC9816x> interfaceC1806a3, InterfaceC1806a<InterfaceC10067d> interfaceC1806a4, InterfaceC1806a<InterfaceC10278b> interfaceC1806a5) {
        return new C9666d(interfaceC1806a, interfaceC1806a2, interfaceC1806a3, interfaceC1806a4, interfaceC1806a5);
    }

    /* renamed from: c */
    public static C9665c m28971c(Executor executor, InterfaceC7853e interfaceC7853e, InterfaceC9816x interfaceC9816x, InterfaceC10067d interfaceC10067d, InterfaceC10278b interfaceC10278b) {
        return new C9665c(executor, interfaceC7853e, interfaceC9816x, interfaceC10067d, interfaceC10278b);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9665c get() {
        return m28971c(this.f23749a.get(), this.f23750b.get(), this.f23751c.get(), this.f23752d.get(), this.f23753e.get());
    }
}
