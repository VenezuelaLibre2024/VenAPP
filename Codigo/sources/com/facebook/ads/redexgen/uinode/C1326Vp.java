package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1326Vp implements InterfaceC0950Gu {
    public final int A00;
    public final InterfaceC0950Gu A01;
    public final I3 A02;

    public C1326Vp(InterfaceC0950Gu interfaceC0950Gu, I3 i32, int i10) {
        this.A01 = (InterfaceC0950Gu) AbstractC0955Ha.A01(interfaceC0950Gu);
        this.A02 = (I3) AbstractC0955Ha.A01(i32);
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final Uri A8E() {
        return this.A01.A8E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final long ADl(C0954Gy c0954Gy) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADl(c0954Gy);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i10, i11);
    }
}
