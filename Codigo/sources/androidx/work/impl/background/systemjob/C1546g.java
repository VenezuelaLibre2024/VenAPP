package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.core.util.InterfaceC0977a;
import androidx.work.impl.C1553e0;
import androidx.work.impl.InterfaceC1579t;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p094f2.AbstractC7277j;
import p094f2.C7286s;
import p094f2.EnumC7281n;
import p192k2.C9120i;
import p192k2.C9123l;
import p192k2.C9124m;
import p192k2.C9132u;
import p192k2.C9135x;
import p192k2.InterfaceC9133v;
import p211l2.C9359k;

/* renamed from: androidx.work.impl.background.systemjob.g */
/* loaded from: classes.dex */
public class C1546g implements InterfaceC1579t {

    /* renamed from: e */
    private static final String f6643e = AbstractC7277j.m21769i("SystemJobScheduler");

    /* renamed from: a */
    private final Context f6644a;

    /* renamed from: b */
    private final JobScheduler f6645b;

    /* renamed from: c */
    private final C1553e0 f6646c;

    /* renamed from: d */
    private final C1545f f6647d;

    public C1546g(Context context, C1553e0 c1553e0) {
        this(context, c1553e0, (JobScheduler) context.getSystemService("jobscheduler"), new C1545f(context));
    }

    public C1546g(Context context, C1553e0 c1553e0, JobScheduler jobScheduler, C1545f c1545f) {
        this.f6644a = context;
        this.f6646c = c1553e0;
        this.f6645b = jobScheduler;
        this.f6647d = c1545f;
    }

    /* renamed from: b */
    public static void m8658b(Context context) {
        List<JobInfo> m8661g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (m8661g = m8661g(context, jobScheduler)) == null || m8661g.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = m8661g.iterator();
        while (it.hasNext()) {
            m8659d(jobScheduler, it.next().getId());
        }
    }

    /* renamed from: d */
    private static void m8659d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            AbstractC7277j.m21767e().mo21773d(f6643e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    /* renamed from: f */
    private static List<Integer> m8660f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> m8661g = m8661g(context, jobScheduler);
        if (m8661g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : m8661g) {
            C9124m m8662h = m8662h(jobInfo);
            if (m8662h != null && str.equals(m8662h.m26876b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static List<JobInfo> m8661g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            AbstractC7277j.m21767e().mo21773d(f6643e, "getAllPendingJobs() is not reliable on this device.", th2);
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

    /* renamed from: h */
    private static C9124m m8662h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C9124m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m8663i(Context context, C1553e0 c1553e0) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> m8661g = m8661g(context, jobScheduler);
        List<String> mo26866d = c1553e0.m8692r().mo8557G().mo26866d();
        boolean z10 = false;
        HashSet hashSet = new HashSet(m8661g != null ? m8661g.size() : 0);
        if (m8661g != null && !m8661g.isEmpty()) {
            for (JobInfo jobInfo : m8661g) {
                C9124m m8662h = m8662h(jobInfo);
                if (m8662h != null) {
                    hashSet.add(m8662h.m26876b());
                } else {
                    m8659d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = mo26866d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                AbstractC7277j.m21767e().mo21770a(f6643e, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (z10) {
            WorkDatabase m8692r = c1553e0.m8692r();
            m8692r.m32253e();
            try {
                InterfaceC9133v mo8560J = m8692r.mo8560J();
                Iterator<String> it2 = mo26866d.iterator();
                while (it2.hasNext()) {
                    mo8560J.mo26915n(it2.next(), -1L);
                }
                m8692r.m32250B();
            } finally {
                m8692r.m32255i();
            }
        }
        return z10;
    }

    @Override // androidx.work.impl.InterfaceC1579t
    /* renamed from: a */
    public void mo8664a(C9132u... c9132uArr) {
        WorkDatabase m8692r = this.f6646c.m8692r();
        C9359k c9359k = new C9359k(m8692r);
        for (C9132u c9132u : c9132uArr) {
            m8692r.m32253e();
            try {
                C9132u mo26909h = m8692r.mo8560J().mo26909h(c9132u.f22005a);
                if (mo26909h == null) {
                    AbstractC7277j.m21767e().mo21777k(f6643e, "Skipping scheduling " + c9132u.f22005a + " because it's no longer in the DB");
                } else if (mo26909h.f22006b != C7286s.a.ENQUEUED) {
                    AbstractC7277j.m21767e().mo21777k(f6643e, "Skipping scheduling " + c9132u.f22005a + " because it is no longer enqueued");
                } else {
                    C9124m m26934a = C9135x.m26934a(c9132u);
                    C9120i mo26867e = m8692r.mo8557G().mo26867e(m26934a);
                    int m27866e = mo26867e != null ? mo26867e.f21978c : c9359k.m27866e(this.f6646c.m8687k().m8514i(), this.f6646c.m8687k().m8512g());
                    if (mo26867e == null) {
                        this.f6646c.m8692r().mo8557G().mo26865c(C9123l.m26874a(m26934a, m27866e));
                    }
                    m8667j(c9132u, m27866e);
                }
                m8692r.m32250B();
            } finally {
                m8692r.m32255i();
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC1579t
    /* renamed from: c */
    public void mo8665c(String str) {
        List<Integer> m8660f = m8660f(this.f6644a, this.f6645b, str);
        if (m8660f == null || m8660f.isEmpty()) {
            return;
        }
        Iterator<Integer> it = m8660f.iterator();
        while (it.hasNext()) {
            m8659d(this.f6645b, it.next().intValue());
        }
        this.f6646c.m8692r().mo8557G().mo26869g(str);
    }

    @Override // androidx.work.impl.InterfaceC1579t
    /* renamed from: e */
    public boolean mo8666e() {
        return true;
    }

    /* renamed from: j */
    public void m8667j(C9132u c9132u, int i10) {
        JobInfo m8657a = this.f6647d.m8657a(c9132u, i10);
        AbstractC7277j m21767e = AbstractC7277j.m21767e();
        String str = f6643e;
        m21767e.mo21770a(str, "Scheduling work ID " + c9132u.f22005a + "Job ID " + i10);
        try {
            if (this.f6645b.schedule(m8657a) == 0) {
                AbstractC7277j.m21767e().mo21777k(str, "Unable to schedule work ID " + c9132u.f22005a);
                if (c9132u.f22021q && c9132u.f22022r == EnumC7281n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c9132u.f22021q = false;
                    AbstractC7277j.m21767e().mo21770a(str, String.format("Scheduling a non-expedited job (work ID %s)", c9132u.f22005a));
                    m8667j(c9132u, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> m8661g = m8661g(this.f6644a, this.f6645b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(m8661g != null ? m8661g.size() : 0), Integer.valueOf(this.f6646c.m8692r().mo8560J().mo26906e().size()), Integer.valueOf(this.f6646c.m8687k().m8513h()));
            AbstractC7277j.m21767e().mo21772c(f6643e, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e10);
            InterfaceC0977a<Throwable> m8517l = this.f6646c.m8687k().m8517l();
            if (m8517l == null) {
                throw illegalStateException;
            }
            m8517l.accept(illegalStateException);
        } catch (Throwable th2) {
            AbstractC7277j.m21767e().mo21773d(f6643e, "Unable to schedule " + c9132u, th2);
        }
    }
}
