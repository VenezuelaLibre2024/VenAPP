package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.VQ */
/* loaded from: assets/audience_network.dex */
public final class C4131VQ implements InterfaceC3369J2 {
    public static InterfaceC3369J2 A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C4336Ym A00;
    public final InterfaceC27718w A01;
    public final InterfaceC3368J1 A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, 31};
    }

    static {
        A03();
        A05 = C4131VQ.class.getSimpleName();
        A06 = false;
    }

    public C4131VQ(C4336Ym c4336Ym) {
        InterfaceC3367J0 dispatchCallback;
        this.A00 = c4336Ym;
        if (AbstractC3350Ij.A0T(c4336Ym)) {
            InterfaceC27718w A00 = AbstractC27698u.A00(c4336Ym);
            this.A01 = A00;
            dispatchCallback = AbstractC3374J7.A00(c4336Ym, A00);
        } else {
            C3086EN A01 = AbstractC27698u.A01(c4336Ym);
            dispatchCallback = AbstractC3374J7.A01(c4336Ym, A01);
            this.A01 = A01;
        }
        this.A02 = new C4134VT(c4336Ym, dispatchCallback);
        ExecutorC3541Lt.A08.execute(new C4133VS(this));
        A04(c4336Ym);
    }

    public static synchronized InterfaceC3369J2 A01(C4336Ym c4336Ym) {
        InterfaceC3369J2 interfaceC3369J2;
        synchronized (C4131VQ.class) {
            if (A03 == null) {
                A03 = new C4131VQ(c4336Ym);
            }
            interfaceC3369J2 = A03;
        }
        return interfaceC3369J2;
    }

    public static synchronized void A04(C4336Ym c4336Ym) {
        synchronized (C4131VQ.class) {
            if (A06) {
                return;
            }
            c4336Ym.A03().AAd();
            A06 = true;
        }
    }

    private void A05(C3366Iz c3366Iz) {
        if (!c3366Iz.A0A()) {
            Log.e(A05, A02(7, 29, 24) + c3366Iz.A06() + A02(0, 7, 55));
        } else {
            A06(c3366Iz);
            this.A01.AHE(c3366Iz, new C4132VR(this, c3366Iz));
        }
    }

    private void A06(C3366Iz c3366Iz) {
        switch (C3370J3.A00[c3366Iz.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C27258B c27258b = new C27258B(new Exception(A02(36, 5, 50)));
                c27258b.A05(1);
                try {
                    c27258b.A07(new JSONObject().put(A02(48, 4, 107), c3366Iz.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A07().A9b(A02(41, 7, 50), AbstractC27248A.A1H, c27258b);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9T(String str, Map<String, String> data) {
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A04).A02(EnumC3372J5.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9V(String str, Map<String, String> data) {
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A04).A02(EnumC3372J5.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9W(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A04).A02(EnumC3372J5.A07).A06(AbstractC3379JC.A0A(str, EnumC3376J9.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9X(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A04).A02(EnumC3372J5.A08).A06(AbstractC3379JC.A0A(str, EnumC3376J9.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9Z(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A04).A02(EnumC3372J5.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9d(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A04).A02(EnumC3372J5.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9g(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A05).A02(EnumC3372J5.A0D).A06(AbstractC3379JC.A0A(str, EnumC3376J9.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9h(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A05).A02(EnumC3372J5.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9i(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A05).A02(EnumC3372J5.A0F).A06(AbstractC3379JC.A0A(str, EnumC3376J9.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9j(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A05).A02(EnumC3372J5.A0K).A06(AbstractC3379JC.A0A(str, EnumC3376J9.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9s(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A05).A02(EnumC3372J5.A0H).A06(AbstractC3379JC.A0A(str, EnumC3376J9.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9u(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A04).A02(EnumC3372J5.A0J).A06(AbstractC3379JC.A0A(str, EnumC3376J9.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9v(String str, Map<String, String> data, String str2, EnumC3371J4 enumC3371J4) {
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(enumC3371J4).A02(EnumC3372J5.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void A9w(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C3366Iz adEvent = new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A04).A02(EnumC3372J5.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void AA0(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A05).A02(EnumC3372J5.A0N).A06(AbstractC3379JC.A0A(str, EnumC3376J9.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void AA1(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A05).A02(EnumC3372J5.A0O).A06(AbstractC3379JC.A0A(str, EnumC3376J9.A0b)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void AA3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A01(EnumC3371J4.A04).A02(EnumC3372J5.A0P).A06(AbstractC3379JC.A0A(str, EnumC3376J9.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void AA4(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A04).A02(EnumC3372J5.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void AA8(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A05).A02(EnumC3372J5.A0Q).A06(AbstractC3379JC.A0A(str, EnumC3376J9.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void AA9(String str, Map<String, String> data) {
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A05).A02(EnumC3372J5.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void AAB(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3365Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC3371J4.A05).A02(EnumC3372J5.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3369J2
    public final void AE1(String str) {
        new AsyncTaskC3898Re(this.A00).execute(str);
    }
}
