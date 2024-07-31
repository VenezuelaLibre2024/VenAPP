package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzfnc implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final zzcei zzf;
    private int zzi;
    private final zzdtx zzj;
    private final List zzk;
    private final zzefb zzm;
    private final zzbzq zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfnh zzg = zzfnk.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzfnc(Context context, zzcei zzceiVar, zzdtx zzdtxVar, zzefb zzefbVar, zzbzq zzbzqVar) {
        this.zze = context;
        this.zzf = zzceiVar;
        this.zzj = zzdtxVar;
        this.zzm = zzefbVar;
        this.zzn = zzbzqVar;
        this.zzk = ((Boolean) a0.c().zza(zzbgc.zziJ)).booleanValue() ? j2.F() : zzgaa.zzl();
    }

    public static boolean zza() {
        boolean booleanValue;
        Boolean valueOf;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbht.zzb.zze()).booleanValue()) {
                    valueOf = Boolean.valueOf(Math.random() < ((Double) zzbht.zza.zze()).doubleValue());
                } else {
                    valueOf = Boolean.FALSE;
                }
                zzb = valueOf;
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzax;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzax = ((zzfnk) this.zzg.zzal()).zzax();
                        this.zzg.zzc();
                    }
                    new zzefa(this.zze, this.zzf.zza, this.zzn, Binder.getCallingUid()).zza(new zzeey((String) a0.c().zza(zzbgc.zziD), 60000, new HashMap(), zzax, "application/x-protobuf", false));
                } catch (Exception e10) {
                    if ((e10 instanceof zzead) && ((zzead) e10).zza() == 3) {
                        return;
                    }
                    t.q().zzv(e10, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(zzfms zzfmsVar) {
        zzcep.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnb
            public final /* synthetic */ zzfms zzb;

            public /* synthetic */ zzfnb(zzfms zzfmsVar2) {
                r2 = zzfmsVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzfnc.this.zzc(r2);
            }
        });
    }

    public final /* synthetic */ void zzc(zzfms zzfmsVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    try {
                        t.r();
                        this.zzh = j2.R(this.zze);
                    } catch (RemoteException e10) {
                        t.q().zzw(e10, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = ca.g.f().a(this.zze);
                    int intValue = ((Integer) a0.c().zza(zzbgc.zziE)).intValue();
                    if (((Boolean) a0.c().zza(zzbgc.zzlk)).booleanValue()) {
                        long j10 = intValue;
                        zzcep.zzd.scheduleWithFixedDelay(this, j10, j10, TimeUnit.MILLISECONDS);
                    } else {
                        long j11 = intValue;
                        zzcep.zzd.scheduleAtFixedRate(this, j11, j11, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzfmsVar != null) {
            synchronized (zzc) {
                if (this.zzg.zza() >= ((Integer) a0.c().zza(zzbgc.zziF)).intValue()) {
                    return;
                }
                zzfne zza2 = zzfnf.zza();
                zza2.zzt(zzfmsVar.zzl());
                zza2.zzp(zzfmsVar.zzk());
                zza2.zzg(zzfmsVar.zzb());
                zza2.zzv(3);
                zza2.zzm(this.zzf.zza);
                zza2.zzb(this.zzh);
                zza2.zzk(Build.VERSION.RELEASE);
                zza2.zzq(Build.VERSION.SDK_INT);
                zza2.zzu(zzfmsVar.zzn());
                zza2.zzj(zzfmsVar.zza());
                zza2.zze(this.zzi);
                zza2.zzs(zzfmsVar.zzm());
                zza2.zzc(zzfmsVar.zzd());
                zza2.zzf(zzfmsVar.zzf());
                zza2.zzh(zzfmsVar.zzg());
                zza2.zzi(this.zzj.zzc(zzfmsVar.zzg()));
                zza2.zzl(zzfmsVar.zzh());
                zza2.zzd(zzfmsVar.zze());
                zza2.zzr(zzfmsVar.zzj());
                zza2.zzn(zzfmsVar.zzi());
                zza2.zzo(zzfmsVar.zzc());
                if (((Boolean) a0.c().zza(zzbgc.zziJ)).booleanValue()) {
                    zza2.zza(this.zzk);
                }
                zzfnh zzfnhVar = this.zzg;
                zzfni zza3 = zzfnj.zza();
                zza3.zza(zza2);
                zzfnhVar.zzb(zza3);
            }
        }
    }
}
