package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.futures.C1583c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p094f2.AbstractC7289v;
import p094f2.C7272e;
import p230m2.InterfaceC9536b;

/* renamed from: androidx.work.c */
/* loaded from: classes.dex */
public abstract class AbstractC1523c {

    /* renamed from: a */
    private Context f6565a;

    /* renamed from: b */
    private WorkerParameters f6566b;

    /* renamed from: c */
    private volatile boolean f6567c;

    /* renamed from: d */
    private boolean f6568d;

    /* renamed from: androidx.work.c$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13172a extends a {

            /* renamed from: a */
            private final C1522b f6569a;

            public C13172a() {
                this(C1522b.f6562c);
            }

            public C13172a(C1522b c1522b) {
                this.f6569a = c1522b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C13172a.class != obj.getClass()) {
                    return false;
                }
                return this.f6569a.equals(((C13172a) obj).f6569a);
            }

            /* renamed from: f */
            public C1522b m8552f() {
                return this.f6569a;
            }

            public int hashCode() {
                return (C13172a.class.getName().hashCode() * 31) + this.f6569a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f6569a + '}';
            }
        }

        /* renamed from: androidx.work.c$a$b */
        /* loaded from: classes.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.c$a$c */
        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a */
            private final C1522b f6570a;

            public c() {
                this(C1522b.f6562c);
            }

            public c(C1522b c1522b) {
                this.f6570a = c1522b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f6570a.equals(((c) obj).f6570a);
            }

            /* renamed from: f */
            public C1522b m8553f() {
                return this.f6570a;
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f6570a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f6570a + '}';
            }
        }

        a() {
        }

        /* renamed from: a */
        public static a m8547a() {
            return new C13172a();
        }

        /* renamed from: b */
        public static a m8548b(C1522b c1522b) {
            return new C13172a(c1522b);
        }

        /* renamed from: c */
        public static a m8549c() {
            return new b();
        }

        /* renamed from: d */
        public static a m8550d() {
            return new c();
        }

        /* renamed from: e */
        public static a m8551e(C1522b c1522b) {
            return new c(c1522b);
        }
    }

    public AbstractC1523c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f6565a = context;
        this.f6566b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f6565a;
    }

    public Executor getBackgroundExecutor() {
        return this.f6566b.m8494a();
    }

    public InterfaceFutureC5920f<C7272e> getForegroundInfoAsync() {
        C1583c m8801s = C1583c.m8801s();
        m8801s.mo8791p(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return m8801s;
    }

    public final UUID getId() {
        return this.f6566b.m8496c();
    }

    public final C1522b getInputData() {
        return this.f6566b.m8497d();
    }

    public final Network getNetwork() {
        return this.f6566b.m8498e();
    }

    public final int getRunAttemptCount() {
        return this.f6566b.m8500g();
    }

    public final Set<String> getTags() {
        return this.f6566b.m8501h();
    }

    public InterfaceC9536b getTaskExecutor() {
        return this.f6566b.m8502i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f6566b.m8503j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f6566b.m8504k();
    }

    public AbstractC7289v getWorkerFactory() {
        return this.f6566b.m8505l();
    }

    public final boolean isStopped() {
        return this.f6567c;
    }

    public final boolean isUsed() {
        return this.f6568d;
    }

    public void onStopped() {
    }

    public final InterfaceFutureC5920f<Void> setForegroundAsync(C7272e c7272e) {
        return this.f6566b.m8495b().mo21759a(getApplicationContext(), getId(), c7272e);
    }

    public InterfaceFutureC5920f<Void> setProgressAsync(C1522b c1522b) {
        return this.f6566b.m8499f().mo21788a(getApplicationContext(), getId(), c1522b);
    }

    public final void setUsed() {
        this.f6568d = true;
    }

    public abstract InterfaceFutureC5920f<a> startWork();

    public final void stop() {
        this.f6567c = true;
        onStopped();
    }
}
