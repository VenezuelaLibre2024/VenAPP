package cg;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;
import java.util.List;

/* renamed from: cg.a */
/* loaded from: classes2.dex */
public final class C1964a extends zzed<C1964a, C2005z> implements zzfp {
    private static final C1964a zza;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private zzel zze = zzed.zzO();
    private String zzg = "";
    private zzdb zzh = zzdb.zzb;

    static {
        C1964a c1964a = new C1964a();
        zza = c1964a;
        zzed.zzU(C1964a.class, c1964a);
    }

    private C1964a() {
    }

    /* renamed from: b */
    public static C1964a m10216b(byte[] bArr, zzdo zzdoVar) {
        return (C1964a) zzed.zzK(zza, bArr, zzdoVar);
    }

    /* renamed from: c */
    public final List m10217c() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", C1998s.class, "zzf", C1982j.f8051a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C1964a();
        }
        if (i11 == 4) {
            return new C2005z(null);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
