package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import com.google.common.util.concurrent.f;
import f2.e;
import f2.v;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    private Context f5714a;

    /* renamed from: b */
    private WorkerParameters f5715b;

    /* renamed from: c */
    private volatile boolean f5716c;

    /* renamed from: d */
    private boolean f5717d;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.c$a$a */
        /* loaded from: classes.dex */
        public static final class C0093a extends a {

            /* renamed from: a */
            private final androidx.work.b f5718a;

            public C0093a() {
                this(androidx.work.b.f5711c);
            }

            public C0093a(androidx.work.b bVar) {
                this.f5718a = bVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0093a.class != obj.getClass()) {
                    return false;
                }
                return this.f5718a.equals(((C0093a) obj).f5718a);
            }

            public androidx.work.b f() {
                return this.f5718a;
            }

            public int hashCode() {
                return (C0093a.class.getName().hashCode() * 31) + this.f5718a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f5718a + '}';
            }
        }

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
        public static final class C0094c extends a {

            /* renamed from: a */
            private final androidx.work.b f5719a;

            public C0094c() {
                this(androidx.work.b.f5711c);
            }

            public C0094c(androidx.work.b bVar) {
                this.f5719a = bVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0094c.class != obj.getClass()) {
                    return false;
                }
                return this.f5719a.equals(((C0094c) obj).f5719a);
            }

            public androidx.work.b f() {
                return this.f5719a;
            }

            public int hashCode() {
                return (C0094c.class.getName().hashCode() * 31) + this.f5719a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f5719a + '}';
            }
        }

        a() {
        }

        public static a a() {
            return new C0093a();
        }

        public static a b(androidx.work.b bVar) {
            return new C0093a(bVar);
        }

        public static a c() {
            return new b();
        }

        public static a d() {
            return new C0094c();
        }

        public static a e(androidx.work.b bVar) {
            return new C0094c(bVar);
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f5714a = context;
        this.f5715b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f5714a;
    }

    public Executor getBackgroundExecutor() {
        return this.f5715b.a();
    }

    public f<e> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
        s10.p(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return s10;
    }

    public final UUID getId() {
        return this.f5715b.c();
    }

    public final b getInputData() {
        return this.f5715b.d();
    }

    public final Network getNetwork() {
        return this.f5715b.e();
    }

    public final int getRunAttemptCount() {
        return this.f5715b.g();
    }

    public final Set<String> getTags() {
        return this.f5715b.h();
    }

    public m2.b getTaskExecutor() {
        return this.f5715b.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f5715b.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f5715b.k();
    }

    public v getWorkerFactory() {
        return this.f5715b.l();
    }

    public final boolean isStopped() {
        return this.f5716c;
    }

    public final boolean isUsed() {
        return this.f5717d;
    }

    public void onStopped() {
    }

    public final f<Void> setForegroundAsync(e eVar) {
        return this.f5715b.b().a(getApplicationContext(), getId(), eVar);
    }

    public f<Void> setProgressAsync(b bVar) {
        return this.f5715b.f().a(getApplicationContext(), getId(), bVar);
    }

    public final void setUsed() {
        this.f5717d = true;
    }

    public abstract f<a> startWork();

    public final void stop() {
        this.f5716c = true;
        onStopped();
    }
}
