package la;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.core.content.C0854a;
import com.google.android.gms.common.internal.C5276s;
import java.lang.reflect.Method;
import na.C9696e;

/* renamed from: la.v */
/* loaded from: classes.dex */
public class C9477v {

    /* renamed from: a */
    private static final int f23015a = Process.myUid();

    /* renamed from: b */
    private static final Method f23016b;

    /* renamed from: c */
    private static final Method f23017c;

    /* renamed from: d */
    private static final Method f23018d;

    /* renamed from: e */
    private static final Method f23019e;

    /* renamed from: f */
    private static final Method f23020f;

    /* renamed from: g */
    private static final Method f23021g;

    /* renamed from: h */
    private static final Method f23022h;

    /* renamed from: i */
    private static final Method f23023i;

    /* renamed from: j */
    private static Boolean f23024j;

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|2|3|4|(22:54|55|7|8|9|10|11|12|13|(13:46|47|16|(10:41|42|19|(7:36|37|22|(6:28|29|30|31|25|26)|24|25|26)|21|22|(0)|24|25|26)|18|19|(0)|21|22|(0)|24|25|26)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x003d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            la.C9477v.f23015a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L18
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L18
            r5[r3] = r6     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r5 = r4
        L19:
            la.C9477v.f23016b = r5
            boolean r5 = la.C9471p.m28166c()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L31
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L31
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L31
            r5[r3] = r8     // Catch: java.lang.Exception -> L31
            r5[r2] = r6     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L31
            goto L32
        L31:
            r0 = r4
        L32:
            la.C9477v.f23017c = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3d
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3d:
            r0 = r4
        L3e:
            la.C9477v.f23018d = r0
            java.lang.String r0 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L4d
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4d
            r5[r3] = r8     // Catch: java.lang.Exception -> L4d
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L4d:
            r0 = r4
        L4e:
            la.C9477v.f23019e = r0
            boolean r0 = la.C9471p.m28166c()
            if (r0 == 0) goto L63
            java.lang.String r0 = "getName"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L63
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L63
            r5[r3] = r8     // Catch: java.lang.Exception -> L63
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L63
            goto L64
        L63:
            r0 = r4
        L64:
            la.C9477v.f23020f = r0
            boolean r0 = la.C9471p.m28173j()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L7d
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L77
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch: java.lang.Exception -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r8, r0)
        L7d:
            r0 = r4
        L7e:
            la.C9477v.f23021g = r0
            boolean r0 = la.C9471p.m28173j()
            if (r0 == 0) goto La1
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r8 = "addNode"
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L9b
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9b
            r7[r3] = r9     // Catch: java.lang.Exception -> L9b
            r7[r2] = r6     // Catch: java.lang.Exception -> L9b
            java.lang.reflect.Method r0 = r0.getMethod(r8, r7)     // Catch: java.lang.Exception -> L9b
            goto La2
        L9b:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain class"
            android.util.Log.w(r5, r6, r0)
        La1:
            r0 = r4
        La2:
            la.C9477v.f23022h = r0
            boolean r0 = la.C9471p.m28173j()
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lb6
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> Lb6
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> Lb7
            goto Lb7
        Lb6:
            r0 = r4
        Lb7:
            la.C9477v.f23023i = r0
            la.C9477v.f23024j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: la.C9477v.<clinit>():void");
    }

    /* renamed from: a */
    public static void m28183a(WorkSource workSource, int i10, String str) {
        Method method = f23017c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f23016b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m28184b(Context context, String str) {
        String str2;
        ApplicationInfo m29074c;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            m29074c = C9696e.m29080a(context).m29074c(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Could not find package: ";
        }
        if (m29074c == null) {
            str2 = "Could not get applicationInfo from package: ";
            Log.e("WorkSourceUtil", str2.concat(str));
            return null;
        }
        int i10 = m29074c.uid;
        WorkSource workSource = new WorkSource();
        m28183a(workSource, i10, str);
        return workSource;
    }

    /* renamed from: c */
    public static synchronized boolean m28185c(Context context) {
        synchronized (C9477v.class) {
            Boolean bool = f23024j;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            Boolean valueOf = Boolean.valueOf(C0854a.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
            f23024j = valueOf;
            return valueOf.booleanValue();
        }
    }

    /* renamed from: d */
    public static boolean m28186d(WorkSource workSource) {
        Method method = f23023i;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C5276s.m13324j(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        return m28187e(workSource) == 0;
    }

    /* renamed from: e */
    public static int m28187e(WorkSource workSource) {
        Method method = f23018d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C5276s.m13324j(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }
}
