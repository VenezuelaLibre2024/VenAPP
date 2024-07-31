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
import androidx.core.content.res.C0869d;
import androidx.core.provider.C0961g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.p */
/* loaded from: classes.dex */
public class C0911p extends C0905j {

    /* renamed from: g */
    protected final Class<?> f4409g;

    /* renamed from: h */
    protected final Constructor<?> f4410h;

    /* renamed from: i */
    protected final Method f4411i;

    /* renamed from: j */
    protected final Method f4412j;

    /* renamed from: k */
    protected final Method f4413k;

    /* renamed from: l */
    protected final Method f4414l;

    /* renamed from: m */
    protected final Method f4415m;

    public C0911p() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = m4636v();
            constructor = m4637w(cls);
            method = m4633s(cls);
            method2 = m4634t(cls);
            method3 = m4638x(cls);
            method4 = m4632r(cls);
            method5 = mo4635u(cls);
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
        this.f4409g = cls;
        this.f4410h = constructor;
        this.f4411i = method;
        this.f4412j = method2;
        this.f4413k = method3;
        this.f4414l = method4;
        this.f4415m = method5;
    }

    /* renamed from: l */
    private Object m4625l() {
        try {
            return this.f4410h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    private void m4626m(Object obj) {
        try {
            this.f4414l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: n */
    private boolean m4627n(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4411i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    private boolean m4628o(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f4412j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    private boolean m4629p(Object obj) {
        try {
            return ((Boolean) this.f4413k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: q */
    private boolean m4630q() {
        if (this.f4411i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f4411i != null;
    }

    @Override // androidx.core.graphics.C0905j, androidx.core.graphics.C0901g0
    /* renamed from: a */
    public Typeface mo4575a(Context context, C0869d.c cVar, Resources resources, int i10) {
        FontVariationAxis[] fromFontVariationSettings;
        if (!m4630q()) {
            return super.mo4575a(context, cVar, resources, i10);
        }
        Object m4625l = m4625l();
        if (m4625l == null) {
            return null;
        }
        for (C0869d.d dVar : cVar.m4436a()) {
            String m4437a = dVar.m4437a();
            int m4439c = dVar.m4439c();
            int m4441e = dVar.m4441e();
            boolean m4442f = dVar.m4442f();
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(dVar.m4440d());
            if (!m4627n(context, m4625l, m4437a, m4439c, m4441e, m4442f ? 1 : 0, fromFontVariationSettings)) {
                m4626m(m4625l);
                return null;
            }
        }
        if (m4629p(m4625l)) {
            return mo4631i(m4625l);
        }
        return null;
    }

    @Override // androidx.core.graphics.C0905j, androidx.core.graphics.C0901g0
    /* renamed from: b */
    public Typeface mo4576b(Context context, CancellationSignal cancellationSignal, C0961g.b[] bVarArr, int i10) {
        Typeface mo4631i;
        Typeface.Builder weight;
        Typeface.Builder italic;
        Typeface build;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m4630q()) {
            C0961g.b mo4578g = mo4578g(bVarArr, i10);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo4578g.m4778d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    weight = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo4578g.m4779e());
                    italic = weight.setItalic(mo4578g.m4780f());
                    build = italic.build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m4601h = C0903h0.m4601h(context, bVarArr, cancellationSignal);
        Object m4625l = m4625l();
        if (m4625l == null) {
            return null;
        }
        boolean z10 = false;
        for (C0961g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = m4601h.get(bVar.m4778d());
            if (byteBuffer != null) {
                if (!m4628o(m4625l, byteBuffer, bVar.m4777c(), bVar.m4779e(), bVar.m4780f() ? 1 : 0)) {
                    m4626m(m4625l);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            m4626m(m4625l);
            return null;
        }
        if (m4629p(m4625l) && (mo4631i = mo4631i(m4625l)) != null) {
            return Typeface.create(mo4631i, i10);
        }
        return null;
    }

    @Override // androidx.core.graphics.C0901g0
    /* renamed from: d */
    public Typeface mo4577d(Context context, Resources resources, int i10, String str, int i11) {
        if (!m4630q()) {
            return super.mo4577d(context, resources, i10, str, i11);
        }
        Object m4625l = m4625l();
        if (m4625l == null) {
            return null;
        }
        if (!m4627n(context, m4625l, str, 0, -1, -1, null)) {
            m4626m(m4625l);
            return null;
        }
        if (m4629p(m4625l)) {
            return mo4631i(m4625l);
        }
        return null;
    }

    /* renamed from: i */
    protected Typeface mo4631i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4409g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4415m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: r */
    protected Method m4632r(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: s */
    protected Method m4633s(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: t */
    protected Method m4634t(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: u */
    protected Method mo4635u(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: v */
    protected Class<?> m4636v() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: w */
    protected Constructor<?> m4637w(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: x */
    protected Method m4638x(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
