package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.ads.internal.util.w1;
import com.google.android.gms.ads.internal.util.z1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import la.p;

/* loaded from: classes2.dex */
public final class zzcdl {
    private final Object zza = new Object();
    private final z1 zzb;
    private final zzcdp zzc;
    private boolean zzd;
    private Context zze;
    private zzcei zzf;
    private String zzg;
    private zzbgk zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzcdk zzl;
    private final Object zzm;
    private com.google.common.util.concurrent.f zzn;
    private final AtomicBoolean zzo;

    public zzcdl() {
        z1 z1Var = new z1();
        this.zzb = z1Var;
        this.zzc = new zzcdp(x.d(), z1Var);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new AtomicInteger(0);
        this.zzl = new zzcdk(null);
        this.zzm = new Object();
        this.zzo = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    public final Context zzd() {
        return this.zze;
    }

    public final Resources zze() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) a0.c().zza(zzbgc.zzkq)).booleanValue()) {
                return zzceg.zza(this.zze).getResources();
            }
            zzceg.zza(this.zze).getResources();
            return null;
        } catch (zzcef e10) {
            zzcec.zzk("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final zzbgk zzg() {
        zzbgk zzbgkVar;
        synchronized (this.zza) {
            zzbgkVar = this.zzh;
        }
        return zzbgkVar;
    }

    public final zzcdp zzh() {
        return this.zzc;
    }

    public final w1 zzi() {
        z1 z1Var;
        synchronized (this.zza) {
            z1Var = this.zzb;
        }
        return z1Var;
    }

    public final com.google.common.util.concurrent.f zzk() {
        if (this.zze != null) {
            if (!((Boolean) a0.c().zza(zzbgc.zzcB)).booleanValue()) {
                synchronized (this.zzm) {
                    com.google.common.util.concurrent.f fVar = this.zzn;
                    if (fVar != null) {
                        return fVar;
                    }
                    com.google.common.util.concurrent.f zzb = zzcep.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdg
                        public /* synthetic */ zzcdg() {
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzcdl.this.zzo();
                        }
                    });
                    this.zzn = zzb;
                    return zzb;
                }
            }
        }
        return zzgen.zzh(new ArrayList());
    }

    public final Boolean zzl() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzn() {
        return this.zzg;
    }

    public final /* synthetic */ ArrayList zzo() {
        Context zza = zzbzs.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f10 = na.e.a(zza).f(zza.getApplicationInfo().packageName, RecognitionOptions.AZTEC);
            if (f10.requestedPermissions != null && f10.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = f10.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((f10.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    public final void zzu(Context context, zzcei zzceiVar) {
        zzbgk zzbgkVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzceiVar;
                t.d().zzc(this.zzc);
                this.zzb.m(this.zze);
                zzbxw.zzb(this.zze, this.zzf);
                t.g();
                if (((Boolean) zzbhu.zzc.zze()).booleanValue()) {
                    zzbgkVar = new zzbgk();
                } else {
                    u1.a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbgkVar = null;
                }
                this.zzh = zzbgkVar;
                if (zzbgkVar != null) {
                    zzces.zza(new zzcdh(this).zzb(), "AppState.registerCsiReporter");
                }
                if (p.i()) {
                    if (((Boolean) a0.c().zza(zzbgc.zzim)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcdi(this));
                    }
                }
                this.zzd = true;
                zzk();
            }
        }
        t.r().E(context, zzceiVar.zza);
    }

    public final void zzv(Throwable th2, String str) {
        zzbxw.zzb(this.zze, this.zzf).zzh(th2, str, ((Double) zzbij.zzg.zze()).floatValue());
    }

    public final void zzw(Throwable th2, String str) {
        zzbxw.zzb(this.zze, this.zzf).zzg(th2, str);
    }

    public final void zzx(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzy(String str) {
        this.zzg = str;
    }

    public final boolean zzz(Context context) {
        if (p.i()) {
            if (((Boolean) a0.c().zza(zzbgc.zzim)).booleanValue()) {
                return this.zzo.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
