package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import ee.b;
import f6.c;
import f6.e;
import f6.f;
import f6.g;
import h6.u;
import pc.w;

/* loaded from: classes2.dex */
public final class zzqh implements zzpr {
    private b zza;
    private final b zzb;
    private final zzpt zzc;

    public zzqh(Context context, zzpt zzptVar) {
        this.zzc = zzptVar;
        a aVar = a.f8096g;
        u.f(context);
        final g g10 = u.c().g(aVar);
        if (aVar.a().contains(f6.b.b("json"))) {
            this.zza = new w(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzqe
                @Override // ee.b
                public final Object get() {
                    return g.this.b("FIREBASE_ML_SDK", byte[].class, f6.b.b("json"), new e() { // from class: com.google.android.gms.internal.mlkit_common.zzqg
                        @Override // f6.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new w(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzqf
            @Override // ee.b
            public final Object get() {
                return g.this.b("FIREBASE_ML_SDK", byte[].class, f6.b.b("proto"), new e() { // from class: com.google.android.gms.internal.mlkit_common.zzqd
                    @Override // f6.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static c zzb(zzpt zzptVar, zzpq zzpqVar) {
        return c.e(zzpqVar.zze(zzptVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpr
    public final void zza(zzpq zzpqVar) {
        b bVar;
        if (this.zzc.zza() == 0) {
            bVar = this.zza;
            if (bVar == null) {
                return;
            }
        } else {
            bVar = this.zzb;
        }
        ((f) bVar.get()).b(zzb(this.zzc, zzpqVar));
    }
}