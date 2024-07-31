package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.v2;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcki extends r2 {
    private final zzcgl zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private v2 zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbku zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcki(zzcgl zzcglVar, float f10, boolean z10, boolean z11) {
        this.zza = zzcglVar;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzw(int i10, int i11, boolean z10, boolean z11) {
        zzcep.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckh
            public final /* synthetic */ int zzb;
            public final /* synthetic */ int zzc;
            public final /* synthetic */ boolean zzd;
            public final /* synthetic */ boolean zze;

            public /* synthetic */ zzckh(int i102, int i112, boolean z102, boolean z112) {
                r2 = i102;
                r3 = i112;
                r4 = z102;
                r5 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcki.this.zzd(r2, r3, r4, r5);
            }
        });
    }

    private final void zzx(String str, Map map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzcep.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckg
            public final /* synthetic */ Map zzb;

            public /* synthetic */ zzckg(Map hashMap2) {
                r2 = hashMap2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcki.this.zzr(r2);
            }
        });
    }

    public final void zzc(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.zzb) {
            z11 = true;
            if (f11 == this.zzi && f12 == this.zzk) {
                z11 = false;
            }
            this.zzi = f11;
            this.zzj = f10;
            z12 = this.zzh;
            this.zzh = z10;
            i11 = this.zze;
            this.zze = i10;
            float f13 = this.zzk;
            this.zzk = f12;
            if (Math.abs(f12 - f13) > 1.0E-4f) {
                this.zza.zzF().invalidate();
            }
        }
        if (z11) {
            try {
                zzbku zzbkuVar = this.zzn;
                if (zzbkuVar != null) {
                    zzbkuVar.zze();
                }
            } catch (RemoteException e10) {
                zzcec.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzw(i11, i10, z12, z10);
    }

    public final /* synthetic */ void zzd(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        v2 v2Var;
        v2 v2Var2;
        v2 v2Var3;
        synchronized (this.zzb) {
            boolean z14 = this.zzg;
            if (z14 || i11 != 1) {
                i12 = i11;
                z12 = false;
            } else {
                i11 = 1;
                i12 = 1;
                z12 = true;
            }
            boolean z15 = i10 != i11;
            if (z15 && i12 == 1) {
                z13 = true;
                i12 = 1;
            } else {
                z13 = false;
            }
            boolean z16 = z15 && i12 == 2;
            boolean z17 = z15 && i12 == 3;
            this.zzg = z14 || z12;
            if (z12) {
                try {
                    v2 v2Var4 = this.zzf;
                    if (v2Var4 != null) {
                        v2Var4.zzi();
                    }
                } catch (RemoteException e10) {
                    zzcec.zzl("#007 Could not call remote method.", e10);
                }
            }
            if (z13 && (v2Var3 = this.zzf) != null) {
                v2Var3.zzh();
            }
            if (z16 && (v2Var2 = this.zzf) != null) {
                v2Var2.zzg();
            }
            if (z17) {
                v2 v2Var5 = this.zzf;
                if (v2Var5 != null) {
                    v2Var5.zze();
                }
                this.zza.zzw();
            }
            if (z10 != z11 && (v2Var = this.zzf) != null) {
                v2Var.zzf(z11);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final int zzh() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final v2 zzi() {
        v2 v2Var;
        synchronized (this.zzb) {
            v2Var = this.zzf;
        }
        return v2Var;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final void zzj(boolean z10) {
        zzx(true != z10 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final void zzm(v2 v2Var) {
        synchronized (this.zzb) {
            this.zzf = v2Var;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final boolean zzo() {
        boolean z10;
        Object obj = this.zzb;
        boolean zzp = zzp();
        synchronized (obj) {
            z10 = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final boolean zzp() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = false;
            if (this.zzc && this.zzl) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final boolean zzq() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(n4 n4Var) {
        Object obj = this.zzb;
        boolean z10 = n4Var.f8712a;
        boolean z11 = n4Var.f8713b;
        boolean z12 = n4Var.f8714c;
        synchronized (obj) {
            this.zzl = z11;
            this.zzm = z12;
        }
        zzx("initialState", la.g.c("muteStart", true != z10 ? "0" : "1", "customControlsRequested", true != z11 ? "0" : "1", "clickToExpandRequested", true != z12 ? "0" : "1"));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzw(i10, 3, z10, z10);
    }

    public final void zzv(zzbku zzbkuVar) {
        synchronized (this.zzb) {
            this.zzn = zzbkuVar;
        }
    }
}
