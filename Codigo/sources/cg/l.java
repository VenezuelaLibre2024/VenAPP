package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* loaded from: classes2.dex */
public final class l extends zzed implements zzfp {
    private static final l zza;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        l lVar = new l();
        zza = lVar;
        zzed.zzU(l.class, lVar);
    }

    private l() {
    }

    public static l b() {
        return zza;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
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
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new l();
        }
        b bVar = null;
        if (i11 == 4) {
            return new k(bVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
