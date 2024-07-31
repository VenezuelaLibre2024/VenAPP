package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.9w */
/* loaded from: assets/audience_network.dex */
public final class C28329w {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC2853AH A03;
    public final C3113Eo A04;
    public final TrackGroupArray A05;
    public final C3229Gk A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C28329w(AbstractC2853AH abstractC2853AH, long j10, TrackGroupArray trackGroupArray, C3229Gk c3229Gk) {
        this(abstractC2853AH, null, new C3113Eo(0), j10, -9223372036854775807L, 1, false, trackGroupArray, c3229Gk);
    }

    public C28329w(AbstractC2853AH abstractC2853AH, Object obj, C3113Eo c3113Eo, long j10, long j11, int i10, boolean z10, TrackGroupArray trackGroupArray, C3229Gk c3229Gk) {
        this.A03 = abstractC2853AH;
        this.A07 = obj;
        this.A04 = c3113Eo;
        this.A02 = j10;
        this.A01 = j11;
        this.A0A = j10;
        this.A09 = j10;
        this.A00 = i10;
        this.A08 = z10;
        this.A05 = trackGroupArray;
        this.A06 = c3229Gk;
    }

    public static void A00(C28329w c28329w, C28329w c28329w2) {
        c28329w2.A0A = c28329w.A0A;
        c28329w2.A09 = c28329w.A09;
    }

    public final C28329w A01(int i10) {
        C28329w c28329w = new C28329w(this.A03, this.A07, this.A04.A00(i10), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c28329w);
        return c28329w;
    }

    public final C28329w A02(int i10) {
        C28329w playbackInfo = new C28329w(this.A03, this.A07, this.A04, this.A02, this.A01, i10, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C28329w A03(AbstractC2853AH abstractC2853AH, Object obj) {
        C28329w playbackInfo = new C28329w(abstractC2853AH, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C28329w A04(C3113Eo c3113Eo, long j10, long j11) {
        long j12 = j11;
        AbstractC2853AH abstractC2853AH = this.A03;
        Object obj = this.A07;
        if (!c3113Eo.A01()) {
            j12 = -9223372036854775807L;
        }
        return new C28329w(abstractC2853AH, obj, c3113Eo, j10, j12, this.A00, this.A08, this.A05, this.A06);
    }

    public final C28329w A05(TrackGroupArray trackGroupArray, C3229Gk c3229Gk) {
        C28329w playbackInfo = new C28329w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c3229Gk);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C28329w A06(boolean z10) {
        C28329w playbackInfo = new C28329w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z10, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
