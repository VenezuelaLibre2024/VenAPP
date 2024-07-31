package p154i6;

import android.content.Context;
import p029bk.InterfaceC1806a;
import p174j6.InterfaceC8989b;
import p327r6.InterfaceC10625a;

/* renamed from: i6.j */
/* loaded from: classes.dex */
public final class C7858j implements InterfaceC8989b<C7857i> {

    /* renamed from: a */
    private final InterfaceC1806a<Context> f18833a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC10625a> f18834b;

    /* renamed from: c */
    private final InterfaceC1806a<InterfaceC10625a> f18835c;

    public C7858j(InterfaceC1806a<Context> interfaceC1806a, InterfaceC1806a<InterfaceC10625a> interfaceC1806a2, InterfaceC1806a<InterfaceC10625a> interfaceC1806a3) {
        this.f18833a = interfaceC1806a;
        this.f18834b = interfaceC1806a2;
        this.f18835c = interfaceC1806a3;
    }

    /* renamed from: a */
    public static C7858j m24162a(InterfaceC1806a<Context> interfaceC1806a, InterfaceC1806a<InterfaceC10625a> interfaceC1806a2, InterfaceC1806a<InterfaceC10625a> interfaceC1806a3) {
        return new C7858j(interfaceC1806a, interfaceC1806a2, interfaceC1806a3);
    }

    /* renamed from: c */
    public static C7857i m24163c(Context context, InterfaceC10625a interfaceC10625a, InterfaceC10625a interfaceC10625a2) {
        return new C7857i(context, interfaceC10625a, interfaceC10625a2);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7857i get() {
        return m24163c(this.f18833a.get(), this.f18834b.get(), this.f18835c.get());
    }
}
