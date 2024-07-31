package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import sd.f;
import ud.m;
import yd.b;

/* loaded from: classes.dex */
public class CardLayoutPortrait extends a {

    /* renamed from: t, reason: collision with root package name */
    private static double f11940t = 0.8d;

    /* renamed from: e, reason: collision with root package name */
    private View f11941e;

    /* renamed from: f, reason: collision with root package name */
    private View f11942f;

    /* renamed from: r, reason: collision with root package name */
    private View f11943r;

    /* renamed from: s, reason: collision with root package name */
    private View f11944s;

    public CardLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int size = getVisibleChildren().size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            View view = getVisibleChildren().get(i15);
            int measuredHeight = view.getMeasuredHeight() + i14;
            int measuredWidth = view.getMeasuredWidth() + 0;
            m.a("Layout child " + i15);
            m.d("\t(top, bottom)", (float) i14, (float) measuredHeight);
            m.d("\t(left, right)", (float) 0, (float) measuredWidth);
            view.layout(0, i14, measuredWidth, measuredHeight);
            m.d("Child " + i15 + " wants to be ", view.getMeasuredWidth(), view.getMeasuredHeight());
            i14 += view.getMeasuredHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f11941e = d(f.f25534n);
        this.f11942f = d(f.f25536p);
        this.f11943r = d(f.f25527g);
        this.f11944s = d(f.f25521a);
        int b10 = b(i10);
        int a10 = a(i11);
        int j10 = j((int) (f11940t * a10), 4);
        m.a("Measuring image");
        b.d(this.f11941e, b10, a10);
        if (e(this.f11941e) > j10) {
            m.a("Image exceeded maximum height, remeasuring image");
            b.c(this.f11941e, b10, j10);
        }
        int f10 = f(this.f11941e);
        m.a("Measuring title");
        b.d(this.f11942f, f10, a10);
        m.a("Measuring action bar");
        b.d(this.f11944s, f10, a10);
        m.a("Measuring scroll view");
        b.d(this.f11943r, f10, ((a10 - e(this.f11941e)) - e(this.f11942f)) - e(this.f11944s));
        int size = getVisibleChildren().size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += e(getVisibleChildren().get(i13));
        }
        setMeasuredDimension(f10, i12);
    }
}
