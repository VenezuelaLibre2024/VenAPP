package be;

import p029bk.InterfaceC1806a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import vi.AbstractC11904d;

/* renamed from: be.x */
/* loaded from: classes.dex */
public final class C1773x implements InterfaceC10693b<AbstractC11904d> {

    /* renamed from: a */
    private final C1771w f7406a;

    /* renamed from: b */
    private final InterfaceC1806a<String> f7407b;

    public C1773x(C1771w c1771w, InterfaceC1806a<String> interfaceC1806a) {
        this.f7406a = c1771w;
        this.f7407b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C1773x m9478a(C1771w c1771w, InterfaceC1806a<String> interfaceC1806a) {
        return new C1773x(c1771w, interfaceC1806a);
    }

    /* renamed from: c */
    public static AbstractC11904d m9479c(C1771w c1771w, String str) {
        return (AbstractC11904d) C10695d.m32564e(c1771w.m9473a(str));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC11904d get() {
        return m9479c(this.f7406a, this.f7407b.get());
    }
}
