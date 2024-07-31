package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0911Fe extends AbstractC1532bZ {
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
        A04 = C0911Fe.class.getSimpleName();
    }

    public C0911Fe(C1399Yn c1399Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData, C05620o c05620o, boolean z10) {
        super(c1399Yn, j22, str, c05620o, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1532bZ
    public final EnumC05550g A0D() {
        EnumC05550g enumC05550g = EnumC05550g.A08;
        if (((AbstractC1532bZ) this).A02) {
            enumC05550g = A0G();
        }
        if (!AbstractC1066Lo.A0e(((AbstractC05560h) this).A00, enumC05550g, this.A01)) {
            A0E(this.A01, enumC05550g);
        }
        return enumC05550g;
    }

    public final EnumC05550g A0G() {
        if (A0F(this.A00)) {
            EnumC05550g actionOutcome = EnumC05550g.A09;
            return actionOutcome;
        }
        try {
            EnumC05550g actionOutcome2 = C1047Kv.A05(new C1047Kv(), ((AbstractC05560h) this).A00, AbstractC1050Ky.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC05560h) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            EnumC05550g actionOutcome3 = EnumC05550g.A03;
            return actionOutcome3;
        }
    }
}
