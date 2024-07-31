package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* renamed from: cg.j0 */
/* loaded from: classes2.dex */
public final class C1983j0 extends zzed implements zzfp {
    private static final C1983j0 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        C1983j0 c1983j0 = new C1983j0();
        zza = c1983j0;
        zzed.zzU(C1983j0.class, c1983j0);
    }

    private C1983j0() {
    }

    /* renamed from: b */
    public static C1983j0 m10252b() {
        return zza;
    }

    /* renamed from: c */
    public final String m10253c() {
        return this.zzf;
    }

    /* renamed from: d */
    public final String m10254d() {
        return this.zzi;
    }

    /* renamed from: e */
    public final String m10255e() {
        return this.zzo;
    }

    /* renamed from: f */
    public final String m10256f() {
        return this.zzr;
    }

    /* renamed from: g */
    public final String m10257g() {
        return this.zzh;
    }

    /* renamed from: h */
    public final String m10258h() {
        return this.zzn;
    }

    /* renamed from: i */
    public final String m10259i() {
        return this.zzg;
    }

    public final String zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzl;
    }

    public final String zze() {
        return this.zzj;
    }

    public final String zzf() {
        return this.zzm;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i11 == 3) {
            return new C1983j0();
        }
        C1966b c1966b = null;
        if (i11 == 4) {
            return new C1981i0(c1966b);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final String zzh() {
        return this.zzq;
    }

    public final String zzi() {
        return this.zze;
    }

    public final String zzj() {
        return this.zzp;
    }
}
