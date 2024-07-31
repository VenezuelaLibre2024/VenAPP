package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzaqg;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzceu;
import java.util.Map;

/* loaded from: classes.dex */
public final class r0 extends zzaqa {

    /* renamed from: a */
    private final zzceu f9039a;

    /* renamed from: b */
    private final zzceb f9040b;

    public r0(String str, Map map, zzceu zzceuVar) {
        super(0, str, new q0(zzceuVar));
        this.f9039a = zzceuVar;
        zzceb zzcebVar = new zzceb(null);
        this.f9040b = zzcebVar;
        zzcebVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final zzaqg zzh(zzapw zzapwVar) {
        return zzaqg.zzb(zzapwVar, zzaqx.zzb(zzapwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzapw zzapwVar = (zzapw) obj;
        this.f9040b.zzf(zzapwVar.zzc, zzapwVar.zza);
        byte[] bArr = zzapwVar.zzb;
        if (zzceb.zzk() && bArr != null) {
            this.f9040b.zzh(bArr);
        }
        this.f9039a.zzc(zzapwVar);
    }
}
