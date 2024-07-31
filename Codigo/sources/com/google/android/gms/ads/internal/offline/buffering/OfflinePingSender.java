package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbwm;

/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* renamed from: f, reason: collision with root package name */
    private final zzbwm f8881f;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f8881f = x.a().k(context, new zzbsr());
    }

    @Override // androidx.work.Worker
    public final c.a doWork() {
        try {
            this.f8881f.zzh();
            return c.a.d();
        } catch (RemoteException unused) {
            return c.a.a();
        }
    }
}
