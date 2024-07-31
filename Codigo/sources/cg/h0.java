package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;
import java.util.List;

/* loaded from: classes2.dex */
public final class h0 extends zzed implements zzfp {
    private static final h0 zza;
    private int zzd;
    private zzcd zze;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";
    private zzel zzh = zzed.zzO();
    private zzel zzi = zzed.zzO();
    private zzel zzj = zzed.zzO();
    private zzel zzk = zzed.zzO();
    private String zzl = "";

    static {
        h0 h0Var = new h0();
        zza = h0Var;
        zzed.zzU(h0.class, h0Var);
    }

    private h0() {
    }

    public static h0 b() {
        return zza;
    }

    public final List c() {
        return this.zzk;
    }

    public final List d() {
        return this.zzi;
    }

    public final List e() {
        return this.zzh;
    }

    public final List f() {
        return this.zzj;
    }

    public final zzcd zza() {
        zzcd zzcdVar = this.zze;
        return zzcdVar == null ? zzcd.zzb() : zzcdVar;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzci.class, "zzi", o0.class, "zzj", "zzk", zzcb.class, "zzl"});
        }
        if (i11 == 3) {
            return new h0();
        }
        if (i11 == 4) {
            return new g0(null);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
