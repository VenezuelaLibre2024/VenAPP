package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Vv */
/* loaded from: assets/audience_network.dex */
public final class C4162Vv implements InterfaceC3238Gt {
    public final InterfaceC3261HG<? super C4163Vw> A00;

    public C4162Vv() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C4162Vv(InterfaceC3261HG<? super C4163Vw> interfaceC3261HG) {
        this.A00 = interfaceC3261HG;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3238Gt
    public final InterfaceC3239Gu A4X() {
        return new C4163Vw(this.A00);
    }
}
