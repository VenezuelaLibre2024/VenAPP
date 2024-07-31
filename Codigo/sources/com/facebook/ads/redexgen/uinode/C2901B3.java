package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.B3 */
/* loaded from: assets/audience_network.dex */
public final class C2901B3 extends FrameLayout implements InterfaceC3561MD, InterfaceC3995TD {
    public static byte[] A0I;
    public static String[] A0J = {"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    public InterfaceC25715T A00;
    public C25735V A01;
    public InterfaceC3755PL A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC4476b5 A06;
    public final C4337Yn A07;
    public final InterfaceC3369J2 A08;
    public final C3377JA A09;
    public final ViewOnSystemUiVisibilityChangeListenerC3523Lb A0A;
    public final C3528Lg A0B;
    public final InterfaceC3560MC A0C;
    public final InterfaceC3593Mj A0D;
    public final C3737P3 A0E;
    public final C3745PB A0F;
    public final AbstractC3871RD A0G;
    public final C3872RE A0H;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{-88, -43, -43, -46, -43, -125, -58, -43, -56, -60, -41, -52, -47, -54, -125, -58, -46, -47, -55, -52, -54, -125, -83, -74, -78, -79, 6, 11, 4, 12, 17, 8, 7, 2, 4, 7, -95, -90, -97, -89, -84, -93, -94, -99, -97, -94, -99, -89, -84, -94, -93, -74, -107, -102, -109, -101, -96, -105, -106, -111, -109, -106, -111, -90, -95, -90, -109, -98, -115, -110, -117, -109, -104, -113, -114, -119, -98, -109, -105, -113, -119, -99, -102, -113, -104, -98, -90, -81, -84, -90, -82, -94, -74, -78, -72, -75, -90, -88, 25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    static {
        A0D();
    }

    public C2901B3(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC, AbstractC4476b5 abstractC4476b5, InterfaceC3593Mj interfaceC3593Mj, int i10) {
        super(c4337Yn);
        int i11;
        this.A00 = new C4008TQ(this);
        C4007TP c4007tp = new C4007TP(this);
        this.A0G = c4007tp;
        this.A03 = true;
        this.A07 = c4337Yn;
        this.A08 = interfaceC3369J2;
        this.A0C = interfaceC3560MC;
        this.A06 = abstractC4476b5;
        this.A0D = interfaceC3593Mj;
        C3745PB A02 = AbstractC3746PC.A02(abstractC4476b5.A0S());
        if (A02 == null) {
            this.A0F = new C3745PB(c4337Yn, abstractC4476b5, interfaceC3369J2, i10);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        C3377JA A0K = this.A0F.A0K();
        this.A09 = A0K;
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new C4006TO(this));
        AbstractC3536Lo.A0G(1003, this.A0F.A0O());
        if (abstractC4476b5.A0g()) {
            i11 = 0;
            C3737P3 c3737p3 = new C3737P3(c4337Yn, interfaceC3369J2, abstractC4476b5, new C26416c(c4337Yn), A0K, interfaceC3560MC, interfaceC3593Mj, new C4005TN(this));
            this.A0E = c3737p3;
            c3737p3.A0N();
            this.A0F.A0O().setOnTouchListener(new ViewOnTouchListenerC3733Oz(this));
            addView(c3737p3, new FrameLayout.LayoutParams(-1, -1));
        } else {
            i11 = 0;
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        C3872RE c3872re = new C3872RE(mediaView, 1, new WeakReference(c4007tp), c4337Yn);
        this.A0H = c3872re;
        c3872re.A0W(abstractC4476b5.A0C());
        c3872re.A0X(abstractC4476b5.A0D());
        this.A0F.A0e(c3872re);
        ViewOnSystemUiVisibilityChangeListenerC3523Lb viewOnSystemUiVisibilityChangeListenerC3523Lb = new ViewOnSystemUiVisibilityChangeListenerC3523Lb(this);
        this.A0A = viewOnSystemUiVisibilityChangeListenerC3523Lb;
        viewOnSystemUiVisibilityChangeListenerC3523Lb.A05(EnumC3522La.A03);
        setBackgroundColor(i11);
        if (C3348Ih.A1W(c4337Yn)) {
            c4337Yn.A0A().AGx(mediaView, abstractC4476b5.A12(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean A18 = abstractC4476b5.A18();
            String A0B = A0B(68, 18, 1);
            String A0B2 = A0B(36, 16, 21);
            String A0B3 = A0B(52, 16, 9);
            String A0B4 = A0B(26, 10, 122);
            if (A18) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, i11);
                jSONObject.put(A0B, abstractC4476b5.A0I());
            } else if (C3485Kz.A05(abstractC4476b5.A0O())) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 1);
                jSONObject.put(A0B, abstractC4476b5.A0I());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(AbstractC27248A.A15, A0B(0, 26, 58));
        }
    }

    private void A0C() {
        C3776Pg A0B = new C3774Pe(this.A07, this.A06.A0x().A0E(), this.A06.A10()).A08(this.A06.A0w().A01()).A0B();
        addView(A0B, new FrameLayout.LayoutParams(-1, -1));
        A0B.A04(new C4003TL(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0E().A5H();
            this.A0F.A0X();
        } else {
            this.A07.A0E().A5I();
            if (this.A0F.A0k()) {
                AGY();
                C4337Yn c4337Yn = this.A07;
                if (A0J[6].length() != 6) {
                    throw new RuntimeException();
                }
                A0J[7] = "2uXfZ95rl8UwGJAIvPTgfy7qu4p9pGiW";
                if (C3348Ih.A1W(c4337Yn)) {
                    this.A07.A0A().ABG();
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.A0F.A0O().getParent();
        if (viewGroup != null) {
            ViewGroup parent = this.A0F.A0O();
            viewGroup.removeView(parent);
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3U(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A0h()) {
            this.A0A.A05(EnumC3522La.A04);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C3663Nr c3663Nr = new C3663Nr(this.A07, this.A0D.A6R(), this.A0H, this.A0B, this.A08, this.A06.A0y(), this.A0C);
        HashMap hashMap = new HashMap();
        hashMap.put(A0B(86, 12, 26), A0B(98, 9, 123));
        c3663Nr.A07(this.A06.A12(), str, hashMap);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void A8S() {
        A0F(this.A06.A0x().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void A8T(String str) {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void A8X() {
        this.A0C.A43(this.A0D.A5s());
        C3803Q7 serverSideRewardHandler = new C3803Q7(this.A07, this.A0D, this.A06.A0T(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void A9K() {
        new Handler(Looper.getMainLooper()).post(new C4004TM(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void A9Q(Intent intent, Bundle bundle, C25735V c25735v) {
        C3745PB.A0B().incrementAndGet();
        c25735v.A0N(this.A00);
        this.A01 = c25735v;
        A0E();
        if (this.A06.A0x().A0P()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ABb() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ABf() {
        C3737P3 c3737p3 = this.A0E;
        if (c3737p3 != null) {
            c3737p3.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ACL(boolean z10) {
        C3737P3 c3737p3 = this.A0E;
        if (c3737p3 != null) {
            c3737p3.A0R(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACW(boolean z10) {
        C3737P3 c3737p3 = this.A0E;
        if (c3737p3 != null) {
            c3737p3.A0S(z10);
        }
        if (z10) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACu(boolean z10) {
        C3737P3 c3737p3 = this.A0E;
        if (c3737p3 != null) {
            c3737p3.A0T(z10);
        }
        boolean z11 = this.A03;
        if (A0J[1].length() == 11) {
            throw new RuntimeException();
        }
        A0J[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        if (z11) {
            this.A03 = false;
        } else if (z10) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void AD8() {
        C3737P3 c3737p3 = this.A0E;
        if (c3737p3 != null) {
            c3737p3.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ADc(boolean z10) {
        C3737P3 c3737p3 = this.A0E;
        if (c3737p3 != null) {
            c3737p3.A0U(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ADe(boolean z10) {
        C3737P3 c3737p3 = this.A0E;
        if (c3737p3 != null) {
            c3737p3.A0V(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void ADr(String str) {
        String urlString = this.A06.A13(str);
        if (urlString == null) {
            return;
        }
        C3481Kv.A0M(new C3481Kv(), this.A07, AbstractC3484Ky.A00(urlString), this.A06.A12());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void AGY() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3995TD
    public final void close() {
        C25735V c25735v = this.A01;
        if (c25735v == null) {
            return;
        }
        c25735v.finish(4);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public String getCurrentClientToken() {
        return this.A06.A12();
    }

    private ViewGroup getMediaView() {
        C3737P3 c3737p3 = this.A0E;
        return c3737p3 != null ? c3737p3 : this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void onDestroy() {
        if (C3348Ih.A1W(this.A07)) {
            this.A07.A0A().AGk(getMediaView());
        }
        C3737P3 c3737p3 = this.A0E;
        if (c3737p3 != null) {
            c3737p3.A0O();
        }
        this.A0A.A03();
        this.A08.A9X(this.A06.A12(), new C3654Ni().A02(this.A0B).A03(this.A0H).A05());
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        AbstractC3746PC.A04(this.A06.A0S());
        C3745PB.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC3560MC interfaceC3560MC) {
    }

    public void setRtfActionsJavascriptListener(InterfaceC3755PL interfaceC3755PL) {
        this.A02 = interfaceC3755PL;
    }
}
