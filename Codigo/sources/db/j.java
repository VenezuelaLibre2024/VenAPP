package db;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzht;

/* loaded from: classes2.dex */
public final class j extends zzed implements zzfp {
    private static final j zza;
    private int zzd;
    private g zzj;
    private zzht zzm;
    private String zze = "";
    private zzdb zzf = zzdb.zzb;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private zzei zzk = zzed.zzL();
    private int zzl = 1;
    private int zzn = 320;
    private int zzo = 4;
    private int zzp = 2;

    static {
        j jVar = new j();
        zza = jVar;
        zzed.zzU(j.class, jVar);
    }

    private j() {
    }

    public static i a() {
        return (i) zza.zzF();
    }

    public static /* synthetic */ void c(j jVar, g gVar) {
        gVar.getClass();
        jVar.zzj = gVar;
        jVar.zzd |= 32;
    }

    public static /* synthetic */ void d(j jVar, zzdb zzdbVar) {
        zzdbVar.getClass();
        jVar.zzd |= 2;
        jVar.zzf = zzdbVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007\u0013\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new j();
        }
        if (i11 == 4) {
            return new i(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
