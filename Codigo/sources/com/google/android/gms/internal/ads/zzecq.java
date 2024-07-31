package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzecq {
    private final zzgey zza;
    private final zzebw zzb;
    private final zzhgx zzc;
    private final zzfnc zzd;
    private final Context zze;
    private final zzcei zzf;

    public zzecq(zzgey zzgeyVar, zzebw zzebwVar, zzhgx zzhgxVar, zzfnc zzfncVar, Context context, zzcei zzceiVar) {
        this.zza = zzgeyVar;
        this.zzb = zzebwVar;
        this.zzc = zzhgxVar;
        this.zzd = zzfncVar;
        this.zze = context;
        this.zzf = zzceiVar;
    }

    private final com.google.common.util.concurrent.f zzh(final zzbze zzbzeVar, zzecp zzecpVar, final zzecp zzecpVar2, final zzgdu zzgduVar) {
        com.google.common.util.concurrent.f zzf;
        String str = zzbzeVar.zzd;
        t.r();
        if (j2.b(str)) {
            zzf = zzgen.zzg(new zzecf(1));
        } else {
            zzf = zzgen.zzf(zzecpVar.zza(zzbzeVar), ExecutionException.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzeco
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    Throwable th2 = (ExecutionException) obj;
                    if (th2.getCause() != null) {
                        th2 = th2.getCause();
                    }
                    return zzgen.zzg(th2);
                }
            }, this.zza);
        }
        return zzgen.zzf(zzgen.zzn(zzgee.zzu(zzf), zzgduVar, this.zza), zzecf.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzecn
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzecq.this.zzc(zzecpVar2, zzbzeVar, zzgduVar, (zzecf) obj);
            }
        }, this.zza);
    }

    public final com.google.common.util.concurrent.f zza(final zzbze zzbzeVar) {
        zzgdu zzgduVar = new zzgdu() { // from class: com.google.android.gms.internal.ads.zzeck
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                String str = new String(zzgci.zzb((InputStream) obj), zzfwq.zzc);
                zzbze zzbzeVar2 = zzbze.this;
                zzbzeVar2.zzj = str;
                return zzgen.zzh(zzbzeVar2);
            }
        };
        final zzebw zzebwVar = this.zzb;
        Objects.requireNonNull(zzebwVar);
        return zzh(zzbzeVar, new zzecp() { // from class: com.google.android.gms.internal.ads.zzecl
            @Override // com.google.android.gms.internal.ads.zzecp
            public final com.google.common.util.concurrent.f zza(zzbze zzbzeVar2) {
                return zzebw.this.zzb(zzbzeVar2);
            }
        }, new zzecp() { // from class: com.google.android.gms.internal.ads.zzecm
            @Override // com.google.android.gms.internal.ads.zzecp
            public final com.google.common.util.concurrent.f zza(zzbze zzbzeVar2) {
                return zzecq.this.zzd(zzbzeVar2);
            }
        }, zzgduVar);
    }

    public final com.google.common.util.concurrent.f zzb(JSONObject jSONObject) {
        return zzgen.zzn(zzgee.zzu(zzgen.zzh(jSONObject)), t.h().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbru.zza, new zzbrp() { // from class: com.google.android.gms.internal.ads.zzecg
            @Override // com.google.android.gms.internal.ads.zzbrp
            public final Object zza(JSONObject jSONObject2) {
                return new zzbzh(jSONObject2);
            }
        }), this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzc(zzecp zzecpVar, zzbze zzbzeVar, zzgdu zzgduVar, zzecf zzecfVar) {
        return zzgen.zzn(zzecpVar.zza(zzbzeVar), zzgduVar, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzd(zzbze zzbzeVar) {
        return ((zzeem) this.zzc.zzb()).zzb(zzbzeVar, Binder.getCallingUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zze(zzbze zzbzeVar) {
        return this.zzb.zzc(zzbzeVar.zzh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzf(zzbze zzbzeVar) {
        return ((zzeem) this.zzc.zzb()).zzi(zzbzeVar.zzh);
    }

    public final com.google.common.util.concurrent.f zzg(zzbze zzbzeVar) {
        return zzh(zzbzeVar, new zzecp() { // from class: com.google.android.gms.internal.ads.zzeci
            @Override // com.google.android.gms.internal.ads.zzecp
            public final com.google.common.util.concurrent.f zza(zzbze zzbzeVar2) {
                return zzecq.this.zze(zzbzeVar2);
            }
        }, new zzecp() { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // com.google.android.gms.internal.ads.zzecp
            public final com.google.common.util.concurrent.f zza(zzbze zzbzeVar2) {
                return zzecq.this.zzf(zzbzeVar2);
            }
        }, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzgen.zzh(null);
            }
        });
    }
}
