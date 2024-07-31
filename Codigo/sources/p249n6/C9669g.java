package p249n6;

import p029bk.InterfaceC1806a;
import p174j6.C8991d;
import p174j6.InterfaceC8989b;
import p266o6.AbstractC9798f;
import p327r6.InterfaceC10625a;

/* renamed from: n6.g */
/* loaded from: classes.dex */
public final class C9669g implements InterfaceC8989b<AbstractC9798f> {

    /* renamed from: a */
    private final InterfaceC1806a<InterfaceC10625a> f23754a;

    public C9669g(InterfaceC1806a<InterfaceC10625a> interfaceC1806a) {
        this.f23754a = interfaceC1806a;
    }

    /* renamed from: a */
    public static AbstractC9798f m28974a(InterfaceC10625a interfaceC10625a) {
        return (AbstractC9798f) C8991d.m26386c(AbstractC9668f.m28973a(interfaceC10625a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C9669g m28975b(InterfaceC1806a<InterfaceC10625a> interfaceC1806a) {
        return new C9669g(interfaceC1806a);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC9798f get() {
        return m28974a(this.f23754a.get());
    }
}
