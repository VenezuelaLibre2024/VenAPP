package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import t8.r0;

/* loaded from: classes.dex */
final class f {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* renamed from: a, reason: collision with root package name */
    private final float f8565a;

    /* renamed from: b, reason: collision with root package name */
    private final float f8566b;

    /* renamed from: c, reason: collision with root package name */
    private final float f8567c;

    /* renamed from: d, reason: collision with root package name */
    private final float f8568d;

    /* renamed from: e, reason: collision with root package name */
    private final float f8569e;

    /* renamed from: f, reason: collision with root package name */
    private final TextPaint f8570f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f8571g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f8572h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f8573i;

    /* renamed from: j, reason: collision with root package name */
    private Layout.Alignment f8574j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f8575k;

    /* renamed from: l, reason: collision with root package name */
    private float f8576l;

    /* renamed from: m, reason: collision with root package name */
    private int f8577m;

    /* renamed from: n, reason: collision with root package name */
    private int f8578n;

    /* renamed from: o, reason: collision with root package name */
    private float f8579o;

    /* renamed from: p, reason: collision with root package name */
    private int f8580p;

    /* renamed from: q, reason: collision with root package name */
    private float f8581q;

    /* renamed from: r, reason: collision with root package name */
    private float f8582r;

    /* renamed from: s, reason: collision with root package name */
    private int f8583s;

    /* renamed from: t, reason: collision with root package name */
    private int f8584t;

    /* renamed from: u, reason: collision with root package name */
    private int f8585u;

    /* renamed from: v, reason: collision with root package name */
    private int f8586v;

    /* renamed from: w, reason: collision with root package name */
    private int f8587w;

    /* renamed from: x, reason: collision with root package name */
    private float f8588x;

    /* renamed from: y, reason: collision with root package name */
    private float f8589y;

    /* renamed from: z, reason: collision with root package name */
    private float f8590z;

    public f(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f8569e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f8568d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f8565a = round;
        this.f8566b = round;
        this.f8567c = round;
        TextPaint textPaint = new TextPaint();
        this.f8570f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f8571g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f8572h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f8575k, (Rect) null, this.J, this.f8572h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        t8.a.e(this.J);
        t8.a.e(this.f8575k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f8585u) > 0) {
            this.f8571g.setColor(this.f8585u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f8571g);
        }
        int i10 = this.f8587w;
        if (i10 == 1) {
            this.f8570f.setStrokeJoin(Paint.Join.ROUND);
            this.f8570f.setStrokeWidth(this.f8565a);
            this.f8570f.setColor(this.f8586v);
            this.f8570f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f8570f;
            float f10 = this.f8566b;
            float f11 = this.f8567c;
            textPaint.setShadowLayer(f10, f11, f11, this.f8586v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f8586v;
            int i12 = z10 ? this.f8586v : -1;
            float f12 = this.f8566b / 2.0f;
            this.f8570f.setColor(this.f8583s);
            this.f8570f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f8570f.setShadowLayer(this.f8566b, f13, f13, i11);
            staticLayout2.draw(canvas);
            this.f8570f.setShadowLayer(this.f8566b, f12, f12, i12);
        }
        this.f8570f.setColor(this.f8583s);
        this.f8570f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f8570f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f8575k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f8579o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f8576l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f8581q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f8582r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L29
            goto L35
        L29:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
        L35:
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            int r3 = r7.f8580p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L43
            float r3 = (float) r1
        L41:
            float r2 = r2 - r3
            goto L49
        L43:
            if (r3 != r5) goto L49
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L41
        L49:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f8578n
            if (r3 != r6) goto L54
            float r3 = (float) r0
        L52:
            float r4 = r4 - r3
            goto L5a
        L54:
            if (r3 != r5) goto L5a
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L52
        L5a:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.f.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.f.g():void");
    }

    public void b(g8.b bVar, r8.a aVar, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = bVar.f16045d == null;
        if (!z10) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(bVar.f16042a)) {
            return;
        } else {
            i14 = bVar.f16053w ? bVar.f16054x : aVar.f24764c;
        }
        if (a(this.f8573i, bVar.f16042a) && r0.c(this.f8574j, bVar.f16043b) && this.f8575k == bVar.f16045d && this.f8576l == bVar.f16046e && this.f8577m == bVar.f16047f && r0.c(Integer.valueOf(this.f8578n), Integer.valueOf(bVar.f16048r)) && this.f8579o == bVar.f16049s && r0.c(Integer.valueOf(this.f8580p), Integer.valueOf(bVar.f16050t)) && this.f8581q == bVar.f16051u && this.f8582r == bVar.f16052v && this.f8583s == aVar.f24762a && this.f8584t == aVar.f24763b && this.f8585u == i14 && this.f8587w == aVar.f24765d && this.f8586v == aVar.f24766e && r0.c(this.f8570f.getTypeface(), aVar.f24767f) && this.f8588x == f10 && this.f8589y == f11 && this.f8590z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            d(canvas, z10);
            return;
        }
        this.f8573i = bVar.f16042a;
        this.f8574j = bVar.f16043b;
        this.f8575k = bVar.f16045d;
        this.f8576l = bVar.f16046e;
        this.f8577m = bVar.f16047f;
        this.f8578n = bVar.f16048r;
        this.f8579o = bVar.f16049s;
        this.f8580p = bVar.f16050t;
        this.f8581q = bVar.f16051u;
        this.f8582r = bVar.f16052v;
        this.f8583s = aVar.f24762a;
        this.f8584t = aVar.f24763b;
        this.f8585u = i14;
        this.f8587w = aVar.f24765d;
        this.f8586v = aVar.f24766e;
        this.f8570f.setTypeface(aVar.f24767f);
        this.f8588x = f10;
        this.f8589y = f11;
        this.f8590z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            t8.a.e(this.f8573i);
            g();
        } else {
            t8.a.e(this.f8575k);
            f();
        }
        d(canvas, z10);
    }
}
