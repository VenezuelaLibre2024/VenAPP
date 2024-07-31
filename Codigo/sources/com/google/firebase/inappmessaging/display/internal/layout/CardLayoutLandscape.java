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
public class CardLayoutLandscape extends a {

    /* renamed from: t, reason: collision with root package name */
    private static double f11935t = 0.6d;

    /* renamed from: e, reason: collision with root package name */
    private View f11936e;

    /* renamed from: f, reason: collision with root package name */
    private View f11937f;

    /* renamed from: r, reason: collision with root package name */
    private View f11938r;

    /* renamed from: s, reason: collision with root package name */
    private View f11939s;

    public CardLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        m.a("Layout image");
        int f10 = f(this.f11936e);
        i(this.f11936e, 0, 0, f10, e(this.f11936e));
        m.a("Layout title");
        int e10 = e(this.f11937f);
        i(this.f11937f, f10, 0, measuredWidth, e10);
        m.a("Layout scroll");
        i(this.f11938r, f10, e10, measuredWidth, e10 + e(this.f11938r));
        m.a("Layout action bar");
        i(this.f11939s, f10, measuredHeight - e(this.f11939s), measuredWidth, measuredHeight);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.inappmessaging.display.internal.layout.a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f11936e = d(f.f25534n);
        this.f11937f = d(f.f25536p);
        this.f11938r = d(f.f25527g);
        View d10 = d(f.f25521a);
        this.f11939s = d10;
        int i12 = 0;
        List asList = Arrays.asList(this.f11937f, this.f11938r, d10);
        int b10 = b(i10);
        int a10 = a(i11);
        int j10 = j((int) (f11935t * b10), 4);
        m.a("Measuring image");
        b.c(this.f11936e, b10, a10);
        if (f(this.f11936e) > j10) {
            m.a("Image exceeded maximum width, remeasuring image");
            b.d(this.f11936e, j10, a10);
        }
        int e10 = e(this.f11936e);
        int f10 = f(this.f11936e);
        int i13 = b10 - f10;
        float f11 = f10;
        m.d("Max col widths (l, r)", f11, i13);
        m.a("Measuring title");
        b.b(this.f11937f, i13, e10);
        m.a("Measuring action bar");
        b.b(this.f11939s, i13, e10);
        m.a("Measuring scroll view");
        b.c(this.f11938r, i13, (e10 - e(this.f11937f)) - e(this.f11939s));
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            i12 = Math.max(f((View) it.next()), i12);
        }
        m.d("Measured columns (l, r)", f11, i12);
        int i14 = f10 + i12;
        m.d("Measured dims", i14, e10);
        setMeasuredDimension(i14, e10);
    }
}
