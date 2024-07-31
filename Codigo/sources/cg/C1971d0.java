package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* renamed from: cg.d0 */
/* loaded from: classes2.dex */
public final class C1971d0 extends zzed implements zzfp {
    private static final C1971d0 zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        C1971d0 c1971d0 = new C1971d0();
        zza = c1971d0;
        zzed.zzU(C1971d0.class, c1971d0);
    }

    private C1971d0() {
    }

    /* renamed from: f */
    public static C1971d0 m10221f() {
        return zza;
    }

    /* renamed from: a */
    public final int m10222a() {
        return this.zzg;
    }

    /* renamed from: b */
    public final int m10223b() {
        return this.zzh;
    }

    /* renamed from: c */
    public final int m10224c() {
        return this.zzj;
    }

    /* renamed from: d */
    public final int m10225d() {
        return this.zze;
    }

    /* renamed from: g */
    public final boolean m10226g() {
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
            return new C1971d0();
        }
        C1966b c1966b = null;
        if (i11 == 4) {
            return new C1969c0(c1966b);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
