package p459y6;

/* renamed from: y6.a0 */
/* loaded from: classes.dex */
public final class C12607a0 {

    /* renamed from: c */
    public static final C12607a0 f34222c = new C12607a0(0, 0);

    /* renamed from: a */
    public final long f34223a;

    /* renamed from: b */
    public final long f34224b;

    public C12607a0(long j10, long j11) {
        this.f34223a = j10;
        this.f34224b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12607a0.class != obj.getClass()) {
            return false;
        }
        C12607a0 c12607a0 = (C12607a0) obj;
        return this.f34223a == c12607a0.f34223a && this.f34224b == c12607a0.f34224b;
    }

    public int hashCode() {
        return (((int) this.f34223a) * 31) + ((int) this.f34224b);
    }

    public String toString() {
        return "[timeUs=" + this.f34223a + ", position=" + this.f34224b + "]";
    }
}
