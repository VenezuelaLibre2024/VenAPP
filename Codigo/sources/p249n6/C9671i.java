package p249n6;

import android.content.Context;
import p029bk.InterfaceC1806a;
import p174j6.C8991d;
import p174j6.InterfaceC8989b;
import p266o6.AbstractC9798f;
import p266o6.InterfaceC9816x;
import p289p6.InterfaceC10067d;
import p327r6.InterfaceC10625a;

/* renamed from: n6.i */
/* loaded from: classes.dex */
public final class C9671i implements InterfaceC8989b<InterfaceC9816x> {

    /* renamed from: a */
    private final InterfaceC1806a<Context> f23755a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC10067d> f23756b;

    /* renamed from: c */
    private final InterfaceC1806a<AbstractC9798f> f23757c;

    /* renamed from: d */
    private final InterfaceC1806a<InterfaceC10625a> f23758d;

    public C9671i(InterfaceC1806a<Context> interfaceC1806a, InterfaceC1806a<InterfaceC10067d> interfaceC1806a2, InterfaceC1806a<AbstractC9798f> interfaceC1806a3, InterfaceC1806a<InterfaceC10625a> interfaceC1806a4) {
        this.f23755a = interfaceC1806a;
        this.f23756b = interfaceC1806a2;
        this.f23757c = interfaceC1806a3;
        this.f23758d = interfaceC1806a4;
    }

    /* renamed from: a */
    public static C9671i m28978a(InterfaceC1806a<Context> interfaceC1806a, InterfaceC1806a<InterfaceC10067d> interfaceC1806a2, InterfaceC1806a<AbstractC9798f> interfaceC1806a3, InterfaceC1806a<InterfaceC10625a> interfaceC1806a4) {
        return new C9671i(interfaceC1806a, interfaceC1806a2, interfaceC1806a3, interfaceC1806a4);
    }

    /* renamed from: c */
    public static InterfaceC9816x m28979c(Context context, InterfaceC10067d interfaceC10067d, AbstractC9798f abstractC9798f, InterfaceC10625a interfaceC10625a) {
        return (InterfaceC9816x) C8991d.m26386c(AbstractC9670h.m28977a(context, interfaceC10067d, abstractC9798f, interfaceC10625a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9816x get() {
        return m28979c(this.f23755a.get(), this.f23756b.get(), this.f23757c.get(), this.f23758d.get());
    }
}
