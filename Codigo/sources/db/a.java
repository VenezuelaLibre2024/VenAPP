package db;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* loaded from: classes2.dex */
public final class a extends zzed<a, l> implements zzfp {
    private static final a zza;
    private int zzd;
    private j zze;
    private o zzf;

    static {
        a aVar = new a();
        zza = aVar;
        zzed.zzU(a.class, aVar);
    }

    private a() {
    }

    public static l a() {
        return (l) zza.zzF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(a aVar, j jVar) {
        jVar.getClass();
        aVar.zze = jVar;
        aVar.zzd |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(a aVar, o oVar) {
        oVar.getClass();
        aVar.zzf = oVar;
        aVar.zzd |= 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new a();
        }
        k kVar = null;
        if (i11 == 4) {
            return new l(kVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
