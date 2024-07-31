package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* loaded from: classes2.dex */
public final class f0 extends zzed implements zzfp {
    private static final f0 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private d0 zzj;
    private d0 zzk;

    static {
        f0 f0Var = new f0();
        zza = f0Var;
        zzed.zzU(f0.class, f0Var);
    }

    private f0() {
    }

    public static f0 d() {
        return zza;
    }

    public final d0 a() {
        d0 d0Var = this.zzk;
        return d0Var == null ? d0.f() : d0Var;
    }

    public final d0 b() {
        d0 d0Var = this.zzj;
        return d0Var == null ? d0.f() : d0Var;
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
            return new f0();
        }
        if (i11 == 4) {
            return new e0(null);
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
