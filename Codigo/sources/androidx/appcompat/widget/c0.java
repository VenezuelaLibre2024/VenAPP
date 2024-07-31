package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.f;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a */
    private final TextView f1397a;

    /* renamed from: b */
    private j1 f1398b;

    /* renamed from: c */
    private j1 f1399c;

    /* renamed from: d */
    private j1 f1400d;

    /* renamed from: e */
    private j1 f1401e;

    /* renamed from: f */
    private j1 f1402f;

    /* renamed from: g */
    private j1 f1403g;

    /* renamed from: h */
    private j1 f1404h;

    /* renamed from: i */
    private final j0 f1405i;

    /* renamed from: j */
    private int f1406j = 0;

    /* renamed from: k */
    private int f1407k = -1;

    /* renamed from: l */
    private Typeface f1408l;

    /* renamed from: m */
    private boolean f1409m;

    /* loaded from: classes.dex */
    public class a extends f.e {

        /* renamed from: a */
        final /* synthetic */ int f1410a;

        /* renamed from: b */
        final /* synthetic */ int f1411b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1412c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1410a = i10;
            this.f1411b = i11;
            this.f1412c = weakReference;
        }

        @Override // androidx.core.content.res.f.e
        /* renamed from: h */
        public void f(int i10) {
        }

        @Override // androidx.core.content.res.f.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1410a) != -1) {
                typeface = f.a(typeface, i10, (this.f1411b & 2) != 0);
            }
            c0.this.n(this.f1412c, typeface);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f1414a;

        /* renamed from: b */
        final /* synthetic */ Typeface f1415b;

        /* renamed from: c */
        final /* synthetic */ int f1416c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f1414a = textView;
            this.f1415b = typeface;
            this.f1416c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1414a.setTypeface(this.f1415b, this.f1416c);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {
        static int a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            Typeface create;
            create = Typeface.create(typeface, i10, z10);
            return create;
        }
    }

    public c0(TextView textView) {
        this.f1397a = textView;
        this.f1405i = new j0(textView);
    }

    private void B(int i10, float f10) {
        this.f1405i.t(i10, f10);
    }

    private void C(Context context, l1 l1Var) {
        String n10;
        Typeface create;
        Typeface typeface;
        this.f1406j = l1Var.j(g.j.H2, this.f1406j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int j10 = l1Var.j(g.j.J2, -1);
            this.f1407k = j10;
            if (j10 != -1) {
                this.f1406j = (this.f1406j & 2) | 0;
            }
        }
        int i11 = g.j.I2;
        if (!l1Var.r(i11) && !l1Var.r(g.j.K2)) {
            int i12 = g.j.G2;
            if (l1Var.r(i12)) {
                this.f1409m = false;
                int j11 = l1Var.j(i12, 1);
                if (j11 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (j11 == 2) {
                    typeface = Typeface.SERIF;
                } else if (j11 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1408l = typeface;
                return;
            }
            return;
        }
        this.f1408l = null;
        int i13 = g.j.K2;
        if (l1Var.r(i13)) {
            i11 = i13;
        }
        int i14 = this.f1407k;
        int i15 = this.f1406j;
        if (!context.isRestricted()) {
            try {
                Typeface i16 = l1Var.i(i11, this.f1406j, new a(i14, i15, new WeakReference(this.f1397a)));
                if (i16 != null) {
                    if (i10 >= 28 && this.f1407k != -1) {
                        i16 = f.a(Typeface.create(i16, 0), this.f1407k, (this.f1406j & 2) != 0);
                    }
                    this.f1408l = i16;
                }
                this.f1409m = this.f1408l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1408l != null || (n10 = l1Var.n(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1407k == -1) {
            create = Typeface.create(n10, this.f1406j);
        } else {
            create = f.a(Typeface.create(n10, 0), this.f1407k, (this.f1406j & 2) != 0);
        }
        this.f1408l = create;
    }

    private void a(Drawable drawable, j1 j1Var) {
        if (drawable == null || j1Var == null) {
            return;
        }
        j.i(drawable, j1Var, this.f1397a.getDrawableState());
    }

    private static j1 d(Context context, j jVar, int i10) {
        ColorStateList f10 = jVar.f(context, i10);
        if (f10 == null) {
            return null;
        }
        j1 j1Var = new j1();
        j1Var.f1534d = true;
        j1Var.f1531a = f10;
        return j1Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a10 = c.a(this.f1397a);
            TextView textView = this.f1397a;
            if (drawable5 == null) {
                drawable5 = a10[0];
            }
            if (drawable2 == null) {
                drawable2 = a10[1];
            }
            if (drawable6 == null) {
                drawable6 = a10[2];
            }
            if (drawable4 == null) {
                drawable4 = a10[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] a11 = c.a(this.f1397a);
        Drawable drawable7 = a11[0];
        if (drawable7 != null || a11[2] != null) {
            TextView textView2 = this.f1397a;
            if (drawable2 == null) {
                drawable2 = a11[1];
            }
            Drawable drawable8 = a11[2];
            if (drawable4 == null) {
                drawable4 = a11[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1397a.getCompoundDrawables();
        TextView textView3 = this.f1397a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        j1 j1Var = this.f1404h;
        this.f1398b = j1Var;
        this.f1399c = j1Var;
        this.f1400d = j1Var;
        this.f1401e = j1Var;
        this.f1402f = j1Var;
        this.f1403g = j1Var;
    }

    public void A(int i10, float f10) {
        if (x1.f1702b || l()) {
            return;
        }
        B(i10, f10);
    }

    public void b() {
        if (this.f1398b != null || this.f1399c != null || this.f1400d != null || this.f1401e != null) {
            Drawable[] compoundDrawables = this.f1397a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1398b);
            a(compoundDrawables[1], this.f1399c);
            a(compoundDrawables[2], this.f1400d);
            a(compoundDrawables[3], this.f1401e);
        }
        if (this.f1402f == null && this.f1403g == null) {
            return;
        }
        Drawable[] a10 = c.a(this.f1397a);
        a(a10[0], this.f1402f);
        a(a10[2], this.f1403g);
    }

    public void c() {
        this.f1405i.a();
    }

    public int e() {
        return this.f1405i.f();
    }

    public int f() {
        return this.f1405i.g();
    }

    public int g() {
        return this.f1405i.h();
    }

    public int[] h() {
        return this.f1405i.i();
    }

    public int i() {
        return this.f1405i.j();
    }

    public ColorStateList j() {
        j1 j1Var = this.f1404h;
        if (j1Var != null) {
            return j1Var.f1531a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        j1 j1Var = this.f1404h;
        if (j1Var != null) {
            return j1Var.f1532b;
        }
        return null;
    }

    public boolean l() {
        return this.f1405i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c0.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1409m) {
            this.f1408l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (androidx.core.view.x0.G(textView)) {
                    textView.post(new b(textView, typeface, this.f1406j));
                } else {
                    textView.setTypeface(typeface, this.f1406j);
                }
            }
        }
    }

    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (x1.f1702b) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i10) {
        String n10;
        l1 s10 = l1.s(context, i10, g.j.E2);
        int i11 = g.j.M2;
        if (s10.r(i11)) {
            s(s10.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = g.j.F2;
        if (s10.r(i13) && s10.e(i13, -1) == 0) {
            this.f1397a.setTextSize(0, 0.0f);
        }
        C(context, s10);
        if (i12 >= 26) {
            int i14 = g.j.L2;
            if (s10.r(i14) && (n10 = s10.n(i14)) != null) {
                e.d(this.f1397a, n10);
            }
        }
        s10.v();
        Typeface typeface = this.f1408l;
        if (typeface != null) {
            this.f1397a.setTypeface(typeface, this.f1406j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        t0.d.f(editorInfo, textView.getText());
    }

    public void s(boolean z10) {
        this.f1397a.setAllCaps(z10);
    }

    public void t(int i10, int i11, int i12, int i13) {
        this.f1405i.p(i10, i11, i12, i13);
    }

    public void u(int[] iArr, int i10) {
        this.f1405i.q(iArr, i10);
    }

    public void v(int i10) {
        this.f1405i.r(i10);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f1404h == null) {
            this.f1404h = new j1();
        }
        j1 j1Var = this.f1404h;
        j1Var.f1531a = colorStateList;
        j1Var.f1534d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f1404h == null) {
            this.f1404h = new j1();
        }
        j1 j1Var = this.f1404h;
        j1Var.f1532b = mode;
        j1Var.f1533c = mode != null;
        z();
    }
}
