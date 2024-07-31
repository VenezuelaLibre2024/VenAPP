package di;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private int f14192a;

    /* renamed from: b, reason: collision with root package name */
    private int f14193b;

    /* renamed from: c, reason: collision with root package name */
    private int f14194c;

    public c(int i10, int i11, int i12) {
        this.f14192a = i10;
        this.f14193b = i11;
        this.f14194c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14192a == cVar.f14192a && this.f14193b == cVar.f14193b && this.f14194c == cVar.f14194c;
    }

    public int hashCode() {
        return (((this.f14192a * 31) + this.f14193b) * 31) + this.f14194c;
    }
}
