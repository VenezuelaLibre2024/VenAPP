package com.facebook.ads.redexgen.uinode;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.KA */
/* loaded from: assets/audience_network.dex */
public final class C3437KA implements InterfaceC3841Qj {
    public static String[] A06 = {"Zp1jBMTXyTngXAjRlLP1q6RZbaUI", "nHljDkT3i8Wirocu51jroGsoJHOhv1cR", "sP6X6aS", "KZL6M4", "KoOjzqZIxieUbLbPf8D", "B1jmqrSafv9jI6Lw73IRSYcL6IlnF6YH", "FLN3m70EKIfdw8", "ppmNyXlbfQKy53gkSU0tUatt7Y3PBdXb"};
    public ValueAnimator A00;
    public EnumC3840Qi A01 = EnumC3840Qi.A05;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public C3437KA(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A02 = i10;
        this.A04 = i11;
        this.A03 = i12;
    }

    private ValueAnimator A00(View view, int i10, int i11) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.setDuration(this.A02);
        ofInt.addUpdateListener(new C3850Qs(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            if (A06[1].charAt(28) != 'v') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "75AaLozsvbqC7RPKNa9MBDOQqsQ1eQ5U";
            strArr[5] = "oWQ9IgFva7oIaP1s8z2NxAvwjcynmKEe";
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        if (z10) {
            this.A01 = EnumC3840Qi.A06;
            ValueAnimator A00 = A00(this.A05, this.A03, this.A04);
            this.A00 = A00;
            A00.addListener(new C3849Qr(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        AbstractC3536Lo.A0H(this.A05);
        this.A01 = EnumC3840Qi.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z10) {
        AbstractC3536Lo.A0L(this.A05);
        if (z10) {
            this.A01 = EnumC3840Qi.A04;
            ValueAnimator A00 = A00(this.A05, this.A04, this.A03);
            this.A00 = A00;
            A00.addListener(new C3848Qq(this));
            this.A00.start();
            return;
        }
        View view = this.A05;
        if (A06[1].charAt(28) != 'v') {
            throw new RuntimeException();
        }
        A06[4] = "CRQ3If4kF9c";
        view.setTranslationY(this.A03);
        this.A01 = EnumC3840Qi.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3841Qj
    public final void A3Y(boolean z10, boolean z11) {
        if (z11) {
            A08(z10);
        } else {
            A09(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3841Qj
    public final EnumC3840Qi A82() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3841Qj
    public final void cancel() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
