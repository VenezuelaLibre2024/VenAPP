package p062db;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* renamed from: db.o */
/* loaded from: classes2.dex */
public final class C6878o extends zzed implements zzfp {
    private static final C6878o zza;
    private int zzd;
    private String zze = "";
    private zzdb zzf;
    private String zzg;
    private zzdb zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        C6878o c6878o = new C6878o();
        zza = c6878o;
        zzed.zzU(C6878o.class, c6878o);
    }

    private C6878o() {
        zzdb zzdbVar = zzdb.zzb;
        this.zzf = zzdbVar;
        this.zzg = "";
        this.zzh = zzdbVar;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    /* renamed from: a */
    public static C6877n m19862a() {
        return (C6877n) zza.zzF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m19864c(C6878o c6878o, zzdb zzdbVar) {
        zzdbVar.getClass();
        c6878o.zzd |= 2;
        c6878o.zzf = zzdbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m19865d(C6878o c6878o, zzdb zzdbVar) {
        zzdbVar.getClass();
        c6878o.zzd |= 8;
        c6878o.zzh = zzdbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C6878o();
        }
        C6876m c6876m = null;
        if (i11 == 4) {
            return new C6877n(c6876m);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
