package com.google.android.recaptcha.internal;

import ck.o;
import ck.v;
import gk.Continuation;
import hk.d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.l;
import ok.p;
import zk.k0;

/* loaded from: classes2.dex */
final class zzaz extends l implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzba zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzn zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzba zzbaVar, String str, zzn zznVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzbaVar;
        this.zzd = str;
        this.zze = zznVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzaz(this.zzc, this.zzd, this.zze, continuation);
    }

    @Override // ok.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaz) create((k0) obj, (Continuation) obj2)).invokeSuspend(v.f7137a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object zzu;
        zzmh zzy;
        Object zzt;
        c10 = d.c();
        zzn zznVar = this.zzb;
        try {
        } catch (Exception e10) {
            zzba zzbaVar = this.zzc;
            zzn zznVar2 = this.zze;
            this.zza = null;
            this.zzb = 2;
            zzu = zzbaVar.zzu(e10, "recaptcha.m.Main.rge", zznVar2, zznVar, 0, this);
            if (zzu == c10) {
                return c10;
            }
        }
        if (zznVar == 0) {
            o.b(obj);
            zzn zznVar3 = new zzn();
            zzmp zzg = zzmp.zzg(zzeb.zzh().zzj(this.zzd));
            zzdk zzb = zzdk.zzb();
            zzba zzbaVar2 = this.zzc;
            zzy = zzba.zzy(zzg.zzi(), zzg.zzj());
            zzb.zzf();
            long zza = zzb.zza(TimeUnit.MICROSECONDS);
            zzj zzjVar = zzj.zza;
            zzj.zza(zzl.zzm.zza(), zza);
            zzba zzbaVar3 = this.zzc;
            List zzi = zzy.zzi();
            zzn zznVar4 = this.zze;
            this.zza = zznVar3;
            this.zzb = 1;
            zzt = zzbaVar3.zzt(zzi, zznVar4, zznVar3, this);
            zznVar = zznVar3;
            if (zzt == c10) {
                return c10;
            }
        } else {
            if (zznVar != 1) {
                o.b(obj);
                return v.f7137a;
            }
            Object obj2 = this.zza;
            o.b(obj);
            zznVar = obj2;
        }
        return v.f7137a;
    }
}
