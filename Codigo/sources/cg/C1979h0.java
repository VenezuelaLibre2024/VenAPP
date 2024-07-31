package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;
import java.util.List;

/* renamed from: cg.h0 */
/* loaded from: classes2.dex */
public final class C1979h0 extends zzed implements zzfp {
    private static final C1979h0 zza;
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
        C1979h0 c1979h0 = new C1979h0();
        zza = c1979h0;
        zzed.zzU(C1979h0.class, c1979h0);
    }

    private C1979h0() {
    }

    /* renamed from: b */
    public static C1979h0 m10244b() {
        return zza;
    }

    /* renamed from: c */
    public final List m10245c() {
        return this.zzk;
    }

    /* renamed from: d */
    public final List m10246d() {
        return this.zzi;
    }

    /* renamed from: e */
    public final List m10247e() {
        return this.zzh;
    }

    /* renamed from: f */
    public final List m10248f() {
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
            return zzed.zzR(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzci.class, "zzi", C1993o0.class, "zzj", "zzk", zzcb.class, "zzl"});
        }
        if (i11 == 3) {
            return new C1979h0();
        }
        if (i11 == 4) {
            return new C1977g0(null);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
