package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.location.b;

/* loaded from: classes2.dex */
public final class zzw implements b {
    public final i<Status> removeActivityUpdates(f fVar, PendingIntent pendingIntent) {
        return fVar.b(new zzu(this, fVar, pendingIntent));
    }

    public final i<Status> requestActivityUpdates(f fVar, long j10, PendingIntent pendingIntent) {
        return fVar.b(new zzt(this, fVar, j10, pendingIntent));
    }
}
