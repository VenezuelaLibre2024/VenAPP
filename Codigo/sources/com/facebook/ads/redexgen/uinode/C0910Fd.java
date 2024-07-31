package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0910Fd extends AbstractC1532bZ {
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
        A03 = C0910Fd.class.getSimpleName();
    }

    public C0910Fd(C1399Yn c1399Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData, C05620o c05620o, boolean z10) {
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
        A0E(this.A01, enumC05550g);
        return enumC05550g;
    }

    public final EnumC05550g A0G() {
        EnumC05550g enumC05550g = EnumC05550g.A08;
        try {
            C1047Kv.A0C(new C1047Kv(), ((AbstractC05560h) this).A00, AbstractC1050Ky.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC05560h) this).A02);
            return enumC05550g;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC05550g.A03;
        }
    }
}
