package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.C6338l;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p444xe.C12472e;
import re.C10696a;

/* renamed from: com.google.firebase.perf.session.gauges.c */
/* loaded from: classes.dex */
public class C6317c {

    /* renamed from: g */
    private static final C10696a f13565g = C10696a.m32565e();

    /* renamed from: h */
    private static final long f13566h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: e */
    private ScheduledFuture f13571e = null;

    /* renamed from: f */
    private long f13572f = -1;

    /* renamed from: a */
    public final ConcurrentLinkedQueue<C12472e> f13567a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private final ScheduledExecutorService f13568b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    private final String f13569c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* renamed from: d */
    private final long f13570d = m17483e();

    /* renamed from: d */
    private long m17482d(long j10) {
        return Math.round((j10 / this.f13570d) * f13566h);
    }

    /* renamed from: e */
    private long m17483e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* renamed from: f */
    public static boolean m17484f(long j10) {
        return j10 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m17485g(C6338l c6338l) {
        C12472e m17489m = m17489m(c6338l);
        if (m17489m != null) {
            this.f13567a.add(m17489m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m17486h(C6338l c6338l) {
        C12472e m17489m = m17489m(c6338l);
        if (m17489m != null) {
            this.f13567a.add(m17489m);
        }
    }

    /* renamed from: i */
    private synchronized void m17487i(final C6338l c6338l) {
        try {
            this.f13568b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() {
                    C6317c.this.m17485g(c6338l);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f13565g.m32574j("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    /* renamed from: j */
    private synchronized void m17488j(long j10, final C6338l c6338l) {
        this.f13572f = j10;
        try {
            this.f13571e = this.f13568b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() {
                    C6317c.this.m17486h(c6338l);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f13565g.m32574j("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    /* renamed from: m */
    private C12472e m17489m(C6338l c6338l) {
        C10696a c10696a;
        StringBuilder sb2;
        String str;
        if (c6338l == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f13569c));
            try {
                long m17531b = c6338l.m17531b();
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                C12472e build = C12472e.m40542f0().m40546I(m17531b).m40547J(m17482d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).m40548K(m17482d(parseLong + parseLong2)).build();
                bufferedReader.close();
                return build;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            e = e10;
            c10696a = f13565g;
            sb2 = new StringBuilder();
            str = "Unable to read 'proc/[pid]/stat' file: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            c10696a.m32574j(sb2.toString());
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            c10696a = f13565g;
            sb2 = new StringBuilder();
            str = "Unexpected '/proc/[pid]/stat' file format encountered: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            c10696a.m32574j(sb2.toString());
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            c10696a = f13565g;
            sb2 = new StringBuilder();
            str = "Unexpected '/proc/[pid]/stat' file format encountered: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            c10696a.m32574j(sb2.toString());
            return null;
        } catch (NumberFormatException e13) {
            e = e13;
            c10696a = f13565g;
            sb2 = new StringBuilder();
            str = "Unexpected '/proc/[pid]/stat' file format encountered: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            c10696a.m32574j(sb2.toString());
            return null;
        }
    }

    /* renamed from: c */
    public void m17490c(C6338l c6338l) {
        m17487i(c6338l);
    }

    /* renamed from: k */
    public void m17491k(long j10, C6338l c6338l) {
        long j11 = this.f13570d;
        if (j11 == -1 || j11 == 0 || m17484f(j10)) {
            return;
        }
        if (this.f13571e == null) {
            m17488j(j10, c6338l);
        } else if (this.f13572f != j10) {
            m17492l();
            m17488j(j10, c6338l);
        }
    }

    /* renamed from: l */
    public void m17492l() {
        ScheduledFuture scheduledFuture = this.f13571e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f13571e = null;
        this.f13572f = -1L;
    }
}
