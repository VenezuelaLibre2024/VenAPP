package com.facebook.ads.redexgen.uinode;

import android.media.MediaCodec;

/* renamed from: com.facebook.ads.redexgen.X.B9 */
/* loaded from: assets/audience_network.dex */
public final class C2907B9 {
    public final MediaCodec.CryptoInfo.Pattern A00;
    public final MediaCodec.CryptoInfo A01;

    public C2907B9(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
        this.A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i10, int i11) {
        this.A00.set(i10, i11);
        this.A01.setPattern(this.A00);
    }
}