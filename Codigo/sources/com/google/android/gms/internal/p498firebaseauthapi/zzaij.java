package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.api.C5101a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaij implements zzalc {
    private final zzaia zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzaij(zzaia zzaiaVar) {
        zzaia zzaiaVar2 = (zzaia) zzajf.zza(zzaiaVar, "input");
        this.zza = zzaiaVar2;
        zzaiaVar2.zzd = this;
    }

    public static zzaij zza(zzaia zzaiaVar) {
        zzaij zzaijVar = zzaiaVar.zzd;
        return zzaijVar != null ? zzaijVar : new zzaij(zzaiaVar);
    }

    private final <T> T zza(zzalf<T> zzalfVar, zzaio zzaioVar) {
        T zza = zzalfVar.zza();
        zzc(zza, zzalfVar, zzaioVar);
        zzalfVar.zzc(zza);
        return zza;
    }

    private final Object zza(zzamr zzamrVar, Class<?> cls, zzaio zzaioVar) {
        switch (zzaii.zza[zzamrVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzalb.zza().zza((Class) cls), zzaioVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final void zza(int i10) {
        if (this.zza.zzc() != i10) {
            throw zzaji.zzi();
        }
    }

    private final void zza(List<String> list, boolean z10) {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) != 2) {
            throw zzaji.zza();
        }
        if (!(list instanceof zzajt) || z10) {
            do {
                list.add(z10 ? zzr() : zzq());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajt zzajtVar = (zzajt) list;
        do {
            zzajtVar.zza(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    private final <T> T zzb(zzalf<T> zzalfVar, zzaio zzaioVar) {
        T zza = zzalfVar.zza();
        zzd(zza, zzalfVar, zzaioVar);
        zzalfVar.zzc(zza);
        return zza;
    }

    private final void zzb(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzaji.zza();
        }
    }

    private static void zzc(int i10) {
        if ((i10 & 3) != 0) {
            throw zzaji.zzg();
        }
    }

    private final <T> void zzc(T t10, zzalf<T> zzalfVar, zzaio zzaioVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzalfVar.zza(t10, this, zzaioVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzaji.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private static void zzd(int i10) {
        if ((i10 & 7) != 0) {
            throw zzaji.zzg();
        }
    }

    private final <T> void zzd(T t10, zzalf<T> zzalfVar, zzaio zzaioVar) {
        int zzj = this.zza.zzj();
        zzaia zzaiaVar = this.zza;
        if (zzaiaVar.zza >= zzaiaVar.zzb) {
            throw new zzaji("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzb = zzaiaVar.zzb(zzj);
        this.zza.zza++;
        zzalfVar.zza(t10, this, zzaioVar);
        this.zza.zzc(0);
        r5.zza--;
        this.zza.zzd(zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final double zza() {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final <T> void zza(T t10, zzalf<T> zzalfVar, zzaio zzaioVar) {
        zzb(3);
        zzc(t10, zzalfVar, zzaioVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zza(List<Boolean> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzahn)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzaji.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzahn zzahnVar = (zzahn) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzaji.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzahnVar.zza(this.zza.zzu());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzahnVar.zza(this.zza.zzu());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    @Deprecated
    public final <T> void zza(List<T> list, zzalf<T> zzalfVar, zzaio zzaioVar) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzaji.zza();
        }
        do {
            list.add(zza(zzalfVar, zzaioVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == i10);
        this.zzd = zzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.p498firebaseauthapi.zzake<K, V> r9, com.google.android.gms.internal.p498firebaseauthapi.zzaio r10) {
        /*
            r7 = this;
            r0 = 2
            r7.zzb(r0)
            com.google.android.gms.internal.firebase-auth-api.zzaia r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.firebase-auth-api.zzaia r2 = r7.zza
            int r1 = r2.zzb(r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L14:
            int r4 = r7.zzc()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.firebase-auth-api.zzaia r5 = r7.zza     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.zzt()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.zzt()     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzajl -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.firebase-auth-api.zzaji r4 = new com.google.android.gms.internal.firebase-auth-api.zzaji     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzajl -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzajl -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzajl -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.firebase-auth-api.zzamr r4 = r9.zzc     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzajl -> L4e java.lang.Throwable -> L64
            V r5 = r9.zzd     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzajl -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzajl -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzajl -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.firebase-auth-api.zzamr r4 = r9.zza     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzajl -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzajl -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.zzt()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.firebase-auth-api.zzaji r8 = new com.google.android.gms.internal.firebase-auth-api.zzaji     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.firebase-auth-api.zzaia r8 = r7.zza
            r8.zzd(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzaia r9 = r7.zza
            r9.zzd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p498firebaseauthapi.zzaij.zza(java.util.Map, com.google.android.gms.internal.firebase-auth-api.zzake, com.google.android.gms.internal.firebase-auth-api.zzaio):void");
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final float zzb() {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final <T> void zzb(T t10, zzalf<T> zzalfVar, zzaio zzaioVar) {
        zzb(2);
        zzd(t10, zzalfVar, zzaioVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzb(List<zzahp> list) {
        int zzi;
        if ((this.zzb & 7) != 2) {
            throw zzaji.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final <T> void zzb(List<T> list, zzalf<T> zzalfVar, zzaio zzaioVar) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzaji.zza();
        }
        do {
            list.add(zzb(zzalfVar, zzaioVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == i10);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i11 = this.zzb;
        return (i11 == 0 || i11 == this.zzc) ? C5101a.e.API_PRIORITY_OTHER : i11 >>> 3;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzc(List<Double> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzaim)) {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzaji.zza();
                }
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzaim zzaimVar = (zzaim) list;
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw zzaji.zza();
            }
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzaimVar.zza(this.zza.zza());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        do {
            zzaimVar.zza(this.zza.zza());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzd(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzaji.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzaji.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajdVar.zzc(this.zza.zzd());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzajdVar.zzc(this.zza.zzd());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final int zze() {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zze(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i10 != 5) {
                throw zzaji.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzajdVar.zzc(this.zza.zze());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i11 != 5) {
            throw zzaji.zza();
        }
        do {
            zzajdVar.zzc(this.zza.zze());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final int zzf() {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzf(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajy)) {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzaji.zza();
                }
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzk()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajy zzajyVar = (zzajy) list;
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw zzaji.zza();
            }
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzajyVar.zza(this.zza.zzk());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        do {
            zzajyVar.zza(this.zza.zzk());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final int zzg() {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzg(List<Float> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajb)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i10 != 5) {
                throw zzaji.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajb zzajbVar = (zzajb) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzajbVar.zza(this.zza.zzb());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i11 != 5) {
            throw zzaji.zza();
        }
        do {
            zzajbVar.zza(this.zza.zzb());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final int zzh() {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzh(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzaji.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzaji.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajdVar.zzc(this.zza.zzf());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzajdVar.zzc(this.zza.zzf());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final int zzi() {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzi(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajy)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzaji.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzl()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajy zzajyVar = (zzajy) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzaji.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajyVar.zza(this.zza.zzl());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzajyVar.zza(this.zza.zzl());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final int zzj() {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzj(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i10 != 5) {
                throw zzaji.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzajdVar.zzc(this.zza.zzg());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i11 != 5) {
            throw zzaji.zza();
        }
        do {
            zzajdVar.zzc(this.zza.zzg());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final long zzk() {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzk(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajy)) {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzaji.zza();
                }
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajy zzajyVar = (zzajy) list;
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw zzaji.zza();
            }
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                zzajyVar.zza(this.zza.zzn());
            } while (this.zza.zzc() < zzc2);
            return;
        }
        do {
            zzajyVar.zza(this.zza.zzn());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final long zzl() {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzl(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzaji.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzaji.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajdVar.zzc(this.zza.zzh());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzajdVar.zzc(this.zza.zzh());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final long zzm() {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzm(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajy)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzaji.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajy zzajyVar = (zzajy) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzaji.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajyVar.zza(this.zza.zzo());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzajyVar.zza(this.zza.zzo());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final long zzn() {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzn(List<String> list) {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final long zzo() {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzo(List<String> list) {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final zzahp zzp() {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzp(List<Integer> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzaji.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzaji.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajdVar.zzc(this.zza.zzj());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzajdVar.zzc(this.zza.zzj());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final String zzq() {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final void zzq(List<Long> list) {
        int zzi;
        int zzi2;
        if (!(list instanceof zzajy)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzaji.zza();
                }
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        zzajy zzajyVar = (zzajy) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzaji.zza();
            }
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajyVar.zza(this.zza.zzp());
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        do {
            zzajyVar.zza(this.zza.zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi2 = this.zza.zzi();
            }
        } while (zzi2 == this.zzb);
        this.zzd = zzi2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final String zzr() {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final boolean zzs() {
        zzb(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzalc
    public final boolean zzt() {
        int i10;
        if (this.zza.zzt() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zze(i10);
    }
}
