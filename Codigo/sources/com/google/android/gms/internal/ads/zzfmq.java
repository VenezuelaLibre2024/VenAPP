package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzfmq implements zzfmo {
    private final Context zza;
    private final int zzo;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzp = 2;
    private int zzq = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private boolean zzm = false;
    private boolean zzn = false;

    public zzfmq(Context context, int i10) {
        this.zza = context;
        this.zzo = i10;
    }

    public final synchronized zzfmq zzH(int i10) {
        this.zzp = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final /* bridge */ /* synthetic */ zzfmo zza(c3 c3Var) {
        zzq(c3Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final /* bridge */ /* synthetic */ zzfmo zzb(zzfgx zzfgxVar) {
        zzr(zzfgxVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final /* bridge */ /* synthetic */ zzfmo zzc(String str) {
        zzs(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final /* bridge */ /* synthetic */ zzfmo zzd(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final /* bridge */ /* synthetic */ zzfmo zze(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final /* bridge */ /* synthetic */ zzfmo zzf(boolean z10) {
        zzv(z10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final /* bridge */ /* synthetic */ zzfmo zzg(Throwable th2) {
        zzw(th2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final /* bridge */ /* synthetic */ zzfmo zzh() {
        zzx();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final /* bridge */ /* synthetic */ zzfmo zzi() {
        zzy();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final synchronized boolean zzj() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final synchronized zzfms zzl() {
        if (this.zzm) {
            return null;
        }
        this.zzm = true;
        if (!this.zzn) {
            zzx();
        }
        if (this.zzc < 0) {
            zzy();
        }
        return new zzfms(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final /* bridge */ /* synthetic */ zzfmo zzm(int i10) {
        zzH(i10);
        return this;
    }

    public final synchronized zzfmq zzq(c3 c3Var) {
        IBinder iBinder = c3Var.f8630e;
        if (iBinder != null) {
            zzdaq zzdaqVar = (zzdaq) iBinder;
            String zzk = zzdaqVar.zzk();
            if (!TextUtils.isEmpty(zzk)) {
                this.zzf = zzk;
            }
            String zzi = zzdaqVar.zzi();
            if (!TextUtils.isEmpty(zzi)) {
                this.zzg = zzi;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r2.zzg = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzfmq zzr(com.google.android.gms.internal.ads.zzfgx r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfgp r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzfgp r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            r2.zzf = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzfgm r0 = (com.google.android.gms.internal.ads.zzfgm) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zzac     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.zzac     // Catch: java.lang.Throwable -> L31
            r2.zzg = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfmq.zzr(com.google.android.gms.internal.ads.zzfgx):com.google.android.gms.internal.ads.zzfmq");
    }

    public final synchronized zzfmq zzs(String str) {
        if (((Boolean) a0.c().zza(zzbgc.zziI)).booleanValue()) {
            this.zzl = str;
        }
        return this;
    }

    public final synchronized zzfmq zzt(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfmq zzu(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfmq zzv(boolean z10) {
        this.zzd = z10;
        return this;
    }

    public final synchronized zzfmq zzw(Throwable th2) {
        if (((Boolean) a0.c().zza(zzbgc.zziI)).booleanValue()) {
            this.zzk = zzbxw.zze(th2);
            this.zzj = (String) zzfxr.zzc(zzfwp.zzc('\n')).zzd(zzbxw.zzd(th2)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfmq zzx() {
        Configuration configuration;
        this.zze = t.s().k(this.zza);
        Resources resources = this.zza.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzq = i10;
        this.zzb = t.b().b();
        this.zzn = true;
        return this;
    }

    public final synchronized zzfmq zzy() {
        this.zzc = t.b().b();
        return this;
    }
}
