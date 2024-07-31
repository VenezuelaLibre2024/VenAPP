package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.UA */
/* loaded from: assets/audience_network.dex */
public final class C4054UA implements InterfaceC3561MD {
    public static byte[] A0D;
    public int A00;
    public C3935SF A01;
    public C27939I A02;
    public String A03;
    public final C4337Yn A04;
    public final InterfaceC3369J2 A05;
    public final InterfaceC3560MC A06;
    public final InterfaceC3588Me A07;
    public final C3930SA A08;
    public final AbstractC3790Pu A09;
    public final AbstractC3788Ps A0A;
    public final AbstractC3721On A0B;
    public final AbstractC3679O7 A0C;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, 24, 11, 6, 7, 17, -11, 7, 7, 13, -10, 11, 15, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public C4054UA(C4337Yn c4337Yn, InterfaceC3588Me interfaceC3588Me, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC) {
        C2928BU c2928bu = new C2928BU(this);
        this.A0C = c2928bu;
        C2927BT c2927bt = new C2927BT(this);
        this.A0B = c2927bt;
        C2926BS c2926bs = new C2926BS(this);
        this.A09 = c2926bs;
        C2925BR c2925br = new C2925BR(this);
        this.A0A = c2925br;
        this.A04 = c4337Yn;
        this.A05 = interfaceC3369J2;
        this.A07 = interfaceC3588Me;
        C3930SA c3930sa = new C3930SA(c4337Yn);
        this.A08 = c3930sa;
        c3930sa.A0c(new C272086(c4337Yn));
        c3930sa.getEventBus().A03(c2928bu, c2927bt, c2926bs, c2925br);
        this.A06 = interfaceC3560MC;
        c3930sa.setIsFullScreen(true);
        c3930sa.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC3560MC.A3U(c3930sa, layoutParams);
        C3568MK closeButton = new C3568MK(c4337Yn);
        closeButton.setOnClickListener(new ViewOnClickListenerC3586Mc(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC3560MC.A3U(closeButton, params);
    }

    public final void A04(int i10) {
        this.A08.setVideoProgressReportIntervalMs(i10);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void A9Q(Intent intent, Bundle bundle, C25735V c25735v) {
        String ctaText = A02(8, 11, 102);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C3783Pn c3783Pn = new C3783Pn(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i10 = (int) (16.0f * AbstractC3499LD.A02);
            layoutParams.setMargins(i10, i10, i10, i10);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c3783Pn.setOnClickListener(new ViewOnClickListenerC3587Md(this));
            this.A06.A3U(c3783Pn, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 124), 0);
        this.A02 = new C27939I(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 1)));
        if (C3348Ih.A1X(this.A04)) {
            this.A01 = new C3935SF(this.A04, this.A05, this.A08, this.A03, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 98)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 34)));
        int i11 = this.A00;
        if (i11 > 0) {
            this.A08.A0Y(i11);
        }
        if (intent.getBooleanExtra(A02(0, 8, 72), false)) {
            this.A08.A0b(EnumC3818QM.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACW(boolean z10) {
        this.A06.A44(A02(37, 21, 27), new C3780Pk());
        this.A08.A0W();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACu(boolean z10) {
        this.A06.A44(A02(37, 21, 27), new C3739P5());
        if (!this.A08.A0j()) {
            this.A08.A0b(EnumC3818QM.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void onDestroy() {
        this.A06.A44(A02(37, 21, 27), new C3601Mr(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0e(this.A08.getCurrentPositionInMillis());
        C3935SF c3935sf = this.A01;
        if (c3935sf != null) {
            c3935sf.A0D();
        }
        this.A08.A0Z(1);
        this.A08.A0V();
    }
}
