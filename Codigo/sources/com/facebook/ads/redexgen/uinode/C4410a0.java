package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a0 */
/* loaded from: assets/audience_network.dex */
public class C4410a0 implements InterfaceC24333D {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C24623h A01;

    public C4410a0(C24623h c24623h) {
        this.A01 = c24623h;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24333D
    public final C24653k AAk(View view, C24653k c24653k) {
        C24653k A06 = AbstractC24493T.A06(view, c24653k);
        if (A06.A07()) {
            return A06;
        }
        Rect rect = this.A00;
        rect.left = A06.A03();
        rect.top = A06.A05();
        rect.right = A06.A04();
        rect.bottom = A06.A02();
        int i10 = this.A01.getChildCount();
        for (int count = 0; count < i10; count++) {
            C24653k A05 = AbstractC24493T.A05(this.A01.getChildAt(count), A06);
            rect.left = Math.min(A05.A03(), rect.left);
            rect.top = Math.min(A05.A05(), rect.top);
            rect.right = Math.min(A05.A04(), rect.right);
            rect.bottom = Math.min(A05.A02(), rect.bottom);
        }
        int count2 = rect.left;
        C24653k applied = A06.A06(count2, rect.top, rect.right, rect.bottom);
        return applied;
    }
}
