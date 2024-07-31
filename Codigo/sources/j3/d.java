package j3;

import java.security.MessageDigest;

/* loaded from: classes.dex */
final class d implements h3.f {

    /* renamed from: b, reason: collision with root package name */
    private final h3.f f19566b;

    /* renamed from: c, reason: collision with root package name */
    private final h3.f f19567c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(h3.f fVar, h3.f fVar2) {
        this.f19566b = fVar;
        this.f19567c = fVar2;
    }

    @Override // h3.f
    public void b(MessageDigest messageDigest) {
        this.f19566b.b(messageDigest);
        this.f19567c.b(messageDigest);
    }

    @Override // h3.f
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19566b.equals(dVar.f19566b) && this.f19567c.equals(dVar.f19567c);
    }

    @Override // h3.f
    public int hashCode() {
        return (this.f19566b.hashCode() * 31) + this.f19567c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f19566b + ", signature=" + this.f19567c + '}';
    }
}
