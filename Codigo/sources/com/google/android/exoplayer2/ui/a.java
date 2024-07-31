package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import g8.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends View implements SubtitleView.a {

    /* renamed from: a */
    private final List<f> f8548a;

    /* renamed from: b */
    private List<g8.b> f8549b;

    /* renamed from: c */
    private int f8550c;

    /* renamed from: d */
    private float f8551d;

    /* renamed from: e */
    private r8.a f8552e;

    /* renamed from: f */
    private float f8553f;

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8548a = new ArrayList();
        this.f8549b = Collections.emptyList();
        this.f8550c = 0;
        this.f8551d = 0.0533f;
        this.f8552e = r8.a.f24761g;
        this.f8553f = 0.08f;
    }

    private static g8.b b(g8.b bVar) {
        b.C0262b p10 = bVar.c().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (bVar.f16047f == 0) {
            p10.h(1.0f - bVar.f16046e, 0);
        } else {
            p10.h((-bVar.f16046e) - 1.0f, 1);
        }
        int i10 = bVar.f16048r;
        if (i10 == 0) {
            p10.i(2);
        } else if (i10 == 2) {
            p10.i(0);
        }
        return p10.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<g8.b> list, r8.a aVar, float f10, int i10, float f11) {
        this.f8549b = list;
        this.f8552e = aVar;
        this.f8551d = f10;
        this.f8550c = i10;
        this.f8553f = f11;
        while (this.f8548a.size() < list.size()) {
            this.f8548a.add(new f(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<g8.b> list = this.f8549b;
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
        float h10 = i.h(this.f8550c, this.f8551d, height, i10);
        if (h10 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            g8.b bVar = list.get(i11);
            if (bVar.A != Integer.MIN_VALUE) {
                bVar = b(bVar);
            }
            g8.b bVar2 = bVar;
            int i12 = paddingBottom;
            this.f8548a.get(i11).b(bVar2, this.f8552e, h10, i.h(bVar2.f16055y, bVar2.f16056z, height, i10), this.f8553f, canvas, paddingLeft, paddingTop, width, i12);
            i11++;
            size = size;
            i10 = i10;
            paddingBottom = i12;
            width = width;
        }
    }
}
