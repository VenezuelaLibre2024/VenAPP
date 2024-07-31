package db;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* loaded from: classes2.dex */
public final class o extends zzed implements zzfp {
    private static final o zza;
    private int zzd;
    private String zze = "";
    private zzdb zzf;
    private String zzg;
    private zzdb zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        o oVar = new o();
        zza = oVar;
        zzed.zzU(o.class, oVar);
    }

    private o() {
        zzdb zzdbVar = zzdb.zzb;
        this.zzf = zzdbVar;
        this.zzg = "";
        this.zzh = zzdbVar;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static n a() {
        return (n) zza.zzF();
    }

    public static /* synthetic */ void c(o oVar, zzdb zzdbVar) {
        zzdbVar.getClass();
        oVar.zzd |= 2;
        oVar.zzf = zzdbVar;
    }

    public static /* synthetic */ void d(o oVar, zzdb zzdbVar) {
        zzdbVar.getClass();
        oVar.zzd |= 8;
        oVar.zzh = zzdbVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new o();
        }
        if (i11 == 4) {
            return new n(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
