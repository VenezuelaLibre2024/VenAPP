package h2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16360a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16361b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16362c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16363d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f16360a = z10;
        this.f16361b = z11;
        this.f16362c = z12;
        this.f16363d = z13;
    }

    public final boolean a() {
        return this.f16360a;
    }

    public final boolean b() {
        return this.f16362c;
    }

    public final boolean c() {
        return this.f16363d;
    }

    public final boolean d() {
        return this.f16361b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16360a == bVar.f16360a && this.f16361b == bVar.f16361b && this.f16362c == bVar.f16362c && this.f16363d == bVar.f16363d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f16360a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f16361b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f16362c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z11 = this.f16363d;
        return i14 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f16360a + ", isValidated=" + this.f16361b + ", isMetered=" + this.f16362c + ", isNotRoaming=" + this.f16363d + ')';
    }
}
