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
import sd.h;
import ud.m;

/* loaded from: classes.dex */
public abstract class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private float f11958a;

    /* renamed from: b, reason: collision with root package name */
    private float f11959b;

    /* renamed from: c, reason: collision with root package name */
    private DisplayMetrics f11960c;

    /* renamed from: d, reason: collision with root package name */
    private List<View> f11961d;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11961d = new ArrayList();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.J, 0, 0);
        try {
            this.f11958a = obtainStyledAttributes.getFloat(h.L, -1.0f);
            this.f11959b = obtainStyledAttributes.getFloat(h.K, -1.0f);
            obtainStyledAttributes.recycle();
            this.f11960c = context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(int i10) {
        if (getMaxHeightPct() > 0.0f) {
            m.a("Height: restrict by pct");
            return j((int) (getDisplayMetrics().heightPixels * getMaxHeightPct()), 4);
        }
        m.a("Height: restrict by spec");
        return View.MeasureSpec.getSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i10) {
        if (getMaxWidthPct() > 0.0f) {
            m.a("Width: restrict by pct");
            return j((int) (getDisplayMetrics().widthPixels * getMaxWidthPct()), 4);
        }
        m.a("Width: restrict by spec");
        return View.MeasureSpec.getSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(int i10) {
        return (int) Math.floor(TypedValue.applyDimension(1, i10, this.f11960c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View d(int i10) {
        View findViewById = findViewById(i10);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalStateException("No such child: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FrameLayout.LayoutParams g(View view) {
        return (FrameLayout.LayoutParams) view.getLayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DisplayMetrics getDisplayMetrics() {
        return this.f11960c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float getMaxHeightPct() {
        return this.f11959b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float getMaxWidthPct() {
        return this.f11958a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<View> getVisibleChildren() {
        return this.f11961d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(View view, int i10, int i11) {
        i(view, i10, i11, i10 + f(view), i11 + e(view));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(View view, int i10, int i11, int i12, int i13) {
        m.d("\tleft, right", i10, i12);
        m.d("\ttop, bottom", i11, i13);
        view.layout(i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int j(int i10, int i11) {
        return i11 * Math.round(i10 / i11);
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        m.d("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        super.measureChildWithMargins(view, i10, i11, i12, i13);
        m.d("\tactual  (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m.b("BEGIN LAYOUT");
        m.a("onLayout: l: " + i10 + ", t: " + i11 + ", r: " + i12 + ", b: " + i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        m.b("BEGIN MEASURE");
        m.d("Display", getDisplayMetrics().widthPixels, getDisplayMetrics().heightPixels);
        this.f11961d.clear();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                this.f11961d.add(childAt);
            } else {
                m.c("Skipping GONE child", i12);
            }
        }
    }
}
