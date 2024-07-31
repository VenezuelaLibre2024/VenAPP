package p018b0;

/* renamed from: b0.a */
/* loaded from: classes.dex */
final class C1593a extends AbstractC1598f {

    /* renamed from: a */
    private final float f6825a;

    /* renamed from: b */
    private final float f6826b;

    /* renamed from: c */
    private final float f6827c;

    /* renamed from: d */
    private final float f6828d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1593a(float f10, float f11, float f12, float f13) {
        this.f6825a = f10;
        this.f6826b = f11;
        this.f6827c = f12;
        this.f6828d = f13;
    }

    @Override // p018b0.AbstractC1598f, p407w.InterfaceC12021k1
    /* renamed from: a */
    public float mo2791a() {
        return this.f6826b;
    }

    @Override // p018b0.AbstractC1598f, p407w.InterfaceC12021k1
    /* renamed from: b */
    public float mo2792b() {
        return this.f6828d;
    }

    @Override // p018b0.AbstractC1598f, p407w.InterfaceC12021k1
    /* renamed from: c */
    public float mo2793c() {
        return this.f6827c;
    }

    @Override // p018b0.AbstractC1598f, p407w.InterfaceC12021k1
    /* renamed from: d */
    public float mo2794d() {
        return this.f6825a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1598f)) {
            return false;
        }
        AbstractC1598f abstractC1598f = (AbstractC1598f) obj;
        return Float.floatToIntBits(this.f6825a) == Float.floatToIntBits(abstractC1598f.mo2794d()) && Float.floatToIntBits(this.f6826b) == Float.floatToIntBits(abstractC1598f.mo2791a()) && Float.floatToIntBits(this.f6827c) == Float.floatToIntBits(abstractC1598f.mo2793c()) && Float.floatToIntBits(this.f6828d) == Float.floatToIntBits(abstractC1598f.mo2792b());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f6825a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f6826b)) * 1000003) ^ Float.floatToIntBits(this.f6827c)) * 1000003) ^ Float.floatToIntBits(this.f6828d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f6825a + ", maxZoomRatio=" + this.f6826b + ", minZoomRatio=" + this.f6827c + ", linearZoom=" + this.f6828d + "}";
    }
}
