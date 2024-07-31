package p327r6;

import p174j6.C8991d;
import p174j6.InterfaceC8989b;

/* renamed from: r6.c */
/* loaded from: classes.dex */
public final class C10627c implements InterfaceC8989b<InterfaceC10625a> {

    /* renamed from: r6.c$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C10627c f26857a = new C10627c();
    }

    /* renamed from: a */
    public static C10627c m32388a() {
        return a.f26857a;
    }

    /* renamed from: b */
    public static InterfaceC10625a m32389b() {
        return (InterfaceC10625a) C8991d.m26386c(AbstractC10626b.m32386a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10625a get() {
        return m32389b();
    }
}
