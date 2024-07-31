package p132h6;

import java.util.Set;
import p098f6.C7298b;
import p098f6.InterfaceC7301e;
import p098f6.InterfaceC7302f;
import p098f6.InterfaceC7303g;

/* renamed from: h6.q */
/* loaded from: classes.dex */
final class C7647q implements InterfaceC7303g {

    /* renamed from: a */
    private final Set<C7298b> f18089a;

    /* renamed from: b */
    private final AbstractC7646p f18090b;

    /* renamed from: c */
    private final InterfaceC7650t f18091c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7647q(Set<C7298b> set, AbstractC7646p abstractC7646p, InterfaceC7650t interfaceC7650t) {
        this.f18089a = set;
        this.f18090b = abstractC7646p;
        this.f18091c = interfaceC7650t;
    }

    @Override // p098f6.InterfaceC7303g
    /* renamed from: a */
    public <T> InterfaceC7302f<T> mo21885a(String str, Class<T> cls, InterfaceC7301e<T, byte[]> interfaceC7301e) {
        return mo21886b(str, cls, C7298b.m21878b("proto"), interfaceC7301e);
    }

    @Override // p098f6.InterfaceC7303g
    /* renamed from: b */
    public <T> InterfaceC7302f<T> mo21886b(String str, Class<T> cls, C7298b c7298b, InterfaceC7301e<T, byte[]> interfaceC7301e) {
        if (this.f18089a.contains(c7298b)) {
            return new C7649s(this.f18090b, str, c7298b, interfaceC7301e, this.f18091c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c7298b, this.f18089a));
    }
}
