package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9x */
/* loaded from: assets/audience_network.dex */
public final class C28339x {
    public static final C28339x A04 = new C28339x(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C28339x(float f10) {
        this(f10, 1.0f, false);
    }

    public C28339x(float f10, float f11, boolean z10) {
        AbstractC3281Ha.A03(f10 > 0.0f);
        AbstractC3281Ha.A03(f11 > 0.0f);
        this.A01 = f10;
        this.A00 = f11;
        this.A02 = z10;
        this.A03 = Math.round(1000.0f * f10);
    }

    public final long A00(long j10) {
        return this.A03 * j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28339x c28339x = (C28339x) obj;
        return this.A01 == c28339x.A01 && this.A00 == c28339x.A00 && this.A02 == c28339x.A02;
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}