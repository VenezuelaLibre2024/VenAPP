package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h */
    private static Boolean f9724h = null;

    /* renamed from: i */
    private static String f9725i = null;

    /* renamed from: j */
    private static boolean f9726j = false;

    /* renamed from: k */
    private static int f9727k = -1;

    /* renamed from: l */
    private static Boolean f9728l;

    /* renamed from: q */
    private static m f9733q;

    /* renamed from: r */
    private static n f9734r;

    /* renamed from: a */
    private final Context f9735a;

    /* renamed from: m */
    private static final ThreadLocal f9729m = new ThreadLocal();

    /* renamed from: n */
    private static final ThreadLocal f9730n = new com.google.android.gms.dynamite.b();

    /* renamed from: o */
    private static final b.a f9731o = new c();

    /* renamed from: b */
    public static final b f9718b = new d();

    /* renamed from: c */
    public static final b f9719c = new e();

    /* renamed from: d */
    public static final b f9720d = new f();

    /* renamed from: e */
    public static final b f9721e = new g();

    /* renamed from: f */
    public static final b f9722f = new h();

    /* renamed from: g */
    public static final b f9723g = new i();

    /* renamed from: p */
    public static final b f9732p = new j();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes.dex */
    public static class a extends Exception {
        /* synthetic */ a(String str, Throwable th2, oa.d dVar) {
            super(str, th2);
        }

        /* synthetic */ a(String str, oa.d dVar) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        /* loaded from: classes.dex */
        public static class C0151b {

            /* renamed from: a */
            public int f9736a = 0;

            /* renamed from: b */
            public int f9737b = 0;

            /* renamed from: c */
            public int f9738c = 0;
        }

        C0151b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        s.j(context);
        this.f9735a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (q.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    @ResultIgnorabilityUnspecified
    public static DynamiteModule e(Context context, b bVar, String str) {
        int i10;
        com.google.android.gms.dynamic.b h22;
        DynamiteModule dynamiteModule;
        n nVar;
        Boolean valueOf;
        com.google.android.gms.dynamic.b f22;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = f9729m;
        k kVar = (k) threadLocal.get();
        k kVar2 = new k(null);
        threadLocal.set(kVar2);
        ThreadLocal threadLocal2 = f9730n;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0151b a10 = bVar.a(context, str, f9731o);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + a10.f9736a + " and remote module " + str + ":" + a10.f9737b);
            int i11 = a10.f9738c;
            if (i11 != 0) {
                if (i11 == -1) {
                    if (a10.f9736a != 0) {
                        i11 = -1;
                    }
                }
                if (i11 != 1 || a10.f9737b != 0) {
                    if (i11 == -1) {
                        DynamiteModule h10 = h(applicationContext, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = kVar2.f9739a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(kVar);
                        return h10;
                    }
                    if (i11 != 1) {
                        throw new a("VersionPolicy returned invalid code:" + i11, null);
                    }
                    try {
                        try {
                            int i12 = a10.f9737b;
                            try {
                                try {
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            try {
                                                if (!k(context)) {
                                                    throw new a("Remote loading disabled", null);
                                                }
                                                Boolean bool = f9724h;
                                                if (bool == null) {
                                                    throw new a("Failed to determine which loading route to use.", null);
                                                }
                                                if (bool.booleanValue()) {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i12);
                                                    synchronized (DynamiteModule.class) {
                                                        try {
                                                            nVar = f9734r;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            while (true) {
                                                                try {
                                                                    break;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    if (nVar == null) {
                                                        throw new a("DynamiteLoaderV2 was not cached.", null);
                                                    }
                                                    k kVar3 = (k) threadLocal.get();
                                                    if (kVar3 == null || kVar3.f9739a == null) {
                                                        throw new a("No result cursor", null);
                                                    }
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor2 = kVar3.f9739a;
                                                    com.google.android.gms.dynamic.d.h2(null);
                                                    synchronized (DynamiteModule.class) {
                                                        valueOf = Boolean.valueOf(f9727k >= 2);
                                                    }
                                                    if (valueOf.booleanValue()) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        f22 = nVar.g2(com.google.android.gms.dynamic.d.h2(applicationContext2), str, i12, com.google.android.gms.dynamic.d.h2(cursor2));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        f22 = nVar.f2(com.google.android.gms.dynamic.d.h2(applicationContext2), str, i12, com.google.android.gms.dynamic.d.h2(cursor2));
                                                    }
                                                    Context context2 = (Context) com.google.android.gms.dynamic.d.g2(f22);
                                                    if (context2 == null) {
                                                        throw new a("Failed to get module context", null);
                                                    }
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i12);
                                                    m l10 = l(context);
                                                    if (l10 == null) {
                                                        throw new a("Failed to create IDynamiteLoader.", null);
                                                    }
                                                    int zze = l10.zze();
                                                    if (zze >= 3) {
                                                        k kVar4 = (k) threadLocal.get();
                                                        if (kVar4 == null) {
                                                            throw new a("No cached result cursor holder", null);
                                                        }
                                                        h22 = l10.i2(com.google.android.gms.dynamic.d.h2(context), str, i12, com.google.android.gms.dynamic.d.h2(kVar4.f9739a));
                                                    } else if (zze == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        h22 = l10.j2(com.google.android.gms.dynamic.d.h2(context), str, i12);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        h22 = l10.h2(com.google.android.gms.dynamic.d.h2(context), str, i12);
                                                    }
                                                    Object g22 = com.google.android.gms.dynamic.d.g2(h22);
                                                    if (g22 == null) {
                                                        throw new a("Failed to load remote module.", null);
                                                    }
                                                    dynamiteModule = new DynamiteModule((Context) g22);
                                                }
                                                if (longValue == 0) {
                                                    threadLocal2.remove();
                                                } else {
                                                    threadLocal2.set(Long.valueOf(longValue));
                                                }
                                                Cursor cursor3 = kVar2.f9739a;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                threadLocal.set(kVar);
                                                return dynamiteModule;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                throw th;
                                            }
                                        }
                                    } catch (RemoteException e10) {
                                        e = e10;
                                        throw new a("Failed to load remote module.", e, null);
                                    } catch (a e11) {
                                        throw e11;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        la.h.a(context, th);
                                        throw new a("Failed to load remote module.", th, null);
                                    }
                                } catch (RemoteException e12) {
                                    e = e12;
                                    throw new a("Failed to load remote module.", e, null);
                                } catch (a e13) {
                                    throw e13;
                                } catch (Throwable th6) {
                                    th = th6;
                                    la.h.a(context, th);
                                    throw new a("Failed to load remote module.", th, null);
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } catch (a e14) {
                            e = e14;
                            Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                            i10 = a10.f9736a;
                            if (i10 == 0) {
                            }
                            throw new a("Remote load failed. No local fallback found.", e, null);
                        }
                    } catch (a e15) {
                        e = e15;
                        Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                        i10 = a10.f9736a;
                        if (i10 == 0 && bVar.a(context, str, new l(i10, 0)).f9738c == -1) {
                            return h(applicationContext, str);
                        }
                        throw new a("Remote load failed. No local fallback found.", e, null);
                    }
                }
            }
            throw new a("No acceptable module " + str + " found. Local version is " + a10.f9736a + " and remote version is " + a10.f9737b + ".", null);
        } finally {
            if (longValue == 0) {
                f9730n.remove();
            } else {
                f9730n.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = kVar2.f9739a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f9729m.set(kVar);
        }
    }

    public static int f(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th2;
        RemoteException e10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f9724h;
                int i10 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != ClassLoader.getSystemClassLoader()) {
                            if (classLoader != null) {
                                try {
                                    i(classLoader);
                                } catch (a unused) {
                                }
                                bool = Boolean.TRUE;
                                f9724h = bool;
                            } else {
                                if (!k(context)) {
                                    return 0;
                                }
                                if (!f9726j) {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (!bool2.equals(null)) {
                                        try {
                                            int g10 = g(context, str, z10, true);
                                            String str2 = f9725i;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader a10 = oa.b.a();
                                                if (a10 == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        String str3 = f9725i;
                                                        s.j(str3);
                                                        a10 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = f9725i;
                                                        s.j(str4);
                                                        a10 = new com.google.android.gms.dynamite.a(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                i(a10);
                                                declaredField.set(null, a10);
                                                f9724h = bool2;
                                                return g10;
                                            }
                                            return g10;
                                        } catch (a unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                }
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                            }
                        }
                        bool = Boolean.FALSE;
                        f9724h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z10, false);
                    } catch (a e12) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                m l10 = l(context);
                if (l10 != null) {
                    try {
                        try {
                            int zze = l10.zze();
                            if (zze >= 3) {
                                k kVar = (k) f9729m.get();
                                if (kVar == null || (cursor = kVar.f9739a) == null) {
                                    Cursor cursor2 = (Cursor) com.google.android.gms.dynamic.d.g2(l10.k2(com.google.android.gms.dynamic.d.h2(context), str, z10, ((Long) f9730n.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i11 = cursor2.getInt(0);
                                                r2 = (i11 <= 0 || !j(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i10 = i11;
                                            }
                                        } catch (RemoteException e13) {
                                            e10 = e13;
                                            r2 = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i10;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            r2 = cursor2;
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            throw th2;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i10 = cursor.getInt(0);
                                }
                            } else if (zze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i10 = l10.g2(com.google.android.gms.dynamic.d.h2(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i10 = l10.f2(com.google.android.gms.dynamic.d.h2(context), str, z10);
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    } catch (RemoteException e14) {
                        e10 = e14;
                    }
                }
                return i10;
            }
        } catch (Throwable th5) {
            la.h.a(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) {
        n nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder);
            }
            f9734r = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10, null);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f9729m.get();
        if (kVar == null || kVar.f9739a != null) {
            return false;
        }
        kVar.f9739a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f9728l)) {
            return true;
        }
        boolean z10 = false;
        if (f9728l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (ca.g.f().h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f9728l = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f9726j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f9733q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f9733q = mVar;
                    return mVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    public Context b() {
        return this.f9735a;
    }

    public IBinder d(String str) {
        try {
            return (IBinder) this.f9735a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
