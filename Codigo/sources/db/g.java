package db;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* loaded from: classes2.dex */
public final class g extends zzed implements zzfp {
    private static final g zza;
    private zzel zzd = zzed.zzO();

    static {
        g gVar = new g();
        zza = gVar;
        zzed.zzU(g.class, gVar);
    }

    private g() {
    }

    public static f a() {
        return (f) zza.zzF();
    }

    public static /* synthetic */ void c(g gVar, d dVar) {
        dVar.getClass();
        zzel zzelVar = gVar.zzd;
        if (!zzelVar.zzc()) {
            gVar.zzd = zzed.zzP(zzelVar);
        }
        gVar.zzd.add(dVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", d.class});
        }
        if (i11 == 3) {
            return new g();
        }
        if (i11 == 4) {
            return new f(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
