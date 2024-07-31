package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.T8 */
/* loaded from: assets/audience_network.dex */
public final class C3990T8 extends AbstractC3760PQ {
    public static String[] A07 = {"itiy11Wl5lP7QtpB3", "v6A5WW2CB", "SYp5FzxPKMl", "MKN0lN1Uug", "IQIXhYysWoH9a5YMZx5hFMUL6lEdxT5q", "FECz3BMfLn4pJfwLFVrIm2wrzlNMsWJ3", "RmVgcuWcoU56A5AXkQhrmgSRFj76ryom", "F5uv5dts8QHAu8Ovw"};
    public static final RelativeLayout.LayoutParams A08 = new RelativeLayout.LayoutParams(-1, -1);
    public C3495L9 A00;
    public AbstractC3693OL A01;
    public final int A02;
    public final ImageView A03;
    public final AbstractC3559MB A04;
    public final InterfaceC3773Pd A05;
    public final AtomicBoolean A06;

    public C3990T8(C4337Yn c4337Yn, InterfaceC3593Mj interfaceC3593Mj, int i10, InterfaceC3369J2 interfaceC3369J2, AbstractC4476b5 abstractC4476b5, InterfaceC3560MC interfaceC3560MC, FullScreenAdToolbar fullScreenAdToolbar, boolean z10, boolean z11, InterfaceC3773Pd interfaceC3773Pd, int i11) {
        super(c4337Yn, interfaceC3593Mj, interfaceC3369J2, abstractC4476b5, i10, z10, z11, interfaceC3560MC);
        this.A06 = new AtomicBoolean(false);
        this.A02 = i11;
        this.A05 = interfaceC3773Pd;
        ImageView imageView = new ImageView(getContext());
        this.A03 = imageView;
        this.A04 = fullScreenAdToolbar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new AsyncTaskC4034Tq(imageView, c4337Yn).A05(abstractC4476b5.A0x().A0D().A00(), abstractC4476b5.A0x().A0D().A01()).A06(new C3992TA(this)).A07(abstractC4476b5.A0x().A0D().A07());
        A08(c4337Yn.getResources().getConfiguration().orientation);
    }

    private AbstractC3693OL A04(int i10) {
        if (this.A03.getParent() != null) {
            ImageView imageView = this.A03;
            if (A07[4].charAt(16) != 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[3] = "PnJcnL34IR";
            strArr[1] = "4gIzhBkuZ";
            AbstractC3536Lo.A0J(imageView);
        }
        if (A07[4].charAt(16) != 'Z') {
            throw new RuntimeException();
        }
        A07[4] = "hUws06ULbo6w3OlBZNW9WYMgHjAED42u";
        C3697OP params = new C3696OO(super.A06, this.A07, this.A09, super.A05, this.A03, this.A0B, this.A08).A0E(this.A04.getToolbarHeight()).A0H(this.A04).A0D(i10).A0J(i10 != 2).A0K();
        return AbstractC3694OM.A00(params, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A06.get()) {
            A03();
        }
    }

    private void A08(int i10) {
        AbstractC3536Lo.A0J(this.A01);
        AbstractC3693OL A04 = A04(i10);
        this.A01 = A04;
        addView(A04, 0, A08);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A0z() {
        if (C3348Ih.A1W(super.A06)) {
            super.A06.A0A().AGk(this.A03);
        }
        AbstractC3693OL abstractC3693OL = this.A01;
        if (abstractC3693OL != null) {
            abstractC3693OL.A0v();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A10() {
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A11() {
        int i10 = this.A02;
        if (i10 > 0) {
            C3495L9 c3495l9 = new C3495L9(i10, 100.0f, 100L, new Handler(Looper.getMainLooper()), new C3991T9(this));
            this.A00 = c3495l9;
            c3495l9.A07();
            return;
        }
        this.A05.AD7(false);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A12(boolean z10) {
        C3495L9 c3495l9 = this.A00;
        if (c3495l9 != null && c3495l9.A05()) {
            this.A00.A06();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A13(boolean z10) {
        C3495L9 c3495l9 = this.A00;
        if (c3495l9 != null && !c3495l9.A04()) {
            this.A00.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final boolean A14() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final boolean A15() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public C3772Pc getFullScreenAdStyle() {
        C23221P colors = this.A01.getColors();
        return new C3772Pc(this.A01.A11(), C3772Pc.A07, colors, ViewOnClickListenerC4029Tl.A08(super.A05), colors.A07(this.A01.A11() || (this.A01 instanceof AbstractC4024Tg)), null);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A05.A0x().A0N()) {
            A08(configuration.orientation);
        }
    }
}
