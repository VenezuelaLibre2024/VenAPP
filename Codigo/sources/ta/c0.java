package ta;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import sa.e;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a */
    private static final String f26848a = "c0";

    /* renamed from: b */
    private static Context f26849b;

    /* renamed from: c */
    private static e0 f26850c;

    public static e0 a(Context context, e.a aVar) {
        com.google.android.gms.common.internal.s.j(context);
        Log.d(f26848a, "preferredRenderer: ".concat(String.valueOf(aVar)));
        e0 e0Var = f26850c;
        if (e0Var != null) {
            return e0Var;
        }
        int g10 = ca.j.g(context, 13400000);
        if (g10 != 0) {
            throw new ca.h(g10);
        }
        e0 d10 = d(context, aVar);
        f26850c = d10;
        try {
            if (d10.zzd() == 2) {
                try {
                    f26850c.zzm(com.google.android.gms.dynamic.d.h2(c(context, aVar)));
                } catch (RemoteException e10) {
                    throw new ua.v(e10);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w(f26848a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    f26849b = null;
                    f26850c = d(context, e.a.LEGACY);
                }
            }
            try {
                e0 e0Var2 = f26850c;
                Context c10 = c(context, aVar);
                c10.getClass();
                e0Var2.zzk(com.google.android.gms.dynamic.d.h2(c10.getResources()), 18020000);
                return f26850c;
            } catch (RemoteException e11) {
                throw new ua.v(e11);
            }
        } catch (RemoteException e12) {
            throw new ua.v(e12);
        }
    }

    private static Context b(Exception exc, Context context) {
        Log.e(f26848a, "Failed to load maps module, use pre-Chimera", exc);
        return ca.j.d(context);
    }

    private static Context c(Context context, e.a aVar) {
        Context b10;
        Context context2 = f26849b;
        if (context2 != null) {
            return context2;
        }
        String str = aVar == e.a.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            b10 = DynamiteModule.e(context, DynamiteModule.f9718b, str).b();
        } catch (Exception e10) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                b10 = b(e10, context);
            } else {
                try {
                    Log.d(f26848a, "Attempting to load maps_dynamite again.");
                    b10 = DynamiteModule.e(context, DynamiteModule.f9718b, "com.google.android.gms.maps_dynamite").b();
                } catch (Exception e11) {
                    b10 = b(e11, context);
                }
            }
        }
        f26849b = b10;
        return b10;
    }

    private static e0 d(Context context, e.a aVar) {
        Log.i(f26848a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) e(((ClassLoader) com.google.android.gms.common.internal.s.j(c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return queryLocalInterface instanceof e0 ? (e0) queryLocalInterface : new d0(iBinder);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e10);
        }
    }

    private static Object e(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e11);
        }
    }
}
