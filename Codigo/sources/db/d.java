package db;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* loaded from: classes2.dex */
public final class d extends zzed implements zzfp {
    private static final d zza;
    private int zzd;
    private zzei zze = zzed.zzL();
    private zzei zzf = zzed.zzL();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        d dVar = new d();
        zza = dVar;
        zzed.zzU(d.class, dVar);
    }

    private d() {
    }

    public static c a() {
        return (c) zza.zzF();
    }

    public static /* synthetic */ void c(d dVar, int i10) {
        dVar.zzd |= 2;
        dVar.zzh = i10;
    }

    public static /* synthetic */ void d(d dVar, float f10) {
        zzei zzeiVar = dVar.zze;
        if (!zzeiVar.zzc()) {
            dVar.zze = zzed.zzM(zzeiVar);
        }
        dVar.zze.zzg(f10);
    }

    public static /* synthetic */ void e(d dVar, float f10) {
        zzei zzeiVar = dVar.zzf;
        if (!zzeiVar.zzc()) {
            dVar.zzf = zzed.zzM(zzeiVar);
        }
        dVar.zzf.zzg(f10);
    }

    public static /* synthetic */ void f(d dVar, int i10) {
        dVar.zzd |= 1;
        dVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new d();
        }
        if (i11 == 4) {
            return new c(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
