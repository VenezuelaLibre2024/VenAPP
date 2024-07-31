package com.google.android.exoplayer2.p048ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.p048ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p120g8.C7484b;
import p329r8.C10636a;

/* renamed from: com.google.android.exoplayer2.ui.a */
/* loaded from: classes.dex */
final class C4770a extends View implements SubtitleView.InterfaceC4766a {

    /* renamed from: a */
    private final List<C4775f> f9615a;

    /* renamed from: b */
    private List<C7484b> f9616b;

    /* renamed from: c */
    private int f9617c;

    /* renamed from: d */
    private float f9618d;

    /* renamed from: e */
    private C10636a f9619e;

    /* renamed from: f */
    private float f9620f;

    public C4770a(Context context) {
        this(context, null);
    }

    public C4770a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9615a = new ArrayList();
        this.f9616b = Collections.emptyList();
        this.f9617c = 0;
        this.f9618d = 0.0533f;
        this.f9619e = C10636a.f26875g;
        this.f9620f = 0.08f;
    }

    /* renamed from: b */
    private static C7484b m12291b(C7484b c7484b) {
        C7484b.b m22779p = c7484b.m22763c().m22774k(-3.4028235E38f).m22775l(Integer.MIN_VALUE).m22779p(null);
        if (c7484b.f17661f == 0) {
            m22779p.m22771h(1.0f - c7484b.f17660e, 0);
        } else {
            m22779p.m22771h((-c7484b.f17660e) - 1.0f, 1);
        }
        int i10 = c7484b.f17662r;
        if (i10 == 0) {
            m22779p.m22772i(2);
        } else if (i10 == 2) {
            m22779p.m22772i(0);
        }
        return m22779p.m22764a();
    }

    @Override // com.google.android.exoplayer2.p048ui.SubtitleView.InterfaceC4766a
    /* renamed from: a */
    public void mo12279a(List<C7484b> list, C10636a c10636a, float f10, int i10, float f11) {
        this.f9616b = list;
        this.f9619e = c10636a;
        this.f9618d = f10;
        this.f9617c = i10;
        this.f9620f = f11;
        while (this.f9615a.size() < list.size()) {
            this.f9615a.add(new C4775f(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<C7484b> list = this.f9616b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float m12324h = C4778i.m12324h(this.f9617c, this.f9618d, height, i10);
        if (m12324h <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            C7484b c7484b = list.get(i11);
            if (c7484b.f17654A != Integer.MIN_VALUE) {
                c7484b = m12291b(c7484b);
            }
            C7484b c7484b2 = c7484b;
            int i12 = paddingBottom;
            this.f9615a.get(i11).m12316b(c7484b2, this.f9619e, m12324h, C4778i.m12324h(c7484b2.f17669y, c7484b2.f17670z, height, i10), this.f9620f, canvas, paddingLeft, paddingTop, width, i12);
            i11++;
            size = size;
            i10 = i10;
            paddingBottom = i12;
            width = width;
        }
    }
}
