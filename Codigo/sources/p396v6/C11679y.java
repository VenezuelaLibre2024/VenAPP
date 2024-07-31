package p396v6;

/* renamed from: v6.y */
/* loaded from: classes.dex */
public final class C11679y {

    /* renamed from: a */
    public final int f30589a;

    /* renamed from: b */
    public final float f30590b;

    public C11679y(int i10, float f10) {
        this.f30589a = i10;
        this.f30590b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11679y.class != obj.getClass()) {
            return false;
        }
        C11679y c11679y = (C11679y) obj;
        return this.f30589a == c11679y.f30589a && Float.compare(c11679y.f30590b, this.f30590b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f30589a) * 31) + Float.floatToIntBits(this.f30590b);
    }
}
