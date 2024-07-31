package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final c f8511a;

    /* renamed from: b, reason: collision with root package name */
    private float f8512b;

    /* renamed from: c, reason: collision with root package name */
    private int f8513c;

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    private final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private float f8514a;

        /* renamed from: b, reason: collision with root package name */
        private float f8515b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8516c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8517d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f8514a = f10;
            this.f8515b = f11;
            this.f8516c = z10;
            if (this.f8517d) {
                return;
            }
            this.f8517d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8517d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8513c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, r8.e.f24785a, 0, 0);
            try {
                this.f8513c = obtainStyledAttributes.getInt(r8.e.f24786b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f8511a = new c();
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f8513c;
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
            float r9 = r8.f8512b
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
            float r4 = r8.f8512b
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L31
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r9 = r8.f8511a
            float r10 = r8.f8512b
            r0 = 0
            r9.a(r10, r3, r0)
            return
        L31:
            int r5 = r8.f8513c
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
            float r9 = r8.f8512b
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L52
        L48:
            float r10 = r8.f8512b
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L52
        L4d:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L43
            goto L48
        L52:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r10 = r8.f8511a
            float r1 = r8.f8512b
            r10.a(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f10) {
        if (this.f8512b != f10) {
            this.f8512b = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f8513c != i10) {
            this.f8513c = i10;
            requestLayout();
        }
    }
}
