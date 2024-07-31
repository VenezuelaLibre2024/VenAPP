package p289p6;

import p174j6.C8991d;
import p174j6.InterfaceC8989b;

/* renamed from: p6.j */
/* loaded from: classes.dex */
public final class C10079j implements InterfaceC8989b<AbstractC10069e> {

    /* renamed from: p6.j$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C10079j f24738a = new C10079j();
    }

    /* renamed from: a */
    public static C10079j m30049a() {
        return a.f24738a;
    }

    /* renamed from: c */
    public static AbstractC10069e m30050c() {
        return (AbstractC10069e) C8991d.m26386c(AbstractC10071f.m30036d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC10069e get() {
        return m30050c();
    }
}
