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
import androidx.core.content.res.C0871f;
import androidx.core.view.C1116x0;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p111g.C7386j;
import p355t0.C10964d;

/* renamed from: androidx.appcompat.widget.c0 */
/* loaded from: classes.dex */
class C0321c0 {

    /* renamed from: a */
    private final TextView f1662a;

    /* renamed from: b */
    private C0343j1 f1663b;

    /* renamed from: c */
    private C0343j1 f1664c;

    /* renamed from: d */
    private C0343j1 f1665d;

    /* renamed from: e */
    private C0343j1 f1666e;

    /* renamed from: f */
    private C0343j1 f1667f;

    /* renamed from: g */
    private C0343j1 f1668g;

    /* renamed from: h */
    private C0343j1 f1669h;

    /* renamed from: i */
    private final C0342j0 f1670i;

    /* renamed from: j */
    private int f1671j = 0;

    /* renamed from: k */
    private int f1672k = -1;

    /* renamed from: l */
    private Typeface f1673l;

    /* renamed from: m */
    private boolean f1674m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.c0$a */
    /* loaded from: classes.dex */
    public class a extends C0871f.e {

        /* renamed from: a */
        final /* synthetic */ int f1675a;

        /* renamed from: b */
        final /* synthetic */ int f1676b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1677c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1675a = i10;
            this.f1676b = i11;
            this.f1677c = weakReference;
        }

        @Override // androidx.core.content.res.C0871f.e
        /* renamed from: h */
        public void m4468f(int i10) {
        }

        @Override // androidx.core.content.res.C0871f.e
        /* renamed from: i */
        public void m4469g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1675a) != -1) {
                typeface = f.m1675a(typeface, i10, (this.f1676b & 2) != 0);
            }
            C0321c0.this.m1653n(this.f1677c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.c0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f1679a;

        /* renamed from: b */
        final /* synthetic */ Typeface f1680b;

        /* renamed from: c */
        final /* synthetic */ int f1681c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f1679a = textView;
            this.f1680b = typeface;
            this.f1681c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1679a.setTypeface(this.f1680b, this.f1681c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.c0$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static Drawable[] m1666a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static void m1667b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        static void m1668c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$d */
    /* loaded from: classes.dex */
    static class d {
        /* renamed from: a */
        static LocaleList m1669a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: b */
        static void m1670b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$e */
    /* loaded from: classes.dex */
    static class e {
        /* renamed from: a */
        static int m1671a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        /* renamed from: b */
        static void m1672b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        /* renamed from: c */
        static void m1673c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        /* renamed from: d */
        static boolean m1674d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.c0$f */
    /* loaded from: classes.dex */
    public static class f {
        /* renamed from: a */
        static Typeface m1675a(Typeface typeface, int i10, boolean z10) {
            Typeface create;
            create = Typeface.create(typeface, i10, z10);
            return create;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0321c0(TextView textView) {
        this.f1662a = textView;
        this.f1670i = new C0342j0(textView);
    }

    /* renamed from: B */
    private void m1635B(int i10, float f10) {
        this.f1670i.m1822t(i10, f10);
    }

    /* renamed from: C */
    private void m1636C(Context context, C0349l1 c0349l1) {
        String m1859n;
        Typeface create;
        Typeface typeface;
        this.f1671j = c0349l1.m1855j(C7386j.f16906H2, this.f1671j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int m1855j = c0349l1.m1855j(C7386j.f16914J2, -1);
            this.f1672k = m1855j;
            if (m1855j != -1) {
                this.f1671j = (this.f1671j & 2) | 0;
            }
        }
        int i11 = C7386j.f16910I2;
        if (!c0349l1.m1863r(i11) && !c0349l1.m1863r(C7386j.f16918K2)) {
            int i12 = C7386j.f16902G2;
            if (c0349l1.m1863r(i12)) {
                this.f1674m = false;
                int m1855j2 = c0349l1.m1855j(i12, 1);
                if (m1855j2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (m1855j2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (m1855j2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1673l = typeface;
                return;
            }
            return;
        }
        this.f1673l = null;
        int i13 = C7386j.f16918K2;
        if (c0349l1.m1863r(i13)) {
            i11 = i13;
        }
        int i14 = this.f1672k;
        int i15 = this.f1671j;
        if (!context.isRestricted()) {
            try {
                Typeface m1854i = c0349l1.m1854i(i11, this.f1671j, new a(i14, i15, new WeakReference(this.f1662a)));
                if (m1854i != null) {
                    if (i10 >= 28 && this.f1672k != -1) {
                        m1854i = f.m1675a(Typeface.create(m1854i, 0), this.f1672k, (this.f1671j & 2) != 0);
                    }
                    this.f1673l = m1854i;
                }
                this.f1674m = this.f1673l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1673l != null || (m1859n = c0349l1.m1859n(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1672k == -1) {
            create = Typeface.create(m1859n, this.f1671j);
        } else {
            create = f.m1675a(Typeface.create(m1859n, 0), this.f1672k, (this.f1671j & 2) != 0);
        }
        this.f1673l = create;
    }

    /* renamed from: a */
    private void m1637a(Drawable drawable, C0343j1 c0343j1) {
        if (drawable == null || c0343j1 == null) {
            return;
        }
        C0341j.m1784i(drawable, c0343j1, this.f1662a.getDrawableState());
    }

    /* renamed from: d */
    private static C0343j1 m1638d(Context context, C0341j c0341j, int i10) {
        ColorStateList m1787f = c0341j.m1787f(context, i10);
        if (m1787f == null) {
            return null;
        }
        C0343j1 c0343j1 = new C0343j1();
        c0343j1.f1809d = true;
        c0343j1.f1806a = m1787f;
        return c0343j1;
    }

    /* renamed from: y */
    private void m1639y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] m1666a = c.m1666a(this.f1662a);
            TextView textView = this.f1662a;
            if (drawable5 == null) {
                drawable5 = m1666a[0];
            }
            if (drawable2 == null) {
                drawable2 = m1666a[1];
            }
            if (drawable6 == null) {
                drawable6 = m1666a[2];
            }
            if (drawable4 == null) {
                drawable4 = m1666a[3];
            }
            c.m1667b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] m1666a2 = c.m1666a(this.f1662a);
        Drawable drawable7 = m1666a2[0];
        if (drawable7 != null || m1666a2[2] != null) {
            TextView textView2 = this.f1662a;
            if (drawable2 == null) {
                drawable2 = m1666a2[1];
            }
            Drawable drawable8 = m1666a2[2];
            if (drawable4 == null) {
                drawable4 = m1666a2[3];
            }
            c.m1667b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1662a.getCompoundDrawables();
        TextView textView3 = this.f1662a;
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

    /* renamed from: z */
    private void m1640z() {
        C0343j1 c0343j1 = this.f1669h;
        this.f1663b = c0343j1;
        this.f1664c = c0343j1;
        this.f1665d = c0343j1;
        this.f1666e = c0343j1;
        this.f1667f = c0343j1;
        this.f1668g = c0343j1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m1641A(int i10, float f10) {
        if (C0385x1.f1996b || m1651l()) {
            return;
        }
        m1635B(i10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1642b() {
        if (this.f1663b != null || this.f1664c != null || this.f1665d != null || this.f1666e != null) {
            Drawable[] compoundDrawables = this.f1662a.getCompoundDrawables();
            m1637a(compoundDrawables[0], this.f1663b);
            m1637a(compoundDrawables[1], this.f1664c);
            m1637a(compoundDrawables[2], this.f1665d);
            m1637a(compoundDrawables[3], this.f1666e);
        }
        if (this.f1667f == null && this.f1668g == null) {
            return;
        }
        Drawable[] m1666a = c.m1666a(this.f1662a);
        m1637a(m1666a[0], this.f1667f);
        m1637a(m1666a[2], this.f1668g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1643c() {
        this.f1670i.m1809a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m1644e() {
        return this.f1670i.m1811f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m1645f() {
        return this.f1670i.m1812g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m1646g() {
        return this.f1670i.m1813h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] m1647h() {
        return this.f1670i.m1814i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m1648i() {
        return this.f1670i.m1815j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m1649j() {
        C0343j1 c0343j1 = this.f1669h;
        if (c0343j1 != null) {
            return c0343j1.f1806a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode m1650k() {
        C0343j1 c0343j1 = this.f1669h;
        if (c0343j1 != null) {
            return c0343j1.f1807b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m1651l() {
        return this.f1670i.m1817n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1652m(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0321c0.m1652m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    void m1653n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1674m) {
            this.f1673l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C1116x0.m5242G(textView)) {
                    textView.post(new b(textView, typeface, this.f1671j));
                } else {
                    textView.setTypeface(typeface, this.f1671j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m1654o(boolean z10, int i10, int i11, int i12, int i13) {
        if (C0385x1.f1996b) {
            return;
        }
        m1643c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m1655p() {
        m1642b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m1656q(Context context, int i10) {
        String m1859n;
        C0349l1 m1843s = C0349l1.m1843s(context, i10, C7386j.f16894E2);
        int i11 = C7386j.f16926M2;
        if (m1843s.m1863r(i11)) {
            m1658s(m1843s.m1846a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = C7386j.f16898F2;
        if (m1843s.m1863r(i13) && m1843s.m1850e(i13, -1) == 0) {
            this.f1662a.setTextSize(0, 0.0f);
        }
        m1636C(context, m1843s);
        if (i12 >= 26) {
            int i14 = C7386j.f16922L2;
            if (m1843s.m1863r(i14) && (m1859n = m1843s.m1859n(i14)) != null) {
                e.m1674d(this.f1662a, m1859n);
            }
        }
        m1843s.m1864v();
        Typeface typeface = this.f1673l;
        if (typeface != null) {
            this.f1662a.setTypeface(typeface, this.f1671j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m1657r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C10964d.m33457f(editorInfo, textView.getText());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m1658s(boolean z10) {
        this.f1662a.setAllCaps(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m1659t(int i10, int i11, int i12, int i13) {
        this.f1670i.m1819p(i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m1660u(int[] iArr, int i10) {
        this.f1670i.m1820q(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m1661v(int i10) {
        this.f1670i.m1821r(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m1662w(ColorStateList colorStateList) {
        if (this.f1669h == null) {
            this.f1669h = new C0343j1();
        }
        C0343j1 c0343j1 = this.f1669h;
        c0343j1.f1806a = colorStateList;
        c0343j1.f1809d = colorStateList != null;
        m1640z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m1663x(PorterDuff.Mode mode) {
        if (this.f1669h == null) {
            this.f1669h = new C0343j1();
        }
        C0343j1 c0343j1 = this.f1669h;
        c0343j1.f1807b = mode;
        c0343j1.f1808c = mode != null;
        m1640z();
    }
}
