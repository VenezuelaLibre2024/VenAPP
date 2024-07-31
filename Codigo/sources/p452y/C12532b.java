package p452y;

import android.util.Size;
import p112g0.C7429v;
import p407w.C12008g0;
import p407w.InterfaceC12023l0;
import p452y.C12558o;

/* renamed from: y.b */
/* loaded from: classes.dex */
final class C12532b extends C12558o.b {

    /* renamed from: c */
    private final Size f33975c;

    /* renamed from: d */
    private final int f33976d;

    /* renamed from: e */
    private final int f33977e;

    /* renamed from: f */
    private final boolean f33978f;

    /* renamed from: g */
    private final InterfaceC12023l0 f33979g;

    /* renamed from: h */
    private final C7429v<C12541f0> f33980h;

    /* renamed from: i */
    private final C7429v<C12008g0> f33981i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12532b(Size size, int i10, int i11, boolean z10, InterfaceC12023l0 interfaceC12023l0, C7429v<C12541f0> c7429v, C7429v<C12008g0> c7429v2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f33975c = size;
        this.f33976d = i10;
        this.f33977e = i11;
        this.f33978f = z10;
        this.f33979g = interfaceC12023l0;
        if (c7429v == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f33980h = c7429v;
        if (c7429v2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f33981i = c7429v2;
    }

    @Override // p452y.C12558o.b
    /* renamed from: b */
    C7429v<C12008g0> mo41137b() {
        return this.f33981i;
    }

    @Override // p452y.C12558o.b
    /* renamed from: c */
    InterfaceC12023l0 mo41138c() {
        return this.f33979g;
    }

    @Override // p452y.C12558o.b
    /* renamed from: d */
    int mo41139d() {
        return this.f33976d;
    }

    @Override // p452y.C12558o.b
    /* renamed from: e */
    int mo41140e() {
        return this.f33977e;
    }

    public boolean equals(Object obj) {
        InterfaceC12023l0 interfaceC12023l0;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12558o.b)) {
            return false;
        }
        C12558o.b bVar = (C12558o.b) obj;
        return this.f33975c.equals(bVar.mo41142g()) && this.f33976d == bVar.mo41139d() && this.f33977e == bVar.mo41140e() && this.f33978f == bVar.mo41143i() && ((interfaceC12023l0 = this.f33979g) != null ? interfaceC12023l0.equals(bVar.mo41138c()) : bVar.mo41138c() == null) && this.f33980h.equals(bVar.mo41141f()) && this.f33981i.equals(bVar.mo41137b());
    }

    @Override // p452y.C12558o.b
    /* renamed from: f */
    C7429v<C12541f0> mo41141f() {
        return this.f33980h;
    }

    @Override // p452y.C12558o.b
    /* renamed from: g */
    Size mo41142g() {
        return this.f33975c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f33975c.hashCode() ^ 1000003) * 1000003) ^ this.f33976d) * 1000003) ^ this.f33977e) * 1000003) ^ (this.f33978f ? 1231 : 1237)) * 1000003;
        InterfaceC12023l0 interfaceC12023l0 = this.f33979g;
        return ((((hashCode ^ (interfaceC12023l0 == null ? 0 : interfaceC12023l0.hashCode())) * 1000003) ^ this.f33980h.hashCode()) * 1000003) ^ this.f33981i.hashCode();
    }

    @Override // p452y.C12558o.b
    /* renamed from: i */
    boolean mo41143i() {
        return this.f33978f;
    }

    public String toString() {
        return "In{size=" + this.f33975c + ", inputFormat=" + this.f33976d + ", outputFormat=" + this.f33977e + ", virtualCamera=" + this.f33978f + ", imageReaderProxyProvider=" + this.f33979g + ", requestEdge=" + this.f33980h + ", errorEdge=" + this.f33981i + "}";
    }
}
