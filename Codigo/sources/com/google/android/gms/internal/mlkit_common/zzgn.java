package com.google.android.gms.internal.mlkit_common;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzgn implements d {
    static final zzgn zza = new zzgn();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;
    private static final c zzg;
    private static final c zzh;
    private static final c zzi;
    private static final c zzj;

    static {
        c.b a10 = c.a("name");
        zzbk zzbkVar = new zzbk();
        zzbkVar.zza(1);
        zzb = a10.b(zzbkVar.zzb()).a();
        c.b a11 = c.a("version");
        zzbk zzbkVar2 = new zzbk();
        zzbkVar2.zza(2);
        zzc = a11.b(zzbkVar2.zzb()).a();
        c.b a12 = c.a("source");
        zzbk zzbkVar3 = new zzbk();
        zzbkVar3.zza(3);
        zzd = a12.b(zzbkVar3.zzb()).a();
        c.b a13 = c.a("uri");
        zzbk zzbkVar4 = new zzbk();
        zzbkVar4.zza(4);
        zze = a13.b(zzbkVar4.zzb()).a();
        c.b a14 = c.a("hash");
        zzbk zzbkVar5 = new zzbk();
        zzbkVar5.zza(5);
        zzf = a14.b(zzbkVar5.zzb()).a();
        c.b a15 = c.a("modelType");
        zzbk zzbkVar6 = new zzbk();
        zzbkVar6.zza(6);
        zzg = a15.b(zzbkVar6.zzb()).a();
        c.b a16 = c.a("size");
        zzbk zzbkVar7 = new zzbk();
        zzbkVar7.zza(7);
        zzh = a16.b(zzbkVar7.zzb()).a();
        c.b a17 = c.a("hasLabelMap");
        zzbk zzbkVar8 = new zzbk();
        zzbkVar8.zza(8);
        zzi = a17.b(zzbkVar8.zzb()).a();
        c.b a18 = c.a("isManifestModel");
        zzbk zzbkVar9 = new zzbk();
        zzbkVar9.zza(9);
        zzj = a18.b(zzbkVar9.zzb()).a();
    }

    private zzgn() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlz zzlzVar = (zzlz) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzlzVar.zzd());
        eVar.add(zzc, (Object) null);
        eVar.add(zzd, zzlzVar.zzb());
        eVar.add(zze, (Object) null);
        eVar.add(zzf, zzlzVar.zzc());
        eVar.add(zzg, zzlzVar.zza());
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, (Object) null);
        eVar.add(zzj, (Object) null);
    }
}
