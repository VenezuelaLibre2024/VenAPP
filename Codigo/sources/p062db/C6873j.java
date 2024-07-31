package p062db;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzht;

/* renamed from: db.j */
/* loaded from: classes2.dex */
public final class C6873j extends zzed implements zzfp {
    private static final C6873j zza;
    private int zzd;
    private C6870g zzj;
    private zzht zzm;
    private String zze = "";
    private zzdb zzf = zzdb.zzb;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private zzei zzk = zzed.zzL();
    private int zzl = 1;
    private int zzn = 320;
    private int zzo = 4;
    private int zzp = 2;

    static {
        C6873j c6873j = new C6873j();
        zza = c6873j;
        zzed.zzU(C6873j.class, c6873j);
    }

    private C6873j() {
    }

    /* renamed from: a */
    public static C6872i m19854a() {
        return (C6872i) zza.zzF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m19856c(C6873j c6873j, C6870g c6870g) {
        c6870g.getClass();
        c6873j.zzj = c6870g;
        c6873j.zzd |= 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m19857d(C6873j c6873j, zzdb zzdbVar) {
        zzdbVar.getClass();
        c6873j.zzd |= 2;
        c6873j.zzf = zzdbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007\u0013\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new C6873j();
        }
        C6871h c6871h = null;
        if (i11 == 4) {
            return new C6872i(c6871h);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
