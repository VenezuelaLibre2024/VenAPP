package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import ca.C1894b;
import com.google.android.gms.common.api.C5102b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC5228c;
import com.google.android.gms.common.internal.C5237f;
import com.google.android.gms.common.internal.C5267p;
import com.google.android.gms.common.internal.C5279t;
import com.google.android.gms.common.internal.C5282u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import la.C9457b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.w0 */
/* loaded from: classes.dex */
public final class C5189w0 implements OnCompleteListener {

    /* renamed from: a */
    private final C5135g f10600a;

    /* renamed from: b */
    private final int f10601b;

    /* renamed from: c */
    private final C5115b f10602c;

    /* renamed from: d */
    private final long f10603d;

    /* renamed from: e */
    private final long f10604e;

    C5189w0(C5135g c5135g, int i10, C5115b c5115b, long j10, long j11, String str, String str2) {
        this.f10600a = c5135g;
        this.f10601b = i10;
        this.f10602c = c5115b;
        this.f10603d = j10;
        this.f10604e = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5189w0 m13200a(C5135g c5135g, int i10, C5115b c5115b) {
        boolean z10;
        if (!c5135g.m13065g()) {
            return null;
        }
        C5282u m13342a = C5279t.m13341b().m13342a();
        if (m13342a == null) {
            z10 = true;
        } else {
            if (!m13342a.m13346w1()) {
                return null;
            }
            z10 = m13342a.m13347x1();
            C5156l0 m13068x = c5135g.m13068x(c5115b);
            if (m13068x != null) {
                if (!(m13068x.m13130s() instanceof AbstractC5228c)) {
                    return null;
                }
                AbstractC5228c abstractC5228c = (AbstractC5228c) m13068x.m13130s();
                if (abstractC5228c.hasConnectionInfo() && !abstractC5228c.isConnecting()) {
                    C5237f m13201b = m13201b(m13068x, abstractC5228c, i10);
                    if (m13201b == null) {
                        return null;
                    }
                    m13068x.m13117D();
                    z10 = m13201b.m13251y1();
                }
            }
        }
        return new C5189w0(c5135g, i10, c5115b, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    /* renamed from: b */
    private static C5237f m13201b(C5156l0 c5156l0, AbstractC5228c abstractC5228c, int i10) {
        int[] m13248v1;
        int[] m13249w1;
        C5237f telemetryConfiguration = abstractC5228c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.m13250x1() || ((m13248v1 = telemetryConfiguration.m13248v1()) != null ? !C9457b.m28115a(m13248v1, i10) : !((m13249w1 = telemetryConfiguration.m13249w1()) == null || !C9457b.m28115a(m13249w1, i10))) || c5156l0.m13128p() >= telemetryConfiguration.m13247u1()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        C5156l0 m13068x;
        int i10;
        int i11;
        int i12;
        int m10050u1;
        long j10;
        long j11;
        int i13;
        if (this.f10600a.m13065g()) {
            C5282u m13342a = C5279t.m13341b().m13342a();
            if ((m13342a == null || m13342a.m13346w1()) && (m13068x = this.f10600a.m13068x(this.f10602c)) != null && (m13068x.m13130s() instanceof AbstractC5228c)) {
                AbstractC5228c abstractC5228c = (AbstractC5228c) m13068x.m13130s();
                int i14 = 0;
                boolean z10 = this.f10603d > 0;
                int gCoreServiceId = abstractC5228c.getGCoreServiceId();
                if (m13342a != null) {
                    z10 &= m13342a.m13347x1();
                    int m13344u1 = m13342a.m13344u1();
                    int m13345v1 = m13342a.m13345v1();
                    i10 = m13342a.m13348y1();
                    if (abstractC5228c.hasConnectionInfo() && !abstractC5228c.isConnecting()) {
                        C5237f m13201b = m13201b(m13068x, abstractC5228c, this.f10601b);
                        if (m13201b == null) {
                            return;
                        }
                        boolean z11 = m13201b.m13251y1() && this.f10603d > 0;
                        m13345v1 = m13201b.m13247u1();
                        z10 = z11;
                    }
                    i12 = m13344u1;
                    i11 = m13345v1;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                C5135g c5135g = this.f10600a;
                if (task.isSuccessful()) {
                    m10050u1 = 0;
                } else {
                    if (task.isCanceled()) {
                        i14 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof C5102b) {
                            Status status = ((C5102b) exception).getStatus();
                            int m12969v1 = status.m12969v1();
                            C1894b m12968u1 = status.m12968u1();
                            m10050u1 = m12968u1 == null ? -1 : m12968u1.m10050u1();
                            i14 = m12969v1;
                        } else {
                            i14 = 101;
                        }
                    }
                    m10050u1 = -1;
                }
                if (z10) {
                    long j12 = this.f10603d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i13 = (int) (SystemClock.elapsedRealtime() - this.f10604e);
                    j10 = j12;
                    j11 = currentTimeMillis;
                } else {
                    j10 = 0;
                    j11 = 0;
                    i13 = -1;
                }
                c5135g.m13059J(new C5267p(this.f10601b, i14, m10050u1, j10, j11, null, null, gCoreServiceId, i13), i10, i12, i11);
            }
        }
    }
}
