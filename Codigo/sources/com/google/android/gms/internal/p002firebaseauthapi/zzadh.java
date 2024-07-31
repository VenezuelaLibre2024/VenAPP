package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class zzadh {
    zzacg zza;
    Executor zzb;

    public final <ResultT> Task<ResultT> zza(final zzadj<ResultT> zzadjVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzadg
            @Override // java.lang.Runnable
            public final void run() {
                zzadjVar.zza(taskCompletionSource, zzadh.this.zza);
            }
        });
        return taskCompletionSource.getTask();
    }
}
