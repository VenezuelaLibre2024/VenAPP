package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.HashMap;
import java.util.Map;
import jd.d;
import jd.f;
import kd.b;

/* loaded from: classes2.dex */
public final class zzfk implements b {
    public static final /* synthetic */ int zza = 0;
    private static final d zzb = new d() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzfj
        @Override // jd.d
        public final void encode(Object obj, Object obj2) {
            int i10 = zzfk.zza;
            throw new jd.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final d zze = zzb;

    @Override // kd.b
    public final /* bridge */ /* synthetic */ b registerEncoder(Class cls, d dVar) {
        this.zzc.put(cls, dVar);
        this.zzd.remove(cls);
        return this;
    }

    public final /* bridge */ /* synthetic */ b registerEncoder(Class cls, f fVar) {
        this.zzd.put(cls, fVar);
        this.zzc.remove(cls);
        return this;
    }

    public final zzfl zza() {
        return new zzfl(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }
}
