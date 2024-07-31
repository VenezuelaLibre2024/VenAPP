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
import androidx.appcompat.widget.C0316a1;
import androidx.core.graphics.C0876a;
import p111g.C7377a;
import p111g.C7379c;
import p111g.C7380d;
import p111g.C7381e;
import p125h.C7605a;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public final class C0341j {

    /* renamed from: b */
    private static final PorterDuff.Mode f1783b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0341j f1784c;

    /* renamed from: a */
    private C0316a1 f1785a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.j$a */
    /* loaded from: classes.dex */
    public class a implements C0316a1.c {

        /* renamed from: a */
        private final int[] f1786a = {C7381e.f16765R, C7381e.f16763P, C7381e.f16767a};

        /* renamed from: b */
        private final int[] f1787b = {C7381e.f16781o, C7381e.f16749B, C7381e.f16786t, C7381e.f16782p, C7381e.f16783q, C7381e.f16785s, C7381e.f16784r};

        /* renamed from: c */
        private final int[] f1788c = {C7381e.f16762O, C7381e.f16764Q, C7381e.f16777k, C7381e.f16758K, C7381e.f16759L, C7381e.f16760M, C7381e.f16761N};

        /* renamed from: d */
        private final int[] f1789d = {C7381e.f16789w, C7381e.f16775i, C7381e.f16788v};

        /* renamed from: e */
        private final int[] f1790e = {C7381e.f16757J, C7381e.f16766S};

        /* renamed from: f */
        private final int[] f1791f = {C7381e.f16769c, C7381e.f16773g, C7381e.f16770d, C7381e.f16774h};

        a() {
        }

        /* renamed from: f */
        private boolean m1789f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m1790g(Context context) {
            return m1791h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m1791h(Context context, int i10) {
            int m1733c = C0334g1.m1733c(context, C7377a.f16719w);
            return new ColorStateList(new int[][]{C0334g1.f1749b, C0334g1.f1752e, C0334g1.f1750c, C0334g1.f1756i}, new int[]{C0334g1.m1732b(context, C7377a.f16717u), C0876a.m4489c(m1733c, i10), C0876a.m4489c(m1733c, i10), i10});
        }

        /* renamed from: i */
        private ColorStateList m1792i(Context context) {
            return m1791h(context, C0334g1.m1733c(context, C7377a.f16716t));
        }

        /* renamed from: j */
        private ColorStateList m1793j(Context context) {
            return m1791h(context, C0334g1.m1733c(context, C7377a.f16717u));
        }

        /* renamed from: k */
        private ColorStateList m1794k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i10 = C7377a.f16721y;
            ColorStateList m1735e = C0334g1.m1735e(context, i10);
            if (m1735e == null || !m1735e.isStateful()) {
                iArr[0] = C0334g1.f1749b;
                iArr2[0] = C0334g1.m1732b(context, i10);
                iArr[1] = C0334g1.f1753f;
                iArr2[1] = C0334g1.m1733c(context, C7377a.f16718v);
                iArr[2] = C0334g1.f1756i;
                iArr2[2] = C0334g1.m1733c(context, i10);
            } else {
                int[] iArr3 = C0334g1.f1749b;
                iArr[0] = iArr3;
                iArr2[0] = m1735e.getColorForState(iArr3, 0);
                iArr[1] = C0334g1.f1753f;
                iArr2[1] = C0334g1.m1733c(context, C7377a.f16718v);
                iArr[2] = C0334g1.f1756i;
                iArr2[2] = m1735e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m1795l(C0316a1 c0316a1, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable m1592i = c0316a1.m1592i(context, C7381e.f16753F);
            Drawable m1592i2 = c0316a1.m1592i(context, C7381e.f16754G);
            if ((m1592i instanceof BitmapDrawable) && m1592i.getIntrinsicWidth() == dimensionPixelSize && m1592i.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) m1592i;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                m1592i.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m1592i.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((m1592i2 instanceof BitmapDrawable) && m1592i2.getIntrinsicWidth() == dimensionPixelSize && m1592i2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) m1592i2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                m1592i2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m1592i2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m1796m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (C0360p0.m1906a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0341j.f1783b;
            }
            drawable.setColorFilter(C0341j.m1782e(i10, mode));
        }

        @Override // androidx.appcompat.widget.C0316a1.c
        /* renamed from: a */
        public Drawable mo1604a(C0316a1 c0316a1, Context context, int i10) {
            int i11;
            if (i10 == C7381e.f16776j) {
                return new LayerDrawable(new Drawable[]{c0316a1.m1592i(context, C7381e.f16775i), c0316a1.m1592i(context, C7381e.f16777k)});
            }
            if (i10 == C7381e.f16791y) {
                i11 = C7380d.f16741i;
            } else if (i10 == C7381e.f16790x) {
                i11 = C7380d.f16742j;
            } else {
                if (i10 != C7381e.f16792z) {
                    return null;
                }
                i11 = C7380d.f16743k;
            }
            return m1795l(c0316a1, context, i11);
        }

        @Override // androidx.appcompat.widget.C0316a1.c
        /* renamed from: b */
        public ColorStateList mo1605b(Context context, int i10) {
            if (i10 == C7381e.f16779m) {
                return C7605a.m23111a(context, C7379c.f16729e);
            }
            if (i10 == C7381e.f16756I) {
                return C7605a.m23111a(context, C7379c.f16732h);
            }
            if (i10 == C7381e.f16755H) {
                return m1794k(context);
            }
            if (i10 == C7381e.f16772f) {
                return m1793j(context);
            }
            if (i10 == C7381e.f16768b) {
                return m1790g(context);
            }
            if (i10 == C7381e.f16771e) {
                return m1792i(context);
            }
            if (i10 == C7381e.f16751D || i10 == C7381e.f16752E) {
                return C7605a.m23111a(context, C7379c.f16731g);
            }
            if (m1789f(this.f1787b, i10)) {
                return C0334g1.m1735e(context, C7377a.f16720x);
            }
            if (m1789f(this.f1790e, i10)) {
                return C7605a.m23111a(context, C7379c.f16728d);
            }
            if (m1789f(this.f1791f, i10)) {
                return C7605a.m23111a(context, C7379c.f16727c);
            }
            if (i10 == C7381e.f16748A) {
                return C7605a.m23111a(context, C7379c.f16730f);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
        @Override // androidx.appcompat.widget.C0316a1.c
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo1606c(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0341j.m1780a()
                int[] r1 = r7.f1786a
                boolean r1 = r7.m1789f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = p111g.C7377a.f16720x
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f1788c
                boolean r1 = r7.m1789f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = p111g.C7377a.f16718v
                goto L11
            L20:
                int[] r1 = r7.f1789d
                boolean r1 = r7.m1789f(r1, r9)
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
                int r1 = p111g.C7381e.f16787u
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
                int r1 = p111g.C7381e.f16778l
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = androidx.appcompat.widget.C0360p0.m1906a(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = androidx.appcompat.widget.C0334g1.m1733c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0341j.m1782e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0341j.a.mo1606c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C0316a1.c
        /* renamed from: d */
        public PorterDuff.Mode mo1607d(int i10) {
            if (i10 == C7381e.f16755H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0316a1.c
        /* renamed from: e */
        public boolean mo1608e(Context context, int i10, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int m1733c;
            if (i10 == C7381e.f16750C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = C7377a.f16720x;
                m1796m(findDrawableByLayerId2, C0334g1.m1733c(context, i11), C0341j.f1783b);
                m1796m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C0334g1.m1733c(context, i11), C0341j.f1783b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                m1733c = C0334g1.m1733c(context, C7377a.f16718v);
            } else {
                if (i10 != C7381e.f16791y && i10 != C7381e.f16790x && i10 != C7381e.f16792z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1796m(layerDrawable2.findDrawableByLayerId(R.id.background), C0334g1.m1732b(context, C7377a.f16720x), C0341j.f1783b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i12 = C7377a.f16718v;
                m1796m(findDrawableByLayerId3, C0334g1.m1733c(context, i12), C0341j.f1783b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                m1733c = C0334g1.m1733c(context, i12);
            }
            m1796m(findDrawableByLayerId, m1733c, C0341j.f1783b);
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized C0341j m1781b() {
        C0341j c0341j;
        synchronized (C0341j.class) {
            if (f1784c == null) {
                m1783h();
            }
            c0341j = f1784c;
        }
        return c0341j;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m1782e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter m1585k;
        synchronized (C0341j.class) {
            m1585k = C0316a1.m1585k(i10, mode);
        }
        return m1585k;
    }

    /* renamed from: h */
    public static synchronized void m1783h() {
        synchronized (C0341j.class) {
            if (f1784c == null) {
                C0341j c0341j = new C0341j();
                f1784c = c0341j;
                c0341j.f1785a = C0316a1.m1583g();
                f1784c.f1785a.m1598t(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m1784i(Drawable drawable, C0343j1 c0343j1, int[] iArr) {
        C0316a1.m1591v(drawable, c0343j1, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m1785c(Context context, int i10) {
        return this.f1785a.m1592i(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable m1786d(Context context, int i10, boolean z10) {
        return this.f1785a.m1593j(context, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList m1787f(Context context, int i10) {
        return this.f1785a.m1594l(context, i10);
    }

    /* renamed from: g */
    public synchronized void m1788g(Context context) {
        this.f1785a.m1596r(context);
    }
}
