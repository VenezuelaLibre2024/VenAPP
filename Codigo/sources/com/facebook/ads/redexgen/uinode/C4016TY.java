package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.TY */
/* loaded from: assets/audience_network.dex */
public class C4016TY implements InterfaceC3638NS {
    public static byte[] A01;
    public static String[] A02 = {"BdhBL09M4Kf5pZVFq3hu", "RvApnOP5TrfSVKNiPYUqrJes", "fe7XFV8kXqba2R6pM5eLN8KkTFIqEiwl", "blbqgiQJp6cs", "NwOGI73VJjSa3U5NpZL78Ksqq7LFe", "B8ngslNEnR5wDlhREJljtiUu", "QAhn6ShnFRB2OsCPxSM", "0DHDykPyyqwhMMlodysb3VmSPsGurPgY"};
    public final /* synthetic */ C4011TT A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{76, 74, 92, 75, 102, 87, 88, 79, 80, 94, 88, 77, 80, 86, 87, 102, 80, 88, 91};
    }

    static {
        A01();
    }

    public C4016TY(C4011TT c4011tt) {
        this.A00 = c4011tt;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACT(String str) {
        C3630NK c3630nk;
        C3630NK c3630nk2;
        AbstractC4476b5 abstractC4476b5;
        C4045U1 c4045u1;
        AbstractC4476b5 abstractC4476b52;
        C4045U1 c4045u12;
        this.A00.A0U = false;
        c3630nk = this.A00.A0I;
        c3630nk.setProgress(100);
        c3630nk2 = this.A00.A0I;
        AbstractC3536Lo.A0N(c3630nk2, 8);
        abstractC4476b5 = this.A00.A0G;
        if (abstractC4476b5.A0n()) {
            c4045u1 = this.A00.A0J;
            if (c4045u1 != null) {
                abstractC4476b52 = this.A00.A0G;
                String A0R = abstractC4476b52.A0R();
                if (!TextUtils.isEmpty(A0R)) {
                    c4045u12 = this.A00.A0J;
                    c4045u12.loadUrl(A0R);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACV(String str) {
        C3630NK c3630nk;
        C3629NJ c3629nj;
        boolean z10;
        int i10;
        this.A00.A0U = true;
        c3630nk = this.A00.A0I;
        AbstractC3536Lo.A0N(c3630nk, 0);
        c3629nj = this.A00.A0H;
        c3629nj.setUrl(str);
        z10 = this.A00.A0T;
        if (!z10) {
            i10 = this.A00.A01;
            if (i10 > 1) {
                this.A00.A0T = true;
                this.A00.A0f(A00(0, 19, 51));
            }
        }
        C4011TT.A03(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACn(int i10) {
        boolean z10;
        C3630NK c3630nk;
        z10 = this.A00.A0U;
        if (z10) {
            c3630nk = this.A00.A0I;
            String[] strArr = A02;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "QY4HeEjZ5INYif1SeRyocKWTC9N0iQjQ";
            strArr2[7] = "IhWprrJJT2Yl4c8tLv2o4taD3peu2qkx";
            c3630nk.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACq(String str) {
        C3629NJ c3629nj;
        c3629nj = this.A00.A0H;
        c3629nj.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACs() {
        C3697OP c3697op;
        c3697op = this.A00.A0L;
        c3697op.A09().AB0(14);
    }
}
