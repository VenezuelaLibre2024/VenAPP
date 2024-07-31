package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.a1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b */
    private static final PorterDuff.Mode f1508b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static j f1509c;

    /* renamed from: a */
    private a1 f1510a;

    /* loaded from: classes.dex */
    public class a implements a1.c {

        /* renamed from: a */
        private final int[] f1511a = {g.e.R, g.e.P, g.e.f15312a};

        /* renamed from: b */
        private final int[] f1512b = {g.e.f15326o, g.e.B, g.e.f15331t, g.e.f15327p, g.e.f15328q, g.e.f15330s, g.e.f15329r};

        /* renamed from: c */
        private final int[] f1513c = {g.e.O, g.e.Q, g.e.f15322k, g.e.K, g.e.L, g.e.M, g.e.N};

        /* renamed from: d */
        private final int[] f1514d = {g.e.f15334w, g.e.f15320i, g.e.f15333v};

        /* renamed from: e */
        private final int[] f1515e = {g.e.J, g.e.S};

        /* renamed from: f */
        private final int[] f1516f = {g.e.f15314c, g.e.f15318g, g.e.f15315d, g.e.f15319h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = g1.c(context, g.a.f15283w);
            return new ColorStateList(new int[][]{g1.f1474b, g1.f1477e, g1.f1475c, g1.f1481i}, new int[]{g1.b(context, g.a.f15281u), androidx.core.graphics.a.c(c10, i10), androidx.core.graphics.a.c(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, g1.c(context, g.a.f15280t));
        }

        private ColorStateList j(Context context) {
            return h(context, g1.c(context, g.a.f15281u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i10 = g.a.f15285y;
            ColorStateList e10 = g1.e(context, i10);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = g1.f1474b;
                iArr2[0] = g1.b(context, i10);
                iArr[1] = g1.f1478f;
                iArr2[1] = g1.c(context, g.a.f15282v);
                iArr[2] = g1.f1481i;
                iArr2[2] = g1.c(context, i10);
            } else {
                int[] iArr3 = g1.f1474b;
                iArr[0] = iArr3;
                iArr2[0] = e10.getColorForState(iArr3, 0);
                iArr[1] = g1.f1478f;
                iArr2[1] = g1.c(context, g.a.f15282v);
                iArr[2] = g1.f1481i;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(a1 a1Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable i11 = a1Var.i(context, g.e.F);
            Drawable i12 = a1Var.i(context, g.e.G);
            if ((i11 instanceof BitmapDrawable) && i11.getIntrinsicWidth() == dimensionPixelSize && i11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) i11;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i11.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((i12 instanceof BitmapDrawable) && i12.getIntrinsicWidth() == dimensionPixelSize && i12.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i12;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i12.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i12.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (p0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f1508b;
            }
            drawable.setColorFilter(j.e(i10, mode));
        }

        @Override // androidx.appcompat.widget.a1.c
        public Drawable a(a1 a1Var, Context context, int i10) {
            int i11;
            if (i10 == g.e.f15321j) {
                return new LayerDrawable(new Drawable[]{a1Var.i(context, g.e.f15320i), a1Var.i(context, g.e.f15322k)});
            }
            if (i10 == g.e.f15336y) {
                i11 = g.d.f15305i;
            } else if (i10 == g.e.f15335x) {
                i11 = g.d.f15306j;
            } else {
                if (i10 != g.e.f15337z) {
                    return null;
                }
                i11 = g.d.f15307k;
            }
            return l(a1Var, context, i11);
        }

        @Override // androidx.appcompat.widget.a1.c
        public ColorStateList b(Context context, int i10) {
            if (i10 == g.e.f15324m) {
                return h.a.a(context, g.c.f15293e);
            }
            if (i10 == g.e.I) {
                return h.a.a(context, g.c.f15296h);
            }
            if (i10 == g.e.H) {
                return k(context);
            }
            if (i10 == g.e.f15317f) {
                return j(context);
            }
            if (i10 == g.e.f15313b) {
                return g(context);
            }
            if (i10 == g.e.f15316e) {
                return i(context);
            }
            if (i10 == g.e.D || i10 == g.e.E) {
                return h.a.a(context, g.c.f15295g);
            }
            if (f(this.f1512b, i10)) {
                return g1.e(context, g.a.f15284x);
            }
            if (f(this.f1515e, i10)) {
                return h.a.a(context, g.c.f15292d);
            }
            if (f(this.f1516f, i10)) {
                return h.a.a(context, g.c.f15291c);
            }
            if (i10 == g.e.A) {
                return h.a.a(context, g.c.f15294f);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
        @Override // androidx.appcompat.widget.a1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r7.f1511a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = g.a.f15284x
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f1513c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = g.a.f15282v
                goto L11
            L20:
                int[] r1 = r7.f1514d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = g.e.f15332u
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = g.e.f15323l
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = androidx.appcompat.widget.p0.a(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = androidx.appcompat.widget.g1.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.j.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.a1.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == g.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.a1.c
        public boolean e(Context context, int i10, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c10;
            if (i10 == g.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = g.a.f15284x;
                m(findDrawableByLayerId2, g1.c(context, i11), j.f1508b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), g1.c(context, i11), j.f1508b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                c10 = g1.c(context, g.a.f15282v);
            } else {
                if (i10 != g.e.f15336y && i10 != g.e.f15335x && i10 != g.e.f15337z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(R.id.background), g1.b(context, g.a.f15284x), j.f1508b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i12 = g.a.f15282v;
                m(findDrawableByLayerId3, g1.c(context, i12), j.f1508b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                c10 = g1.c(context, i12);
            }
            m(findDrawableByLayerId, c10, j.f1508b);
            return true;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f1509c == null) {
                h();
            }
            jVar = f1509c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter k10;
        synchronized (j.class) {
            k10 = a1.k(i10, mode);
        }
        return k10;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (f1509c == null) {
                j jVar = new j();
                f1509c = jVar;
                jVar.f1510a = a1.g();
                f1509c.f1510a.t(new a());
            }
        }
    }

    public static void i(Drawable drawable, j1 j1Var, int[] iArr) {
        a1.v(drawable, j1Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1510a.i(context, i10);
    }

    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1510a.j(context, i10, z10);
    }

    public synchronized ColorStateList f(Context context, int i10) {
        return this.f1510a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1510a.r(context);
    }
}
