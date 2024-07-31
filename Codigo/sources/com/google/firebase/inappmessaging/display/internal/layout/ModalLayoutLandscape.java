package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import sd.f;
import ud.m;
import yd.b;

/* loaded from: classes.dex */
public class ModalLayoutLandscape extends a {

    /* renamed from: e, reason: collision with root package name */
    private View f11948e;

    /* renamed from: f, reason: collision with root package name */
    private View f11949f;

    /* renamed from: r, reason: collision with root package name */
    private View f11950r;

    /* renamed from: s, reason: collision with root package name */
    private View f11951s;

    /* renamed from: t, reason: collision with root package name */
    private int f11952t;

    /* renamed from: u, reason: collision with root package name */
    private int f11953u;

    /* renamed from: v, reason: collision with root package name */
    private int f11954v;

    /* renamed from: w, reason: collision with root package name */
    private int f11955w;

    public ModalLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i16 = this.f11954v;
        int i17 = this.f11955w;
        if (i16 < i17) {
            i15 = (i17 - i16) / 2;
            i14 = 0;
        } else {
            i14 = (i16 - i17) / 2;
            i15 = 0;
        }
        m.a("Layout image");
        int i18 = paddingTop + i15;
        int f10 = f(this.f11948e) + paddingLeft;
        i(this.f11948e, paddingLeft, i18, f10, i18 + e(this.f11948e));
        int i19 = f10 + this.f11952t;
        m.a("Layout getTitle");
        int i20 = paddingTop + i14;
        int e10 = e(this.f11949f) + i20;
        i(this.f11949f, i19, i20, measuredWidth, e10);
        m.a("Layout getBody");
        int i21 = e10 + (this.f11949f.getVisibility() == 8 ? 0 : this.f11953u);
        int e11 = e(this.f11950r) + i21;
        i(this.f11950r, i19, i21, measuredWidth, e11);
        m.a("Layout button");
        h(this.f11951s, i19, e11 + (this.f11950r.getVisibility() != 8 ? this.f11953u : 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f11948e = d(f.f25534n);
        this.f11949f = d(f.f25536p);
        this.f11950r = d(f.f25527g);
        this.f11951s = d(f.f25528h);
        int i12 = 0;
        this.f11952t = this.f11948e.getVisibility() == 8 ? 0 : c(24);
        this.f11953u = c(24);
        List asList = Arrays.asList(this.f11949f, this.f11950r, this.f11951s);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int b10 = b(i10);
        int a10 = a(i11) - paddingBottom;
        int i13 = b10 - paddingLeft;
        m.a("Measuring image");
        b.b(this.f11948e, (int) (i13 * 0.4f), a10);
        int f10 = f(this.f11948e);
        int i14 = i13 - (this.f11952t + f10);
        float f11 = f10;
        m.d("Max col widths (l, r)", f11, i14);
        Iterator it = asList.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            if (((View) it.next()).getVisibility() != 8) {
                i15++;
            }
        }
        int max = Math.max(0, (i15 - 1) * this.f11953u);
        int i16 = a10 - max;
        m.a("Measuring getTitle");
        b.b(this.f11949f, i14, i16);
        m.a("Measuring button");
        b.b(this.f11951s, i14, i16);
        m.a("Measuring scroll view");
        b.b(this.f11950r, i14, (i16 - e(this.f11949f)) - e(this.f11951s));
        this.f11954v = e(this.f11948e);
        this.f11955w = max;
        Iterator it2 = asList.iterator();
        while (it2.hasNext()) {
            this.f11955w += e((View) it2.next());
        }
        int max2 = Math.max(this.f11954v + paddingBottom, this.f11955w + paddingBottom);
        Iterator it3 = asList.iterator();
        while (it3.hasNext()) {
            i12 = Math.max(f((View) it3.next()), i12);
        }
        m.d("Measured columns (l, r)", f11, i12);
        int i17 = f10 + i12 + this.f11952t + paddingLeft;
        m.d("Measured dims", i17, max2);
        setMeasuredDimension(i17, max2);
    }
}
