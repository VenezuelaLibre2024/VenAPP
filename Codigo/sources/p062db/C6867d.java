package p062db;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* renamed from: db.d */
/* loaded from: classes2.dex */
public final class C6867d extends zzed implements zzfp {
    private static final C6867d zza;
    private int zzd;
    private zzei zze = zzed.zzL();
    private zzei zzf = zzed.zzL();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C6867d c6867d = new C6867d();
        zza = c6867d;
        zzed.zzU(C6867d.class, c6867d);
    }

    private C6867d() {
    }

    /* renamed from: a */
    public static C6866c m19842a() {
        return (C6866c) zza.zzF();
    }

    /* renamed from: c */
    public static /* synthetic */ void m19844c(C6867d c6867d, int i10) {
        c6867d.zzd |= 2;
        c6867d.zzh = i10;
    }

    /* renamed from: d */
    public static /* synthetic */ void m19845d(C6867d c6867d, float f10) {
        zzei zzeiVar = c6867d.zze;
        if (!zzeiVar.zzc()) {
            c6867d.zze = zzed.zzM(zzeiVar);
        }
        c6867d.zze.zzg(f10);
    }

    /* renamed from: e */
    public static /* synthetic */ void m19846e(C6867d c6867d, float f10) {
        zzei zzeiVar = c6867d.zzf;
        if (!zzeiVar.zzc()) {
            c6867d.zzf = zzed.zzM(zzeiVar);
        }
        c6867d.zzf.zzg(f10);
    }

    /* renamed from: f */
    public static /* synthetic */ void m19847f(C6867d c6867d, int i10) {
        c6867d.zzd |= 1;
        c6867d.zzg = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C6867d();
        }
        if (i11 == 4) {
            return new C6866c(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
