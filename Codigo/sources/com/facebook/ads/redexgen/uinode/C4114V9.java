package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.V9 */
/* loaded from: assets/audience_network.dex */
public class C4114V9 implements InterfaceC26336U {
    public static byte[] A03;
    public static String[] A04 = {"WE91vPqiHLcyJwrbQHRJcIvZwn5D9l", "3LK2x46Pp3Ld9onr8DyN9Ggm", "60IU9PqapOW3gkaytJRkZEg3", "UqNMzTGRyBNLAx", "QjYmXRpW4", "DeQ01HErfJf7NLfnuVX6corDAbYDzPur", "bhlqPTI7mETXQlgoFXHPJBBhjQPpzoup", "oYTMQ3SHL"};
    public final /* synthetic */ C4491bK A00;
    public final /* synthetic */ C4107V2 A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-16, 11, 19, 22, 15, 14, -54, 30, 25, -54, 14, 25, 33, 24, 22, 25, 11, 14, -54, 11, -54, 23, 15, 14, 19, 11, -40};
    }

    static {
        A01();
    }

    public C4114V9(C4107V2 c4107v2, C4491bK c4491bK, boolean z10) {
        this.A01 = c4107v2;
        this.A00 = c4491bK;
        this.A02 = z10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void AB2() {
        C4337Yn c4337Yn;
        long j10;
        InterfaceC4106V1 interfaceC4106V1;
        InterfaceC4106V1 interfaceC4106V12;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 110);
        c4337Yn = this.A01.A0c;
        InterfaceC22640S A0E = c4337Yn.A0E();
        j10 = this.A01.A00;
        A0E.A2m(C3527Lf.A01(j10), adErrorType.getErrorCode(), A00);
        interfaceC4106V1 = this.A01.A0G;
        if (interfaceC4106V1 != null) {
            C4107V2 c4107v2 = this.A01;
            String[] strArr = A04;
            String errorMessage = strArr[4];
            if (errorMessage.length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[6] = "7cQ3648pyLFx7h83cxUuTBVDS0jRS450";
            interfaceC4106V12 = c4107v2.A0G;
            interfaceC4106V12.ABR(C3403Jb.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void ABB() {
        InterfaceC4106V1 interfaceC4106V1;
        EnumC3388JL enumC3388JL;
        C4337Yn c4337Yn;
        InterfaceC4106V1 interfaceC4106V12;
        C4337Yn c4337Yn2;
        boolean A0q;
        InterfaceC4106V1 interfaceC4106V13;
        C3147FO c3147fo;
        C3147FO c3147fo2;
        this.A01.A0a = this.A00;
        if (this.A02) {
            c3147fo = this.A01.A0A;
            if (c3147fo != null) {
                c3147fo2 = this.A01.A0A;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[4] = "vb7V14ygc";
                strArr2[7] = "eJXYUqUMt";
                c3147fo2.A0I();
            }
        }
        interfaceC4106V1 = this.A01.A0G;
        if (interfaceC4106V1 != null) {
            enumC3388JL = this.A01.A0E;
            if (enumC3388JL.equals(EnumC3388JL.A04)) {
                A0q = this.A01.A0q();
                if (!A0q) {
                    interfaceC4106V13 = this.A01.A0G;
                    interfaceC4106V13.ACF();
                }
            }
            if (this.A02) {
                c4337Yn = this.A01.A0c;
                if (!C3348Ih.A1Q(c4337Yn) || this.A01.A0z() == null || !this.A01.A0z().A0m()) {
                    interfaceC4106V12 = this.A01.A0G;
                    interfaceC4106V12.AAg();
                } else {
                    C4107V2 c4107v2 = this.A01;
                    c4337Yn2 = c4107v2.A0c;
                    c4107v2.A0M = AbstractC3746PC.A01(c4337Yn2, this.A01.A0z(), 4, new C4115VA(this));
                }
            }
        }
    }
}
