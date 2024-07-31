package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* loaded from: classes2.dex */
public final class d0 extends zzed implements zzfp {
    private static final d0 zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        d0 d0Var = new d0();
        zza = d0Var;
        zzed.zzU(d0.class, d0Var);
    }

    private d0() {
    }

    public static d0 f() {
        return zza;
    }

    public final int a() {
        return this.zzg;
    }

    public final int b() {
        return this.zzh;
    }

    public final int c() {
        return this.zzj;
    }

    public final int d() {
        return this.zze;
    }

    public final boolean g() {
        return this.zzk;
    }

    public final int zzc() {
        return this.zzi;
    }

    public final int zzd() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new d0();
        }
        b bVar = null;
        if (i11 == 4) {
            return new c0(bVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
