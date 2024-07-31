package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.WT */
/* loaded from: assets/audience_network.dex */
public final class C4196WT implements InterfaceC3253H8 {
    public static String[] A0C = {"G7jWD6ulf4YNSZyKFTHtDKYEexnehBFD", "eAcypqsPfTTSG9tYkNPVa4Ur1OSgM6nM", "x", "tNQG44GENbPBCr6MlCIr3t4n4NF0MmxZ", "OwErIGDXAeY1H11Nt9UmuNZTMubue4sT", "f", "eBkibdjxFKT4WmP6H51EPZ9055c0bCkp", "0Ce9TygyYiJS1KV85oyrWWiGz76nCu"};
    public long A00;
    public long A02;
    public C3243Gy A03;
    public final Uri A05;
    public final C3109Ek A07;
    public final InterfaceC3239Gu A08;
    public final C3287Hg A09;
    public volatile boolean A0A;
    public final /* synthetic */ C2971CD A0B;
    public final C2957Bz A06 = new C2957Bz();
    public boolean A04 = true;
    public long A01 = -1;

    public C4196WT(C2971CD c2971cd, Uri uri, InterfaceC3239Gu interfaceC3239Gu, C3109Ek c3109Ek, C3287Hg c3287Hg) {
        this.A0B = c2971cd;
        this.A05 = (Uri) AbstractC3281Ha.A01(uri);
        this.A08 = (InterfaceC3239Gu) AbstractC3281Ha.A01(interfaceC3239Gu);
        this.A07 = (C3109Ek) AbstractC3281Ha.A01(c3109Ek);
        this.A09 = c3287Hg;
    }

    public final void A04(long j10, long j11) {
        this.A06.A00 = j10;
        this.A02 = j11;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3253H8
    public final void A4A() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3253H8
    public final void A9P() throws IOException, InterruptedException {
        char charAt;
        char charAt2;
        C4275Xn c4275Xn;
        int result = 0;
        while (result == 0 && !this.A0A) {
            try {
                long j10 = this.A06.A00;
                C3243Gy c3243Gy = new C3243Gy(this.A05, j10, -1L, C2971CD.A08(this.A0B));
                this.A03 = c3243Gy;
                long ADl = this.A08.ADl(c3243Gy);
                this.A01 = ADl;
                if (ADl != -1) {
                    this.A01 = ADl + j10;
                }
                c4275Xn = new C4275Xn(this.A08, j10, this.A01);
                InterfaceC2950Bs extractor = this.A07.A02(c4275Xn, this.A08.A8E());
                if (this.A04) {
                    extractor.AFh(j10, this.A02);
                    this.A04 = false;
                }
                while (result == 0 && !this.A0A) {
                    this.A09.A00();
                    result = extractor.AEH(c4275Xn, this.A06);
                    if (c4275Xn.A7i() > C2971CD.A03(this.A0B) + j10) {
                        j10 = c4275Xn.A7i();
                        this.A09.A01();
                        C2971CD.A04(this.A0B).post(C2971CD.A06(this.A0B));
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
                C2957Bz c2957Bz = this.A06;
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[7] = "RP5F3MQdpmYGlMxTR22UmyqYUd";
                c2957Bz.A00 = c4275Xn.A7i();
                this.A00 = this.A06.A00 - this.A03.A01;
            }
            AbstractC3322IF.A0W(this.A08);
        }
    }
}
