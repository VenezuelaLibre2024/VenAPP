package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* loaded from: classes2.dex */
public final class g extends zzed implements zzfp {
    private static final g zza;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        g gVar = new g();
        zza = gVar;
        zzed.zzU(g.class, gVar);
    }

    private g() {
    }

    public static f c() {
        return (f) zza.zzF();
    }

    public static /* synthetic */ void e(g gVar, int i10) {
        gVar.zzd |= 1;
        gVar.zze = i10;
    }

    public static /* synthetic */ void f(g gVar, int i10) {
        gVar.zzd |= 2;
        gVar.zzf = i10;
    }

    public final int a() {
        return this.zze;
    }

    public final int b() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new g();
        }
        if (i11 == 4) {
            return new f(null);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
