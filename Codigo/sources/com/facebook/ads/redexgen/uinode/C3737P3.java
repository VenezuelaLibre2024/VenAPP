package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.P3 */
/* loaded from: assets/audience_network.dex */
public final class C3737P3 extends FrameLayout {
    public static byte[] A0L;
    public static String[] A0M = {"tg98T7YqorVxljyy5rC9rRviyjZQ3PWt", "vfHBQfbeXMWpx0Lt9J2p4bolhXFdVoUD", "nuD8gLvjahybAxP4K7AI7EnQPexhi40p", "Mle9DIn2BhVQrDGkT0Ym6c4cXgC65WVc", "K7R1lop0AG70QQAdOPTNlaEDkQeUTiOI", "yRh0uKXr8zSd48KJrOgjFYKLFGGCRN1w", "QQOq4rDYvkiUVU0ErOwgNbjJJCuazTiH", "YmsKh0Z7MVbEzdUA2tq2qo4jdnYDOoVM"};
    public EnumC3818QM A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC4476b5 A05;
    public final C26416c A06;
    public final C4337Yn A07;
    public final C3377JA A08;
    public final InterfaceC3560MC A09;
    public final InterfaceC3593Mj A0A;
    public final InterfaceC3736P2 A0B;
    public final C3935SF A0C;
    public final C3930SA A0D;
    public final C27939I A0E;
    public final AbstractC3790Pu A0F;
    public final AbstractC3788Ps A0G;
    public final AbstractC3721On A0H;
    public final AbstractC3679O7 A0I;
    public final AbstractC3643NX A0J;
    public final AbstractC3636NQ A0K;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{5, 19, 20, 20, 3, 8, 18, 50, 15, 11, 3, 78, 95, 88, 75, 94, 67, 69, 68, 95, 71, 70, 87, 86, 98, 115, 103, 97, 119, 118, 80, 107, 71, 97, 119, 96, 38, 36, 57, 49, 36, 51, 37, 37};
    }

    static {
        A0C();
    }

    public C3737P3(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, AbstractC4476b5 abstractC4476b5, C26416c c26416c, C3377JA c3377ja, InterfaceC3560MC interfaceC3560MC, InterfaceC3593Mj interfaceC3593Mj, InterfaceC3736P2 interfaceC3736P2) {
        super(c4337Yn);
        C2891At c2891At = new C2891At(this);
        this.A0J = c2891At;
        C2888Aq c2888Aq = new C2888Aq(this);
        this.A0I = c2888Aq;
        C2871AZ c2871az = new C2871AZ(this);
        this.A0H = c2871az;
        C2870AY c2870ay = new C2870AY(this);
        this.A0K = c2870ay;
        C2869AX c2869ax = new C2869AX(this);
        this.A0F = c2869ax;
        C2868AW c2868aw = new C2868AW(this);
        this.A0G = c2868aw;
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c4337Yn;
        this.A05 = abstractC4476b5;
        this.A06 = c26416c;
        this.A08 = c3377ja;
        this.A09 = interfaceC3560MC;
        this.A0A = interfaceC3593Mj;
        C3930SA c3930sa = new C3930SA(c4337Yn);
        this.A0D = c3930sa;
        this.A0B = interfaceC3736P2;
        c3930sa.setFunnelLoggingHandler(c3377ja);
        c3930sa.getEventBus().A03(c2891At, c2888Aq, c2871az, c2870ay, c2869ax, c2868aw);
        C27939I c27939i = new C27939I(c4337Yn, interfaceC3369J2, c3930sa, abstractC4476b5.A12());
        this.A0E = c27939i;
        if (C3348Ih.A1X(c4337Yn)) {
            this.A0C = new C3935SF(c4337Yn, interfaceC3369J2, c3930sa, abstractC4476b5.A12(), c27939i, null);
        } else {
            this.A0C = null;
        }
        A0B();
        c3930sa.setVideoURI(c26416c.A0S(abstractC4476b5.A0x().A0D().A08()));
        A09();
        AbstractC3536Lo.A0M(this, abstractC4476b5.A0w().A01().A07(true));
        String videoUrl = abstractC4476b5.A0x().A0D().A07();
        if (!TextUtils.isEmpty(videoUrl)) {
            AbstractC3682OA.A00(c4337Yn, this, videoUrl);
        }
        addView(c3930sa, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A04(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 64), i10);
            jSONObject.put(A02(11, 8, 12), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 20), this.A0D.A0h());
            jSONObject.put(A02(24, 12, 52), this.A0D.A0j());
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A02) {
            return;
        }
        if (A0M[4].charAt(2) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "wYD5NcGpzh0isOAoVzlYli3P4mnoyMgF";
        strArr[3] = "lJUNZHbcIhPOnD8CvxzjDicpi9xwJBJa";
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new C3999TH(this), C3348Ih.A0K(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new C3998TG(this), C3348Ih.A0L(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A0B.ADY(A02(36, 8, 112), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A0x().A0D().A07())) {
            C26817R c26817r = new C26817R(this.A07);
            this.A0D.A0c(c26817r);
            c26817r.setImage(this.A05.A0x().A0D().A07());
        }
        C26707C c26707c = new C26707C(this.A07, true, this.A08);
        this.A0D.A0c(c26707c);
        this.A0D.A0c(new C3493L7(c26707c, EnumC3831QZ.A03, true));
        this.A0D.A0c(new C26747H(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C277893 c277893) {
        if (this.A0D.getState() == EnumC3869RB.A02 && C3348Ih.A1D(this.A07)) {
            this.A0D.postDelayed(new C3997TF(this, c277893), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(String str) {
        this.A07.A0E().A2z(str);
        if (C3348Ih.A1E(this.A07)) {
            A07();
            return;
        }
        InterfaceC3560MC interfaceC3560MC = this.A09;
        InterfaceC3593Mj interfaceC3593Mj = this.A0A;
        String[] strArr = A0M;
        if (strArr[5].charAt(16) != strArr[6].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[2] = "EBONCaOY6he3EVwrjSVJVgPSsddIWnnf";
        strArr2[3] = "quoo3J1Esh1kTLqYeLvwyhMYZuOues3Q";
        interfaceC3560MC.A43(interfaceC3593Mj.A6y());
        this.A09.A43(this.A0A.A6u());
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A0x().A0D().A09() ? 0.0f : 1.0f);
        this.A0D.A0b(EnumC3818QM.A02, 26);
        A08();
    }

    public final void A0O() {
        C3930SA c3930sa = this.A0D;
        if (c3930sa != null) {
            if (!this.A02) {
                c3930sa.A0a(EnumC3813QH.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0V();
        }
        C3935SF c3935sf = this.A0C;
        if (c3935sf != null) {
            c3935sf.A0C();
        }
        this.A0E.A0i();
    }

    public final void A0P() {
        this.A0D.A0Z(9);
        AbstractC3536Lo.A0T(this);
        AbstractC3536Lo.A0H(this.A0D);
        AbstractC3536Lo.A0a(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0a(EnumC3813QH.A04);
    }

    public final void A0R(boolean z10) {
        if (z10) {
            this.A0D.setVolume(0.0f);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        A0M[4] = "yn69DofMHsLSVfdL7HK9OU5c1k1rZYJH";
    }

    public final void A0S(boolean z10) {
        if (this.A0D.A0i()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z10;
        this.A0D.A0e(false, 19);
    }

    public final void A0T(boolean z10) {
        EnumC3818QM enumC3818QM;
        if (this.A0D.A0j() || this.A02 || this.A0D.getState() == EnumC3869RB.A06 || (enumC3818QM = this.A00) == null) {
            return;
        }
        boolean z11 = this.A01;
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[1] = "icjW3n8vZZxsaCmttUmjcTI7CQu2m51p";
        strArr[0] = "kS3lp82K2YolC4kFtdcvtTBENFWE8ibh";
        if (!z11 || z10) {
            this.A0D.A0b(enumC3818QM, 27);
        }
    }

    public final void A0U(boolean z10) {
        this.A0D.A0e(z10, 18);
    }

    public final void A0V(boolean z10) {
        this.A0D.A0b(EnumC3818QM.A04, 25);
    }
}
