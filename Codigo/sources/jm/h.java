package jm;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final float f20059a;

    /* renamed from: b, reason: collision with root package name */
    private final float f20060b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jm.h.<init>():void");
    }

    public h(float f10, float f11) {
        this.f20059a = f10;
        this.f20060b = f11;
    }

    public /* synthetic */ h(float f10, float f11, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1.0f : f11);
    }

    public final float a() {
        return this.f20059a;
    }

    public final float b() {
        return this.f20060b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f20059a, hVar.f20059a) == 0 && Float.compare(this.f20060b, hVar.f20060b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f20059a) * 31) + Float.hashCode(this.f20060b);
    }

    public String toString() {
        return "VolumeInfo(left=" + this.f20059a + ", right=" + this.f20060b + ')';
    }
}
