package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0909Fc extends AbstractC1281Tv {
    public static byte[] A02;
    public static String[] A03 = {"RkD1OJxt7Cm", "85G", "rOg3VWXB3SEY3xQpEJ0sm9sa", "k8A4i4hEDbRwTbJ7ZqirbVmRMdyhqYao", "w8o7PtZgo3USKQqv4zP9Jz4sqmraE2my", "KkDuTncCOt8", "W5AvxWS2W", "p0drNpcb1k1QxXuNf36gE6"};
    public final /* synthetic */ C1520bN A00;
    public final /* synthetic */ C1510bD A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, -1, -3, 8, 8, 1, 14, -16, 21, 12, 1, -25, -29, -30, -27, 17, 20, 23, 31, 16, 29, 16, 15, 10, 14, 23, 20, 14, 22, 10, 15, 16, 23, 12, 36, 10, 24, 30, 15, 25, 5, 9, 24, 11, 7, 26, 15, 28, 11, 5, 7, 25, 5, 9, 26, 7, 5, 28, -40, -60, -67, -72, -64, -60, -76, -104, -77};
    }

    static {
        A01();
    }

    public C0909Fc(C1520bN c1520bN, C1510bD c1510bD) {
        this.A00 = c1520bN;
        this.A01 = c1510bD;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1105Nb
    public final void AAn() {
        boolean z10;
        this.A00.A0F = true;
        z10 = this.A00.A0G;
        if (!z10) {
            return;
        }
        this.A00.A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1281Tv, com.facebook.ads.redexgen.uinode.InterfaceC1105Nb
    public final void AB4(String str, Map<String, String> map) {
        EQ eq;
        String str2;
        FV fv;
        EQ eq2;
        J2 j22;
        FV fv2;
        FV fv3;
        C1U A0y;
        String str3;
        EQ eq3;
        EQ eq4;
        boolean z10;
        InterfaceC05710x interfaceC05710x;
        InterfaceC05710x interfaceC05710x2;
        InterfaceC05710x interfaceC05710x3;
        FV fv4;
        FV fv5;
        eq = this.A00.A04;
        eq.A0E().A3j();
        Uri A00 = AbstractC1050Ky.A00(str);
        map.put(A00(22, 10, 82), AdPlacementType.BANNER.name());
        str2 = this.A00.A0H;
        map.put(A00(80, 8, 5), str2);
        fv = this.A00.A03;
        if (fv != null) {
            fv4 = this.A00.A03;
            map.put(A00(59, 21, 92), String.valueOf(fv4.A0l()));
            fv5 = this.A00.A03;
            map.put(A00(36, 23, 97), String.valueOf(fv5.A0H()));
        }
        eq2 = this.A00.A04;
        j22 = this.A00.A05;
        String A6T = this.A01.A6T();
        fv2 = this.A00.A03;
        if (fv2 == null) {
            A0y = null;
        } else {
            fv3 = this.A00.A03;
            A0y = fv3.A0y();
        }
        AbstractC05560h A002 = C05570i.A00(eq2, j22, A6T, A00, map, A0y);
        EnumC05550g enumC05550g = EnumC05550g.A08;
        if (A002 != null) {
            try {
                eq3 = this.A00.A04;
                eq3.A0E().A3g();
                enumC05550g = A002.A0C();
            } catch (Exception e10) {
                str3 = C1520bN.A0K;
                Log.e(str3, A00(0, 22, 0), e10);
            }
        }
        boolean z11 = A002 instanceof C0911Fe;
        String[] strArr = A03;
        if (strArr[0].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[1] = "yKt";
        strArr2[2] = "O3cmN93hsB9jwoMarcV7SE5e";
        if (z11 || (A002 instanceof C0913Fg)) {
            eq4 = this.A00.A04;
            if (AbstractC1066Lo.A0e(eq4, enumC05550g, map)) {
                z10 = true;
                if (A00(32, 4, 55).equals(A00.getScheme()) || !C05570i.A04(A00.getAuthority())) {
                }
                C1520bN c1520bN = this.A00;
                String[] strArr3 = A03;
                if (strArr3[1].length() != strArr3[2].length()) {
                    String[] strArr4 = A03;
                    strArr4[3] = "M83eNTNa8vARqiZhiytfGHWaWQaZAWG6";
                    strArr4[4] = "l8FjrIknJvxUrl7LWCsoLe7lR5i3NNwU";
                    interfaceC05710x3 = c1520bN.A00;
                    if (interfaceC05710x3 == null) {
                        return;
                    }
                } else {
                    String[] strArr5 = A03;
                    strArr5[0] = "riyOH90vrbS";
                    strArr5[5] = "IRnMxNmFGTn";
                    interfaceC05710x = c1520bN.A00;
                    if (interfaceC05710x == null) {
                        return;
                    }
                }
                if (z10 || enumC05550g == EnumC05550g.A05) {
                    return;
                }
                interfaceC05710x2 = this.A00.A00;
                interfaceC05710x2.AAx(this.A00);
                return;
            }
        }
        z10 = false;
        if (A00(32, 4, 55).equals(A00.getScheme())) {
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1105Nb
    public final void ABj() {
        EQ eq;
        C1508bB c1508bB;
        C1508bB c1508bB2;
        C1508bB c1508bB3;
        eq = this.A00.A04;
        InterfaceC1539bg A0E = eq.A0E();
        c1508bB = this.A00.A02;
        A0E.A3k(c1508bB != null);
        c1508bB2 = this.A00.A02;
        if (c1508bB2 == null) {
            return;
        }
        c1508bB3 = this.A00.A02;
        c1508bB3.A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1281Tv, com.facebook.ads.redexgen.uinode.InterfaceC1105Nb
    public final void ACU() {
        EQ eq;
        C1508bB c1508bB;
        eq = this.A00.A04;
        eq.A0E().A3m();
        c1508bB = this.A00.A02;
        c1508bB.A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1105Nb
    public final void ADj() {
    }
}
