package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbwm;
import f9.a;

/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: f, reason: collision with root package name */
    private final zzbwm f8880f;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f8880f = x.a().k(context, new zzbsr());
    }

    @Override // androidx.work.Worker
    public final c.a doWork() {
        try {
            this.f8880f.zzj(d.h2(getApplicationContext()), new a(getInputData().l("uri"), getInputData().l("gws_query_id"), getInputData().l("image_url")));
            return c.a.d();
        } catch (RemoteException unused) {
            return c.a.a();
        }
    }
}
