package y;

import android.util.Size;
import y.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends o.b {

    /* renamed from: c */
    private final Size f31455c;

    /* renamed from: d */
    private final int f31456d;

    /* renamed from: e */
    private final int f31457e;

    /* renamed from: f */
    private final boolean f31458f;

    /* renamed from: g */
    private final w.l0 f31459g;

    /* renamed from: h */
    private final g0.v<f0> f31460h;

    /* renamed from: i */
    private final g0.v<w.g0> f31461i;

    public b(Size size, int i10, int i11, boolean z10, w.l0 l0Var, g0.v<f0> vVar, g0.v<w.g0> vVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f31455c = size;
        this.f31456d = i10;
        this.f31457e = i11;
        this.f31458f = z10;
        this.f31459g = l0Var;
        if (vVar == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f31460h = vVar;
        if (vVar2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f31461i = vVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.o.b
    public g0.v<w.g0> b() {
        return this.f31461i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.o.b
    public w.l0 c() {
        return this.f31459g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.o.b
    public int d() {
        return this.f31456d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.o.b
    public int e() {
        return this.f31457e;
    }

    public boolean equals(Object obj) {
        w.l0 l0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o.b)) {
            return false;
        }
        o.b bVar = (o.b) obj;
        return this.f31455c.equals(bVar.g()) && this.f31456d == bVar.d() && this.f31457e == bVar.e() && this.f31458f == bVar.i() && ((l0Var = this.f31459g) != null ? l0Var.equals(bVar.c()) : bVar.c() == null) && this.f31460h.equals(bVar.f()) && this.f31461i.equals(bVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.o.b
    public g0.v<f0> f() {
        return this.f31460h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.o.b
    public Size g() {
        return this.f31455c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f31455c.hashCode() ^ 1000003) * 1000003) ^ this.f31456d) * 1000003) ^ this.f31457e) * 1000003) ^ (this.f31458f ? 1231 : 1237)) * 1000003;
        w.l0 l0Var = this.f31459g;
        return ((((hashCode ^ (l0Var == null ? 0 : l0Var.hashCode())) * 1000003) ^ this.f31460h.hashCode()) * 1000003) ^ this.f31461i.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.o.b
    public boolean i() {
        return this.f31458f;
    }

    public String toString() {
        return "In{size=" + this.f31455c + ", inputFormat=" + this.f31456d + ", outputFormat=" + this.f31457e + ", virtualCamera=" + this.f31458f + ", imageReaderProxyProvider=" + this.f31459g + ", requestEdge=" + this.f31460h + ", errorEdge=" + this.f31461i + "}";
    }
}
