package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* renamed from: cg.q */
/* loaded from: classes2.dex */
public final class C1996q extends zzed implements zzfp {
    private static final C1996q zza;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzg = "";

    static {
        C1996q c1996q = new C1996q();
        zza = c1996q;
        zzed.zzU(C1996q.class, c1996q);
    }

    private C1996q() {
    }

    /* renamed from: b */
    public static C1996q m10268b() {
        return zza;
    }

    /* renamed from: c */
    public final int m10269c() {
        int m10266a = C1994p.m10266a(this.zzf);
        if (m10266a == 0) {
            return 1;
        }
        return m10266a;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", C1992o.f8054a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C1996q();
        }
        if (i11 == 4) {
            return new C1988m(null);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
