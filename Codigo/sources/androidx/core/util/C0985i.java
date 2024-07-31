package androidx.core.util;

/* renamed from: androidx.core.util.i */
/* loaded from: classes.dex */
public final class C0985i {

    /* renamed from: a */
    private final float f4544a;

    /* renamed from: b */
    private final float f4545b;

    public C0985i(float f10, float f11) {
        this.f4544a = C0984h.m4826d(f10, "width");
        this.f4545b = C0984h.m4826d(f11, "height");
    }

    /* renamed from: a */
    public float m4837a() {
        return this.f4545b;
    }

    /* renamed from: b */
    public float m4838b() {
        return this.f4544a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0985i)) {
            return false;
        }
        C0985i c0985i = (C0985i) obj;
        return c0985i.f4544a == this.f4544a && c0985i.f4545b == this.f4545b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f4544a) ^ Float.floatToIntBits(this.f4545b);
    }

    public String toString() {
        return this.f4544a + "x" + this.f4545b;
    }
}
