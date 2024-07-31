package p132h6;

import p098f6.AbstractC7299c;
import p098f6.C7298b;
import p098f6.InterfaceC7301e;
import p098f6.InterfaceC7302f;
import p098f6.InterfaceC7304h;

/* renamed from: h6.s */
/* loaded from: classes.dex */
final class C7649s<T> implements InterfaceC7302f<T> {

    /* renamed from: a */
    private final AbstractC7646p f18092a;

    /* renamed from: b */
    private final String f18093b;

    /* renamed from: c */
    private final C7298b f18094c;

    /* renamed from: d */
    private final InterfaceC7301e<T, byte[]> f18095d;

    /* renamed from: e */
    private final InterfaceC7650t f18096e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7649s(AbstractC7646p abstractC7646p, String str, C7298b c7298b, InterfaceC7301e<T, byte[]> interfaceC7301e, InterfaceC7650t interfaceC7650t) {
        this.f18092a = abstractC7646p;
        this.f18093b = str;
        this.f18094c = c7298b;
        this.f18095d = interfaceC7301e;
        this.f18096e = interfaceC7650t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m23229e(Exception exc) {
    }

    @Override // p098f6.InterfaceC7302f
    /* renamed from: a */
    public void mo21883a(AbstractC7299c<T> abstractC7299c, InterfaceC7304h interfaceC7304h) {
        this.f18096e.mo23231a(AbstractC7645o.m23223a().mo23189e(this.f18092a).mo23187c(abstractC7299c).mo23190f(this.f18093b).mo23188d(this.f18095d).mo23186b(this.f18094c).mo23185a(), interfaceC7304h);
    }

    @Override // p098f6.InterfaceC7302f
    /* renamed from: b */
    public void mo21884b(AbstractC7299c<T> abstractC7299c) {
        mo21883a(abstractC7299c, new InterfaceC7304h() { // from class: h6.r
            @Override // p098f6.InterfaceC7304h
            /* renamed from: a */
            public final void mo9335a(Exception exc) {
                C7649s.m23229e(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC7646p m23230d() {
        return this.f18092a;
    }
}
