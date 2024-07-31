package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ed */
/* loaded from: assets/audience_network.dex */
public class C3102Ed extends C4398Zn {
    public final /* synthetic */ C3101Ec A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3102Ed(C3101Ec c3101Ec, Context context) {
        super(context);
        this.A00 = c3101Ec;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4398Zn, com.facebook.ads.redexgen.uinode.AbstractC254351
    public final void A0I(View view, C254553 c254553, C25414z c25414z) {
        C3101Ec c3101Ec = this.A00;
        int[] A0H = c3101Ec.A0H(((AbstractC4384ZY) c3101Ec).A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c25414z.A04(time, dy, dx, ((C4398Zn) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C4398Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4398Zn
    public final int A0L(int i10) {
        return Math.min(100, super.A0L(i10));
    }
}
