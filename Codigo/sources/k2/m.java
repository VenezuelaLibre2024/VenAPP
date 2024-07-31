package k2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f20204a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20205b;

    public m(String workSpecId, int i10) {
        kotlin.jvm.internal.n.e(workSpecId, "workSpecId");
        this.f20204a = workSpecId;
        this.f20205b = i10;
    }

    public final int a() {
        return this.f20205b;
    }

    public final String b() {
        return this.f20204a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.n.a(this.f20204a, mVar.f20204a) && this.f20205b == mVar.f20205b;
    }

    public int hashCode() {
        return (this.f20204a.hashCode() * 31) + Integer.hashCode(this.f20205b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f20204a + ", generation=" + this.f20205b + ')';
    }
}
