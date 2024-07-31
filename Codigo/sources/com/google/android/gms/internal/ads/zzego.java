package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzego implements zzfln {
    private final zzegc zza;
    private final zzegg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzego(zzegc zzegcVar, zzegg zzeggVar) {
        this.zza = zzegcVar;
        this.zzb = zzeggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbL(zzflg zzflgVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbM(zzflg zzflgVar, String str, Throwable th2) {
        if (((Boolean) a0.c().zza(zzbgc.zzgj)).booleanValue() && zzflg.RENDERER == zzflgVar && this.zza.zzc() != 0) {
            this.zza.zzf(t.b().b() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbN(zzflg zzflgVar, String str) {
        if (((Boolean) a0.c().zza(zzbgc.zzgj)).booleanValue()) {
            if (zzflg.RENDERER == zzflgVar) {
                this.zza.zzg(t.b().b());
                return;
            }
            if (zzflg.PRELOADED_LOADER == zzflgVar || zzflg.SERVER_TRANSACTION == zzflgVar) {
                this.zza.zzh(t.b().b());
                final zzegg zzeggVar = this.zzb;
                final long zzd = this.zza.zzd();
                zzeggVar.zza.zza(new zzfkp() { // from class: com.google.android.gms.internal.ads.zzegf
                    @Override // com.google.android.gms.internal.ads.zzfkp
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzegg.this.zzf()) {
                            return null;
                        }
                        long j10 = zzd;
                        zzbdx zzg = zzbdy.zzg();
                        zzg.zzh(j10);
                        byte[] zzax = ((zzbdy) zzg.zzal()).zzax();
                        zzegn.zzg(sQLiteDatabase, false, false);
                        zzegn.zzd(sQLiteDatabase, j10, zzax);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzd(zzflg zzflgVar, String str) {
        if (((Boolean) a0.c().zza(zzbgc.zzgj)).booleanValue() && zzflg.RENDERER == zzflgVar && this.zza.zzc() != 0) {
            this.zza.zzf(t.b().b() - this.zza.zzc());
        }
    }
}
