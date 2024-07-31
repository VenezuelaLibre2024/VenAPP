package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbqu implements zzbng {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbri zzb;
    final /* synthetic */ zzbqe zzc;
    final /* synthetic */ zzbrj zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqu(zzbrj zzbrjVar, long j10, zzbri zzbriVar, zzbqe zzbqeVar) {
        this.zza = j10;
        this.zzb = zzbriVar;
        this.zzc = zzbqeVar;
        this.zzd = zzbrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        u1.a("onGmsg /jsLoaded. JsLoaded latency is " + (t.b().a() - this.zza) + " ms.");
        u1.a("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        obj2 = this.zzd.zza;
        synchronized (obj2) {
            u1.a("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzbqe zzbqeVar = this.zzc;
                zzbqeVar.zzq("/log", zzbnf.zzg);
                zzbqeVar.zzq("/result", zzbnf.zzo);
                this.zzb.zzh(this.zzc);
                this.zzd.zzh = this.zzb;
                u1.a("Successfully loaded JS Engine.");
                u1.a("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            u1.a("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
