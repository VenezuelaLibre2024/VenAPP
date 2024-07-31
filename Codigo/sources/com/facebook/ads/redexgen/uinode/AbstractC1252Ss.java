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
public abstract class AbstractC1252Ss extends FrameLayout implements MD {
    public static String[] A0D = {"2Xyaln6pEv", "U0a3JqFqqkDVhXbmlhDLXicSxteMexx", "xzpI97Jg3aS17fwtqg1jZWsfReheMZxV", "0HUxaz9ggnFIA", "Uunhkc3", "kqN9", "fWeU9xYsODnan54TmlbSL1hNy6Lef7fu", "qbKhPFfRzVPGu"};
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AbstractC1502b5 A01;
    public final C07046c A02;
    public final C1399Yn A03;
    public final J2 A04;
    public final JA A05;
    public final C1058Lg A06;
    public final MB A07;
    public final MC A08;
    public final InterfaceC1087Mj A09;
    public final RE A0A;
    public final ViewOnSystemUiVisibilityChangeListenerC1053Lb A0B;
    public final RD A0C;

    public abstract void A0Q();

    public abstract void A0S(C5V c5v);

    public abstract boolean A0T();

    public AbstractC1252Ss(C1399Yn c1399Yn, InterfaceC1087Mj interfaceC1087Mj, J2 j22, AbstractC1502b5 abstractC1502b5, C07046c c07046c, MC mc2) {
        super(c1399Yn);
        C1256Sw c1256Sw = new C1256Sw(this);
        this.A0C = c1256Sw;
        this.A06 = new C1058Lg();
        this.A00 = false;
        this.A03 = c1399Yn;
        this.A09 = interfaceC1087Mj;
        this.A04 = j22;
        this.A01 = abstractC1502b5;
        this.A02 = c07046c;
        this.A08 = mc2;
        this.A05 = new JA(abstractC1502b5.A12(), j22);
        RE re2 = new RE(this, 1, new WeakReference(c1256Sw), c1399Yn);
        this.A0A = re2;
        re2.A0W(abstractC1502b5.A0C());
        re2.A0X(abstractC1502b5.A0D());
        this.A07 = A0N();
        ViewOnSystemUiVisibilityChangeListenerC1053Lb viewOnSystemUiVisibilityChangeListenerC1053Lb = new ViewOnSystemUiVisibilityChangeListenerC1053Lb(this);
        this.A0B = viewOnSystemUiVisibilityChangeListenerC1053Lb;
        viewOnSystemUiVisibilityChangeListenerC1053Lb.A05(EnumC1052La.A03);
    }

    private FullScreenAdToolbar A0N() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0r());
        fullScreenAdToolbar.setFullscreen(true);
        int A03 = this.A01.A0x().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A10(), this.A01.A12(), A03, this.A01.A11());
        fullScreenAdToolbar.A06(this.A01.A0w().A01(), ViewOnClickListenerC1271Tl.A08(this.A01));
        if (A03 < 0) {
            C1G A0x = this.A01.A0x();
            int unskippableSeconds = A0D[4].length();
            if (unskippableSeconds == 31) {
                throw new RuntimeException();
            }
            A0D[5] = "3phQ";
            if (A0x.A0M()) {
                fullScreenAdToolbar.setToolbarActionMode(4);
            }
        }
        fullScreenAdToolbar.setToolbarListener(new C1253St(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        if (this.A01.A0x().A0P()) {
            C1162Pg A0B = new C1160Pe(this.A03, this.A01.A0x().A0E(), this.A01.A10()).A08(this.A01.A0w().A01()).A0B();
            JC.A04(A0B, this.A05, J9.A0U);
            addView(A0B, A0E);
            A0B.A04(new C1254Su(this));
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

    public final void A0R(int i10, KT kt) {
        new L9(i10, new C1255Sv(this, i10, kt)).A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        this.A08.A3U(this, A0E);
        A0S(c5v);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public String getCurrentClientToken() {
        return this.A01.A12();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
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
            this.A04.A9X(this.A01.A12(), new C1112Ni().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(MC mc2) {
    }

    public void setUpFullscreenMode(boolean z10) {
        EnumC1052La enumC1052La;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z10) {
            enumC1052La = EnumC1052La.A04;
        } else {
            enumC1052La = EnumC1052La.A03;
        }
        this.A0B.A05(enumC1052La);
    }
}
