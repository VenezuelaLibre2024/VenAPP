package p327r6;

import p174j6.C8991d;
import p174j6.InterfaceC8989b;

/* renamed from: r6.d */
/* loaded from: classes.dex */
public final class C10628d implements InterfaceC8989b<InterfaceC10625a> {

    /* renamed from: r6.d$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C10628d f26858a = new C10628d();
    }

    /* renamed from: a */
    public static C10628d m32392a() {
        return a.f26858a;
    }

    /* renamed from: c */
    public static InterfaceC10625a m32393c() {
        return (InterfaceC10625a) C8991d.m26386c(AbstractC10626b.m32387b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC10625a get() {
        return m32393c();
    }
}
