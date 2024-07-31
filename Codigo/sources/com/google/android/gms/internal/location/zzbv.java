package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.location.h;
import com.google.android.gms.location.j;
import com.google.android.gms.location.k;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbv implements j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ TaskCompletionSource zza(final e eVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzbq
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                e eVar2 = e.this;
                if (task.isSuccessful()) {
                    eVar2.setResult(Status.f9292r);
                    return;
                }
                if (task.isCanceled()) {
                    eVar2.setFailedResult(Status.f9296v);
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof b) {
                    eVar2.setFailedResult(((b) exception).getStatus());
                } else {
                    eVar2.setFailedResult(Status.f9294t);
                }
            }
        });
        return taskCompletionSource;
    }

    public final i<Status> addGeofences(f fVar, k kVar, PendingIntent pendingIntent) {
        return fVar.b(new zzbr(this, fVar, kVar, pendingIntent));
    }

    @Deprecated
    public final i<Status> addGeofences(f fVar, List<h> list, PendingIntent pendingIntent) {
        k.a aVar = new k.a();
        aVar.b(list);
        aVar.d(5);
        return fVar.b(new zzbr(this, fVar, aVar.c(), pendingIntent));
    }

    public final i<Status> removeGeofences(f fVar, PendingIntent pendingIntent) {
        return fVar.b(new zzbs(this, fVar, pendingIntent));
    }

    public final i<Status> removeGeofences(f fVar, List<String> list) {
        return fVar.b(new zzbt(this, fVar, list));
    }
}
