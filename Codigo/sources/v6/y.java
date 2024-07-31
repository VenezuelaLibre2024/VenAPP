package v6;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f28220a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28221b;

    public y(int i10, float f10) {
        this.f28220a = i10;
        this.f28221b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f28220a == yVar.f28220a && Float.compare(yVar.f28221b, this.f28221b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f28220a) * 31) + Float.floatToIntBits(this.f28221b);
    }
}
