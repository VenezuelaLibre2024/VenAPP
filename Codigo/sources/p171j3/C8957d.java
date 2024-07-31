package p171j3;

import java.security.MessageDigest;
import p129h3.InterfaceC7622f;

/* renamed from: j3.d */
/* loaded from: classes.dex */
final class C8957d implements InterfaceC7622f {

    /* renamed from: b */
    private final InterfaceC7622f f21317b;

    /* renamed from: c */
    private final InterfaceC7622f f21318c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8957d(InterfaceC7622f interfaceC7622f, InterfaceC7622f interfaceC7622f2) {
        this.f21317b = interfaceC7622f;
        this.f21318c = interfaceC7622f2;
    }

    @Override // p129h3.InterfaceC7622f
    /* renamed from: b */
    public void mo9110b(MessageDigest messageDigest) {
        this.f21317b.mo9110b(messageDigest);
        this.f21318c.mo9110b(messageDigest);
    }

    @Override // p129h3.InterfaceC7622f
    public boolean equals(Object obj) {
        if (!(obj instanceof C8957d)) {
            return false;
        }
        C8957d c8957d = (C8957d) obj;
        return this.f21317b.equals(c8957d.f21317b) && this.f21318c.equals(c8957d.f21318c);
    }

    @Override // p129h3.InterfaceC7622f
    public int hashCode() {
        return (this.f21317b.hashCode() * 31) + this.f21318c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f21317b + ", signature=" + this.f21318c + '}';
    }
}
