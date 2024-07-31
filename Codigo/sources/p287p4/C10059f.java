package p287p4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: p4.f */
/* loaded from: classes.dex */
public final class C10059f {

    /* renamed from: b */
    private static boolean f24709b;

    /* renamed from: a */
    public static final C10059f f24708a = new C10059f();

    /* renamed from: c */
    private static HashSet<String> f24710c = new HashSet<>();

    /* renamed from: d */
    private static Map<String, HashSet<String>> f24711d = new HashMap();

    private C10059f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:6:0x0009, B:8:0x0014, B:13:0x0020, B:15:0x0024, B:20:0x0030, B:23:0x0033), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:6:0x0009, B:8:0x0014, B:13:0x0020, B:15:0x0024, B:20:0x0030, B:23:0x0033), top: B:5:0x0009 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m30001a() {
        /*
            java.lang.Class<p4.f> r0 = p287p4.C10059f.class
            boolean r1 = p007a5.C0033a.m107d(r0)
            if (r1 == 0) goto L9
            return
        L9:
            p4.f r1 = p287p4.C10059f.f24708a     // Catch: java.lang.Throwable -> L36
            r1.m30002b()     // Catch: java.lang.Throwable -> L36
            java.util.HashSet<java.lang.String> r1 = p287p4.C10059f.f24710c     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L1b
            goto L1d
        L1b:
            r1 = r2
            goto L1e
        L1d:
            r1 = r3
        L1e:
            if (r1 == 0) goto L33
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r1 = p287p4.C10059f.f24711d     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L2d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L2b
            goto L2d
        L2b:
            r1 = r2
            goto L2e
        L2d:
            r1 = r3
        L2e:
            if (r1 == 0) goto L33
            p287p4.C10059f.f24709b = r2     // Catch: java.lang.Throwable -> L36
            return
        L33:
            p287p4.C10059f.f24709b = r3     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r1 = move-exception
            p007a5.C0033a.m105b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p287p4.C10059f.m30001a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m30002b() {
        /*
            r9 = this;
            java.lang.String r0 = "value"
            java.lang.String r1 = "key"
            boolean r2 = p007a5.C0033a.m107d(r9)
            if (r2 == 0) goto Lb
            return
        Lb:
            com.facebook.internal.v r2 = com.facebook.internal.C4648v.f8854a     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = p152i4.C7799e0.m23861m()     // Catch: java.lang.Throwable -> L7b
            r3 = 0
            com.facebook.internal.r r2 = com.facebook.internal.C4648v.m11457q(r2, r3)     // Catch: java.lang.Throwable -> L7b
            if (r2 != 0) goto L19
            return
        L19:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            r4.<init>()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            p287p4.C10059f.f24710c = r4     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            r4.<init>()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            p287p4.C10059f.f24711d = r4     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            org.json.JSONArray r2 = r2.m11387m()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            if (r2 == 0) goto L7a
            int r4 = r2.length()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            if (r4 == 0) goto L7a
            int r4 = r2.length()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            if (r4 <= 0) goto L7a
        L39:
            int r5 = r3 + 1
            org.json.JSONObject r3 = r2.getJSONObject(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            boolean r6 = r3.has(r1)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            boolean r7 = r3.has(r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            if (r6 == 0) goto L75
            if (r7 == 0) goto L75
            java.lang.String r6 = r3.getString(r1)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            org.json.JSONArray r3 = r3.getJSONArray(r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            if (r6 != 0) goto L56
            goto L75
        L56:
            if (r3 != 0) goto L59
            goto L75
        L59:
            java.util.HashSet r3 = com.facebook.internal.C4634n0.m11317m(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            if (r3 != 0) goto L60
            goto L75
        L60:
            java.lang.String r7 = "_MTSDK_Default_"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            if (r7 == 0) goto L6b
            p287p4.C10059f.f24710c = r3     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            goto L75
        L6b:
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r7 = p287p4.C10059f.f24711d     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            java.lang.String r8 = "sensitiveParamsScope"
            kotlin.jvm.internal.C9322n.m27780d(r6, r8)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
            r7.put(r6, r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7b
        L75:
            if (r5 < r4) goto L78
            goto L7a
        L78:
            r3 = r5
            goto L39
        L7a:
            return
        L7b:
            r0 = move-exception
            p007a5.C0033a.m105b(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p287p4.C10059f.m30002b():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:14|(7:19|20|21|(4:24|(3:26|27|28)(1:30)|29|22)|31|32|(2:34|35)(1:37))(1:18))|40|(1:16)|19|20|21|(1:22)|31|32|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[Catch: Exception -> 0x0068, all -> 0x0078, TryCatch #0 {Exception -> 0x0068, blocks: (B:21:0x0036, B:22:0x004d, B:24:0x0053, B:27:0x0061), top: B:20:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:6:0x0009, B:9:0x0018, B:11:0x001c, B:16:0x0028, B:19:0x0031, B:21:0x0036, B:22:0x004d, B:24:0x0053, B:27:0x0061, B:32:0x0068, B:34:0x006e), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m30003c(java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6) {
        /*
            java.lang.Class<p4.f> r0 = p287p4.C10059f.class
            boolean r1 = p007a5.C0033a.m107d(r0)
            if (r1 == 0) goto L9
            return
        L9:
            java.lang.String r1 = "parameters"
            kotlin.jvm.internal.C9322n.m27781e(r5, r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = "eventName"
            kotlin.jvm.internal.C9322n.m27781e(r6, r1)     // Catch: java.lang.Throwable -> L78
            boolean r1 = p287p4.C10059f.f24709b     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L18
            return
        L18:
            java.util.HashSet<java.lang.String> r1 = p287p4.C10059f.f24710c     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L25
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L23
            goto L25
        L23:
            r1 = 0
            goto L26
        L25:
            r1 = 1
        L26:
            if (r1 == 0) goto L31
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r1 = p287p4.C10059f.f24711d     // Catch: java.lang.Throwable -> L78
            boolean r1 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L31
            return
        L31:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L78
            r1.<init>()     // Catch: java.lang.Throwable -> L78
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r2 = p287p4.C10059f.f24711d     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            java.lang.Object r6 = r2.get(r6)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            java.util.HashSet r6 = (java.util.HashSet) r6     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            java.util.Set r3 = r5.keySet()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            r2.<init>(r3)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
        L4d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            if (r3 == 0) goto L68
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            p4.f r4 = p287p4.C10059f.f24708a     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            boolean r4 = r4.m30004d(r3, r6)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            if (r4 == 0) goto L4d
            r5.remove(r3)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            r1.put(r3)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            goto L4d
        L68:
            int r6 = r1.length()     // Catch: java.lang.Throwable -> L78
            if (r6 <= 0) goto L77
            java.lang.String r6 = "_filteredKey"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L78
            r5.put(r6, r1)     // Catch: java.lang.Throwable -> L78
        L77:
            return
        L78:
            r5 = move-exception
            p007a5.C0033a.m105b(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p287p4.C10059f.m30003c(java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:6:0x0008, B:9:0x0013, B:14:0x001f), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m30004d(java.lang.String r4, java.util.HashSet<java.lang.String> r5) {
        /*
            r3 = this;
            boolean r0 = p007a5.C0033a.m107d(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.HashSet<java.lang.String> r0 = p287p4.C10059f.f24710c     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0.contains(r4)     // Catch: java.lang.Throwable -> L27
            r2 = 1
            if (r0 != 0) goto L25
            if (r5 == 0) goto L1c
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = r1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 != 0) goto L26
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L26
        L25:
            r1 = r2
        L26:
            return r1
        L27:
            r4 = move-exception
            p007a5.C0033a.m105b(r4, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p287p4.C10059f.m30004d(java.lang.String, java.util.HashSet):boolean");
    }
}
