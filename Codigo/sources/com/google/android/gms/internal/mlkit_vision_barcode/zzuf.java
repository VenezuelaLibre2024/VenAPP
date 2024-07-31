package com.google.android.gms.internal.mlkit_vision_barcode;

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
public final class zzuf implements zztn {
    private b zza;
    private final b zzb;
    private final zztp zzc;

    public zzuf(Context context, zztp zztpVar) {
        this.zzc = zztpVar;
        a aVar = a.f8096g;
        u.f(context);
        final g g10 = u.c().g(aVar);
        if (aVar.a().contains(f6.b.b("json"))) {
            this.zza = new w(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzuc
                @Override // ee.b
                public final Object get() {
                    return g.this.b("FIREBASE_ML_SDK", byte[].class, f6.b.b("json"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzue
                        @Override // f6.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new w(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzud
            @Override // ee.b
            public final Object get() {
                return g.this.b("FIREBASE_ML_SDK", byte[].class, f6.b.b("proto"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzub
                    @Override // f6.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static c zzb(zztp zztpVar, zztm zztmVar) {
        int zza = zztpVar.zza();
        int zza2 = zztmVar.zza();
        byte[] zze = zztmVar.zze(zza, false);
        return zza2 != 0 ? c.d(zze) : c.e(zze);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztn
    public final void zza(zztm zztmVar) {
        b bVar;
        if (this.zzc.zza() == 0) {
            bVar = this.zza;
            if (bVar == null) {
                return;
            }
        } else {
            bVar = this.zzb;
        }
        ((f) bVar.get()).b(zzb(this.zzc, zztmVar));
    }
}
