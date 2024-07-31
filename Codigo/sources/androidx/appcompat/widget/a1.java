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
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: i */
    private static a1 f1370i;

    /* renamed from: a */
    private WeakHashMap<Context, androidx.collection.i<ColorStateList>> f1372a;

    /* renamed from: b */
    private androidx.collection.h<String, b> f1373b;

    /* renamed from: c */
    private androidx.collection.i<String> f1374c;

    /* renamed from: d */
    private final WeakHashMap<Context, androidx.collection.e<WeakReference<Drawable.ConstantState>>> f1375d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1376e;

    /* renamed from: f */
    private boolean f1377f;

    /* renamed from: g */
    private c f1378g;

    /* renamed from: h */
    private static final PorterDuff.Mode f1369h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final a f1371j = new a(6);

    /* loaded from: classes.dex */
    public static class a extends androidx.collection.f<Integer, PorterDuffColorFilter> {
        public a(int i10) {
            super(i10);
        }

        private static int a(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter b(int i10, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i10, mode)));
        }

        PorterDuffColorFilter c(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i10, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface c {
        Drawable a(a1 a1Var, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1375d.get(context);
        if (eVar == null) {
            eVar = new androidx.collection.e<>();
            this.f1375d.put(context, eVar);
        }
        eVar.i(j10, new WeakReference<>(constantState));
        return true;
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1372a == null) {
            this.f1372a = new WeakHashMap<>();
        }
        androidx.collection.i<ColorStateList> iVar = this.f1372a.get(context);
        if (iVar == null) {
            iVar = new androidx.collection.i<>();
            this.f1372a.put(context, iVar);
        }
        iVar.a(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f1377f) {
            return;
        }
        this.f1377f = true;
        Drawable i10 = i(context, j.b.f19470a);
        if (i10 == null || !p(i10)) {
            this.f1377f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable e(Context context, int i10) {
        if (this.f1376e == null) {
            this.f1376e = new TypedValue();
        }
        TypedValue typedValue = this.f1376e;
        context.getResources().getValue(i10, typedValue, true);
        long d10 = d(typedValue);
        Drawable h10 = h(context, d10);
        if (h10 != null) {
            return h10;
        }
        c cVar = this.f1378g;
        Drawable a10 = cVar == null ? null : cVar.a(this, context, i10);
        if (a10 != null) {
            a10.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d10, a10);
        }
        return a10;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized a1 g() {
        a1 a1Var;
        synchronized (a1.class) {
            if (f1370i == null) {
                a1 a1Var2 = new a1();
                f1370i = a1Var2;
                o(a1Var2);
            }
            a1Var = f1370i;
        }
        return a1Var;
    }

    private synchronized Drawable h(Context context, long j10) {
        androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1375d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> d10 = eVar.d(j10);
        if (d10 != null) {
            Drawable.ConstantState constantState = d10.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.j(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter b10;
        synchronized (a1.class) {
            a aVar = f1371j;
            b10 = aVar.b(i10, mode);
            if (b10 == null) {
                b10 = new PorterDuffColorFilter(i10, mode);
                aVar.c(i10, mode, b10);
            }
        }
        return b10;
    }

    private ColorStateList m(Context context, int i10) {
        androidx.collection.i<ColorStateList> iVar;
        WeakHashMap<Context, androidx.collection.i<ColorStateList>> weakHashMap = this.f1372a;
        if (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return iVar.e(i10);
    }

    private static void o(a1 a1Var) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof c2.c) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i10) {
        int next;
        androidx.collection.h<String, b> hVar = this.f1373b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        androidx.collection.i<String> iVar = this.f1374c;
        if (iVar != null) {
            String e10 = iVar.e(i10);
            if ("appcompat_skip_skip".equals(e10) || (e10 != null && this.f1373b.get(e10) == null)) {
                return null;
            }
        } else {
            this.f1374c = new androidx.collection.i<>();
        }
        if (this.f1376e == null) {
            this.f1376e = new TypedValue();
        }
        TypedValue typedValue = this.f1376e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long d10 = d(typedValue);
        Drawable h10 = h(context, d10);
        if (h10 != null) {
            return h10;
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
                this.f1374c.a(i10, name);
                b bVar = this.f1373b.get(name);
                if (bVar != null) {
                    h10 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (h10 != null) {
                    h10.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, d10, h10);
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (h10 == null) {
            this.f1374c.a(i10, "appcompat_skip_skip");
        }
        return h10;
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList l10 = l(context, i10);
        if (l10 == null) {
            c cVar = this.f1378g;
            if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
                return null;
            }
            return drawable;
        }
        if (p0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable i11 = androidx.core.graphics.drawable.a.i(drawable);
        androidx.core.graphics.drawable.a.g(i11, l10);
        PorterDuff.Mode n10 = n(i10);
        if (n10 == null) {
            return i11;
        }
        androidx.core.graphics.drawable.a.h(i11, n10);
        return i11;
    }

    public static void v(Drawable drawable, j1 j1Var, int[] iArr) {
        int[] state = drawable.getState();
        if (p0.a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = j1Var.f1534d;
        if (z10 || j1Var.f1533c) {
            drawable.setColorFilter(f(z10 ? j1Var.f1531a : null, j1Var.f1533c ? j1Var.f1532b : f1369h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    public synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable q10;
        c(context);
        q10 = q(context, i10);
        if (q10 == null) {
            q10 = e(context, i10);
        }
        if (q10 == null) {
            q10 = androidx.core.content.a.getDrawable(context, i10);
        }
        if (q10 != null) {
            q10 = u(context, i10, z10, q10);
        }
        if (q10 != null) {
            p0.b(q10);
        }
        return q10;
    }

    public synchronized ColorStateList l(Context context, int i10) {
        ColorStateList m10;
        m10 = m(context, i10);
        if (m10 == null) {
            c cVar = this.f1378g;
            m10 = cVar == null ? null : cVar.b(context, i10);
            if (m10 != null) {
                b(context, i10, m10);
            }
        }
        return m10;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f1378g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    public synchronized void r(Context context) {
        androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1375d.get(context);
        if (eVar != null) {
            eVar.a();
        }
    }

    public synchronized Drawable s(Context context, w1 w1Var, int i10) {
        Drawable q10 = q(context, i10);
        if (q10 == null) {
            q10 = w1Var.a(i10);
        }
        if (q10 == null) {
            return null;
        }
        return u(context, i10, false, q10);
    }

    public synchronized void t(c cVar) {
        this.f1378g = cVar;
    }

    public boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f1378g;
        return cVar != null && cVar.c(context, i10, drawable);
    }
}
