package p062db;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* renamed from: db.g */
/* loaded from: classes2.dex */
public final class C6870g extends zzed implements zzfp {
    private static final C6870g zza;
    private zzel zzd = zzed.zzO();

    static {
        C6870g c6870g = new C6870g();
        zza = c6870g;
        zzed.zzU(C6870g.class, c6870g);
    }

    private C6870g() {
    }

    /* renamed from: a */
    public static C6869f m19849a() {
        return (C6869f) zza.zzF();
    }

    /* renamed from: c */
    public static /* synthetic */ void m19851c(C6870g c6870g, C6867d c6867d) {
        c6867d.getClass();
        zzel zzelVar = c6870g.zzd;
        if (!zzelVar.zzc()) {
            c6870g.zzd = zzed.zzP(zzelVar);
        }
        c6870g.zzd.add(c6867d);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C6867d.class});
        }
        if (i11 == 3) {
            return new C6870g();
        }
        if (i11 == 4) {
            return new C6869f(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
