package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fe */
/* loaded from: assets/audience_network.dex */
public final class C3163Fe extends AbstractC4506bZ {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {14, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, 61, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = C3163Fe.class.getSimpleName();
    }

    public C3163Fe(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, String str, Uri uri, Map<String, String> mExtraData, C22850o c22850o, boolean z10) {
        super(c4337Yn, interfaceC3369J2, str, c22850o, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4506bZ
    public final EnumC22780g A0D() {
        EnumC22780g enumC22780g = EnumC22780g.A08;
        if (((AbstractC4506bZ) this).A02) {
            enumC22780g = A0G();
        }
        if (!AbstractC3536Lo.A0e(((AbstractC22790h) this).A00, enumC22780g, this.A01)) {
            A0E(this.A01, enumC22780g);
        }
        return enumC22780g;
    }

    public final EnumC22780g A0G() {
        if (A0F(this.A00)) {
            EnumC22780g actionOutcome = EnumC22780g.A09;
            return actionOutcome;
        }
        try {
            EnumC22780g actionOutcome2 = C3481Kv.A05(new C3481Kv(), ((AbstractC22790h) this).A00, AbstractC3484Ky.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC22790h) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            EnumC22780g actionOutcome3 = EnumC22780g.A03;
            return actionOutcome3;
        }
    }
}
