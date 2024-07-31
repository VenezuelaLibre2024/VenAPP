package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* loaded from: classes2.dex */
public final class b0 extends zzed implements zzfp {
    private static final b0 zza;
    private int zzd;
    private String zze = "";
    private zzel zzf = zzed.zzO();

    static {
        b0 b0Var = new b0();
        zza = b0Var;
        zzed.zzU(b0.class, b0Var);
    }

    private b0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", c.class});
        }
        if (i11 == 3) {
            return new b0();
        }
        if (i11 == 4) {
            return new a0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
