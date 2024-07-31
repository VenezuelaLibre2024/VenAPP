package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import zk.j;
import zk.k0;

/* loaded from: classes2.dex */
public final class zzal extends TimerTask {
    final /* synthetic */ zzao zza;

    public zzal(zzao zzaoVar) {
        this.zza = zzaoVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        k0 k0Var;
        k0Var = this.zza.zzd;
        j.d(k0Var, null, null, new zzam(this.zza, null), 3, null);
    }
}
