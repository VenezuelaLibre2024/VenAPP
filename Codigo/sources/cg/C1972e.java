package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* renamed from: cg.e */
/* loaded from: classes2.dex */
public final class C1972e extends zzed implements zzfp {
    private static final C1972e zza;
    private int zzd;
    private double zze;
    private double zzf;
    private byte zzg = 2;

    static {
        C1972e c1972e = new C1972e();
        zza = c1972e;
        zzed.zzU(C1972e.class, c1972e);
    }

    private C1972e() {
    }

    /* renamed from: d */
    public static C1972e m10228d() {
        return zza;
    }

    /* renamed from: a */
    public final double m10229a() {
        return this.zze;
    }

    /* renamed from: b */
    public final double m10230b() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C1972e();
        }
        C1966b c1966b = null;
        if (i11 == 4) {
            return new C1970d(c1966b);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
