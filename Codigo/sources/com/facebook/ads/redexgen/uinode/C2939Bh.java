package com.facebook.ads.redexgen.uinode;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bh */
/* loaded from: assets/audience_network.dex */
public class C2939Bh extends C4398Zn {
    public final /* synthetic */ C2938Bg A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.C4398Zn
    public final int A0O(View view, int i10) {
        int i11;
        AbstractC25304o A08 = A08();
        if (!A08.A20()) {
            return 0;
        }
        C25314p c25314p = (C25314p) view.getLayoutParams();
        int A0N = A0N(A08.A0k(view) - c25314p.leftMargin, A08.A0n(view) + c25314p.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i10);
        i11 = this.A00.A02;
        return A0N + i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2939Bh(C2938Bg c2938Bg, C4337Yn c4337Yn) {
        super(c4337Yn);
        this.A00 = c2938Bg;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4398Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        float f10;
        f10 = this.A00.A00;
        return f10 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4398Zn
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4398Zn
    public final PointF A0P(int i10) {
        return this.A00.A4O(i10);
    }
}
