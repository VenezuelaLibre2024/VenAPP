package k2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f20194a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20196c;

    public i(String workSpecId, int i10, int i11) {
        kotlin.jvm.internal.n.e(workSpecId, "workSpecId");
        this.f20194a = workSpecId;
        this.f20195b = i10;
        this.f20196c = i11;
    }

    public final int a() {
        return this.f20195b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.n.a(this.f20194a, iVar.f20194a) && this.f20195b == iVar.f20195b && this.f20196c == iVar.f20196c;
    }

    public int hashCode() {
        return (((this.f20194a.hashCode() * 31) + Integer.hashCode(this.f20195b)) * 31) + Integer.hashCode(this.f20196c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f20194a + ", generation=" + this.f20195b + ", systemId=" + this.f20196c + ')';
    }
}
