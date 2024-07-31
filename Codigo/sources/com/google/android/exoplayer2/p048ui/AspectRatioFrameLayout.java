package com.google.android.exoplayer2.p048ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p329r8.C10640e;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    private final RunnableC4765c f9578a;

    /* renamed from: b */
    private float f9579b;

    /* renamed from: c */
    private int f9580c;

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    /* loaded from: classes.dex */
    public interface InterfaceC4764b {
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c */
    /* loaded from: classes.dex */
    private final class RunnableC4765c implements Runnable {

        /* renamed from: a */
        private float f9581a;

        /* renamed from: b */
        private float f9582b;

        /* renamed from: c */
        private boolean f9583c;

        /* renamed from: d */
        private boolean f9584d;

        private RunnableC4765c() {
        }

        /* renamed from: a */
        public void m12274a(float f10, float f11, boolean z10) {
            this.f9581a = f10;
            this.f9582b = f11;
            this.f9583c = z10;
            if (this.f9584d) {
                return;
            }
            this.f9584d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9584d = false;
            AspectRatioFrameLayout.m12273a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9580c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C10640e.f26899a, 0, 0);
            try {
                this.f9580c = obtainStyledAttributes.getInt(C10640e.f26900b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f9578a = new RunnableC4765c();
    }

    /* renamed from: a */
    static /* synthetic */ InterfaceC4764b m12273a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f9580c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r4 > 0.0f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r4 > 0.0f) goto L20;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f9579b
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f9579b
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L31
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r9 = r8.f9578a
            float r10 = r8.f9579b
            r0 = 0
            r9.m12274a(r10, r3, r0)
            return
        L31:
            int r5 = r8.f9580c
            r6 = 1
            if (r5 == 0) goto L4d
            if (r5 == r6) goto L48
            r7 = 2
            if (r5 == r7) goto L43
            r7 = 4
            if (r5 == r7) goto L3f
            goto L52
        L3f:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L48
        L43:
            float r9 = r8.f9579b
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L52
        L48:
            float r10 = r8.f9579b
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L52
        L4d:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L43
            goto L48
        L52:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r10 = r8.f9578a
            float r1 = r8.f9579b
            r10.m12274a(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p048ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f10) {
        if (this.f9579b != f10) {
            this.f9579b = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC4764b interfaceC4764b) {
    }

    public void setResizeMode(int i10) {
        if (this.f9580c != i10) {
            this.f9580c = i10;
            requestLayout();
        }
    }
}
