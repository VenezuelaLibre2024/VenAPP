package jm;

import kotlin.jvm.internal.C9315g;

/* renamed from: jm.h */
/* loaded from: classes3.dex */
public final class C9092h {

    /* renamed from: a */
    private final float f21838a;

    /* renamed from: b */
    private final float f21839b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9092h() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jm.C9092h.<init>():void");
    }

    public C9092h(float f10, float f11) {
        this.f21838a = f10;
        this.f21839b = f11;
    }

    public /* synthetic */ C9092h(float f10, float f11, int i10, C9315g c9315g) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1.0f : f11);
    }

    /* renamed from: a */
    public final float m26712a() {
        return this.f21838a;
    }

    /* renamed from: b */
    public final float m26713b() {
        return this.f21839b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9092h)) {
            return false;
        }
        C9092h c9092h = (C9092h) obj;
        return Float.compare(this.f21838a, c9092h.f21838a) == 0 && Float.compare(this.f21839b, c9092h.f21839b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f21838a) * 31) + Float.hashCode(this.f21839b);
    }

    public String toString() {
        return "VolumeInfo(left=" + this.f21838a + ", right=" + this.f21839b + ')';
    }
}
