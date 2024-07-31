package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzaf implements e {
    private final TaskCompletionSource zza;

    public zzaf(TaskCompletionSource taskCompletionSource) {
        s.j(taskCompletionSource);
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void setFailedResult(Status status) {
        if (status == null) {
            return;
        }
        this.zza.setException(new b(status));
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final /* synthetic */ void setResult(Object obj) {
        x.b((Status) obj, null, this.zza);
    }
}
