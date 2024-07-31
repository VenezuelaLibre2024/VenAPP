package p266o6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p132h6.AbstractC7646p;
import p215l6.C9399a;
import p289p6.InterfaceC10067d;
import p349s6.C10801a;

/* renamed from: o6.d */
/* loaded from: classes.dex */
public class C9796d implements InterfaceC9816x {

    /* renamed from: a */
    private final Context f24182a;

    /* renamed from: b */
    private final InterfaceC10067d f24183b;

    /* renamed from: c */
    private final AbstractC9798f f24184c;

    public C9796d(Context context, InterfaceC10067d interfaceC10067d, AbstractC9798f abstractC9798f) {
        this.f24182a = context;
        this.f24183b = interfaceC10067d;
        this.f24184c = abstractC9798f;
    }

    /* renamed from: d */
    private boolean m29437d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // p266o6.InterfaceC9816x
    /* renamed from: a */
    public void mo29438a(AbstractC7646p abstractC7646p, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f24182a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f24182a.getSystemService("jobscheduler");
        int m29440c = m29440c(abstractC7646p);
        if (!z10 && m29437d(jobScheduler, m29440c, i10)) {
            C9399a.m27989b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC7646p);
            return;
        }
        long mo30028n0 = this.f24183b.mo30028n0(abstractC7646p);
        JobInfo.Builder m29447c = this.f24184c.m29447c(new JobInfo.Builder(m29440c, componentName), abstractC7646p.mo23193d(), mo30028n0, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", abstractC7646p.mo23191b());
        persistableBundle.putInt("priority", C10801a.m32912a(abstractC7646p.mo23193d()));
        if (abstractC7646p.mo23192c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC7646p.mo23192c(), 0));
        }
        m29447c.setExtras(persistableBundle);
        C9399a.m27990c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC7646p, Integer.valueOf(m29440c), Long.valueOf(this.f24184c.m29448g(abstractC7646p.mo23193d(), mo30028n0, i10)), Long.valueOf(mo30028n0), Integer.valueOf(i10));
        jobScheduler.schedule(m29447c.build());
    }

    @Override // p266o6.InterfaceC9816x
    /* renamed from: b */
    public void mo29439b(AbstractC7646p abstractC7646p, int i10) {
        mo29438a(abstractC7646p, i10, false);
    }

    /* renamed from: c */
    int m29440c(AbstractC7646p abstractC7646p) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f24182a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC7646p.mo23191b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C10801a.m32912a(abstractC7646p.mo23193d())).array());
        if (abstractC7646p.mo23192c() != null) {
            adler32.update(abstractC7646p.mo23192c());
        }
        return (int) adler32.getValue();
    }
}
