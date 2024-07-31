package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.C0738h;
import androidx.core.content.res.C0869d;
import androidx.core.provider.C0961g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: androidx.core.graphics.k */
/* loaded from: classes.dex */
class C0906k extends C0901g0 {

    /* renamed from: b */
    private static final Class<?> f4405b;

    /* renamed from: c */
    private static final Constructor<?> f4406c;

    /* renamed from: d */
    private static final Method f4407d;

    /* renamed from: e */
    private static final Method f4408e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f4406c = constructor;
        f4405b = cls;
        f4407d = method2;
        f4408e = method;
    }

    /* renamed from: h */
    private static boolean m4617h(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f4407d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: i */
    private static Typeface m4618i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f4405b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4408e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m4619j() {
        Method method = f4407d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: k */
    private static Object m4620k() {
        try {
            return f4406c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0901g0
    /* renamed from: a */
    public Typeface mo4575a(Context context, C0869d.c cVar, Resources resources, int i10) {
        Object m4620k = m4620k();
        if (m4620k == null) {
            return null;
        }
        for (C0869d.d dVar : cVar.m4436a()) {
            ByteBuffer m4595b = C0903h0.m4595b(context, resources, dVar.m4438b());
            if (m4595b == null || !m4617h(m4620k, m4595b, dVar.m4439c(), dVar.m4441e(), dVar.m4442f())) {
                return null;
            }
        }
        return m4618i(m4620k);
    }

    @Override // androidx.core.graphics.C0901g0
    /* renamed from: b */
    public Typeface mo4576b(Context context, CancellationSignal cancellationSignal, C0961g.b[] bVarArr, int i10) {
        Object m4620k = m4620k();
        if (m4620k == null) {
            return null;
        }
        C0738h c0738h = new C0738h();
        for (C0961g.b bVar : bVarArr) {
            Uri m4778d = bVar.m4778d();
            ByteBuffer byteBuffer = (ByteBuffer) c0738h.get(m4778d);
            if (byteBuffer == null) {
                byteBuffer = C0903h0.m4599f(context, cancellationSignal, m4778d);
                c0738h.put(m4778d, byteBuffer);
            }
            if (byteBuffer == null || !m4617h(m4620k, byteBuffer, bVar.m4777c(), bVar.m4779e(), bVar.m4780f())) {
                return null;
            }
        }
        Typeface m4618i = m4618i(m4620k);
        if (m4618i == null) {
            return null;
        }
        return Typeface.create(m4618i, i10);
    }
}
