package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.C0869d;
import androidx.core.provider.C0961g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.j */
/* loaded from: classes.dex */
class C0905j extends C0901g0 {

    /* renamed from: b */
    private static Class<?> f4400b = null;

    /* renamed from: c */
    private static Constructor<?> f4401c = null;

    /* renamed from: d */
    private static Method f4402d = null;

    /* renamed from: e */
    private static Method f4403e = null;

    /* renamed from: f */
    private static boolean f4404f = false;

    /* renamed from: h */
    private static boolean m4612h(Object obj, String str, int i10, boolean z10) {
        m4615k();
        try {
            return ((Boolean) f4402d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: i */
    private static Typeface m4613i(Object obj) {
        m4615k();
        try {
            Object newInstance = Array.newInstance(f4400b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4403e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: j */
    private File m4614j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: k */
    private static void m4615k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f4404f) {
            return;
        }
        f4404f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f4401c = constructor;
        f4400b = cls;
        f4402d = method2;
        f4403e = method;
    }

    /* renamed from: l */
    private static Object m4616l() {
        m4615k();
        try {
            return f4401c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.C0901g0
    /* renamed from: a */
    public Typeface mo4575a(Context context, C0869d.c cVar, Resources resources, int i10) {
        Object m4616l = m4616l();
        for (C0869d.d dVar : cVar.m4436a()) {
            File m4598e = C0903h0.m4598e(context);
            if (m4598e == null) {
                return null;
            }
            try {
                if (!C0903h0.m4596c(m4598e, resources, dVar.m4438b())) {
                    return null;
                }
                if (!m4612h(m4616l, m4598e.getPath(), dVar.m4441e(), dVar.m4442f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m4598e.delete();
            }
        }
        return m4613i(m4616l);
    }

    @Override // androidx.core.graphics.C0901g0
    /* renamed from: b */
    public Typeface mo4576b(Context context, CancellationSignal cancellationSignal, C0961g.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File m4614j = m4614j(openFileDescriptor);
                if (m4614j != null && m4614j.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m4614j);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface m4587c = super.m4587c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return m4587c;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
