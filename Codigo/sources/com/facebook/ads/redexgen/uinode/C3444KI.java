package com.facebook.ads.redexgen.uinode;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.KI */
/* loaded from: assets/audience_network.dex */
public final class C3444KI implements InterfaceC3841Qj {
    public int A00;
    public ValueAnimator A01;
    public EnumC3840Qi A02 = EnumC3840Qi.A05;
    public final int A03;
    public final int A04;
    public final View A05;

    public C3444KI(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A03 = i10;
        this.A00 = i11;
        this.A04 = i12;
    }

    private ValueAnimator A00(int i10, int i11, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new C3844Qm(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z10) {
        if (z10) {
            this.A02 = EnumC3840Qi.A06;
            ValueAnimator A00 = A00(this.A00, this.A04, this.A05);
            this.A01 = A00;
            A00.addListener(new C3843Ql(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        AbstractC3536Lo.A0H(this.A05);
        this.A02 = EnumC3840Qi.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        AbstractC3536Lo.A0L(this.A05);
        if (z10) {
            this.A02 = EnumC3840Qi.A04;
            ValueAnimator A00 = A00(this.A04, this.A00, this.A05);
            this.A01 = A00;
            A00.addListener(new C3842Qk(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC3840Qi.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3841Qj
    public final void A3Y(boolean z10, boolean z11) {
        if (z11) {
            A07(z10);
        } else {
            A08(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3841Qj
    public final EnumC3840Qi A82() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3841Qj
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
