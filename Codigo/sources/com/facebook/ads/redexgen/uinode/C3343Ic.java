package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ic */
/* loaded from: assets/audience_network.dex */
public final class C3343Ic {
    public final Handler A00;
    public final InterfaceC3344Id A01;

    public C3343Ic(Handler handler, InterfaceC3344Id interfaceC3344Id) {
        this.A00 = interfaceC3344Id != null ? (Handler) AbstractC3281Ha.A01(handler) : null;
        this.A01 = interfaceC3344Id;
    }

    public final void A01(int i10, int i11, int i12, float f10) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC3340IZ(this, i10, i11, i12, f10));
        }
    }

    public final void A02(int i10, long j10) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC3339IY(this, i10, j10));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC3341Ia(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC3338IX(this, format));
        }
    }

    public final void A05(C2910BC c2910bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC3342Ib(this, c2910bc));
        }
    }

    public final void A06(C2910BC c2910bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC3336IV(this, c2910bc));
        }
    }

    public final void A07(String str, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC3337IW(this, str, j10, j11));
        }
    }
}
