package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.i1;
import com.google.android.gms.ads.internal.util.t1;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l9.v;
import l9.z;

/* loaded from: classes2.dex */
public abstract class zzclg implements zzcqs {
    private static zzclg zza;

    private static synchronized zzclg zzD(Context context, zzbsv zzbsvVar, int i10, boolean z10, int i11, zzcmk zzcmkVar) {
        synchronized (zzclg.class) {
            zzclg zzclgVar = zza;
            if (zzclgVar != null) {
                return zzclgVar;
            }
            zzbgc.zza(context);
            zzfid zzd = zzfid.zzd(context);
            zzcei zzc = zzd.zzc(240304000, false, i11);
            zzd.zzf(zzbsvVar);
            zzcny zzcnyVar = new zzcny(null);
            zzclh zzclhVar = new zzclh();
            zzclhVar.zzd(zzc);
            zzclhVar.zzc(context);
            zzcnyVar.zzb(new zzclj(zzclhVar, null));
            zzcnyVar.zzc(new zzcpl(zzcmkVar));
            zzclg zza2 = zzcnyVar.zza();
            t.q().zzu(context, zzc);
            t.e().zzi(context);
            t.r().N(context);
            t.r().M(context);
            t1.a(context);
            t.d().zzd(context);
            t.x().b(context);
            zza2.zza().c();
            zzcci.zzd(context);
            if (((Boolean) a0.c().zza(zzbgc.zzgj)).booleanValue()) {
                if (!((Boolean) a0.c().zza(zzbgc.zzav)).booleanValue()) {
                    zzbbp zzbbpVar = new zzbbp(new zzbbv(context));
                    zzefy zzefyVar = new zzefy(new zzefu(context), zza2.zzA());
                    t.r();
                    new zzegu(context, zzc, zzbbpVar, zzefyVar, UUID.randomUUID().toString(), zza2.zzy()).zzb(t.q().zzi().zzQ());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzclg zzb(Context context, zzbsv zzbsvVar, int i10) {
        return zzD(context, zzbsvVar, 240304000, false, i10, new zzcmk());
    }

    public abstract zzgey zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    public abstract i1 zza();

    public abstract zzcpv zzc();

    public abstract zzcts zzd();

    public abstract zzcvb zze();

    public abstract zzddm zzf();

    public abstract zzdkn zzg();

    public abstract zzdlj zzh();

    public abstract zzdss zzi();

    public abstract zzdxo zzj();

    public abstract zzdzd zzk();

    public abstract zzdzx zzl();

    public abstract zzehs zzm();

    public abstract v zzn();

    public abstract z zzo();

    public abstract l9.c zzp();

    @Override // com.google.android.gms.internal.ads.zzcqs
    public final zzeyo zzq(zzbze zzbzeVar, int i10) {
        return zzr(new zzfar(zzbzeVar, i10));
    }

    protected abstract zzeyo zzr(zzfar zzfarVar);

    public abstract zzfbm zzs();

    public abstract zzfda zzt();

    public abstract zzfer zzu();

    public abstract zzfgf zzv();

    public abstract zzfhw zzw();

    public abstract zzfig zzx();

    public abstract zzflw zzy();

    public abstract zzfnc zzz();
}
