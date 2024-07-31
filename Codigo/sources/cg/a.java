package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends zzed<a, z> implements zzfp {
    private static final a zza;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private zzel zze = zzed.zzO();
    private String zzg = "";
    private zzdb zzh = zzdb.zzb;

    static {
        a aVar = new a();
        zza = aVar;
        zzed.zzU(a.class, aVar);
    }

    private a() {
    }

    public static a b(byte[] bArr, zzdo zzdoVar) {
        return (a) zzed.zzK(zza, bArr, zzdoVar);
    }

    public final List c() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", s.class, "zzf", j.f7099a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new a();
        }
        if (i11 == 4) {
            return new z(null);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
