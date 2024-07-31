package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.B0 */
/* loaded from: assets/audience_network.dex */
public final class C2898B0 extends FrameLayout implements InterfaceC3995TD {
    public static byte[] A0A;
    public static String[] A0B = {"gR8VXB3ia", "OJTiurBFiCqcREvzh7o4PkhSqDGudpIq", "iaBHwIBC1utH6CwOSIC2yyAu4ZYXfJ61", "YdU4", "YcTfP9iPeB3iMp", "vsmHP1kkKyGC9kag", "2EZKw0n31g6TC4", "KAWIkc2sX"};
    public C3872RE A00;
    public final int A01;
    public final AbstractC4476b5 A02;
    public final C4337Yn A03;
    public final InterfaceC3369J2 A04;
    public final C3528Lg A05;
    public final InterfaceC3734P0 A06;
    public final C3745PB A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{118, 84, 91, 18, 65, 21, 70, 65, 84, 71, 65, 21, 116, 64, 81, 92, 80, 91, 86, 80, 123, 80, 65, 66, 90, 71, 94, 116, 86, 65, 92, 67, 92, 65, 76, 27, 21, 120, 84, 94, 80, 21, 70, 64, 71, 80, 21, 65, 93, 84, 65, 21, 92, 65, 18, 70, 21, 92, 91, 21, 76, 90, 64, 71, 21, 116, 91, 81, 71, 90, 92, 81, 120, 84, 91, 92, 83, 80, 70, 65, 27, 77, 88, 89, 21, 83, 92, 89, 80, 27, 30, 26, 25, 45, 60, 49, 61, 54, 59, 61, 22, 61, 44, 47, 55, 42, 51, 54, 57, 8, 54, 52, 35, 62, 33, 62, 35, 46, 77, 66, 71, 77, 69, 113, 93, 65, 91, 92, 77, 75, 55, 56, 45, 48, 47, 60, 24, 61, 29, 56, 45, 56, 27, 44, 55, 61, 53, 60, 33, 39, 49, 38, 55, 56, 61, 55, 63, 22, 9, 5, 23, 52, 25, 16, 5};
    }

    static {
        A02();
    }

    public C2898B0(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, InterfaceC3734P0 interfaceC3734P0, AbstractC4476b5 abstractC4476b5, String str, int i10, C3528Lg c3528Lg) {
        super(c4337Yn);
        this.A03 = c4337Yn;
        this.A04 = interfaceC3369J2;
        this.A02 = abstractC4476b5;
        this.A08 = str;
        this.A06 = interfaceC3734P0;
        this.A01 = i10;
        C3745PB preloadedDynamicWebViewController = AbstractC3746PC.A02(abstractC4476b5.A0S());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            C3745PB preloadedDynamicWebViewController2 = new C3745PB(c4337Yn, abstractC4476b5, interfaceC3369J2, i10);
            this.A07 = preloadedDynamicWebViewController2;
            AbstractC3746PC.A03(abstractC4476b5, preloadedDynamicWebViewController2);
            this.A09 = false;
        }
        if (c3528Lg != null) {
            this.A05 = c3528Lg;
            this.A07.A0Z(c3528Lg);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new C4002TK(this));
        this.A07.A0a(interfaceC3734P0);
        EnumC3504LI.A04(this, EnumC3504LI.A0A);
        if (C3348Ih.A1W(c4337Yn)) {
            c4337Yn.A0A().AGx(this.A07.A0O(), abstractC4476b5.A12(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0E().A5H();
            this.A07.A0X();
        } else {
            this.A03.A0E().A5I();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "EW3rEVX7vA8fzU";
            strArr2[4] = "ztAtYR2DvpL08d";
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    InterfaceC3734P0 interfaceC3734P0 = this.A06;
                    if (interfaceC3734P0 != null) {
                        interfaceC3734P0.ABO(this);
                    }
                    if (C3348Ih.A1W(this.A03)) {
                        this.A03.A0A().ABG();
                    }
                } else {
                    AGY();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C3745PB.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC4476b5 abstractC4476b5) {
        intent.putExtra(A01(157, 8, 17), EnumC3438KB.A07);
        intent.putExtra(A01(130, 18, 40), abstractC4476b5);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC4476b5 abstractC4476b5) {
        AdActivityIntent A04 = C3471Kj.A04(this.A03);
        A05(A04, abstractC4476b5);
        try {
            C3471Kj.A0A(this.A03, A04);
        } catch (Exception e10) {
            this.A03.A07().A9a(A01(107, 11, 38), AbstractC27248A.A0D, new C27258B(e10));
            Log.e(A01(90, 17, 41), A01(0, 90, 68), e10);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C3663Nr c3663Nr = new C3663Nr(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A0y());
        HashMap hashMap = new HashMap();
        hashMap.put(A01(118, 12, 95), A01(148, 9, 37));
        c3663Nr.A07(this.A02.A12(), str, hashMap);
    }

    public final void A08() {
        AbstractC3536Lo.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void A8S() {
        A07(this.A02.A0x().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void A8T(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void A8X() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void A9K() {
        new Handler(Looper.getMainLooper()).post(new C4001TJ(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ABb() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ABf() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ACL(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void AD8() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ADc(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ADe(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ADr(String str) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void AGY() {
        InterfaceC3734P0 interfaceC3734P0 = this.A06;
        if (interfaceC3734P0 != null) {
            interfaceC3734P0.ABO(this);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void close() {
    }

    public InterfaceC3369J2 getAdEventManager() {
        return this.A04;
    }

    public C3745PB getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C3872RE c3872re) {
        this.A00 = c3872re;
        this.A07.A0e(c3872re);
    }
}
