package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0884Ed extends C1424Zn {
    public final /* synthetic */ C0883Ec A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0884Ed(C0883Ec c0883Ec, Context context) {
        super(context);
        this.A00 = c0883Ec;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1424Zn, com.facebook.ads.redexgen.uinode.AnonymousClass51
    public final void A0I(View view, AnonymousClass53 anonymousClass53, C06754z c06754z) {
        C0883Ec c0883Ec = this.A00;
        int[] A0H = c0883Ec.A0H(((ZY) c0883Ec).A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c06754z.A04(time, dy, dx, ((C1424Zn) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C1424Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1424Zn
    public final int A0L(int i10) {
        return Math.min(100, super.A0L(i10));
    }
}
