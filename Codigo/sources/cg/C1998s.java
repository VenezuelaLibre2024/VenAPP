package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzej;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;

/* renamed from: cg.s */
/* loaded from: classes2.dex */
public final class C1998s extends zzed implements zzfp {
    private static final C1998s zza;
    private int zzd;
    private int zze;
    private zzdb zzf;
    private String zzg;
    private int zzh;
    private C1979h0 zzi;
    private C1993o0 zzj;
    private zzci zzk;
    private C1980i zzl;
    private C1996q zzm;
    private C1986l zzn;
    private C1972e zzo;
    private C1975f0 zzp;
    private C1983j0 zzq;
    private C1967b0 zzr;
    private zzel zzs;
    private zzej zzt;
    private String zzu;
    private zzel zzv;
    private boolean zzw;
    private double zzx;
    private zzdb zzy;
    private byte zzz = 2;

    static {
        C1998s c1998s = new C1998s();
        zza = c1998s;
        zzed.zzU(C1998s.class, c1998s);
    }

    private C1998s() {
        zzdb zzdbVar = zzdb.zzb;
        this.zzf = zzdbVar;
        this.zzg = "";
        this.zzs = zzed.zzO();
        this.zzt = zzed.zzN();
        this.zzu = "";
        this.zzv = zzed.zzO();
        this.zzw = true;
        this.zzy = zzdbVar;
    }

    /* renamed from: o */
    public static /* synthetic */ void m10272o(C1998s c1998s, int i10, C1976g c1976g) {
        c1976g.getClass();
        zzel zzelVar = c1998s.zzs;
        if (!zzelVar.zzc()) {
            c1998s.zzs = zzed.zzP(zzelVar);
        }
        c1998s.zzs.set(i10, c1976g);
    }

    /* renamed from: a */
    public final int m10273a() {
        int m10297a = C2004y.m10297a(this.zzh);
        if (m10297a == 0) {
            return 1;
        }
        return m10297a;
    }

    /* renamed from: b */
    public final int m10274b() {
        return this.zzs.size();
    }

    /* renamed from: d */
    public final C1975f0 m10275d() {
        C1975f0 c1975f0 = this.zzp;
        return c1975f0 == null ? C1975f0.m10234d() : c1975f0;
    }

    /* renamed from: e */
    public final C1979h0 m10276e() {
        C1979h0 c1979h0 = this.zzi;
        return c1979h0 == null ? C1979h0.m10244b() : c1979h0;
    }

    /* renamed from: f */
    public final C1983j0 m10277f() {
        C1983j0 c1983j0 = this.zzq;
        return c1983j0 == null ? C1983j0.m10252b() : c1983j0;
    }

    /* renamed from: g */
    public final C1993o0 m10278g() {
        C1993o0 c1993o0 = this.zzj;
        return c1993o0 == null ? C1993o0.m10264b() : c1993o0;
    }

    /* renamed from: h */
    public final C1972e m10279h() {
        C1972e c1972e = this.zzo;
        return c1972e == null ? C1972e.m10228d() : c1972e;
    }

    /* renamed from: i */
    public final C1980i m10280i() {
        C1980i c1980i = this.zzl;
        return c1980i == null ? C1980i.m10250b() : c1980i;
    }

    /* renamed from: j */
    public final C1986l m10281j() {
        C1986l c1986l = this.zzn;
        return c1986l == null ? C1986l.m10261b() : c1986l;
    }

    /* renamed from: k */
    public final C1996q m10282k() {
        C1996q c1996q = this.zzm;
        return c1996q == null ? C1996q.m10268b() : c1996q;
    }

    /* renamed from: l */
    public final zzdb m10283l() {
        return this.zzf;
    }

    /* renamed from: m */
    public final String m10284m() {
        return this.zzg;
    }

    /* renamed from: n */
    public final List m10285n() {
        return this.zzs;
    }

    /* renamed from: p */
    public final boolean m10286p() {
        return (this.zzd & RecognitionOptions.PDF417) != 0;
    }

    /* renamed from: q */
    public final boolean m10287q() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: r */
    public final boolean m10288r() {
        return (this.zzd & RecognitionOptions.AZTEC) != 0;
    }

    /* renamed from: s */
    public final boolean m10289s() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: t */
    public final boolean m10290t() {
        return (this.zzd & RecognitionOptions.UPC_E) != 0;
    }

    /* renamed from: u */
    public final boolean m10291u() {
        return (this.zzd & 64) != 0;
    }

    /* renamed from: v */
    public final boolean m10292v() {
        return (this.zzd & RecognitionOptions.ITF) != 0;
    }

    /* renamed from: w */
    public final boolean m10293w() {
        return (this.zzd & RecognitionOptions.UPC_A) != 0;
    }

    /* renamed from: x */
    public final boolean m10294x() {
        return (this.zzd & RecognitionOptions.QR_CODE) != 0;
    }

    /* renamed from: y */
    public final int m10295y() {
        int m10296a = C2001v.m10296a(this.zze);
        if (m10296a == 0) {
            return 1;
        }
        return m10296a;
    }

    public final zzci zzb() {
        zzci zzciVar = this.zzk;
        return zzciVar == null ? zzci.zzb() : zzciVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzz);
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bЛ\fဈ\u000e\rЛ\u000eည\u0011\u000fᐉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012\u0016\u0013ဉ\r\u0014ဇ\u000f\u0015က\u0010", new Object[]{"zzd", "zze", C2000u.f8056a, "zzf", "zzg", "zzh", C2003x.f8058a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzs", C1976g.class, "zzu", "zzv", C1976g.class, "zzy", "zzo", "zzp", "zzq", "zzt", "zzr", "zzw", "zzx"});
        }
        if (i11 == 3) {
            return new C1998s();
        }
        if (i11 == 4) {
            return new C1997r(null);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzz = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
