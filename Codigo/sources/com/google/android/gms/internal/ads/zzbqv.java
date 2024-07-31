package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.f1;
import com.google.android.gms.ads.internal.util.u1;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbqv implements zzbng {
    final /* synthetic */ zzbqe zza;
    final /* synthetic */ f1 zzb;
    final /* synthetic */ zzbrj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqv(zzbrj zzbrjVar, zzavi zzaviVar, zzbqe zzbqeVar, f1 f1Var) {
        this.zza = zzbqeVar;
        this.zzb = f1Var;
        this.zzc = zzbrjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.ads.zzbng] */
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i10;
        u1.a("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            u1.a("loadJavascriptEngine > /requestReload handler: Lock acquired");
            zzcec.zzi("JS Engine is requesting an update");
            i10 = this.zzc.zzi;
            if (i10 == 0) {
                zzcec.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", this.zzb.a());
        }
        u1.a("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
