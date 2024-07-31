package com.google.android.exoplayer2.p048ui;

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
import p120g8.C7484b;
import p329r8.C10636a;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: com.google.android.exoplayer2.ui.f */
/* loaded from: classes.dex */
final class C4775f {

    /* renamed from: A */
    private int f9632A;

    /* renamed from: B */
    private int f9633B;

    /* renamed from: C */
    private int f9634C;

    /* renamed from: D */
    private int f9635D;

    /* renamed from: E */
    private StaticLayout f9636E;

    /* renamed from: F */
    private StaticLayout f9637F;

    /* renamed from: G */
    private int f9638G;

    /* renamed from: H */
    private int f9639H;

    /* renamed from: I */
    private int f9640I;

    /* renamed from: J */
    private Rect f9641J;

    /* renamed from: a */
    private final float f9642a;

    /* renamed from: b */
    private final float f9643b;

    /* renamed from: c */
    private final float f9644c;

    /* renamed from: d */
    private final float f9645d;

    /* renamed from: e */
    private final float f9646e;

    /* renamed from: f */
    private final TextPaint f9647f;

    /* renamed from: g */
    private final Paint f9648g;

    /* renamed from: h */
    private final Paint f9649h;

    /* renamed from: i */
    private CharSequence f9650i;

    /* renamed from: j */
    private Layout.Alignment f9651j;

    /* renamed from: k */
    private Bitmap f9652k;

    /* renamed from: l */
    private float f9653l;

    /* renamed from: m */
    private int f9654m;

    /* renamed from: n */
    private int f9655n;

    /* renamed from: o */
    private float f9656o;

    /* renamed from: p */
    private int f9657p;

    /* renamed from: q */
    private float f9658q;

    /* renamed from: r */
    private float f9659r;

    /* renamed from: s */
    private int f9660s;

    /* renamed from: t */
    private int f9661t;

    /* renamed from: u */
    private int f9662u;

    /* renamed from: v */
    private int f9663v;

    /* renamed from: w */
    private int f9664w;

    /* renamed from: x */
    private float f9665x;

    /* renamed from: y */
    private float f9666y;

    /* renamed from: z */
    private float f9667z;

    public C4775f(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f9646e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f9645d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f9642a = round;
        this.f9643b = round;
        this.f9644c = round;
        TextPaint textPaint = new TextPaint();
        this.f9647f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f9648g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f9649h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    private static boolean m12310a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* renamed from: c */
    private void m12311c(Canvas canvas) {
        canvas.drawBitmap(this.f9652k, (Rect) null, this.f9641J, this.f9649h);
    }

    /* renamed from: d */
    private void m12312d(Canvas canvas, boolean z10) {
        if (z10) {
            m12313e(canvas);
            return;
        }
        C11137a.m34603e(this.f9641J);
        C11137a.m34603e(this.f9652k);
        m12311c(canvas);
    }

    /* renamed from: e */
    private void m12313e(Canvas canvas) {
        StaticLayout staticLayout = this.f9636E;
        StaticLayout staticLayout2 = this.f9637F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.f9638G, this.f9639H);
        if (Color.alpha(this.f9662u) > 0) {
            this.f9648g.setColor(this.f9662u);
            canvas.drawRect(-this.f9640I, 0.0f, staticLayout.getWidth() + this.f9640I, staticLayout.getHeight(), this.f9648g);
        }
        int i10 = this.f9664w;
        if (i10 == 1) {
            this.f9647f.setStrokeJoin(Paint.Join.ROUND);
            this.f9647f.setStrokeWidth(this.f9642a);
            this.f9647f.setColor(this.f9663v);
            this.f9647f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f9647f;
            float f10 = this.f9643b;
            float f11 = this.f9644c;
            textPaint.setShadowLayer(f10, f11, f11, this.f9663v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f9663v;
            int i12 = z10 ? this.f9663v : -1;
            float f12 = this.f9643b / 2.0f;
            this.f9647f.setColor(this.f9660s);
            this.f9647f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f9647f.setShadowLayer(this.f9643b, f13, f13, i11);
            staticLayout2.draw(canvas);
            this.f9647f.setShadowLayer(this.f9643b, f12, f12, i12);
        }
        this.f9647f.setColor(this.f9660s);
        this.f9647f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f9647f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m12314f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f9652k
            int r1 = r7.f9634C
            int r2 = r7.f9632A
            int r1 = r1 - r2
            int r3 = r7.f9635D
            int r4 = r7.f9633B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f9656o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f9653l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f9658q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f9659r
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
            int r3 = r7.f9657p
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
            int r3 = r7.f9655n
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
            r7.f9641J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p048ui.C4775f.m12314f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m12315g() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p048ui.C4775f.m12315g():void");
    }

    /* renamed from: b */
    public void m12316b(C7484b c7484b, C10636a c10636a, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = c7484b.f17659d == null;
        if (!z10) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(c7484b.f17656a)) {
            return;
        } else {
            i14 = c7484b.f17667w ? c7484b.f17668x : c10636a.f26878c;
        }
        if (m12310a(this.f9650i, c7484b.f17656a) && C11172r0.m34914c(this.f9651j, c7484b.f17657b) && this.f9652k == c7484b.f17659d && this.f9653l == c7484b.f17660e && this.f9654m == c7484b.f17661f && C11172r0.m34914c(Integer.valueOf(this.f9655n), Integer.valueOf(c7484b.f17662r)) && this.f9656o == c7484b.f17663s && C11172r0.m34914c(Integer.valueOf(this.f9657p), Integer.valueOf(c7484b.f17664t)) && this.f9658q == c7484b.f17665u && this.f9659r == c7484b.f17666v && this.f9660s == c10636a.f26876a && this.f9661t == c10636a.f26877b && this.f9662u == i14 && this.f9664w == c10636a.f26879d && this.f9663v == c10636a.f26880e && C11172r0.m34914c(this.f9647f.getTypeface(), c10636a.f26881f) && this.f9665x == f10 && this.f9666y == f11 && this.f9667z == f12 && this.f9632A == i10 && this.f9633B == i11 && this.f9634C == i12 && this.f9635D == i13) {
            m12312d(canvas, z10);
            return;
        }
        this.f9650i = c7484b.f17656a;
        this.f9651j = c7484b.f17657b;
        this.f9652k = c7484b.f17659d;
        this.f9653l = c7484b.f17660e;
        this.f9654m = c7484b.f17661f;
        this.f9655n = c7484b.f17662r;
        this.f9656o = c7484b.f17663s;
        this.f9657p = c7484b.f17664t;
        this.f9658q = c7484b.f17665u;
        this.f9659r = c7484b.f17666v;
        this.f9660s = c10636a.f26876a;
        this.f9661t = c10636a.f26877b;
        this.f9662u = i14;
        this.f9664w = c10636a.f26879d;
        this.f9663v = c10636a.f26880e;
        this.f9647f.setTypeface(c10636a.f26881f);
        this.f9665x = f10;
        this.f9666y = f11;
        this.f9667z = f12;
        this.f9632A = i10;
        this.f9633B = i11;
        this.f9634C = i12;
        this.f9635D = i13;
        if (z10) {
            C11137a.m34603e(this.f9650i);
            m12315g();
        } else {
            C11137a.m34603e(this.f9652k);
            m12314f();
        }
        m12312d(canvas, z10);
    }
}
