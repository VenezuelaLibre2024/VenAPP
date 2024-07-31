package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            x.a().k(this, new zzbsr()).zze(intent);
        } catch (RemoteException e10) {
            zzcec.zzg("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }
}
