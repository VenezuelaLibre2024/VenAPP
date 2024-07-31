package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fc */
/* loaded from: assets/audience_network.dex */
public class C3161Fc extends AbstractC4039Tv {
    public static byte[] A02;
    public static String[] A03 = {"RkD1OJxt7Cm", "85G", "rOg3VWXB3SEY3xQpEJ0sm9sa", "k8A4i4hEDbRwTbJ7ZqirbVmRMdyhqYao", "w8o7PtZgo3USKQqv4zP9Jz4sqmraE2my", "KkDuTncCOt8", "W5AvxWS2W", "p0drNpcb1k1QxXuNf36gE6"};
    public final /* synthetic */ C4494bN A00;
    public final /* synthetic */ C4484bD A01;

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

    public C3161Fc(C4494bN c4494bN, C4484bD c4484bD) {
        this.A00 = c4494bN;
        this.A01 = c4484bD;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3647Nb
    public final void AAn() {
        boolean z10;
        this.A00.A0F = true;
        z10 = this.A00.A0G;
        if (!z10) {
            return;
        }
        this.A00.A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4039Tv, com.facebook.ads.redexgen.uinode.InterfaceC3647Nb
    public final void AB4(String str, Map<String, String> map) {
        C3089EQ c3089eq;
        String str2;
        C3154FV c3154fv;
        C3089EQ c3089eq2;
        InterfaceC3369J2 interfaceC3369J2;
        C3154FV c3154fv2;
        C3154FV c3154fv3;
        C23271U A0y;
        String str3;
        C3089EQ c3089eq3;
        C3089EQ c3089eq4;
        boolean z10;
        InterfaceC22940x interfaceC22940x;
        InterfaceC22940x interfaceC22940x2;
        InterfaceC22940x interfaceC22940x3;
        C3154FV c3154fv4;
        C3154FV c3154fv5;
        c3089eq = this.A00.A04;
        c3089eq.A0E().A3j();
        Uri A00 = AbstractC3484Ky.A00(str);
        map.put(A00(22, 10, 82), AdPlacementType.BANNER.name());
        str2 = this.A00.A0H;
        map.put(A00(80, 8, 5), str2);
        c3154fv = this.A00.A03;
        if (c3154fv != null) {
            c3154fv4 = this.A00.A03;
            map.put(A00(59, 21, 92), String.valueOf(c3154fv4.A0l()));
            c3154fv5 = this.A00.A03;
            map.put(A00(36, 23, 97), String.valueOf(c3154fv5.A0H()));
        }
        c3089eq2 = this.A00.A04;
        interfaceC3369J2 = this.A00.A05;
        String A6T = this.A01.A6T();
        c3154fv2 = this.A00.A03;
        if (c3154fv2 == null) {
            A0y = null;
        } else {
            c3154fv3 = this.A00.A03;
            A0y = c3154fv3.A0y();
        }
        AbstractC22790h A002 = C22800i.A00(c3089eq2, interfaceC3369J2, A6T, A00, map, A0y);
        EnumC22780g enumC22780g = EnumC22780g.A08;
        if (A002 != null) {
            try {
                c3089eq3 = this.A00.A04;
                c3089eq3.A0E().A3g();
                enumC22780g = A002.A0C();
            } catch (Exception e10) {
                str3 = C4494bN.A0K;
                Log.e(str3, A00(0, 22, 0), e10);
            }
        }
        boolean z11 = A002 instanceof C3163Fe;
        String[] strArr = A03;
        if (strArr[0].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[1] = "yKt";
        strArr2[2] = "O3cmN93hsB9jwoMarcV7SE5e";
        if (z11 || (A002 instanceof C3165Fg)) {
            c3089eq4 = this.A00.A04;
            if (AbstractC3536Lo.A0e(c3089eq4, enumC22780g, map)) {
                z10 = true;
                if (A00(32, 4, 55).equals(A00.getScheme()) || !C22800i.A04(A00.getAuthority())) {
                }
                C4494bN c4494bN = this.A00;
                String[] strArr3 = A03;
                if (strArr3[1].length() != strArr3[2].length()) {
                    String[] strArr4 = A03;
                    strArr4[3] = "M83eNTNa8vARqiZhiytfGHWaWQaZAWG6";
                    strArr4[4] = "l8FjrIknJvxUrl7LWCsoLe7lR5i3NNwU";
                    interfaceC22940x3 = c4494bN.A00;
                    if (interfaceC22940x3 == null) {
                        return;
                    }
                } else {
                    String[] strArr5 = A03;
                    strArr5[0] = "riyOH90vrbS";
                    strArr5[5] = "IRnMxNmFGTn";
                    interfaceC22940x = c4494bN.A00;
                    if (interfaceC22940x == null) {
                        return;
                    }
                }
                if (z10 || enumC22780g == EnumC22780g.A05) {
                    return;
                }
                interfaceC22940x2 = this.A00.A00;
                interfaceC22940x2.AAx(this.A00);
                return;
            }
        }
        z10 = false;
        if (A00(32, 4, 55).equals(A00.getScheme())) {
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3647Nb
    public final void ABj() {
        C3089EQ c3089eq;
        C4482bB c4482bB;
        C4482bB c4482bB2;
        C4482bB c4482bB3;
        c3089eq = this.A00.A04;
        InterfaceC4513bg A0E = c3089eq.A0E();
        c4482bB = this.A00.A02;
        A0E.A3k(c4482bB != null);
        c4482bB2 = this.A00.A02;
        if (c4482bB2 == null) {
            return;
        }
        c4482bB3 = this.A00.A02;
        c4482bB3.A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4039Tv, com.facebook.ads.redexgen.uinode.InterfaceC3647Nb
    public final void ACU() {
        C3089EQ c3089eq;
        C4482bB c4482bB;
        c3089eq = this.A00.A04;
        c3089eq.A0E().A3m();
        c4482bB = this.A00.A02;
        c4482bB.A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3647Nb
    public final void ADj() {
    }
}
