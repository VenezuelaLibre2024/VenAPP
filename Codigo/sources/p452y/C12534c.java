package p452y;

import androidx.camera.core.InterfaceC0710o;
import p112g0.C7429v;
import p452y.C12558o;

/* renamed from: y.c */
/* loaded from: classes.dex */
final class C12534c extends C12558o.c {

    /* renamed from: a */
    private final C7429v<InterfaceC0710o> f33984a;

    /* renamed from: b */
    private final C7429v<C12541f0> f33985b;

    /* renamed from: c */
    private final int f33986c;

    /* renamed from: d */
    private final int f33987d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12534c(C7429v<InterfaceC0710o> c7429v, C7429v<C12541f0> c7429v2, int i10, int i11) {
        if (c7429v == null) {
            throw new NullPointerException("Null imageEdge");
        }
        this.f33984a = c7429v;
        if (c7429v2 == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f33985b = c7429v2;
        this.f33986c = i10;
        this.f33987d = i11;
    }

    @Override // p452y.C12558o.c
    /* renamed from: a */
    C7429v<InterfaceC0710o> mo41144a() {
        return this.f33984a;
    }

    @Override // p452y.C12558o.c
    /* renamed from: b */
    int mo41145b() {
        return this.f33986c;
    }

    @Override // p452y.C12558o.c
    /* renamed from: c */
    int mo41146c() {
        return this.f33987d;
    }

    @Override // p452y.C12558o.c
    /* renamed from: d */
    C7429v<C12541f0> mo41147d() {
        return this.f33985b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12558o.c)) {
            return false;
        }
        C12558o.c cVar = (C12558o.c) obj;
        return this.f33984a.equals(cVar.mo41144a()) && this.f33985b.equals(cVar.mo41147d()) && this.f33986c == cVar.mo41145b() && this.f33987d == cVar.mo41146c();
    }

    public int hashCode() {
        return ((((((this.f33984a.hashCode() ^ 1000003) * 1000003) ^ this.f33985b.hashCode()) * 1000003) ^ this.f33986c) * 1000003) ^ this.f33987d;
    }

    public String toString() {
        return "Out{imageEdge=" + this.f33984a + ", requestEdge=" + this.f33985b + ", inputFormat=" + this.f33986c + ", outputFormat=" + this.f33987d + "}";
    }
}
