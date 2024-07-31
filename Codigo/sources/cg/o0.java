package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* loaded from: classes2.dex */
public final class o0 extends zzed implements zzfp {
    private static final o0 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        o0 o0Var = new o0();
        zza = o0Var;
        zzed.zzU(o0.class, o0Var);
    }

    private o0() {
    }

    public static o0 b() {
        return zza;
    }

    public final int c() {
        int a10 = n0.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", m0.f7100a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new o0();
        }
        if (i11 == 4) {
            return new k0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
