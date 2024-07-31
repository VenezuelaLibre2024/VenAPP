package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzayo extends BroadcastReceiver {
    final /* synthetic */ zzayr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayo(zzayr zzayrVar) {
        this.zza = zzayrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzj(3);
    }
}
