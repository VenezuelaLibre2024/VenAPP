package com.facebook.ads.redexgen.uinode;

import android.media.MediaCodec;

/* renamed from: com.facebook.ads.redexgen.X.BA */
/* loaded from: assets/audience_network.dex */
public final class C2908BA {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public byte[] A04;
    public byte[] A05;
    public int[] A06;
    public int[] A07;
    public final MediaCodec.CryptoInfo A08;
    public final C2907B9 A09;

    public C2908BA() {
        MediaCodec.CryptoInfo A00 = AbstractC3322IF.A02 >= 16 ? A00() : null;
        this.A08 = A00;
        this.A09 = AbstractC3322IF.A02 >= 24 ? new C2907B9(A00) : null;
    }

    private MediaCodec.CryptoInfo A00() {
        return new MediaCodec.CryptoInfo();
    }

    private void A01() {
        this.A08.numSubSamples = this.A03;
        this.A08.numBytesOfClearData = this.A06;
        this.A08.numBytesOfEncryptedData = this.A07;
        this.A08.key = this.A05;
        this.A08.iv = this.A04;
        this.A08.mode = this.A02;
        if (AbstractC3322IF.A02 >= 24) {
            this.A09.A00(this.A01, this.A00);
        }
    }

    public final MediaCodec.CryptoInfo A02() {
        return this.A08;
    }

    public final void A03(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.A03 = i10;
        this.A06 = iArr;
        this.A07 = iArr2;
        this.A05 = bArr;
        this.A04 = bArr2;
        this.A02 = i11;
        this.A01 = i12;
        this.A00 = i13;
        if (AbstractC3322IF.A02 >= 16) {
            A01();
        }
    }
}