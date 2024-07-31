package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fd */
/* loaded from: assets/audience_network.dex */
public final class C3162Fd extends AbstractC4506bZ {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C3162Fd.class.getSimpleName();
    }

    public C3162Fd(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, String str, Uri uri, Map<String, String> mExtraData, C22850o c22850o, boolean z10) {
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
        A0E(this.A01, enumC22780g);
        return enumC22780g;
    }

    public final EnumC22780g A0G() {
        EnumC22780g enumC22780g = EnumC22780g.A08;
        try {
            C3481Kv.A0C(new C3481Kv(), ((AbstractC22790h) this).A00, AbstractC3484Ky.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC22790h) this).A02);
            return enumC22780g;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC22780g.A03;
        }
    }
}
