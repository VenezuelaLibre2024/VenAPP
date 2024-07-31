package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzhl implements d {
    static final zzhl zza = new zzhl();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;
    private static final c zzg;
    private static final c zzh;
    private static final c zzi;

    static {
        c.b a10 = c.a("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        zzb = a10.b(zzfcVar.zzb()).a();
        c.b a11 = c.a("imageInfo");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        zzc = a11.b(zzfcVar2.zzb()).a();
        c.b a12 = c.a("isColdCall");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        zzd = a12.b(zzfcVar3.zzb()).a();
        c.b a13 = c.a("options");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        zze = a13.b(zzfcVar4.zzb()).a();
        c.b a14 = c.a("documentPresenceConfidence");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        zzf = a14.b(zzfcVar5.zzb()).a();
        c.b a15 = c.a("documentCornerConfidence");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        zzg = a15.b(zzfcVar6.zzb()).a();
        c.b a16 = c.a("documentRotationSuggestionDegrees");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        zzh = a16.b(zzfcVar7.zzb()).a();
        c.b a17 = c.a("documentRotationSuggestionConfidence");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        zzi = a17.b(zzfcVar8.zzb()).a();
    }

    private zzhl() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
