package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzceh implements zzcdu {
    private final String zza;

    public zzceh() {
        this.zza = null;
    }

    public zzceh(String str) {
        this.zza = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (la.e.a() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e0, code lost:
    
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        if (la.e.a() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
    
        if (la.e.a() == false) goto L40;
     */
    @Override // com.google.android.gms.internal.ads.zzcdu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = ". "
            r1 = 0
            boolean r2 = la.e.a()     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            if (r2 == 0) goto Le
            r2 = 263(0x107, float:3.69E-43)
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
        Le:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            r2.<init>()     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            java.lang.String r3 = "Pinging URL: "
            r2.append(r3)     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            r2.append(r7)     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            java.lang.String r2 = r2.toString()     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            com.google.android.gms.internal.ads.zzcec.zze(r2)     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            r2.<init>(r7)     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            com.google.android.gms.ads.internal.client.x.b()     // Catch: java.lang.Throwable -> L90
            java.lang.String r3 = r6.zza     // Catch: java.lang.Throwable -> L90
            r4 = 60000(0xea60, float:8.4078E-41)
            r2.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L90
            r5 = 1
            r2.setInstanceFollowRedirects(r5)     // Catch: java.lang.Throwable -> L90
            r2.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L46
            java.lang.String r4 = "User-Agent"
            r2.setRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L90
        L46:
            r2.setUseCaches(r1)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzceb r3 = new com.google.android.gms.internal.ads.zzceb     // Catch: java.lang.Throwable -> L90
            r4 = 0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L90
            r3.zzc(r2, r4)     // Catch: java.lang.Throwable -> L90
            int r4 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L90
            r3.zze(r2, r4)     // Catch: java.lang.Throwable -> L90
            r3 = 200(0xc8, float:2.8E-43)
            if (r4 < r3) goto L64
            r3 = 300(0x12c, float:4.2E-43)
            if (r4 < r3) goto L62
            goto L64
        L62:
            r1 = r5
            goto L80
        L64:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r3.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = "Received non-success response code "
            r3.append(r5)     // Catch: java.lang.Throwable -> L90
            r3.append(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = " from pinging URL: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L90
            r3.append(r7)     // Catch: java.lang.Throwable -> L90
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzcec.zzj(r3)     // Catch: java.lang.Throwable -> L90
        L80:
            r2.disconnect()     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            boolean r7 = la.e.a()
            if (r7 == 0) goto Le3
            goto Le0
        L8a:
            r2 = move-exception
            goto L97
        L8c:
            r2 = move-exception
            goto L97
        L8e:
            r2 = move-exception
            goto Lbc
        L90:
            r3 = move-exception
            r2.disconnect()     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
            throw r3     // Catch: java.lang.RuntimeException -> L8a java.io.IOException -> L8c java.lang.IndexOutOfBoundsException -> L8e java.lang.Throwable -> L95
        L95:
            r7 = move-exception
            goto Le4
        L97:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r3.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r4 = "Error while pinging URL: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L95
            r3.append(r7)     // Catch: java.lang.Throwable -> L95
            r3.append(r0)     // Catch: java.lang.Throwable -> L95
            r3.append(r2)     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L95
            com.google.android.gms.internal.ads.zzcec.zzj(r7)     // Catch: java.lang.Throwable -> L95
            boolean r7 = la.e.a()
            if (r7 == 0) goto Le3
            goto Le0
        Lbc:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r3.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r4 = "Error while parsing ping URL: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L95
            r3.append(r7)     // Catch: java.lang.Throwable -> L95
            r3.append(r0)     // Catch: java.lang.Throwable -> L95
            r3.append(r2)     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L95
            com.google.android.gms.internal.ads.zzcec.zzj(r7)     // Catch: java.lang.Throwable -> L95
            boolean r7 = la.e.a()
            if (r7 == 0) goto Le3
        Le0:
            android.net.TrafficStats.clearThreadStatsTag()
        Le3:
            return r1
        Le4:
            boolean r0 = la.e.a()
            if (r0 == 0) goto Led
            android.net.TrafficStats.clearThreadStatsTag()
        Led:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzceh.zza(java.lang.String):boolean");
    }
}
