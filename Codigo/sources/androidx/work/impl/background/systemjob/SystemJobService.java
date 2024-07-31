package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import androidx.work.impl.e0;
import androidx.work.impl.v;
import androidx.work.impl.w;
import f2.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import k2.m;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements androidx.work.impl.e {

    /* renamed from: d, reason: collision with root package name */
    private static final String f5785d = j.i("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    private e0 f5786a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<m, JobParameters> f5787b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final w f5788c = new w();

    /* loaded from: classes.dex */
    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static Network a(JobParameters jobParameters) {
            Network network;
            network = jobParameters.getNetwork();
            return network;
        }
    }

    private static m a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(m mVar, boolean z10) {
        JobParameters remove;
        j.e().a(f5785d, mVar.b() + " executed on JobScheduler");
        synchronized (this.f5787b) {
            remove = this.f5787b.remove(mVar);
        }
        this.f5788c.b(mVar);
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            e0 m10 = e0.m(getApplicationContext());
            this.f5786a = m10;
            m10.o().g(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            j.e().k(f5785d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        e0 e0Var = this.f5786a;
        if (e0Var != null) {
            e0Var.o().n(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f5786a == null) {
            j.e().a(f5785d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        m a10 = a(jobParameters);
        if (a10 == null) {
            j.e().c(f5785d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f5787b) {
            if (this.f5787b.containsKey(a10)) {
                j.e().a(f5785d, "Job is already being executed by SystemJobService: " + a10);
                return false;
            }
            j.e().a(f5785d, "onStartJob for " + a10);
            this.f5787b.put(a10, jobParameters);
            int i10 = Build.VERSION.SDK_INT;
            WorkerParameters.a aVar = new WorkerParameters.a();
            if (a.b(jobParameters) != null) {
                aVar.f5680b = Arrays.asList(a.b(jobParameters));
            }
            if (a.a(jobParameters) != null) {
                aVar.f5679a = Arrays.asList(a.a(jobParameters));
            }
            if (i10 >= 28) {
                aVar.f5681c = b.a(jobParameters);
            }
            this.f5786a.y(this.f5788c.d(a10), aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f5786a == null) {
            j.e().a(f5785d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        m a10 = a(jobParameters);
        if (a10 == null) {
            j.e().c(f5785d, "WorkSpec id not found!");
            return false;
        }
        j.e().a(f5785d, "onStopJob for " + a10);
        synchronized (this.f5787b) {
            this.f5787b.remove(a10);
        }
        v b10 = this.f5788c.b(a10);
        if (b10 != null) {
            this.f5786a.A(b10);
        }
        return !this.f5786a.o().j(a10.b());
    }
}
