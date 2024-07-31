package p266o6;

import java.util.concurrent.Executor;
import p029bk.InterfaceC1806a;
import p174j6.InterfaceC8989b;
import p289p6.InterfaceC10067d;
import p305q6.InterfaceC10278b;

/* renamed from: o6.w */
/* loaded from: classes.dex */
public final class C9815w implements InterfaceC8989b<C9814v> {

    /* renamed from: a */
    private final InterfaceC1806a<Executor> f24238a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC10067d> f24239b;

    /* renamed from: c */
    private final InterfaceC1806a<InterfaceC9816x> f24240c;

    /* renamed from: d */
    private final InterfaceC1806a<InterfaceC10278b> f24241d;

    public C9815w(InterfaceC1806a<Executor> interfaceC1806a, InterfaceC1806a<InterfaceC10067d> interfaceC1806a2, InterfaceC1806a<InterfaceC9816x> interfaceC1806a3, InterfaceC1806a<InterfaceC10278b> interfaceC1806a4) {
        this.f24238a = interfaceC1806a;
        this.f24239b = interfaceC1806a2;
        this.f24240c = interfaceC1806a3;
        this.f24241d = interfaceC1806a4;
    }

    /* renamed from: a */
    public static C9815w m29483a(InterfaceC1806a<Executor> interfaceC1806a, InterfaceC1806a<InterfaceC10067d> interfaceC1806a2, InterfaceC1806a<InterfaceC9816x> interfaceC1806a3, InterfaceC1806a<InterfaceC10278b> interfaceC1806a4) {
        return new C9815w(interfaceC1806a, interfaceC1806a2, interfaceC1806a3, interfaceC1806a4);
    }

    /* renamed from: c */
    public static C9814v m29484c(Executor executor, InterfaceC10067d interfaceC10067d, InterfaceC9816x interfaceC9816x, InterfaceC10278b interfaceC10278b) {
        return new C9814v(executor, interfaceC10067d, interfaceC9816x, interfaceC10278b);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9814v get() {
        return m29484c(this.f24238a.get(), this.f24239b.get(), this.f24240c.get(), this.f24241d.get());
    }
}
