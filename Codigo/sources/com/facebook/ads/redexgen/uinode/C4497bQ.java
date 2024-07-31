package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bQ */
/* loaded from: assets/audience_network.dex */
public class C4497bQ implements InterfaceC3734P0 {
    public final /* synthetic */ C4494bN A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3734P0
    public final void A9L() {
        C3154FV c3154fv;
        C3089EQ c3089eq;
        c3154fv = this.A00.A03;
        String A00 = c3154fv.A10().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        C3481Kv c3481Kv = new C3481Kv();
        c3089eq = this.A00.A04;
        C3481Kv.A0M(c3481Kv, c3089eq, AbstractC3484Ky.A00(A00), this.A00.A6T());
    }

    public C4497bQ(C4494bN c4494bN) {
        this.A00 = c4494bN;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3734P0
    public final void ABO(C2898B0 c2898b0) {
        new Handler(Looper.getMainLooper()).postDelayed(new C4498bR(this, c2898b0), 1L);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3734P0
    public final void ABd() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3734P0
    public final void ADL(View view, MotionEvent motionEvent) {
    }
}
