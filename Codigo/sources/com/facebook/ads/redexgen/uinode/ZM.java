package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* loaded from: assets/audience_network.dex */
public class ZM implements P0 {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ ZH A01;
    public final /* synthetic */ V2 A02;

    public ZM(ZH zh2, V2 v22, NativeAd nativeAd) {
        this.A01 = zh2;
        this.A02 = v22;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void A9L() {
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ABO(B0 b02) {
        new Handler(Looper.getMainLooper()).postDelayed(new ZN(this, b02), 1L);
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ABd() {
        B0 b02;
        B0 b03;
        b02 = this.A01.A0A;
        if (b02 != null) {
            b03 = this.A01.A0A;
            b03.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ADL(View view, MotionEvent motionEvent) {
        C1399Yn c1399Yn;
        boolean A0J;
        C1058Lg A19 = this.A02.A19();
        c1399Yn = this.A01.A07;
        A19.A06(c1399Yn, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0J = this.A01.A0J(this.A00);
            if (!A0J && this.A02.A12() != null) {
                this.A02.A12().onClick(view);
            }
        }
    }
}