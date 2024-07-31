package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.UL */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4065UL extends RelativeLayout implements InterfaceC3561MD {
    public static byte[] A0F;
    public static String[] A0G = {"fqT9snXDZkE2N6bIU2twhbCcrvrF5wQR", "W8MK3buqarkLhDixdfnbfGeXuw3i87xB", "M5iWaw3OwwKxChS5bTa9KUrj63pwu1Od", "QKu8TlGQ3D7NsDDaY", "OUnrWL6BanKvWJF", "644mHU9zQQHAcSiNB", "MqQzuM0GD0HqxOL2854PPJvoiao7nama", "mSpdOD621tCilusEUOf234Jx9LR3KzyX"};
    public View A00;
    public C3495L9 A01;
    public C3776Pg A02;
    public boolean A03;
    public boolean A04;
    public C23091C A05;
    public C3803Q7 A06;
    public boolean A07;
    public final ViewOnSystemUiVisibilityChangeListenerC3523Lb A08;
    public final InterfaceC3560MC A09;
    public final AbstractC4476b5 A0A;
    public final C4337Yn A0B;
    public final InterfaceC3369J2 A0C;
    public final C3377JA A0D;
    public final AbstractC3559MB A0E;

    public static String A0L(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0F = new byte[]{88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 90, 95, 72, 21, 82, 85, 79, 94, 73, 72, 79, 82, 79, 82, 90, 87, 21, 82, 86, 75, 73, 94, 72, 72, 82, 84, 85, 21, 87, 84, 92, 92, 94, 95};
    }

    public abstract boolean A0a();

    public abstract int getCloseButtonStyle();

    static {
        A0O();
    }

    public AbstractC4065UL(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC, AbstractC4476b5 abstractC4476b5) {
        super(c4337Yn);
        this.A07 = false;
        this.A04 = false;
        this.A03 = false;
        this.A0B = c4337Yn;
        this.A0C = interfaceC3369J2;
        this.A09 = interfaceC3560MC;
        this.A08 = new ViewOnSystemUiVisibilityChangeListenerC3523Lb(this);
        this.A0A = abstractC4476b5;
        C3377JA c3377ja = new C3377JA(abstractC4476b5.A12(), interfaceC3369J2);
        this.A0D = c3377ja;
        this.A0E = new FullScreenAdToolbar(c4337Yn, getAudienceNetworkListener(), c3377ja, 0, abstractC4476b5.A0r());
    }

    private C23221P A0J(int i10) {
        if (i10 == 1) {
            return this.A05.A01();
        }
        C23091C c23091c = this.A05;
        if (A0G[2].charAt(7) != 'O') {
            throw new RuntimeException();
        }
        A0G[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        return c23091c.A00();
    }

    private void A0M() {
        removeAllViews();
        AbstractC3536Lo.A0J(this);
    }

    private void A0N() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0X() && this.A02 == null) {
            this.A04 = true;
            C3776Pg A0B = new C3774Pe(this.A0B, this.A0A.A0x().A0E(), this.A0A.A10()).A08(this.A0A.A0w().A01()).A0B();
            this.A02 = A0B;
            AbstractC3379JC.A04(A0B, this.A0D, EnumC3376J9.A0U);
            this.A09.A3T(this, 0, layoutParams);
            this.A09.A3T(this.A02, 1, layoutParams);
            this.A02.A04(new C4067UN(this));
            return;
        }
        this.A09.A3T(this, 0, layoutParams);
    }

    private void A0P(C23221P c23221p, boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0E.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0E.A06(c23221p, ViewOnClickListenerC4029Tl.A08(this.A0A));
        addView(this.A0E, layoutParams);
    }

    public final void A0S() {
        View view = this.A00;
        if (view == null || !(view instanceof AbstractC3693OL)) {
            return;
        }
        if (A0Y()) {
            ((AbstractC3693OL) this.A00).A0z();
        } else {
            ((AbstractC3693OL) this.A00).A0y();
        }
    }

    public final void A0T(int i10) {
        this.A01 = new C3495L9(i10, new C4066UM(this, i10));
        this.A03 = true;
        A0S();
        this.A01.A07();
    }

    public final void A0U(View view, boolean z10, int i10) {
        this.A0E.setFullscreen(z10);
        this.A00 = view;
        this.A08.A05(EnumC3522La.A03);
        A0M();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z10 ? 0 : this.A0E.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C23221P A0J = A0J(i10);
        A0P(A0J, z10);
        AbstractC3536Lo.A0M(this, A0J.A07(false));
        if (this.A09 != null) {
            A0N();
            String[] strArr = A0G;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            if (z10 && Build.VERSION.SDK_INT >= 19) {
                ViewOnSystemUiVisibilityChangeListenerC3523Lb viewOnSystemUiVisibilityChangeListenerC3523Lb = this.A08;
                if (A0G[0].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A0G[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                viewOnSystemUiVisibilityChangeListenerC3523Lb.A05(EnumC3522La.A04);
            }
        }
    }

    public final void A0V(C25735V c25735v) {
        this.A08.A04(c25735v.A0J().getWindow());
        this.A05 = this.A0A.A0w();
        C23131G c23131g = null;
        C23131G adInfo = this.A0A.A0x();
        if (adInfo != null) {
            C23131G adInfo2 = this.A0A.A0x();
            if (adInfo2 != null) {
                c23131g = this.A0A.A0x();
            }
        }
        this.A0E.setPageDetails(this.A0A.A10(), this.A0A.A12(), c23131g != null ? c23131g.A0D().A03() : 0, this.A0A.A11());
        this.A0E.setToolbarListener(new C4069UP(this, c25735v));
    }

    public final void A0W(C25735V c25735v) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC3572MO(this, this, c25735v));
        startAnimation(alphaAnimation);
    }

    public final boolean A0X() {
        if (!this.A0A.A14().isEmpty()) {
            boolean A0P = this.A0A.A0x().A0P();
            if (A0G[6].charAt(3) != 'z') {
                throw new RuntimeException();
            }
            A0G[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            if (A0P) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0Y() {
        return this.A03;
    }

    public final boolean A0Z() {
        return this.A04;
    }

    public void ACW(boolean z10) {
        C3495L9 c3495l9 = this.A01;
        if (c3495l9 != null && c3495l9.A05()) {
            this.A01.A06();
        }
    }

    public void ACu(boolean z10) {
        C3495L9 c3495l9 = this.A01;
        if (c3495l9 != null && !c3495l9.A04()) {
            this.A01.A07();
        }
    }

    public InterfaceC3369J2 getAdEventManager() {
        return this.A0C;
    }

    public InterfaceC3560MC getAudienceNetworkListener() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public String getCurrentClientToken() {
        return this.A0A.A12();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A03();
        this.A0E.setToolbarListener(null);
        A0M();
    }

    public void setImpressionRecordingFlag(C3528Lg c3528Lg) {
        c3528Lg.A05();
        if (getAudienceNetworkListener() != null) {
            if (this.A07) {
                getAudienceNetworkListener().A43(new C4052U8().A7B());
            } else {
                getAudienceNetworkListener().A43(A0L(0, 47, 106));
            }
        }
    }

    public void setListener(InterfaceC3560MC interfaceC3560MC) {
    }

    public void setServerSideRewardHandler(C3803Q7 c3803q7) {
        this.A06 = c3803q7;
    }
}
