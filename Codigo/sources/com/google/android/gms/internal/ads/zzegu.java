package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.w1;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzegu {
    private final zzbbp zza;
    private final Context zzb;
    private final zzefy zzc;
    private final zzcei zzd;
    private final String zze;
    private final zzflw zzf;
    private final w1 zzg = t.q().zzi();

    public zzegu(Context context, zzcei zzceiVar, zzbbp zzbbpVar, zzefy zzefyVar, String str, zzflw zzflwVar) {
        this.zzb = context;
        this.zzd = zzceiVar;
        this.zza = zzbbpVar;
        this.zzc = zzefyVar;
        this.zze = str;
        this.zzf = zzflwVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zzbdy zzbdyVar = (zzbdy) arrayList.get(i10);
            if (zzbdyVar.zzw() == 2 && zzbdyVar.zze() > j10) {
                j10 = zzbdyVar.zze();
            }
        }
        if (j10 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j10));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(boolean z10, SQLiteDatabase sQLiteDatabase) {
        if (z10) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue()) {
            zzflv zzb = zzflv.zzb("oa_upload");
            zzb.zza("oa_failed_reqs", String.valueOf(zzegn.zza(sQLiteDatabase, 0)));
            zzb.zza("oa_total_reqs", String.valueOf(zzegn.zza(sQLiteDatabase, 1)));
            zzb.zza("oa_upload_time", String.valueOf(t.b().a()));
            zzb.zza("oa_last_successful_time", String.valueOf(zzegn.zzb(sQLiteDatabase, 2)));
            zzb.zza("oa_session_id", this.zzg.zzQ() ? "" : this.zze);
            this.zzf.zzb(zzb);
            ArrayList zzc = zzegn.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc);
            int size = zzc.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzbdy zzbdyVar = (zzbdy) zzc.get(i10);
                w1 w1Var = this.zzg;
                zzflv zzb2 = zzflv.zzb("oa_signals");
                zzb2.zza("oa_session_id", w1Var.zzQ() ? "" : this.zze);
                zzbdt zzf = zzbdyVar.zzf();
                String valueOf = zzf.zzf() ? String.valueOf(zzf.zzh() - 1) : "-1";
                String obj = zzgao.zzb(zzbdyVar.zzk(), new zzfws() { // from class: com.google.android.gms.internal.ads.zzegt
                    @Override // com.google.android.gms.internal.ads.zzfws
                    public final Object apply(Object obj2) {
                        return ((zzbcn) obj2).name();
                    }
                }).toString();
                zzb2.zza("oa_sig_ts", String.valueOf(zzbdyVar.zze()));
                zzb2.zza("oa_sig_status", String.valueOf(zzbdyVar.zzw() - 1));
                zzb2.zza("oa_sig_resp_lat", String.valueOf(zzbdyVar.zzd()));
                zzb2.zza("oa_sig_render_lat", String.valueOf(zzbdyVar.zzc()));
                zzb2.zza("oa_sig_formats", obj);
                zzb2.zza("oa_sig_nw_type", valueOf);
                zzb2.zza("oa_sig_wifi", String.valueOf(zzbdyVar.zzx() - 1));
                zzb2.zza("oa_sig_airplane", String.valueOf(zzbdyVar.zzt() - 1));
                zzb2.zza("oa_sig_data", String.valueOf(zzbdyVar.zzu() - 1));
                zzb2.zza("oa_sig_nw_resp", String.valueOf(zzbdyVar.zza()));
                zzb2.zza("oa_sig_offline", String.valueOf(zzbdyVar.zzv() - 1));
                zzb2.zza("oa_sig_nw_state", String.valueOf(zzbdyVar.zzj().zza()));
                if (zzf.zze() && zzf.zzf() && zzf.zzh() == 2) {
                    zzb2.zza("oa_sig_cell_type", String.valueOf(zzf.zzg() - 1));
                }
                this.zzf.zzb(zzb2);
            }
        } else {
            ArrayList zzc2 = zzegn.zzc(sQLiteDatabase);
            Context context = this.zzb;
            zzbdz zza = zzbed.zza();
            zza.zzb(context.getPackageName());
            zza.zzd(Build.MODEL);
            zza.zze(zzegn.zza(sQLiteDatabase, 0));
            zza.zza(zzc2);
            zza.zzg(zzegn.zza(sQLiteDatabase, 1));
            zza.zzc(zzegn.zza(sQLiteDatabase, 3));
            zza.zzh(t.b().a());
            zza.zzf(zzegn.zzb(sQLiteDatabase, 2));
            final zzbed zzbedVar = (zzbed) zza.zzal();
            zzc(sQLiteDatabase, zzc2);
            this.zza.zzb(new zzbbo() { // from class: com.google.android.gms.internal.ads.zzegr
                @Override // com.google.android.gms.internal.ads.zzbbo
                public final void zza(zzbde zzbdeVar) {
                    zzbdeVar.zzi(zzbed.this);
                }
            });
            zzcei zzceiVar = this.zzd;
            zzbeo zza2 = zzbep.zza();
            zza2.zza(zzceiVar.zzb);
            zza2.zzc(this.zzd.zzc);
            zza2.zzb(true == this.zzd.zzd ? 0 : 2);
            final zzbep zzbepVar = (zzbep) zza2.zzal();
            this.zza.zzb(new zzbbo() { // from class: com.google.android.gms.internal.ads.zzegs
                @Override // com.google.android.gms.internal.ads.zzbbo
                public final void zza(zzbde zzbdeVar) {
                    zzbcw zzbcwVar = (zzbcw) zzbdeVar.zzb().zzaB();
                    zzbcwVar.zzb(zzbep.this);
                    zzbdeVar.zzg(zzbcwVar);
                }
            });
            this.zza.zzc(10004);
        }
        zzegn.zzf(sQLiteDatabase);
        return null;
    }

    public final void zzb(final boolean z10) {
        try {
            this.zzc.zza(new zzfkp() { // from class: com.google.android.gms.internal.ads.zzegq
                @Override // com.google.android.gms.internal.ads.zzfkp
                public final Object zza(Object obj) {
                    zzegu.this.zza(z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e10) {
            zzcec.zzg("Error in offline signals database startup: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
