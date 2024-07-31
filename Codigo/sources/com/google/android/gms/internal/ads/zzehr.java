package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import g9.u;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzehr extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ u zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzehr(zzehs zzehsVar, AlertDialog alertDialog, Timer timer, u uVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = uVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        u uVar = this.zzc;
        if (uVar != null) {
            uVar.zzb();
        }
    }
}
