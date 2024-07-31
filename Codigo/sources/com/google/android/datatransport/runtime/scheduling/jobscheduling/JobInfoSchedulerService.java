package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import h6.p;
import h6.u;
import s6.a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        u.f(getApplicationContext());
        p.a d10 = p.a().b(string).d(a.b(i10));
        if (string2 != null) {
            d10.c(Base64.decode(string2, 0));
        }
        u.c().e().v(d10.a(), i11, new Runnable() { // from class: o6.e

            /* renamed from: b */
            public final /* synthetic */ JobParameters f22253b;

            public /* synthetic */ e(JobParameters jobParameters2) {
                r2 = jobParameters2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.b(r2);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
