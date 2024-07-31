package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzej;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;

/* loaded from: classes2.dex */
public final class s extends zzed implements zzfp {
    private static final s zza;
    private int zzd;
    private int zze;
    private zzdb zzf;
    private String zzg;
    private int zzh;
    private h0 zzi;
    private o0 zzj;
    private zzci zzk;
    private i zzl;
    private q zzm;
    private l zzn;
    private e zzo;
    private f0 zzp;
    private j0 zzq;
    private b0 zzr;
    private zzel zzs;
    private zzej zzt;
    private String zzu;
    private zzel zzv;
    private boolean zzw;
    private double zzx;
    private zzdb zzy;
    private byte zzz = 2;

    static {
        s sVar = new s();
        zza = sVar;
        zzed.zzU(s.class, sVar);
    }

    private s() {
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

    public static /* synthetic */ void o(s sVar, int i10, g gVar) {
        gVar.getClass();
        zzel zzelVar = sVar.zzs;
        if (!zzelVar.zzc()) {
            sVar.zzs = zzed.zzP(zzelVar);
        }
        sVar.zzs.set(i10, gVar);
    }

    public final int a() {
        int a10 = y.a(this.zzh);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int b() {
        return this.zzs.size();
    }

    public final f0 d() {
        f0 f0Var = this.zzp;
        return f0Var == null ? f0.d() : f0Var;
    }

    public final h0 e() {
        h0 h0Var = this.zzi;
        return h0Var == null ? h0.b() : h0Var;
    }

    public final j0 f() {
        j0 j0Var = this.zzq;
        return j0Var == null ? j0.b() : j0Var;
    }

    public final o0 g() {
        o0 o0Var = this.zzj;
        return o0Var == null ? o0.b() : o0Var;
    }

    public final e h() {
        e eVar = this.zzo;
        return eVar == null ? e.d() : eVar;
    }

    public final i i() {
        i iVar = this.zzl;
        return iVar == null ? i.b() : iVar;
    }

    public final l j() {
        l lVar = this.zzn;
        return lVar == null ? l.b() : lVar;
    }

    public final q k() {
        q qVar = this.zzm;
        return qVar == null ? q.b() : qVar;
    }

    public final zzdb l() {
        return this.zzf;
    }

    public final String m() {
        return this.zzg;
    }

    public final List n() {
        return this.zzs;
    }

    public final boolean p() {
        return (this.zzd & RecognitionOptions.PDF417) != 0;
    }

    public final boolean q() {
        return (this.zzd & 16) != 0;
    }

    public final boolean r() {
        return (this.zzd & RecognitionOptions.AZTEC) != 0;
    }

    public final boolean s() {
        return (this.zzd & 32) != 0;
    }

    public final boolean t() {
        return (this.zzd & RecognitionOptions.UPC_E) != 0;
    }

    public final boolean u() {
        return (this.zzd & 64) != 0;
    }

    public final boolean v() {
        return (this.zzd & RecognitionOptions.ITF) != 0;
    }

    public final boolean w() {
        return (this.zzd & RecognitionOptions.UPC_A) != 0;
    }

    public final boolean x() {
        return (this.zzd & RecognitionOptions.QR_CODE) != 0;
    }

    public final int y() {
        int a10 = v.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
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
            return zzed.zzR(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bЛ\fဈ\u000e\rЛ\u000eည\u0011\u000fᐉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012\u0016\u0013ဉ\r\u0014ဇ\u000f\u0015က\u0010", new Object[]{"zzd", "zze", u.f7104a, "zzf", "zzg", "zzh", x.f7106a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzs", g.class, "zzu", "zzv", g.class, "zzy", "zzo", "zzp", "zzq", "zzt", "zzr", "zzw", "zzx"});
        }
        if (i11 == 3) {
            return new s();
        }
        if (i11 == 4) {
            return new r(null);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzz = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
