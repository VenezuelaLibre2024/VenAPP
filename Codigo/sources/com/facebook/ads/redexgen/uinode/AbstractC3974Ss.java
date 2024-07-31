package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ss */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3974Ss extends FrameLayout implements InterfaceC3561MD {
    public static String[] A0D = {"2Xyaln6pEv", "U0a3JqFqqkDVhXbmlhDLXicSxteMexx", "xzpI97Jg3aS17fwtqg1jZWsfReheMZxV", "0HUxaz9ggnFIA", "Uunhkc3", "kqN9", "fWeU9xYsODnan54TmlbSL1hNy6Lef7fu", "qbKhPFfRzVPGu"};
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AbstractC4476b5 A01;
    public final C26416c A02;
    public final C4337Yn A03;
    public final InterfaceC3369J2 A04;
    public final C3377JA A05;
    public final C3528Lg A06;
    public final AbstractC3559MB A07;
    public final InterfaceC3560MC A08;
    public final InterfaceC3593Mj A09;
    public final C3872RE A0A;
    public final ViewOnSystemUiVisibilityChangeListenerC3523Lb A0B;
    public final AbstractC3871RD A0C;

    public abstract void A0Q();

    public abstract void A0S(C25735V c25735v);

    public abstract boolean A0T();

    public AbstractC3974Ss(C4337Yn c4337Yn, InterfaceC3593Mj interfaceC3593Mj, InterfaceC3369J2 interfaceC3369J2, AbstractC4476b5 abstractC4476b5, C26416c c26416c, InterfaceC3560MC interfaceC3560MC) {
        super(c4337Yn);
        C3978Sw c3978Sw = new C3978Sw(this);
        this.A0C = c3978Sw;
        this.A06 = new C3528Lg();
        this.A00 = false;
        this.A03 = c4337Yn;
        this.A09 = interfaceC3593Mj;
        this.A04 = interfaceC3369J2;
        this.A01 = abstractC4476b5;
        this.A02 = c26416c;
        this.A08 = interfaceC3560MC;
        this.A05 = new C3377JA(abstractC4476b5.A12(), interfaceC3369J2);
        C3872RE c3872re = new C3872RE(this, 1, new WeakReference(c3978Sw), c4337Yn);
        this.A0A = c3872re;
        c3872re.A0W(abstractC4476b5.A0C());
        c3872re.A0X(abstractC4476b5.A0D());
        this.A07 = A0N();
        ViewOnSystemUiVisibilityChangeListenerC3523Lb viewOnSystemUiVisibilityChangeListenerC3523Lb = new ViewOnSystemUiVisibilityChangeListenerC3523Lb(this);
        this.A0B = viewOnSystemUiVisibilityChangeListenerC3523Lb;
        viewOnSystemUiVisibilityChangeListenerC3523Lb.A05(EnumC3522La.A03);
    }

    private FullScreenAdToolbar A0N() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0r());
        fullScreenAdToolbar.setFullscreen(true);
        int A03 = this.A01.A0x().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A10(), this.A01.A12(), A03, this.A01.A11());
        fullScreenAdToolbar.A06(this.A01.A0w().A01(), ViewOnClickListenerC4029Tl.A08(this.A01));
        if (A03 < 0) {
            C23131G A0x = this.A01.A0x();
            int unskippableSeconds = A0D[4].length();
            if (unskippableSeconds == 31) {
                throw new RuntimeException();
            }
            A0D[5] = "3phQ";
            if (A0x.A0M()) {
                fullScreenAdToolbar.setToolbarActionMode(4);
            }
        }
        fullScreenAdToolbar.setToolbarListener(new C3975St(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        if (this.A01.A0x().A0P()) {
            C3776Pg A0B = new C3774Pe(this.A03, this.A01.A0x().A0E(), this.A01.A10()).A08(this.A01.A0w().A01()).A0B();
            AbstractC3379JC.A04(A0B, this.A05, EnumC3376J9.A0U);
            addView(A0B, A0E);
            A0B.A04(new C3976Su(this));
            return;
        }
        A0Q();
    }

    public final void A0P() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0R(int i10, AbstractRunnableC3455KT abstractRunnableC3455KT) {
        new C3495L9(i10, new C3977Sv(this, i10, abstractRunnableC3455KT)).A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void A9Q(Intent intent, Bundle bundle, C25735V c25735v) {
        this.A08.A3U(this, A0E);
        A0S(c25735v);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public String getCurrentClientToken() {
        return this.A01.A12();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A12())) {
            this.A04.A9X(this.A01.A12(), new C3654Ni().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC3560MC interfaceC3560MC) {
    }

    public void setUpFullscreenMode(boolean z10) {
        EnumC3522La enumC3522La;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z10) {
            enumC3522La = EnumC3522La.A04;
        } else {
            enumC3522La = EnumC3522La.A03;
        }
        this.A0B.A05(enumC3522La);
    }
}
