package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.collection.C0735e;
import androidx.collection.C0736f;
import androidx.collection.C0738h;
import androidx.collection.C0739i;
import androidx.core.content.C0854a;
import androidx.core.graphics.drawable.C0888a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p034c2.C1838c;
import p167j.C8932b;

/* renamed from: androidx.appcompat.widget.a1 */
/* loaded from: classes.dex */
public final class C0316a1 {

    /* renamed from: i */
    private static C0316a1 f1620i;

    /* renamed from: a */
    private WeakHashMap<Context, C0739i<ColorStateList>> f1622a;

    /* renamed from: b */
    private C0738h<String, b> f1623b;

    /* renamed from: c */
    private C0739i<String> f1624c;

    /* renamed from: d */
    private final WeakHashMap<Context, C0735e<WeakReference<Drawable.ConstantState>>> f1625d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1626e;

    /* renamed from: f */
    private boolean f1627f;

    /* renamed from: g */
    private c f1628g;

    /* renamed from: h */
    private static final PorterDuff.Mode f1619h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final a f1621j = new a(6);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.a1$a */
    /* loaded from: classes.dex */
    public static class a extends C0736f<Integer, PorterDuffColorFilter> {
        public a(int i10) {
            super(i10);
        }

        /* renamed from: a */
        private static int m1600a(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        /* renamed from: b */
        PorterDuffColorFilter m1601b(int i10, PorterDuff.Mode mode) {
            return get(Integer.valueOf(m1600a(i10, mode)));
        }

        /* renamed from: c */
        PorterDuffColorFilter m1602c(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(m1600a(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.a1$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        Drawable m1603a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.a1$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        Drawable mo1604a(C0316a1 c0316a1, Context context, int i10);

        /* renamed from: b */
        ColorStateList mo1605b(Context context, int i10);

        /* renamed from: c */
        boolean mo1606c(Context context, int i10, Drawable drawable);

        /* renamed from: d */
        PorterDuff.Mode mo1607d(int i10);

        /* renamed from: e */
        boolean mo1608e(Context context, int i10, Drawable drawable);
    }

    /* renamed from: a */
    private synchronized boolean m1577a(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0735e<WeakReference<Drawable.ConstantState>> c0735e = this.f1625d.get(context);
        if (c0735e == null) {
            c0735e = new C0735e<>();
            this.f1625d.put(context, c0735e);
        }
        c0735e.m3687i(j10, new WeakReference<>(constantState));
        return true;
    }

    /* renamed from: b */
    private void m1578b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1622a == null) {
            this.f1622a = new WeakHashMap<>();
        }
        C0739i<ColorStateList> c0739i = this.f1622a.get(context);
        if (c0739i == null) {
            c0739i = new C0739i<>();
            this.f1622a.put(context, c0739i);
        }
        c0739i.m3717a(i10, colorStateList);
    }

    /* renamed from: c */
    private void m1579c(Context context) {
        if (this.f1627f) {
            return;
        }
        this.f1627f = true;
        Drawable m1592i = m1592i(context, C8932b.f21221a);
        if (m1592i == null || !m1588p(m1592i)) {
            this.f1627f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: d */
    private static long m1580d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: e */
    private Drawable m1581e(Context context, int i10) {
        if (this.f1626e == null) {
            this.f1626e = new TypedValue();
        }
        TypedValue typedValue = this.f1626e;
        context.getResources().getValue(i10, typedValue, true);
        long m1580d = m1580d(typedValue);
        Drawable m1584h = m1584h(context, m1580d);
        if (m1584h != null) {
            return m1584h;
        }
        c cVar = this.f1628g;
        Drawable mo1604a = cVar == null ? null : cVar.mo1604a(this, context, i10);
        if (mo1604a != null) {
            mo1604a.setChangingConfigurations(typedValue.changingConfigurations);
            m1577a(context, m1580d, mo1604a);
        }
        return mo1604a;
    }

    /* renamed from: f */
    private static PorterDuffColorFilter m1582f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1585k(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: g */
    public static synchronized C0316a1 m1583g() {
        C0316a1 c0316a1;
        synchronized (C0316a1.class) {
            if (f1620i == null) {
                C0316a1 c0316a12 = new C0316a1();
                f1620i = c0316a12;
                m1587o(c0316a12);
            }
            c0316a1 = f1620i;
        }
        return c0316a1;
    }

    /* renamed from: h */
    private synchronized Drawable m1584h(Context context, long j10) {
        C0735e<WeakReference<Drawable.ConstantState>> c0735e = this.f1625d.get(context);
        if (c0735e == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m3683d = c0735e.m3683d(j10);
        if (m3683d != null) {
            Drawable.ConstantState constantState = m3683d.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c0735e.m3688j(j10);
        }
        return null;
    }

    /* renamed from: k */
    public static synchronized PorterDuffColorFilter m1585k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter m1601b;
        synchronized (C0316a1.class) {
            a aVar = f1621j;
            m1601b = aVar.m1601b(i10, mode);
            if (m1601b == null) {
                m1601b = new PorterDuffColorFilter(i10, mode);
                aVar.m1602c(i10, mode, m1601b);
            }
        }
        return m1601b;
    }

    /* renamed from: m */
    private ColorStateList m1586m(Context context, int i10) {
        C0739i<ColorStateList> c0739i;
        WeakHashMap<Context, C0739i<ColorStateList>> weakHashMap = this.f1622a;
        if (weakHashMap == null || (c0739i = weakHashMap.get(context)) == null) {
            return null;
        }
        return c0739i.m3720e(i10);
    }

    /* renamed from: o */
    private static void m1587o(C0316a1 c0316a1) {
    }

    /* renamed from: p */
    private static boolean m1588p(Drawable drawable) {
        return (drawable instanceof C1838c) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: q */
    private Drawable m1589q(Context context, int i10) {
        int next;
        C0738h<String, b> c0738h = this.f1623b;
        if (c0738h == null || c0738h.isEmpty()) {
            return null;
        }
        C0739i<String> c0739i = this.f1624c;
        if (c0739i != null) {
            String m3720e = c0739i.m3720e(i10);
            if ("appcompat_skip_skip".equals(m3720e) || (m3720e != null && this.f1623b.get(m3720e) == null)) {
                return null;
            }
        } else {
            this.f1624c = new C0739i<>();
        }
        if (this.f1626e == null) {
            this.f1626e = new TypedValue();
        }
        TypedValue typedValue = this.f1626e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long m1580d = m1580d(typedValue);
        Drawable m1584h = m1584h(context, m1580d);
        if (m1584h != null) {
            return m1584h;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1624c.m3717a(i10, name);
                b bVar = this.f1623b.get(name);
                if (bVar != null) {
                    m1584h = bVar.m1603a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m1584h != null) {
                    m1584h.setChangingConfigurations(typedValue.changingConfigurations);
                    m1577a(context, m1580d, m1584h);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (m1584h == null) {
            this.f1624c.m3717a(i10, "appcompat_skip_skip");
        }
        return m1584h;
    }

    /* renamed from: u */
    private Drawable m1590u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m1594l = m1594l(context, i10);
        if (m1594l == null) {
            c cVar = this.f1628g;
            if ((cVar == null || !cVar.mo1608e(context, i10, drawable)) && !m1599w(context, i10, drawable) && z10) {
                return null;
            }
            return drawable;
        }
        if (C0360p0.m1906a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable m4545i = C0888a.m4545i(drawable);
        C0888a.m4543g(m4545i, m1594l);
        PorterDuff.Mode m1595n = m1595n(i10);
        if (m1595n == null) {
            return m4545i;
        }
        C0888a.m4544h(m4545i, m1595n);
        return m4545i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static void m1591v(Drawable drawable, C0343j1 c0343j1, int[] iArr) {
        int[] state = drawable.getState();
        if (C0360p0.m1906a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = c0343j1.f1809d;
        if (z10 || c0343j1.f1808c) {
            drawable.setColorFilter(m1582f(z10 ? c0343j1.f1806a : null, c0343j1.f1808c ? c0343j1.f1807b : f1619h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: i */
    public synchronized Drawable m1592i(Context context, int i10) {
        return m1593j(context, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized Drawable m1593j(Context context, int i10, boolean z10) {
        Drawable m1589q;
        m1579c(context);
        m1589q = m1589q(context, i10);
        if (m1589q == null) {
            m1589q = m1581e(context, i10);
        }
        if (m1589q == null) {
            m1589q = C0854a.getDrawable(context, i10);
        }
        if (m1589q != null) {
            m1589q = m1590u(context, i10, z10, m1589q);
        }
        if (m1589q != null) {
            C0360p0.m1907b(m1589q);
        }
        return m1589q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized ColorStateList m1594l(Context context, int i10) {
        ColorStateList m1586m;
        m1586m = m1586m(context, i10);
        if (m1586m == null) {
            c cVar = this.f1628g;
            m1586m = cVar == null ? null : cVar.mo1605b(context, i10);
            if (m1586m != null) {
                m1578b(context, i10, m1586m);
            }
        }
        return m1586m;
    }

    /* renamed from: n */
    PorterDuff.Mode m1595n(int i10) {
        c cVar = this.f1628g;
        if (cVar == null) {
            return null;
        }
        return cVar.mo1607d(i10);
    }

    /* renamed from: r */
    public synchronized void m1596r(Context context) {
        C0735e<WeakReference<Drawable.ConstantState>> c0735e = this.f1625d.get(context);
        if (c0735e != null) {
            c0735e.m3681a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public synchronized Drawable m1597s(Context context, C0382w1 c0382w1, int i10) {
        Drawable m1589q = m1589q(context, i10);
        if (m1589q == null) {
            m1589q = c0382w1.m1613a(i10);
        }
        if (m1589q == null) {
            return null;
        }
        return m1590u(context, i10, false, m1589q);
    }

    /* renamed from: t */
    public synchronized void m1598t(c cVar) {
        this.f1628g = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean m1599w(Context context, int i10, Drawable drawable) {
        c cVar = this.f1628g;
        return cVar != null && cVar.mo1606c(context, i10, drawable);
    }
}
