package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    private final g f9486a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9487b;

    /* renamed from: c, reason: collision with root package name */
    private final b f9488c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9489d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9490e;

    w0(g gVar, int i10, b bVar, long j10, long j11, String str, String str2) {
        this.f9486a = gVar;
        this.f9487b = i10;
        this.f9488c = bVar;
        this.f9489d = j10;
        this.f9490e = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w0 a(g gVar, int i10, b bVar) {
        boolean z10;
        if (!gVar.g()) {
            return null;
        }
        com.google.android.gms.common.internal.u a10 = com.google.android.gms.common.internal.t.b().a();
        if (a10 == null) {
            z10 = true;
        } else {
            if (!a10.w1()) {
                return null;
            }
            z10 = a10.x1();
            l0 x10 = gVar.x(bVar);
            if (x10 != null) {
                if (!(x10.s() instanceof com.google.android.gms.common.internal.c)) {
                    return null;
                }
                com.google.android.gms.common.internal.c cVar = (com.google.android.gms.common.internal.c) x10.s();
                if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                    com.google.android.gms.common.internal.f b10 = b(x10, cVar, i10);
                    if (b10 == null) {
                        return null;
                    }
                    x10.D();
                    z10 = b10.y1();
                }
            }
        }
        return new w0(gVar, i10, bVar, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static com.google.android.gms.common.internal.f b(l0 l0Var, com.google.android.gms.common.internal.c cVar, int i10) {
        int[] v12;
        int[] w12;
        com.google.android.gms.common.internal.f telemetryConfiguration = cVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.x1() || ((v12 = telemetryConfiguration.v1()) != null ? !la.b.a(v12, i10) : !((w12 = telemetryConfiguration.w1()) == null || !la.b.a(w12, i10))) || l0Var.p() >= telemetryConfiguration.u1()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        l0 x10;
        int i10;
        int i11;
        int i12;
        int u12;
        long j10;
        long j11;
        int i13;
        if (this.f9486a.g()) {
            com.google.android.gms.common.internal.u a10 = com.google.android.gms.common.internal.t.b().a();
            if ((a10 == null || a10.w1()) && (x10 = this.f9486a.x(this.f9488c)) != null && (x10.s() instanceof com.google.android.gms.common.internal.c)) {
                com.google.android.gms.common.internal.c cVar = (com.google.android.gms.common.internal.c) x10.s();
                int i14 = 0;
                boolean z10 = this.f9489d > 0;
                int gCoreServiceId = cVar.getGCoreServiceId();
                if (a10 != null) {
                    z10 &= a10.x1();
                    int u13 = a10.u1();
                    int v12 = a10.v1();
                    i10 = a10.y1();
                    if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                        com.google.android.gms.common.internal.f b10 = b(x10, cVar, this.f9487b);
                        if (b10 == null) {
                            return;
                        }
                        boolean z11 = b10.y1() && this.f9489d > 0;
                        v12 = b10.u1();
                        z10 = z11;
                    }
                    i12 = u13;
                    i11 = v12;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                g gVar = this.f9486a;
                if (task.isSuccessful()) {
                    u12 = 0;
                } else {
                    if (task.isCanceled()) {
                        i14 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.b) {
                            Status status = ((com.google.android.gms.common.api.b) exception).getStatus();
                            int v13 = status.v1();
                            ca.b u14 = status.u1();
                            u12 = u14 == null ? -1 : u14.u1();
                            i14 = v13;
                        } else {
                            i14 = 101;
                        }
                    }
                    u12 = -1;
                }
                if (z10) {
                    long j12 = this.f9489d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i13 = (int) (SystemClock.elapsedRealtime() - this.f9490e);
                    j10 = j12;
                    j11 = currentTimeMillis;
                } else {
                    j10 = 0;
                    j11 = 0;
                    i13 = -1;
                }
                gVar.J(new com.google.android.gms.common.internal.p(this.f9487b, i14, u12, j10, j11, null, null, gCoreServiceId, i13), i10, i12, i11);
            }
        }
    }
}
