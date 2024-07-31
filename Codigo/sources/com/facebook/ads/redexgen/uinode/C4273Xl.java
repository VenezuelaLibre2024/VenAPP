package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Xl */
/* loaded from: assets/audience_network.dex */
public final class C4273Xl implements InterfaceC2962C4 {
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2962C4
    public final void A5n(Format format) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2962C4
    public final int AFQ(InterfaceC2951Bt interfaceC2951Bt, int i10, boolean z10) throws IOException, InterruptedException {
        int AGM = interfaceC2951Bt.AGM(i10);
        if (AGM == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return AGM;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2962C4
    public final void AFR(C3306Hz c3306Hz, int i10) {
        c3306Hz.A0Z(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2962C4
    public final void AFS(long j10, int i10, int i11, int i12, C2961C3 c2961c3) {
    }
}
