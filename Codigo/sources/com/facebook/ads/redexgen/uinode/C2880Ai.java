package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ai */
/* loaded from: assets/audience_network.dex */
public final class C2880Ai {
    public final Handler A00;
    public final InterfaceC2881Aj A01;

    public C2880Ai(Handler handler, InterfaceC2881Aj interfaceC2881Aj) {
        this.A00 = interfaceC2881Aj != null ? (Handler) AbstractC3281Ha.A01(handler) : null;
        this.A01 = interfaceC2881Aj;
    }

    public final void A01(int i10) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC2879Ah(this, i10));
        }
    }

    public final void A02(int i10, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC2877Af(this, i10, j10, j11));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC2876Ae(this, format));
        }
    }

    public final void A04(C2910BC c2910bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC2878Ag(this, c2910bc));
        }
    }

    public final void A05(C2910BC c2910bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC2874Ac(this, c2910bc));
        }
    }

    public final void A06(String str, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC2875Ad(this, str, j10, j11));
        }
    }
}
