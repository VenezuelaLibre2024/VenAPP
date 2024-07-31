package sa;

import android.content.Context;

/* renamed from: sa.e */
/* loaded from: classes2.dex */
public final class C10860e {

    /* renamed from: a */
    private static final String f27547a = "e";

    /* renamed from: b */
    private static boolean f27548b = false;

    /* renamed from: c */
    private static a f27549c = a.LEGACY;

    /* renamed from: sa.e$a */
    /* loaded from: classes2.dex */
    public enum a {
        LEGACY,
        LATEST
    }

    private C10860e() {
    }

    /* renamed from: a */
    public static synchronized int m33154a(Context context) {
        int m33155b;
        synchronized (C10860e.class) {
            m33155b = m33155b(context, null, null);
        }
        return m33155b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|16|17|(10:19|(1:(1:22))|23|24|(1:26)|27|28|(1:30)|31|32)|36|23|24|(0)|27|28|(0)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        android.util.Log.e(sa.C10860e.f27547a, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f A[Catch: RemoteException -> 0x005b, all -> 0x0089, TryCatch #3 {RemoteException -> 0x005b, blocks: (B:24:0x0049, B:26:0x004f, B:27:0x0053), top: B:23:0x0049, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x001e, B:12:0x0025, B:15:0x0029, B:17:0x0038, B:19:0x003d, B:24:0x0049, B:26:0x004f, B:27:0x0053, B:28:0x0063, B:30:0x0076, B:35:0x005c, B:39:0x007e, B:40:0x0083, B:42:0x0085), top: B:3:0x0003, inners: #0, #1, #3 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized int m33155b(android.content.Context r5, sa.C10860e.a r6, sa.InterfaceC10862g r7) {
        /*
            java.lang.Class<sa.e> r0 = sa.C10860e.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.C5276s.m13325k(r5, r1)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = sa.C10860e.f27547a     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L89
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L89
            boolean r1 = sa.C10860e.f27548b     // Catch: java.lang.Throwable -> L89
            r2 = 0
            if (r1 == 0) goto L25
            if (r7 == 0) goto L23
            sa.e$a r5 = sa.C10860e.f27549c     // Catch: java.lang.Throwable -> L89
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L89
        L23:
            monitor-exit(r0)
            return r2
        L25:
            ta.e0 r1 = p365ta.C11198c0.m35098a(r5, r6)     // Catch: ca.C1906h -> L84 java.lang.Throwable -> L89
            ta.a r3 = r1.zze()     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            sa.C10857b.m33107k(r3)     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            com.google.android.gms.internal.maps.zzi r3 = r1.zzj()     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            ua.C11480c.m35924e(r3)     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            r3 = 1
            sa.C10860e.f27548b = r3     // Catch: java.lang.Throwable -> L89
            r4 = 2
            if (r6 == 0) goto L48
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L89
            if (r6 == 0) goto L49
            if (r6 == r3) goto L46
            goto L48
        L46:
            r3 = r4
            goto L49
        L48:
            r3 = r2
        L49:
            int r6 = r1.zzd()     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            if (r6 != r4) goto L53
            sa.e$a r6 = sa.C10860e.a.LATEST     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            sa.C10860e.f27549c = r6     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
        L53:
            com.google.android.gms.dynamic.b r5 = com.google.android.gms.dynamic.BinderC5314d.m13412h2(r5)     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            r1.mo35107G0(r5, r3)     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            goto L63
        L5b:
            r5 = move-exception
            java.lang.String r6 = sa.C10860e.f27547a     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch: java.lang.Throwable -> L89
        L63:
            java.lang.String r5 = sa.C10860e.f27547a     // Catch: java.lang.Throwable -> L89
            sa.e$a r6 = sa.C10860e.f27549c     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Throwable -> L89
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L89
            if (r7 == 0) goto L7b
            sa.e$a r5 = sa.C10860e.f27549c     // Catch: java.lang.Throwable -> L89
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L89
        L7b:
            monitor-exit(r0)
            return r2
        L7d:
            r5 = move-exception
            ua.v r6 = new ua.v     // Catch: java.lang.Throwable -> L89
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L89
            throw r6     // Catch: java.lang.Throwable -> L89
        L84:
            r5 = move-exception
            int r5 = r5.f7925a     // Catch: java.lang.Throwable -> L89
            monitor-exit(r0)
            return r5
        L89:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.C10860e.m33155b(android.content.Context, sa.e$a, sa.g):int");
    }
}
