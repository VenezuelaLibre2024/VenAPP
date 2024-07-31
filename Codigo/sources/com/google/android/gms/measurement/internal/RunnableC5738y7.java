package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* renamed from: com.google.android.gms.measurement.internal.y7 */
/* loaded from: classes2.dex */
final class RunnableC5738y7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzcv f12079a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f12080b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5738y7(C5442b7 c5442b7, zzcv zzcvVar) {
        this.f12080b = c5442b7;
        this.f12079a = zzcvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.b7 r0 = r7.f12080b
            com.google.android.gms.measurement.internal.da r0 = r0.mo13699p()
            boolean r1 = com.google.android.gms.internal.measurement.zzpr.zza()
            r2 = 0
            if (r1 == 0) goto L64
            com.google.android.gms.measurement.internal.f r1 = r0.mo13672a()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C5474e0.f11214D0
            boolean r1 = r1.m13900n(r3)
            if (r1 == 0) goto L64
            com.google.android.gms.measurement.internal.y4 r1 = r0.mo13679e()
            com.google.android.gms.measurement.internal.y6 r1 = r1.m14553E()
            boolean r1 = r1.m14596y()
            if (r1 != 0) goto L32
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.m14188H()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            goto L6e
        L32:
            com.google.android.gms.measurement.internal.y4 r1 = r0.mo13679e()
            la.f r3 = r0.zzb()
            long r3 = r3.mo28130a()
            boolean r1 = r1.m14565t(r3)
            if (r1 != 0) goto L71
            com.google.android.gms.measurement.internal.y4 r1 = r0.mo13679e()
            com.google.android.gms.measurement.internal.d5 r1 = r1.f12066q
            long r3 = r1.m13720a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L55
            goto L71
        L55:
            com.google.android.gms.measurement.internal.y4 r0 = r0.mo13679e()
            com.google.android.gms.measurement.internal.d5 r0 = r0.f12066q
            long r0 = r0.m13720a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L72
        L64:
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.m14188H()
            java.lang.String r1 = "getSessionId has been disabled."
        L6e:
            r0.m14218a(r1)
        L71:
            r0 = r2
        L72:
            if (r0 == 0) goto L86
            com.google.android.gms.measurement.internal.b7 r1 = r7.f12080b
            com.google.android.gms.measurement.internal.w5 r1 = r1.f11899a
            com.google.android.gms.measurement.internal.ib r1 = r1.m14500G()
            com.google.android.gms.internal.measurement.zzcv r2 = r7.f12079a
            long r3 = r0.longValue()
            r1.m14017K(r2, r3)
            return
        L86:
            com.google.android.gms.internal.measurement.zzcv r0 = r7.f12079a     // Catch: android.os.RemoteException -> L8c
            r0.zza(r2)     // Catch: android.os.RemoteException -> L8c
            return
        L8c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.b7 r1 = r7.f12080b
            com.google.android.gms.measurement.internal.w5 r1 = r1.f11899a
            com.google.android.gms.measurement.internal.n4 r1 = r1.zzj()
            com.google.android.gms.measurement.internal.p4 r1 = r1.m14182B()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.m14219b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC5738y7.run():void");
    }
}
