package p062db;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* renamed from: db.a */
/* loaded from: classes2.dex */
public final class C6864a extends zzed<C6864a, C6875l> implements zzfp {
    private static final C6864a zza;
    private int zzd;
    private C6873j zze;
    private C6878o zzf;

    static {
        C6864a c6864a = new C6864a();
        zza = c6864a;
        zzed.zzU(C6864a.class, c6864a);
    }

    private C6864a() {
    }

    /* renamed from: a */
    public static C6875l m19834a() {
        return (C6875l) zza.zzF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m19836c(C6864a c6864a, C6873j c6873j) {
        c6873j.getClass();
        c6864a.zze = c6873j;
        c6864a.zzd |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m19837d(C6864a c6864a, C6878o c6878o) {
        c6878o.getClass();
        c6864a.zzf = c6878o;
        c6864a.zzd |= 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C6864a();
        }
        C6874k c6874k = null;
        if (i11 == 4) {
            return new C6875l(c6874k);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
