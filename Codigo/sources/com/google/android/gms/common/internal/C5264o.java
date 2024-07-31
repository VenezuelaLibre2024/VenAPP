package com.google.android.gms.common.internal;

import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: com.google.android.gms.common.internal.o */
/* loaded from: classes.dex */
public class C5264o {

    /* renamed from: b */
    private static final C5249j f10721b = new C5249j("LibraryVersion", "");

    /* renamed from: c */
    private static final C5264o f10722c = new C5264o();

    /* renamed from: a */
    private final ConcurrentHashMap f10723a = new ConcurrentHashMap();

    protected C5264o() {
    }

    /* renamed from: a */
    public static C5264o m13300a() {
        return f10722c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @java.lang.Deprecated
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m13301b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.C5276s.m13321g(r9, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r8.f10723a
            boolean r2 = r2.containsKey(r9)
            if (r2 == 0) goto L1a
            java.util.concurrent.ConcurrentHashMap r0 = r8.f10723a
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "/%s.properties"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            r6 = 0
            r5[r6] = r9     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            java.lang.Class<com.google.android.gms.common.internal.o> r5 = com.google.android.gms.common.internal.C5264o.class
            java.io.InputStream r4 = r5.getResourceAsStream(r4)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            if (r4 == 0) goto L57
            r2.load(r4)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            java.lang.String r5 = "version"
            java.lang.String r3 = r2.getProperty(r5, r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            com.google.android.gms.common.internal.j r2 = com.google.android.gms.common.internal.C5264o.f10721b     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            r5.<init>()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            r5.append(r9)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            java.lang.String r6 = " version is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            r5.append(r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            r2.m13289f(r1, r5)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            goto L6b
        L57:
            com.google.android.gms.common.internal.j r2 = com.google.android.gms.common.internal.C5264o.f10721b     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            r5.<init>()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            r5.append(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            r5.append(r9)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
            r2.m13290g(r1, r5)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
        L6b:
            if (r4 == 0) goto L97
            la.C9467l.m28157a(r4)
            goto L97
        L71:
            r9 = move-exception
            r3 = r4
            goto La8
        L74:
            r2 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L7d
        L79:
            r9 = move-exception
            goto La8
        L7b:
            r2 = move-exception
            r4 = r3
        L7d:
            com.google.android.gms.common.internal.j r5 = com.google.android.gms.common.internal.C5264o.f10721b     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r6.<init>()     // Catch: java.lang.Throwable -> L79
            r6.append(r0)     // Catch: java.lang.Throwable -> L79
            r6.append(r9)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L79
            r5.m13287d(r1, r0, r2)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L96
            la.C9467l.m28157a(r3)
        L96:
            r3 = r4
        L97:
            if (r3 != 0) goto La2
            com.google.android.gms.common.internal.j r0 = com.google.android.gms.common.internal.C5264o.f10721b
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.m13285b(r1, r2)
            java.lang.String r3 = "UNKNOWN"
        La2:
            java.util.concurrent.ConcurrentHashMap r0 = r8.f10723a
            r0.put(r9, r3)
            return r3
        La8:
            if (r3 == 0) goto Lad
            la.C9467l.m28157a(r3)
        Lad:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C5264o.m13301b(java.lang.String):java.lang.String");
    }
}
