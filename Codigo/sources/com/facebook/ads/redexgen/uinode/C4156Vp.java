package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vp */
/* loaded from: assets/audience_network.dex */
public final class C4156Vp implements InterfaceC3239Gu {
    public final int A00;
    public final InterfaceC3239Gu A01;
    public final C3310I3 A02;

    public C4156Vp(InterfaceC3239Gu interfaceC3239Gu, C3310I3 c3310i3, int i10) {
        this.A01 = (InterfaceC3239Gu) AbstractC3281Ha.A01(interfaceC3239Gu);
        this.A02 = (C3310I3) AbstractC3281Ha.A01(c3310i3);
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final Uri A8E() {
        return this.A01.A8E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final long ADl(C3243Gy c3243Gy) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADl(c3243Gy);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i10, i11);
    }
}
