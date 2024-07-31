package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Pj */
/* loaded from: assets/audience_network.dex */
public final class C3779Pj {
    public final int[] A00(View view, int i10, int i11) {
        C25314p c25314p = (C25314p) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i10, view.getPaddingLeft() + view.getPaddingRight(), c25314p.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i11, childWidthSpec + view.getPaddingBottom(), c25314p.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c25314p.leftMargin + c25314p.rightMargin, childWidthSpec3 + c25314p.bottomMargin + c25314p.topMargin};
    }
}
