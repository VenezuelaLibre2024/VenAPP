package o6;

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

/* loaded from: classes.dex */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22249a;

    /* renamed from: b, reason: collision with root package name */
    private final p6.d f22250b;

    /* renamed from: c, reason: collision with root package name */
    private final f f22251c;

    public d(Context context, p6.d dVar, f fVar) {
        this.f22249a = context;
        this.f22250b = dVar;
        this.f22251c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // o6.x
    public void a(h6.p pVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f22249a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f22249a.getSystemService("jobscheduler");
        int c10 = c(pVar);
        if (!z10 && d(jobScheduler, c10, i10)) {
            l6.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long n02 = this.f22250b.n0(pVar);
        JobInfo.Builder c11 = this.f22251c.c(new JobInfo.Builder(c10, componentName), pVar.d(), n02, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", s6.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        c11.setExtras(persistableBundle);
        l6.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c10), Long.valueOf(this.f22251c.g(pVar.d(), n02, i10)), Long.valueOf(n02), Integer.valueOf(i10));
        jobScheduler.schedule(c11.build());
    }

    @Override // o6.x
    public void b(h6.p pVar, int i10) {
        a(pVar, i10, false);
    }

    int c(h6.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f22249a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(s6.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
