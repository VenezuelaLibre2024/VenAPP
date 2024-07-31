package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WT implements H8 {
    public static String[] A0C = {"G7jWD6ulf4YNSZyKFTHtDKYEexnehBFD", "eAcypqsPfTTSG9tYkNPVa4Ur1OSgM6nM", "x", "tNQG44GENbPBCr6MlCIr3t4n4NF0MmxZ", "OwErIGDXAeY1H11Nt9UmuNZTMubue4sT", "f", "eBkibdjxFKT4WmP6H51EPZ9055c0bCkp", "0Ce9TygyYiJS1KV85oyrWWiGz76nCu"};
    public long A00;
    public long A02;
    public C0954Gy A03;
    public final Uri A05;
    public final C0891Ek A07;
    public final InterfaceC0950Gu A08;
    public final C0961Hg A09;
    public volatile boolean A0A;
    public final /* synthetic */ CD A0B;
    public final C0842Bz A06 = new C0842Bz();
    public boolean A04 = true;
    public long A01 = -1;

    public WT(CD cd2, Uri uri, InterfaceC0950Gu interfaceC0950Gu, C0891Ek c0891Ek, C0961Hg c0961Hg) {
        this.A0B = cd2;
        this.A05 = (Uri) AbstractC0955Ha.A01(uri);
        this.A08 = (InterfaceC0950Gu) AbstractC0955Ha.A01(interfaceC0950Gu);
        this.A07 = (C0891Ek) AbstractC0955Ha.A01(c0891Ek);
        this.A09 = c0961Hg;
    }

    public final void A04(long j10, long j11) {
        this.A06.A00 = j10;
        this.A02 = j11;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.H8
    public final void A4A() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.H8
    public final void A9P() throws IOException, InterruptedException {
        char charAt;
        char charAt2;
        C1373Xn c1373Xn;
        int result = 0;
        while (result == 0 && !this.A0A) {
            try {
                long j10 = this.A06.A00;
                C0954Gy c0954Gy = new C0954Gy(this.A05, j10, -1L, CD.A08(this.A0B));
                this.A03 = c0954Gy;
                long ADl = this.A08.ADl(c0954Gy);
                this.A01 = ADl;
                if (ADl != -1) {
                    this.A01 = ADl + j10;
                }
                c1373Xn = new C1373Xn(this.A08, j10, this.A01);
                InterfaceC0837Bs extractor = this.A07.A02(c1373Xn, this.A08.A8E());
                if (this.A04) {
                    extractor.AFh(j10, this.A02);
                    this.A04 = false;
                }
                while (result == 0 && !this.A0A) {
                    this.A09.A00();
                    result = extractor.AEH(c1373Xn, this.A06);
                    if (c1373Xn.A7i() > CD.A03(this.A0B) + j10) {
                        j10 = c1373Xn.A7i();
                        this.A09.A01();
                        CD.A04(this.A0B).post(CD.A06(this.A0B));
                    }
                }
            } finally {
                if (charAt != charAt2) {
                }
                throw new RuntimeException();
            }
            if (result == 1) {
                result = 0;
            } else {
                C0842Bz c0842Bz = this.A06;
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[7] = "RP5F3MQdpmYGlMxTR22UmyqYUd";
                c0842Bz.A00 = c1373Xn.A7i();
                this.A00 = this.A06.A00 - this.A03.A01;
            }
            IF.A0W(this.A08);
        }
    }
}
