package androidx.core.util;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final float f3872a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3873b;

    public i(float f10, float f11) {
        this.f3872a = h.d(f10, "width");
        this.f3873b = h.d(f11, "height");
    }

    public float a() {
        return this.f3873b;
    }

    public float b() {
        return this.f3872a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f3872a == this.f3872a && iVar.f3873b == this.f3873b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f3872a) ^ Float.floatToIntBits(this.f3873b);
    }

    public String toString() {
        return this.f3872a + "x" + this.f3873b;
    }
}
