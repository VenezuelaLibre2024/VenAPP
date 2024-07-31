package com.google.android.recaptcha.internal;

import dk.r;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.n;
import ok.p;

/* loaded from: classes2.dex */
public final class zzbe extends zzbd implements zzbi {
    private final p zza;
    private final String zzb;

    public zzbe(p pVar, String str, Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzbd
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection j10;
        if (!n.a(method.getName(), this.zzb)) {
            return false;
        }
        zzmk zzf = zzmn.zzf();
        if (objArr != null) {
            j10 = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzml zzf2 = zzmm.zzf();
                zzf2.zzv(obj2.toString());
                j10.add((zzmm) zzf2.zzj());
            }
        } else {
            j10 = r.j();
        }
        zzf.zzd(j10);
        zzmn zzmnVar = (zzmn) zzf.zzj();
        p pVar = this.zza;
        byte[] zzd = zzmnVar.zzd();
        pVar.invoke(objArr, zzeb.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
