package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e0;
import androidx.work.impl.t;
import f2.j;
import f2.n;
import f2.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k2.i;
import k2.l;
import k2.m;
import k2.u;
import k2.v;
import k2.x;
import l2.k;

/* loaded from: classes.dex */
public class g implements t {

    /* renamed from: e, reason: collision with root package name */
    private static final String f5792e = j.i("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f5793a;

    /* renamed from: b, reason: collision with root package name */
    private final JobScheduler f5794b;

    /* renamed from: c, reason: collision with root package name */
    private final e0 f5795c;

    /* renamed from: d, reason: collision with root package name */
    private final f f5796d;

    public g(Context context, e0 e0Var) {
        this(context, e0Var, (JobScheduler) context.getSystemService("jobscheduler"), new f(context));
    }

    public g(Context context, e0 e0Var, JobScheduler jobScheduler, f fVar) {
        this.f5793a = context;
        this.f5795c = e0Var;
        this.f5794b = jobScheduler;
        this.f5796d = fVar;
    }

    public static void b(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g10 = g(context, jobScheduler)) == null || g10.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = g10.iterator();
        while (it.hasNext()) {
            d(jobScheduler, it.next().getId());
        }
    }

    private static void d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            j.e().d(f5792e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            m h10 = h(jobInfo);
            if (h10 != null && str.equals(h10.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            j.e().d(f5792e, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, e0 e0Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> d10 = e0Var.r().G().d();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                m h10 = h(jobInfo);
                if (h10 != null) {
                    hashSet.add(h10.b());
                } else {
                    d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = d10.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                j.e().a(f5792e, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (z10) {
            WorkDatabase r10 = e0Var.r();
            r10.e();
            try {
                v J = r10.J();
                Iterator<String> it2 = d10.iterator();
                while (it2.hasNext()) {
                    J.n(it2.next(), -1L);
                }
                r10.B();
            } finally {
                r10.i();
            }
        }
        return z10;
    }

    @Override // androidx.work.impl.t
    public void a(u... uVarArr) {
        WorkDatabase r10 = this.f5795c.r();
        k kVar = new k(r10);
        for (u uVar : uVarArr) {
            r10.e();
            try {
                u h10 = r10.J().h(uVar.f20223a);
                if (h10 == null) {
                    j.e().k(f5792e, "Skipping scheduling " + uVar.f20223a + " because it's no longer in the DB");
                } else if (h10.f20224b != s.a.ENQUEUED) {
                    j.e().k(f5792e, "Skipping scheduling " + uVar.f20223a + " because it is no longer enqueued");
                } else {
                    m a10 = x.a(uVar);
                    i e10 = r10.G().e(a10);
                    int e11 = e10 != null ? e10.f20196c : kVar.e(this.f5795c.k().i(), this.f5795c.k().g());
                    if (e10 == null) {
                        this.f5795c.r().G().c(l.a(a10, e11));
                    }
                    j(uVar, e11);
                }
                r10.B();
            } finally {
                r10.i();
            }
        }
    }

    @Override // androidx.work.impl.t
    public void c(String str) {
        List<Integer> f10 = f(this.f5793a, this.f5794b, str);
        if (f10 == null || f10.isEmpty()) {
            return;
        }
        Iterator<Integer> it = f10.iterator();
        while (it.hasNext()) {
            d(this.f5794b, it.next().intValue());
        }
        this.f5795c.r().G().g(str);
    }

    @Override // androidx.work.impl.t
    public boolean e() {
        return true;
    }

    public void j(u uVar, int i10) {
        JobInfo a10 = this.f5796d.a(uVar, i10);
        j e10 = j.e();
        String str = f5792e;
        e10.a(str, "Scheduling work ID " + uVar.f20223a + "Job ID " + i10);
        try {
            if (this.f5794b.schedule(a10) == 0) {
                j.e().k(str, "Unable to schedule work ID " + uVar.f20223a);
                if (uVar.f20239q && uVar.f20240r == n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    uVar.f20239q = false;
                    j.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", uVar.f20223a));
                    j(uVar, i10);
                }
            }
        } catch (IllegalStateException e11) {
            List<JobInfo> g10 = g(this.f5793a, this.f5794b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g10 != null ? g10.size() : 0), Integer.valueOf(this.f5795c.r().J().e().size()), Integer.valueOf(this.f5795c.k().h()));
            j.e().c(f5792e, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e11);
            androidx.core.util.a<Throwable> l10 = this.f5795c.k().l();
            if (l10 == null) {
                throw illegalStateException;
            }
            l10.accept(illegalStateException);
        } catch (Throwable th2) {
            j.e().d(f5792e, "Unable to schedule " + uVar, th2);
        }
    }
}
