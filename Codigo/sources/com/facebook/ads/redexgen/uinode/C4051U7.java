package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.U7 */
/* loaded from: assets/audience_network.dex */
public class C4051U7 implements InterfaceC3600Mq {
    public static byte[] A01;
    public static String[] A02 = {"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    public final /* synthetic */ AbstractC3598Mo A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -31, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A02[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    static {
        A01();
    }

    public C4051U7(AbstractC3598Mo abstractC3598Mo) {
        this.A00 = abstractC3598Mo;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3600Mq
    public final void A4L() {
        InterfaceC3560MC interfaceC3560MC;
        InterfaceC3560MC interfaceC3560MC2;
        interfaceC3560MC = this.A00.A07;
        if (interfaceC3560MC != null) {
            interfaceC3560MC2 = this.A00.A07;
            interfaceC3560MC2.A43(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3600Mq
    public final void A4M() {
        InterfaceC3561MD interfaceC3561MD;
        InterfaceC3561MD interfaceC3561MD2;
        this.A00.A0M();
        interfaceC3561MD = this.A00.A08;
        if (interfaceC3561MD != null) {
            interfaceC3561MD2 = this.A00.A08;
            interfaceC3561MD2.ACu(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3600Mq
    public final void A8P() {
        C23912W c23912w;
        C23912W c23912w2;
        C23912W c23912w3;
        C4337Yn c4337Yn;
        c23912w = this.A00.A03;
        if (c23912w == null) {
            A4M();
            return;
        }
        AbstractC3598Mo.A01(this.A00);
        c23912w2 = this.A00.A03;
        if (c23912w2.A02() == null) {
            AbstractC3598Mo abstractC3598Mo = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            A02[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            abstractC3598Mo.A0C();
        } else {
            AbstractC3598Mo abstractC3598Mo2 = this.A00;
            c23912w3 = abstractC3598Mo2.A03;
            abstractC3598Mo2.A0E(c23912w3.A02());
        }
        if (Build.VERSION.SDK_INT >= 16) {
            c4337Yn = this.A00.A05;
            if (C3348Ih.A23(c4337Yn)) {
                this.A00.performAccessibilityAction(RecognitionOptions.ITF, null);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3600Mq
    public final void A9N() {
        C23872S c23872s;
        C23902V c23902v;
        C4337Yn c4337Yn;
        C23872S c23872s2;
        String str;
        c23872s = this.A00.A04;
        if (!TextUtils.isEmpty(c23872s.A0I())) {
            C3481Kv c3481Kv = new C3481Kv();
            c4337Yn = this.A00.A05;
            c23872s2 = this.A00.A04;
            Uri A00 = AbstractC3484Ky.A00(c23872s2.A0I());
            str = this.A00.A09;
            C3481Kv.A0M(c3481Kv, c4337Yn, A00, str);
        }
        c23902v = this.A00.A02;
        c23902v.A04();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3600Mq
    public final void A9O() {
        InterfaceC3561MD interfaceC3561MD;
        C23872S c23872s;
        C23902V c23902v;
        C4337Yn c4337Yn;
        C23872S c23872s2;
        String str;
        InterfaceC3561MD interfaceC3561MD2;
        this.A00.A0M();
        interfaceC3561MD = this.A00.A08;
        if (interfaceC3561MD != null) {
            interfaceC3561MD2 = this.A00.A08;
            interfaceC3561MD2.ACu(true);
        }
        c23872s = this.A00.A04;
        if (!TextUtils.isEmpty(c23872s.A0C())) {
            C3481Kv c3481Kv = new C3481Kv();
            c4337Yn = this.A00.A05;
            c23872s2 = this.A00.A04;
            Uri A00 = AbstractC3484Ky.A00(c23872s2.A0C());
            str = this.A00.A09;
            C3481Kv.A0M(c3481Kv, c4337Yn, A00, str);
        }
        c23902v = this.A00.A02;
        c23902v.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3600Mq
    public final void ACI(EnumC23892U enumC23892U) {
        EnumC23892U enumC23892U2;
        C23872S c23872s;
        C23912W A0B;
        C23872S c23872s2;
        AbstractC3598Mo.A00(this.A00);
        this.A00.A01 = enumC23892U;
        enumC23892U2 = this.A00.A01;
        if (enumC23892U2 == EnumC23892U.A03) {
            c23872s2 = this.A00.A04;
            A0B = c23872s2.A0A();
        } else {
            c23872s = this.A00.A04;
            A0B = c23872s.A0B();
        }
        this.A00.A0E(A0B);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3600Mq
    public final void ACS(C23912W c23912w) {
        C23902V c23902v;
        AbstractC3598Mo.A00(this.A00);
        c23902v = this.A00.A02;
        c23902v.A07(c23912w.A01());
        if (!c23912w.A05().isEmpty()) {
            this.A00.A0E(c23912w);
        } else {
            this.A00.A0D(c23912w);
        }
    }
}
