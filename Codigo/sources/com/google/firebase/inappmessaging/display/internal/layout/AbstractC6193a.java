package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import p382ud.C11544m;
import sd.C10901h;

/* renamed from: com.google.firebase.inappmessaging.display.internal.layout.a */
/* loaded from: classes.dex */
public abstract class AbstractC6193a extends FrameLayout {

    /* renamed from: a */
    private float f13173a;

    /* renamed from: b */
    private float f13174b;

    /* renamed from: c */
    private DisplayMetrics f13175c;

    /* renamed from: d */
    private List<View> f13176d;

    public AbstractC6193a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13176d = new ArrayList();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C10901h.f27673J, 0, 0);
        try {
            this.f13173a = obtainStyledAttributes.getFloat(C10901h.f27675L, -1.0f);
            this.f13174b = obtainStyledAttributes.getFloat(C10901h.f27674K, -1.0f);
            obtainStyledAttributes.recycle();
            this.f13175c = context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m16803a(int i10) {
        if (getMaxHeightPct() > 0.0f) {
            C11544m.m36182a("Height: restrict by pct");
            return m16812j((int) (getDisplayMetrics().heightPixels * getMaxHeightPct()), 4);
        }
        C11544m.m36182a("Height: restrict by spec");
        return View.MeasureSpec.getSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m16804b(int i10) {
        if (getMaxWidthPct() > 0.0f) {
            C11544m.m36182a("Width: restrict by pct");
            return m16812j((int) (getDisplayMetrics().widthPixels * getMaxWidthPct()), 4);
        }
        C11544m.m36182a("Width: restrict by spec");
        return View.MeasureSpec.getSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m16805c(int i10) {
        return (int) Math.floor(TypedValue.applyDimension(1, i10, this.f13175c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public View m16806d(int i10) {
        View findViewById = findViewById(i10);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalStateException("No such child: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m16807e(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public int m16808f(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public FrameLayout.LayoutParams m16809g(View view) {
        return (FrameLayout.LayoutParams) view.getLayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DisplayMetrics getDisplayMetrics() {
        return this.f13175c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float getMaxHeightPct() {
        return this.f13174b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float getMaxWidthPct() {
        return this.f13173a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<View> getVisibleChildren() {
        return this.f13176d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m16810h(View view, int i10, int i11) {
        m16811i(view, i10, i11, i10 + m16808f(view), i11 + m16807e(view));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void m16811i(View view, int i10, int i11, int i12, int i13) {
        C11544m.m36185d("\tleft, right", i10, i12);
        C11544m.m36185d("\ttop, bottom", i11, i13);
        view.layout(i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public int m16812j(int i10, int i11) {
        return i11 * Math.round(i10 / i11);
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        C11544m.m36185d("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        super.measureChildWithMargins(view, i10, i11, i12, i13);
        C11544m.m36185d("\tactual  (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        C11544m.m36183b("BEGIN LAYOUT");
        C11544m.m36182a("onLayout: l: " + i10 + ", t: " + i11 + ", r: " + i12 + ", b: " + i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        C11544m.m36183b("BEGIN MEASURE");
        C11544m.m36185d("Display", getDisplayMetrics().widthPixels, getDisplayMetrics().heightPixels);
        this.f13176d.clear();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                this.f13176d.add(childAt);
            } else {
                C11544m.m36184c("Skipping GONE child", i12);
            }
        }
    }
}
