package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.9w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07899w {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AH A03;
    public final C0895Eo A04;
    public final TrackGroupArray A05;
    public final C0940Gk A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C07899w(AH ah2, long j10, TrackGroupArray trackGroupArray, C0940Gk c0940Gk) {
        this(ah2, null, new C0895Eo(0), j10, -9223372036854775807L, 1, false, trackGroupArray, c0940Gk);
    }

    public C07899w(AH ah2, Object obj, C0895Eo c0895Eo, long j10, long j11, int i10, boolean z10, TrackGroupArray trackGroupArray, C0940Gk c0940Gk) {
        this.A03 = ah2;
        this.A07 = obj;
        this.A04 = c0895Eo;
        this.A02 = j10;
        this.A01 = j11;
        this.A0A = j10;
        this.A09 = j10;
        this.A00 = i10;
        this.A08 = z10;
        this.A05 = trackGroupArray;
        this.A06 = c0940Gk;
    }

    public static void A00(C07899w c07899w, C07899w c07899w2) {
        c07899w2.A0A = c07899w.A0A;
        c07899w2.A09 = c07899w.A09;
    }

    public final C07899w A01(int i10) {
        C07899w c07899w = new C07899w(this.A03, this.A07, this.A04.A00(i10), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c07899w);
        return c07899w;
    }

    public final C07899w A02(int i10) {
        C07899w playbackInfo = new C07899w(this.A03, this.A07, this.A04, this.A02, this.A01, i10, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C07899w A03(AH ah2, Object obj) {
        C07899w playbackInfo = new C07899w(ah2, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C07899w A04(C0895Eo c0895Eo, long j10, long j11) {
        long j12 = j11;
        AH ah2 = this.A03;
        Object obj = this.A07;
        if (!c0895Eo.A01()) {
            j12 = -9223372036854775807L;
        }
        return new C07899w(ah2, obj, c0895Eo, j10, j12, this.A00, this.A08, this.A05, this.A06);
    }

    public final C07899w A05(TrackGroupArray trackGroupArray, C0940Gk c0940Gk) {
        C07899w playbackInfo = new C07899w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c0940Gk);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C07899w A06(boolean z10) {
        C07899w playbackInfo = new C07899w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z10, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
