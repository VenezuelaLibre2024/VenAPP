package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a0 */
/* loaded from: assets/audience_network.dex */
public class C1436a0 implements C3D {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C06333h A01;

    public C1436a0(C06333h c06333h) {
        this.A01 = c06333h;
    }

    @Override // com.facebook.ads.redexgen.uinode.C3D
    public final C06363k AAk(View view, C06363k c06363k) {
        C06363k A06 = C3T.A06(view, c06363k);
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
            C06363k A05 = C3T.A05(this.A01.getChildAt(count), A06);
            rect.left = Math.min(A05.A03(), rect.left);
            rect.top = Math.min(A05.A05(), rect.top);
            rect.right = Math.min(A05.A04(), rect.right);
            rect.bottom = Math.min(A05.A02(), rect.bottom);
        }
        int count2 = rect.left;
        C06363k applied = A06.A06(count2, rect.top, rect.right, rect.bottom);
        return applied;
    }
}