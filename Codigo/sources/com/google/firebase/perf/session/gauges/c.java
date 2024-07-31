package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c {

    /* renamed from: g, reason: collision with root package name */
    private static final re.a f12333g = re.a.e();

    /* renamed from: h, reason: collision with root package name */
    private static final long f12334h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: e, reason: collision with root package name */
    private ScheduledFuture f12339e = null;

    /* renamed from: f, reason: collision with root package name */
    private long f12340f = -1;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue<xe.e> f12335a = new ConcurrentLinkedQueue<>();

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f12336b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    private final String f12337c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* renamed from: d, reason: collision with root package name */
    private final long f12338d = e();

    private long d(long j10) {
        return Math.round((j10 / this.f12338d) * f12334h);
    }

    private long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean f(long j10) {
        return j10 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(com.google.firebase.perf.util.l lVar) {
        xe.e m10 = m(lVar);
        if (m10 != null) {
            this.f12335a.add(m10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(com.google.firebase.perf.util.l lVar) {
        xe.e m10 = m(lVar);
        if (m10 != null) {
            this.f12335a.add(m10);
        }
    }

    private synchronized void i(final com.google.firebase.perf.util.l lVar) {
        try {
            this.f12336b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.g(lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f12333g.j("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    private synchronized void j(long j10, final com.google.firebase.perf.util.l lVar) {
        this.f12340f = j10;
        try {
            this.f12339e = this.f12336b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.h(lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f12333g.j("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    private xe.e m(com.google.firebase.perf.util.l lVar) {
        re.a aVar;
        StringBuilder sb2;
        String str;
        if (lVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f12337c));
            try {
                long b10 = lVar.b();
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                xe.e build = xe.e.f0().I(b10).J(d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).K(d(parseLong + parseLong2)).build();
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
            aVar = f12333g;
            sb2 = new StringBuilder();
            str = "Unable to read 'proc/[pid]/stat' file: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            aVar.j(sb2.toString());
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            aVar = f12333g;
            sb2 = new StringBuilder();
            str = "Unexpected '/proc/[pid]/stat' file format encountered: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            aVar.j(sb2.toString());
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            aVar = f12333g;
            sb2 = new StringBuilder();
            str = "Unexpected '/proc/[pid]/stat' file format encountered: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            aVar.j(sb2.toString());
            return null;
        } catch (NumberFormatException e13) {
            e = e13;
            aVar = f12333g;
            sb2 = new StringBuilder();
            str = "Unexpected '/proc/[pid]/stat' file format encountered: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            aVar.j(sb2.toString());
            return null;
        }
    }

    public void c(com.google.firebase.perf.util.l lVar) {
        i(lVar);
    }

    public void k(long j10, com.google.firebase.perf.util.l lVar) {
        long j11 = this.f12338d;
        if (j11 == -1 || j11 == 0 || f(j10)) {
            return;
        }
        if (this.f12339e == null) {
            j(j10, lVar);
        } else if (this.f12340f != j10) {
            l();
            j(j10, lVar);
        }
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.f12339e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f12339e = null;
        this.f12340f = -1L;
    }
}
