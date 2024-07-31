package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* renamed from: cg.g */
/* loaded from: classes2.dex */
public final class C1976g extends zzed implements zzfp {
    private static final C1976g zza;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C1976g c1976g = new C1976g();
        zza = c1976g;
        zzed.zzU(C1976g.class, c1976g);
    }

    private C1976g() {
    }

    /* renamed from: c */
    public static C1974f m10237c() {
        return (C1974f) zza.zzF();
    }

    /* renamed from: e */
    public static /* synthetic */ void m10239e(C1976g c1976g, int i10) {
        c1976g.zzd |= 1;
        c1976g.zze = i10;
    }

    /* renamed from: f */
    public static /* synthetic */ void m10240f(C1976g c1976g, int i10) {
        c1976g.zzd |= 2;
        c1976g.zzf = i10;
    }

    /* renamed from: a */
    public final int m10241a() {
        return this.zze;
    }

    /* renamed from: b */
    public final int m10242b() {
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
            return new C1976g();
        }
        if (i11 == 4) {
            return new C1974f(null);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
