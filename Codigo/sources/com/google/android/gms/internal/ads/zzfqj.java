package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfqj extends zzfqe {
    public zzfqj(zzfpx zzfpxVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfpxVar, hashSet, jSONObject, j10);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfpo.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfqf
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfov zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfov.zza()) != null) {
            for (zzfoh zzfohVar : zza.zzc()) {
                if (((zzfqe) this).zza.contains(zzfohVar.zzh())) {
                    zzfohVar.zzg().zzf(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
