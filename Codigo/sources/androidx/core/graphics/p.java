package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.d;
import androidx.core.provider.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public class p extends j {

    /* renamed from: g, reason: collision with root package name */
    protected final Class<?> f3737g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor<?> f3738h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f3739i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f3740j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f3741k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f3742l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f3743m;

    public p() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = v();
            constructor = w(cls);
            method = s(cls);
            method2 = t(cls);
            method3 = x(cls);
            method4 = r(cls);
            method5 = u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f3737g = cls;
        this.f3738h = constructor;
        this.f3739i = method;
        this.f3740j = method2;
        this.f3741k = method3;
        this.f3742l = method4;
        this.f3743m = method5;
    }

    private Object l() {
        try {
            return this.f3738h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.f3742l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3739i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f3740j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f3741k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f3739i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f3739i != null;
    }

    @Override // androidx.core.graphics.j, androidx.core.graphics.g0
    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        FontVariationAxis[] fromFontVariationSettings;
        if (!q()) {
            return super.a(context, cVar, resources, i10);
        }
        Object l10 = l();
        if (l10 == null) {
            return null;
        }
        for (d.C0042d c0042d : cVar.a()) {
            String a10 = c0042d.a();
            int c10 = c0042d.c();
            int e10 = c0042d.e();
            boolean f10 = c0042d.f();
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0042d.d());
            if (!n(context, l10, a10, c10, e10, f10 ? 1 : 0, fromFontVariationSettings)) {
                m(l10);
                return null;
            }
        }
        if (p(l10)) {
            return i(l10);
        }
        return null;
    }

    @Override // androidx.core.graphics.j, androidx.core.graphics.g0
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        Typeface i11;
        Typeface.Builder weight;
        Typeface.Builder italic;
        Typeface build;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
            g.b g10 = g(bVarArr, i10);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g10.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    weight = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g10.e());
                    italic = weight.setItalic(g10.f());
                    build = italic.build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h10 = h0.h(context, bVarArr, cancellationSignal);
        Object l10 = l();
        if (l10 == null) {
            return null;
        }
        boolean z10 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = h10.get(bVar.d());
            if (byteBuffer != null) {
                if (!o(l10, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    m(l10);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            m(l10);
            return null;
        }
        if (p(l10) && (i11 = i(l10)) != null) {
            return Typeface.create(i11, i10);
        }
        return null;
    }

    @Override // androidx.core.graphics.g0
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (!q()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object l10 = l();
        if (l10 == null) {
            return null;
        }
        if (!n(context, l10, str, 0, -1, -1, null)) {
            m(l10);
            return null;
        }
        if (p(l10)) {
            return i(l10);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3737g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3743m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method s(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method t(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> v() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> w(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    protected Method x(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
