package com.facebook.ads.redexgen.uinode;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.bl */
/* loaded from: assets/audience_network.dex */
public final class C4518bl implements InterfaceC22560K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C4518bl(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22560K
    public final void ADm(int i10) throws C4517bk {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.A01);
        this.A00 = byteArrayInputStream;
        byteArrayInputStream.skip(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22560K
    public final void close() throws C4517bk {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22560K
    public final int length() throws C4517bk {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22560K
    public final int read(byte[] bArr) throws C4517bk {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
