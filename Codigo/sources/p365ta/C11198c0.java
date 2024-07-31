package p365ta;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import ca.C1906h;
import ca.C1910j;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamite.DynamiteModule;
import sa.C10860e;
import ua.C11518v;

/* renamed from: ta.c0 */
/* loaded from: classes2.dex */
public final class C11198c0 {

    /* renamed from: a */
    private static final String f29144a = "c0";

    /* renamed from: b */
    private static Context f29145b;

    /* renamed from: c */
    private static InterfaceC11202e0 f29146c;

    /* renamed from: a */
    public static InterfaceC11202e0 m35098a(Context context, C10860e.a aVar) {
        C5276s.m13324j(context);
        Log.d(f29144a, "preferredRenderer: ".concat(String.valueOf(aVar)));
        InterfaceC11202e0 interfaceC11202e0 = f29146c;
        if (interfaceC11202e0 != null) {
            return interfaceC11202e0;
        }
        int m10094g = C1910j.m10094g(context, 13400000);
        if (m10094g != 0) {
            throw new C1906h(m10094g);
        }
        InterfaceC11202e0 m35101d = m35101d(context, aVar);
        f29146c = m35101d;
        try {
            if (m35101d.zzd() == 2) {
                try {
                    f29146c.zzm(BinderC5314d.m13412h2(m35100c(context, aVar)));
                } catch (RemoteException e10) {
                    throw new C11518v(e10);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w(f29144a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    f29145b = null;
                    f29146c = m35101d(context, C10860e.a.LEGACY);
                }
            }
            try {
                InterfaceC11202e0 interfaceC11202e02 = f29146c;
                Context m35100c = m35100c(context, aVar);
                m35100c.getClass();
                interfaceC11202e02.zzk(BinderC5314d.m13412h2(m35100c.getResources()), 18020000);
                return f29146c;
            } catch (RemoteException e11) {
                throw new C11518v(e11);
            }
        } catch (RemoteException e12) {
            throw new C11518v(e12);
        }
    }

    /* renamed from: b */
    private static Context m35099b(Exception exc, Context context) {
        Log.e(f29144a, "Failed to load maps module, use pre-Chimera", exc);
        return C1910j.m10092d(context);
    }

    /* renamed from: c */
    private static Context m35100c(Context context, C10860e.a aVar) {
        Context m35099b;
        Context context2 = f29145b;
        if (context2 != null) {
            return context2;
        }
        String str = aVar == C10860e.a.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            m35099b = DynamiteModule.m13418e(context, DynamiteModule.f10833b, str).m13426b();
        } catch (Exception e10) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                m35099b = m35099b(e10, context);
            } else {
                try {
                    Log.d(f29144a, "Attempting to load maps_dynamite again.");
                    m35099b = DynamiteModule.m13418e(context, DynamiteModule.f10833b, "com.google.android.gms.maps_dynamite").m13426b();
                } catch (Exception e11) {
                    m35099b = m35099b(e11, context);
                }
            }
        }
        f29145b = m35099b;
        return m35099b;
    }

    /* renamed from: d */
    private static InterfaceC11202e0 m35101d(Context context, C10860e.a aVar) {
        Log.i(f29144a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) m35102e(((ClassLoader) C5276s.m13324j(m35100c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return queryLocalInterface instanceof InterfaceC11202e0 ? (InterfaceC11202e0) queryLocalInterface : new C11200d0(iBinder);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e10);
        }
    }

    /* renamed from: e */
    private static Object m35102e(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e11);
        }
    }
}
