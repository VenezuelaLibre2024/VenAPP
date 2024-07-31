package p128h2;

/* renamed from: h2.b */
/* loaded from: classes.dex */
public final class C7612b {

    /* renamed from: a */
    private final boolean f17997a;

    /* renamed from: b */
    private final boolean f17998b;

    /* renamed from: c */
    private final boolean f17999c;

    /* renamed from: d */
    private final boolean f18000d;

    public C7612b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f17997a = z10;
        this.f17998b = z11;
        this.f17999c = z12;
        this.f18000d = z13;
    }

    /* renamed from: a */
    public final boolean m23128a() {
        return this.f17997a;
    }

    /* renamed from: b */
    public final boolean m23129b() {
        return this.f17999c;
    }

    /* renamed from: c */
    public final boolean m23130c() {
        return this.f18000d;
    }

    /* renamed from: d */
    public final boolean m23131d() {
        return this.f17998b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7612b)) {
            return false;
        }
        C7612b c7612b = (C7612b) obj;
        return this.f17997a == c7612b.f17997a && this.f17998b == c7612b.f17998b && this.f17999c == c7612b.f17999c && this.f18000d == c7612b.f18000d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f17997a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f17998b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f17999c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z11 = this.f18000d;
        return i14 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f17997a + ", isValidated=" + this.f17998b + ", isMetered=" + this.f17999c + ", isNotRoaming=" + this.f18000d + ')';
    }
}
