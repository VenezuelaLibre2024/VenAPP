package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.T2 */
/* loaded from: assets/audience_network.dex */
public class C3984T2 implements InterfaceC3638NS {
    public static byte[] A01;
    public final /* synthetic */ C3979Sx A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-36, -38, -52, -39, -58, -43, -56, -35, -48, -50, -56, -37, -48, -42, -43, -58, -48, -56, -55};
    }

    public C3984T2(C3979Sx c3979Sx) {
        this.A00 = c3979Sx;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACT(String str) {
        C3630NK c3630nk;
        C3630NK c3630nk2;
        this.A00.A0Q = false;
        c3630nk = this.A00.A0F;
        c3630nk.setProgress(100);
        c3630nk2 = this.A00.A0F;
        AbstractC3536Lo.A0N(c3630nk2, 8);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACV(String str) {
        C3630NK c3630nk;
        C3629NJ c3629nj;
        boolean z10;
        int i10;
        this.A00.A0Q = true;
        c3630nk = this.A00.A0F;
        AbstractC3536Lo.A0N(c3630nk, 0);
        c3629nj = this.A00.A0E;
        c3629nj.setUrl(str);
        z10 = this.A00.A0P;
        if (!z10) {
            i10 = this.A00.A02;
            if (i10 > 1) {
                this.A00.A0P = true;
                this.A00.A0j(A00(0, 19, 97));
            }
        }
        C3979Sx.A08(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACn(int i10) {
        boolean z10;
        C3630NK c3630nk;
        z10 = this.A00.A0Q;
        if (z10) {
            c3630nk = this.A00.A0F;
            c3630nk.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACq(String str) {
        C3629NJ c3629nj;
        c3629nj = this.A00.A0E;
        c3629nj.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACs() {
        ((AbstractC3760PQ) this.A00).A09.AB0(14);
    }
}
