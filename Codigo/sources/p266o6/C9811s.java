package p266o6;

import android.content.Context;
import java.util.concurrent.Executor;
import p029bk.InterfaceC1806a;
import p154i6.InterfaceC7853e;
import p174j6.InterfaceC8989b;
import p289p6.InterfaceC10065c;
import p289p6.InterfaceC10067d;
import p305q6.InterfaceC10278b;
import p327r6.InterfaceC10625a;

/* renamed from: o6.s */
/* loaded from: classes.dex */
public final class C9811s implements InterfaceC8989b<C9810r> {

    /* renamed from: a */
    private final InterfaceC1806a<Context> f24223a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC7853e> f24224b;

    /* renamed from: c */
    private final InterfaceC1806a<InterfaceC10067d> f24225c;

    /* renamed from: d */
    private final InterfaceC1806a<InterfaceC9816x> f24226d;

    /* renamed from: e */
    private final InterfaceC1806a<Executor> f24227e;

    /* renamed from: f */
    private final InterfaceC1806a<InterfaceC10278b> f24228f;

    /* renamed from: g */
    private final InterfaceC1806a<InterfaceC10625a> f24229g;

    /* renamed from: h */
    private final InterfaceC1806a<InterfaceC10625a> f24230h;

    /* renamed from: i */
    private final InterfaceC1806a<InterfaceC10065c> f24231i;

    public C9811s(InterfaceC1806a<Context> interfaceC1806a, InterfaceC1806a<InterfaceC7853e> interfaceC1806a2, InterfaceC1806a<InterfaceC10067d> interfaceC1806a3, InterfaceC1806a<InterfaceC9816x> interfaceC1806a4, InterfaceC1806a<Executor> interfaceC1806a5, InterfaceC1806a<InterfaceC10278b> interfaceC1806a6, InterfaceC1806a<InterfaceC10625a> interfaceC1806a7, InterfaceC1806a<InterfaceC10625a> interfaceC1806a8, InterfaceC1806a<InterfaceC10065c> interfaceC1806a9) {
        this.f24223a = interfaceC1806a;
        this.f24224b = interfaceC1806a2;
        this.f24225c = interfaceC1806a3;
        this.f24226d = interfaceC1806a4;
        this.f24227e = interfaceC1806a5;
        this.f24228f = interfaceC1806a6;
        this.f24229g = interfaceC1806a7;
        this.f24230h = interfaceC1806a8;
        this.f24231i = interfaceC1806a9;
    }

    /* renamed from: a */
    public static C9811s m29475a(InterfaceC1806a<Context> interfaceC1806a, InterfaceC1806a<InterfaceC7853e> interfaceC1806a2, InterfaceC1806a<InterfaceC10067d> interfaceC1806a3, InterfaceC1806a<InterfaceC9816x> interfaceC1806a4, InterfaceC1806a<Executor> interfaceC1806a5, InterfaceC1806a<InterfaceC10278b> interfaceC1806a6, InterfaceC1806a<InterfaceC10625a> interfaceC1806a7, InterfaceC1806a<InterfaceC10625a> interfaceC1806a8, InterfaceC1806a<InterfaceC10065c> interfaceC1806a9) {
        return new C9811s(interfaceC1806a, interfaceC1806a2, interfaceC1806a3, interfaceC1806a4, interfaceC1806a5, interfaceC1806a6, interfaceC1806a7, interfaceC1806a8, interfaceC1806a9);
    }

    /* renamed from: c */
    public static C9810r m29476c(Context context, InterfaceC7853e interfaceC7853e, InterfaceC10067d interfaceC10067d, InterfaceC9816x interfaceC9816x, Executor executor, InterfaceC10278b interfaceC10278b, InterfaceC10625a interfaceC10625a, InterfaceC10625a interfaceC10625a2, InterfaceC10065c interfaceC10065c) {
        return new C9810r(context, interfaceC7853e, interfaceC10067d, interfaceC9816x, executor, interfaceC10278b, interfaceC10625a, interfaceC10625a2, interfaceC10065c);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9810r get() {
        return m29476c(this.f24223a.get(), this.f24224b.get(), this.f24225c.get(), this.f24226d.get(), this.f24227e.get(), this.f24228f.get(), this.f24229g.get(), this.f24230h.get(), this.f24231i.get());
    }
}
