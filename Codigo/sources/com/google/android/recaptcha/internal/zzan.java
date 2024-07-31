package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import ck.o;
import ck.v;
import dk.z;
import gk.Continuation;
import hk.d;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import ok.p;
import zk.k0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzan extends l implements p {
    final /* synthetic */ zzkx zza;
    final /* synthetic */ zzao zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzkx zzkxVar, zzao zzaoVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzkxVar;
        this.zzb = zzaoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzan(this.zza, this.zzb, continuation);
    }

    @Override // ok.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((k0) obj, (Continuation) obj2)).invokeSuspend(v.f7137a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzad zzadVar;
        zzad zzadVar2;
        zzad zzadVar3;
        zzad zzadVar4;
        List b02;
        zzad zzadVar5;
        d.c();
        o.b(obj);
        zzkx zzkxVar = this.zza;
        zzao zzaoVar = this.zzb;
        synchronized (zzaj.class) {
            byte[] zzd = zzkxVar.zzd();
            zzae zzaeVar = new zzae(zzeb.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
            zzadVar = zzaoVar.zze;
            ContentValues contentValues = new ContentValues();
            contentValues.put("ss", zzaeVar.zzc());
            contentValues.put("ts", Long.valueOf(zzaeVar.zzb()));
            zzadVar.getWritableDatabase().insert("ce", null, contentValues);
            zzadVar2 = zzaoVar.zze;
            int zzb = zzadVar2.zzb() - 500;
            if (zzb > 0) {
                zzadVar4 = zzaoVar.zze;
                b02 = z.b0(zzadVar4.zzd(), zzb);
                zzadVar5 = zzaoVar.zze;
                zzadVar5.zza(b02);
            }
            zzadVar3 = zzaoVar.zze;
            if (zzadVar3.zzb() >= 20) {
                zzaoVar.zzg();
            }
        }
        return v.f7137a;
    }
}
