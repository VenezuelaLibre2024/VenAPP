package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* renamed from: cg.f0 */
/* loaded from: classes2.dex */
public final class C1975f0 extends zzed implements zzfp {
    private static final C1975f0 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private C1971d0 zzj;
    private C1971d0 zzk;

    static {
        C1975f0 c1975f0 = new C1975f0();
        zza = c1975f0;
        zzed.zzU(C1975f0.class, c1975f0);
    }

    private C1975f0() {
    }

    /* renamed from: d */
    public static C1975f0 m10234d() {
        return zza;
    }

    /* renamed from: a */
    public final C1971d0 m10235a() {
        C1971d0 c1971d0 = this.zzk;
        return c1971d0 == null ? C1971d0.m10221f() : c1971d0;
    }

    /* renamed from: b */
    public final C1971d0 m10236b() {
        C1971d0 c1971d0 = this.zzj;
        return c1971d0 == null ? C1971d0.m10221f() : c1971d0;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C1975f0();
        }
        if (i11 == 4) {
            return new C1973e0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zze;
    }
}
