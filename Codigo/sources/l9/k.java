package l9;

import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzdac;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzflm;
import com.google.android.gms.internal.ads.zzhhd;
import com.google.android.gms.internal.ads.zzhhu;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k implements zzhhd {

    /* renamed from: a, reason: collision with root package name */
    private final zzhhu f21091a;

    /* renamed from: b, reason: collision with root package name */
    private final zzhhu f21092b;

    /* renamed from: c, reason: collision with root package name */
    private final zzhhu f21093c;

    public k(zzhhu zzhhuVar, zzhhu zzhhuVar2, zzhhu zzhhuVar3) {
        this.f21091a = zzhhuVar;
        this.f21092b = zzhhuVar2;
        this.f21093c = zzhhuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzflm) this.f21091a.zzb()).zzb(zzflg.GENERATE_SIGNALS, ((zzdac) this.f21093c).zzb().zzc()).zzf(((n) this.f21092b).zzb()).zzi(((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzfx)).intValue(), TimeUnit.SECONDS).zza();
    }
}
