package com.facebook.ads.redexgen.uinode;

import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.Vz */
/* loaded from: assets/audience_network.dex */
public final class C4166Vz implements InterfaceC3238Gt {
    public final Context A00;
    public final InterfaceC3238Gt A01;
    public final InterfaceC3261HG<? super InterfaceC3239Gu> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C4166Vz(Context context, InterfaceC3261HG<? super InterfaceC3239Gu> interfaceC3261HG, InterfaceC3238Gt interfaceC3238Gt) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC3261HG;
        this.A01 = interfaceC3238Gt;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C4166Vz(Context context, String str, InterfaceC3261HG<? super InterfaceC3239Gu> interfaceC3261HG) {
        this(context, interfaceC3261HG, new C248241(str, interfaceC3261HG));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3238Gt
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C4167W0 A4X() {
        return new C4167W0(this.A00, this.A02, this.A01.A4X());
    }
}
