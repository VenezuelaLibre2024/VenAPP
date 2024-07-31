package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzaqg;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzceu;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.r0 */
/* loaded from: classes.dex */
public final class C5035r0 extends zzaqa {

    /* renamed from: a */
    private final zzceu f10138a;

    /* renamed from: b */
    private final zzceb f10139b;

    public C5035r0(String str, Map map, zzceu zzceuVar) {
        super(0, str, new C5031q0(zzceuVar));
        this.f10138a = zzceuVar;
        zzceb zzcebVar = new zzceb(null);
        this.f10139b = zzcebVar;
        zzcebVar.zzd(str, "GET", null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqa
    public final zzaqg zzh(zzapw zzapwVar) {
        return zzaqg.zzb(zzapwVar, zzaqx.zzb(zzapwVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqa
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzapw zzapwVar = (zzapw) obj;
        this.f10139b.zzf(zzapwVar.zzc, zzapwVar.zza);
        byte[] bArr = zzapwVar.zzb;
        if (zzceb.zzk() && bArr != null) {
            this.f10139b.zzh(bArr);
        }
        this.f10138a.zzc(zzapwVar);
    }
}
