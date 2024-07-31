package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.ZM */
/* loaded from: assets/audience_network.dex */
public class C4372ZM implements InterfaceC3734P0 {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C4367ZH A01;
    public final /* synthetic */ C4107V2 A02;

    public C4372ZM(C4367ZH c4367zh, C4107V2 c4107v2, NativeAd nativeAd) {
        this.A01 = c4367zh;
        this.A02 = c4107v2;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3734P0
    public final void A9L() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3734P0
    public final void ABO(C2898B0 c2898b0) {
        new Handler(Looper.getMainLooper()).postDelayed(new C4373ZN(this, c2898b0), 1L);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3734P0
    public final void ABd() {
        C2898B0 c2898b0;
        C2898B0 c2898b02;
        c2898b0 = this.A01.A0A;
        if (c2898b0 != null) {
            c2898b02 = this.A01.A0A;
            c2898b02.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3734P0
    public final void ADL(View view, MotionEvent motionEvent) {
        C4337Yn c4337Yn;
        boolean A0J;
        C3528Lg A19 = this.A02.A19();
        c4337Yn = this.A01.A07;
        A19.A06(c4337Yn, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0J = this.A01.A0J(this.A00);
            if (!A0J && this.A02.A12() != null) {
                this.A02.A12().onClick(view);
            }
        }
    }
}
