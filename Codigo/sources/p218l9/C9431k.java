package p218l9;

import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzdac;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzflm;
import com.google.android.gms.internal.ads.zzhhd;
import com.google.android.gms.internal.ads.zzhhu;
import java.util.concurrent.TimeUnit;

/* renamed from: l9.k */
/* loaded from: classes.dex */
public final class C9431k implements zzhhd {

    /* renamed from: a */
    private final zzhhu f22944a;

    /* renamed from: b */
    private final zzhhu f22945b;

    /* renamed from: c */
    private final zzhhu f22946c;

    public C9431k(zzhhu zzhhuVar, zzhhu zzhhuVar2, zzhhu zzhhuVar3) {
        this.f22944a = zzhhuVar;
        this.f22945b = zzhhuVar2;
        this.f22946c = zzhhuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzflm) this.f22944a.zzb()).zzb(zzflg.GENERATE_SIGNALS, ((zzdac) this.f22946c).zzb().zzc()).zzf(((C9437n) this.f22945b).zzb()).zzi(((Integer) C4784a0.m12365c().zza(zzbgc.zzfx)).intValue(), TimeUnit.SECONDS).zza();
    }
}
