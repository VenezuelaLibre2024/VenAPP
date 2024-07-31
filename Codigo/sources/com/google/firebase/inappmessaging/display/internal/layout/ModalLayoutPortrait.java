package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import sd.f;
import ud.m;
import yd.b;
import yd.c;
import yd.d;

/* loaded from: classes.dex */
public class ModalLayoutPortrait extends a {

    /* renamed from: e, reason: collision with root package name */
    private c f11956e;

    /* renamed from: f, reason: collision with root package name */
    private int f11957f;

    public ModalLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11956e = new c();
    }

    private boolean k(View view) {
        return view.getId() == f.f25527g || view.getId() == f.f25534n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        for (int i16 = 0; i16 < size; i16++) {
            View view = getVisibleChildren().get(i16);
            FrameLayout.LayoutParams g10 = g(view);
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i17 = measuredHeight + paddingTop;
            if ((g10.gravity & 1) == 1) {
                int i18 = (i12 - i10) / 2;
                int i19 = measuredWidth / 2;
                i15 = i18 - i19;
                i14 = i18 + i19;
            } else {
                i14 = paddingLeft + measuredWidth;
                i15 = paddingLeft;
            }
            m.a("Layout child " + i16);
            m.d("\t(top, bottom)", (float) paddingTop, (float) i17);
            m.d("\t(left, right)", (float) i15, (float) i14);
            view.layout(i15, paddingTop, i14, i17);
            paddingTop += view.getMeasuredHeight();
            if (i16 < size - 1) {
                paddingTop += this.f11957f;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f11957f = c(24);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int b10 = b(i10);
        int a10 = a(i11);
        int size = paddingBottom + ((getVisibleChildren().size() - 1) * this.f11957f);
        this.f11956e.f(b10, a10);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            this.f11956e.a(childAt, k(childAt));
        }
        m.a("Screen dimens: " + getDisplayMetrics());
        m.d("Max pct", getMaxWidthPct(), getMaxHeightPct());
        float f10 = (float) b10;
        m.d("Base dimens", f10, (float) a10);
        for (d dVar : this.f11956e.e()) {
            m.a("Pre-measure child");
            dVar.e(b10, a10);
        }
        int d10 = this.f11956e.d() + size;
        m.c("Total reserved height", size);
        m.c("Total desired height", d10);
        boolean z10 = d10 > a10;
        m.a("Total height constrained: " + z10);
        if (z10) {
            this.f11956e.b((a10 - size) - this.f11956e.c());
        }
        int i13 = b10 - paddingRight;
        for (d dVar2 : this.f11956e.e()) {
            m.a("Measuring child");
            b.b(dVar2.c(), i13, dVar2.b());
            size += e(dVar2.c());
        }
        m.d("Measured dims", f10, size);
        setMeasuredDimension(b10, size);
    }
}
