package p452y;

import p112g0.C7429v;
import p452y.C12539e0;

/* renamed from: y.f */
/* loaded from: classes.dex */
final class C12540f extends C12539e0.a {

    /* renamed from: a */
    private final C7429v<C12539e0.b> f34007a;

    /* renamed from: b */
    private final int f34008b;

    /* renamed from: c */
    private final int f34009c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12540f(C7429v<C12539e0.b> c7429v, int i10, int i11) {
        if (c7429v == null) {
            throw new NullPointerException("Null edge");
        }
        this.f34007a = c7429v;
        this.f34008b = i10;
        this.f34009c = i11;
    }

    @Override // p452y.C12539e0.a
    /* renamed from: a */
    C7429v<C12539e0.b> mo41170a() {
        return this.f34007a;
    }

    @Override // p452y.C12539e0.a
    /* renamed from: b */
    int mo41171b() {
        return this.f34008b;
    }

    @Override // p452y.C12539e0.a
    /* renamed from: c */
    int mo41172c() {
        return this.f34009c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12539e0.a)) {
            return false;
        }
        C12539e0.a aVar = (C12539e0.a) obj;
        return this.f34007a.equals(aVar.mo41170a()) && this.f34008b == aVar.mo41171b() && this.f34009c == aVar.mo41172c();
    }

    public int hashCode() {
        return ((((this.f34007a.hashCode() ^ 1000003) * 1000003) ^ this.f34008b) * 1000003) ^ this.f34009c;
    }

    public String toString() {
        return "In{edge=" + this.f34007a + ", inputFormat=" + this.f34008b + ", outputFormat=" + this.f34009c + "}";
    }
}
