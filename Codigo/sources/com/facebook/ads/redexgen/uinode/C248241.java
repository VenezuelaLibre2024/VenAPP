package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.41 */
/* loaded from: assets/audience_network.dex */
public final class C248241 extends AbstractC2943Bl {
    public final int A00;
    public final int A01;
    public final InterfaceC3261HG<? super InterfaceC3239Gu> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C248241(String str, InterfaceC3261HG<? super InterfaceC3239Gu> interfaceC3261HG) {
        this(str, interfaceC3261HG, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C248241(String str, InterfaceC3261HG<? super InterfaceC3239Gu> interfaceC3261HG, int i10, int i11, boolean z10) {
        this.A03 = str;
        this.A02 = interfaceC3261HG;
        this.A00 = i10;
        this.A01 = i11;
        this.A04 = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC2943Bl
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C2944Bm A01(C3250H5 c3250h5) {
        return new C2944Bm(this.A03, null, this.A02, this.A00, this.A01, this.A04, c3250h5);
    }
}
