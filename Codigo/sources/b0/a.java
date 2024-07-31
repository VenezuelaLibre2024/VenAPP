package b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a */
    private final float f5970a;

    /* renamed from: b */
    private final float f5971b;

    /* renamed from: c */
    private final float f5972c;

    /* renamed from: d */
    private final float f5973d;

    public a(float f10, float f11, float f12, float f13) {
        this.f5970a = f10;
        this.f5971b = f11;
        this.f5972c = f12;
        this.f5973d = f13;
    }

    @Override // b0.f, w.k1
    public float a() {
        return this.f5971b;
    }

    @Override // b0.f, w.k1
    public float b() {
        return this.f5973d;
    }

    @Override // b0.f, w.k1
    public float c() {
        return this.f5972c;
    }

    @Override // b0.f, w.k1
    public float d() {
        return this.f5970a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.floatToIntBits(this.f5970a) == Float.floatToIntBits(fVar.d()) && Float.floatToIntBits(this.f5971b) == Float.floatToIntBits(fVar.a()) && Float.floatToIntBits(this.f5972c) == Float.floatToIntBits(fVar.c()) && Float.floatToIntBits(this.f5973d) == Float.floatToIntBits(fVar.b());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f5970a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f5971b)) * 1000003) ^ Float.floatToIntBits(this.f5972c)) * 1000003) ^ Float.floatToIntBits(this.f5973d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f5970a + ", maxZoomRatio=" + this.f5971b + ", minZoomRatio=" + this.f5972c + ", linearZoom=" + this.f5973d + "}";
    }
}
