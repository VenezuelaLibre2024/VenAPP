package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* renamed from: cg.o0 */
/* loaded from: classes2.dex */
public final class C1993o0 extends zzed implements zzfp {
    private static final C1993o0 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        C1993o0 c1993o0 = new C1993o0();
        zza = c1993o0;
        zzed.zzU(C1993o0.class, c1993o0);
    }

    private C1993o0() {
    }

    /* renamed from: b */
    public static C1993o0 m10264b() {
        return zza;
    }

    /* renamed from: c */
    public final int m10265c() {
        int m10262a = C1991n0.m10262a(this.zze);
        if (m10262a == 0) {
            return 1;
        }
        return m10262a;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", C1989m0.f8052a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C1993o0();
        }
        if (i11 == 4) {
            return new C1985k0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
