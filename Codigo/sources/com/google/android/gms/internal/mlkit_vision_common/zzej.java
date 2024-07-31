package com.google.android.gms.internal.mlkit_vision_common;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzej implements d {
    static final zzej zza = new zzej();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;
    private static final c zzg;
    private static final c zzh;

    static {
        c.b a10 = c.a("durationMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a10.b(zzaeVar.zzb()).a();
        c.b a11 = c.a("imageSource");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a11.b(zzaeVar2.zzb()).a();
        c.b a12 = c.a("imageFormat");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a12.b(zzaeVar3.zzb()).a();
        c.b a13 = c.a("imageByteSize");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a13.b(zzaeVar4.zzb()).a();
        c.b a14 = c.a("imageWidth");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = a14.b(zzaeVar5.zzb()).a();
        c.b a15 = c.a("imageHeight");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = a15.b(zzaeVar6.zzb()).a();
        c.b a16 = c.a("rotationDegrees");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = a16.b(zzaeVar7.zzb()).a();
    }

    private zzej() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zziq zziqVar = (zziq) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zziqVar.zzg());
        eVar.add(zzc, zziqVar.zzb());
        eVar.add(zzd, zziqVar.zza());
        eVar.add(zze, zziqVar.zzc());
        eVar.add(zzf, zziqVar.zze());
        eVar.add(zzg, zziqVar.zzd());
        eVar.add(zzh, zziqVar.zzf());
    }
}
