package com.google.android.recaptcha.internal;

import android.content.Context;
import ck.o;
import ck.v;
import gk.Continuation;
import hk.d;
import il.a;
import kotlin.coroutines.jvm.internal.l;
import ok.p;
import zk.k0;

/* loaded from: classes2.dex */
final class zzcy extends l implements p {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzda zze;
    final /* synthetic */ String zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzda zzdaVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zze = zzdaVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzcy(this.zze, this.zzf, continuation);
    }

    @Override // ok.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcy) create((k0) obj, (Continuation) obj2)).invokeSuspend(v.f7137a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [il.a] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [il.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        a aVar;
        String str;
        Object obj2;
        ?? r02;
        zzr zzrVar;
        String str2;
        String str3;
        String str4;
        Context context;
        zzr zzrVar2;
        c10 = d.c();
        int i10 = this.zzd;
        try {
            if (i10 == 0) {
                o.b(obj);
                zzda zzdaVar = this.zze;
                aVar = zzdaVar.zzo;
                str = this.zzf;
                this.zza = aVar;
                this.zzb = zzdaVar;
                this.zzc = str;
                this.zzd = 1;
                if (aVar.c(null, this) == c10) {
                    return c10;
                }
                obj2 = zzdaVar;
            } else {
                if (i10 != 1) {
                    r02 = this.zza;
                    try {
                        o.b(obj);
                        r02 = r02;
                        v vVar = v.f7137a;
                        r02.b(null);
                        return v.f7137a;
                    } catch (Throwable th2) {
                        th = th2;
                        r02.b(null);
                        throw th;
                    }
                }
                ?? r12 = this.zzc;
                obj2 = this.zzb;
                ?? r42 = this.zza;
                o.b(obj);
                str = r12;
                aVar = r42;
            }
            zzrVar = ((zzda) obj2).zzf;
            String zzb = zzrVar.zzb();
            str2 = ((zzda) obj2).zzd;
            str3 = ((zzda) obj2).zzh;
            str4 = ((zzda) obj2).zzg;
            context = ((zzda) obj2).zze;
            zzrVar2 = ((zzda) obj2).zzf;
            this.zza = aVar;
            this.zzb = null;
            this.zzc = null;
            this.zzd = 2;
            if (zzbj.zzb(zzb, str2, str, str3, str4, context, zzrVar2, this) == c10) {
                return c10;
            }
            r02 = aVar;
            v vVar2 = v.f7137a;
            r02.b(null);
            return v.f7137a;
        } catch (Throwable th3) {
            th = th3;
            r02 = aVar;
            r02.b(null);
            throw th;
        }
    }
}
