package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final class zzfui {
    public static com.google.common.util.concurrent.f zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfuh zzfuhVar = new zzfuh(task, null);
        task.addOnCompleteListener(zzgfe.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfug
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfuh zzfuhVar2 = zzfuh.this;
                if (task2.isCanceled()) {
                    zzfuhVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfuhVar2.zzc(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzfuhVar2.zzd(exception);
            }
        });
        return zzfuhVar;
    }
}
