package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzawt extends zzaxx {
    private final Activity zzi;
    private final View zzj;

    public zzawt(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11, View view, Activity activity) {
        super(zzawjVar, "sA157cQy3kuoY6/Q8khf6XMDmxSzcYyzmkuwKzX0O8QIfXTfkmyj/S2OF9jehLNc", "FdxRYG9/HOndmgVdj1eVgDulreHUGSjsWl31nKn2TzY=", zzasgVar, i10, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        if (this.zzj == null) {
            return;
        }
        boolean booleanValue = ((Boolean) a0.c().zza(zzbgc.zzcu)).booleanValue();
        Object[] objArr = (Object[]) this.zzf.invoke(null, this.zzj, this.zzi, Boolean.valueOf(booleanValue));
        synchronized (this.zze) {
            this.zze.zzc(((Long) objArr[0]).longValue());
            this.zze.zze(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zze.zzd((String) objArr[2]);
            }
        }
    }
}
