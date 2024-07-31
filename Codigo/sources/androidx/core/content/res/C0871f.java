package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.C0871f;
import androidx.core.util.C0979c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.res.f */
/* loaded from: classes.dex */
public final class C0871f {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f4351a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<d, SparseArray<c>> f4352b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f4353c = new Object();

    /* renamed from: androidx.core.content.res.f$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static Drawable m4461a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        /* renamed from: b */
        static Drawable m4462b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.f$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static int m4463a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        /* renamed from: b */
        static ColorStateList m4464b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.content.res.f$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final ColorStateList f4354a;

        /* renamed from: b */
        final Configuration f4355b;

        /* renamed from: c */
        final int f4356c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f4354a = colorStateList;
            this.f4355b = configuration;
            this.f4356c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.content.res.f$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        final Resources f4357a;

        /* renamed from: b */
        final Resources.Theme f4358b;

        d(Resources resources, Resources.Theme theme) {
            this.f4357a = resources;
            this.f4358b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f4357a.equals(dVar.f4357a) && C0979c.m4812a(this.f4358b, dVar.f4358b);
        }

        public int hashCode() {
            return C0979c.m4813b(this.f4357a, this.f4358b);
        }
    }

    /* renamed from: androidx.core.content.res.f$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        /* renamed from: e */
        public static Handler m4467e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void m4470c(final int i10, Handler handler) {
            m4467e(handler).post(new Runnable() { // from class: androidx.core.content.res.h
                @Override // java.lang.Runnable
                public final void run() {
                    C0871f.e.this.m4468f(i10);
                }
            });
        }

        /* renamed from: d */
        public final void m4471d(final Typeface typeface, Handler handler) {
            m4467e(handler).post(new Runnable() { // from class: androidx.core.content.res.g
                @Override // java.lang.Runnable
                public final void run() {
                    C0871f.e.this.m4469g(typeface);
                }
            });
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void m4468f(int i10);

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void m4469g(Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.f$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: androidx.core.content.res.f$f$a */
        /* loaded from: classes.dex */
        static class a {

            /* renamed from: a */
            private static final Object f4359a = new Object();

            /* renamed from: b */
            private static Method f4360b;

            /* renamed from: c */
            private static boolean f4361c;

            /* renamed from: a */
            static void m4473a(Resources.Theme theme) {
                synchronized (f4359a) {
                    if (!f4361c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f4360b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f4361c = true;
                    }
                    Method method = f4360b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            f4360b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.res.f$f$b */
        /* loaded from: classes.dex */
        static class b {
            /* renamed from: a */
            static void m4474a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m4472a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.m4474a(theme);
            } else {
                a.m4473a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m4450a(d dVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f4353c) {
            WeakHashMap<d, SparseArray<c>> weakHashMap = f4352b;
            SparseArray<c> sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i10, new c(colorStateList, dVar.f4357a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    private static ColorStateList m4451b(d dVar, int i10) {
        c cVar;
        Resources.Theme theme;
        synchronized (f4353c) {
            SparseArray<c> sparseArray = f4352b.get(dVar);
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i10)) != null) {
                if (cVar.f4355b.equals(dVar.f4357a.getConfiguration()) && (((theme = dVar.f4358b) == null && cVar.f4356c == 0) || (theme != null && cVar.f4356c == theme.hashCode()))) {
                    return cVar.f4354a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m4452c(Resources resources, int i10, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList m4451b = m4451b(dVar, i10);
        if (m4451b != null) {
            return m4451b;
        }
        ColorStateList m4457h = m4457h(resources, i10, theme);
        if (m4457h == null) {
            return b.m4464b(resources, i10, theme);
        }
        m4450a(dVar, i10, m4457h, theme);
        return m4457h;
    }

    /* renamed from: d */
    public static Drawable m4453d(Resources resources, int i10, Resources.Theme theme) {
        return a.m4461a(resources, i10, theme);
    }

    /* renamed from: e */
    public static Drawable m4454e(Resources resources, int i10, int i11, Resources.Theme theme) {
        return a.m4462b(resources, i10, i11, theme);
    }

    /* renamed from: f */
    public static Typeface m4455f(Context context, int i10, TypedValue typedValue, int i11, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m4459j(context, i10, typedValue, i11, eVar, null, true, false);
    }

    /* renamed from: g */
    private static TypedValue m4456g() {
        ThreadLocal<TypedValue> threadLocal = f4351a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: h */
    private static ColorStateList m4457h(Resources resources, int i10, Resources.Theme theme) {
        if (m4458i(resources, i10)) {
            return null;
        }
        try {
            return C0868c.m4420a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    /* renamed from: i */
    private static boolean m4458i(Resources resources, int i10) {
        TypedValue m4456g = m4456g();
        resources.getValue(i10, m4456g, true);
        int i11 = m4456g.type;
        return i11 >= 28 && i11 <= 31;
    }

    /* renamed from: j */
    private static Typeface m4459j(Context context, int i10, TypedValue typedValue, int i11, e eVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface m4460k = m4460k(context, resources, typedValue, i10, i11, eVar, handler, z10, z11);
        if (m4460k != null || eVar != null || z11) {
            return m4460k;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface m4460k(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.C0871f.e r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lae
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L25
            if (r11 == 0) goto L24
            r11.m4470c(r15, r12)
        L24:
            return r16
        L25:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.C0904i.m4608f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L35
            if (r11 == 0) goto L34
            r11.m4471d(r2, r12)
        L34:
            return r2
        L35:
            if (r25 == 0) goto L38
            return r16
        L38:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r2 == 0) goto L6f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            androidx.core.content.res.d$b r2 = androidx.core.content.res.C0869d.m4428b(r2, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r2 != 0) goto L59
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r11 == 0) goto L58
            r11.m4470c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
        L58:
            return r16
        L59:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.C0904i.m4605c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            return r0
        L6f:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.C0904i.m4606d(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            if (r11 == 0) goto L89
            if (r0 == 0) goto L86
            r11.m4471d(r0, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
            goto L89
        L86:
            r11.m4470c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> L93
        L89:
            return r0
        L8a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L9b
        L93:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L9b:
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            if (r11 == 0) goto Lad
            r11.m4470c(r15, r12)
        Lad:
            return r16
        Lae:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0871f.m4460k(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.f$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
