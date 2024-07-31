package df;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final String f14080a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14081b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14082c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14083d;

    public t(String processName, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.n.e(processName, "processName");
        this.f14080a = processName;
        this.f14081b = i10;
        this.f14082c = i11;
        this.f14083d = z10;
    }

    public final int a() {
        return this.f14082c;
    }

    public final int b() {
        return this.f14081b;
    }

    public final String c() {
        return this.f14080a;
    }

    public final boolean d() {
        return this.f14083d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.n.a(this.f14080a, tVar.f14080a) && this.f14081b == tVar.f14081b && this.f14082c == tVar.f14082c && this.f14083d == tVar.f14083d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f14080a.hashCode() * 31) + Integer.hashCode(this.f14081b)) * 31) + Integer.hashCode(this.f14082c)) * 31;
        boolean z10 = this.f14083d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f14080a + ", pid=" + this.f14081b + ", importance=" + this.f14082c + ", isDefaultProcess=" + this.f14083d + ')';
    }
}
