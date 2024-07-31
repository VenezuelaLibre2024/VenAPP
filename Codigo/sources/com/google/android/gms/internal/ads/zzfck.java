package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.b5;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.i2;
import g9.w;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzfck implements zzdba, zzdcw, zzfea, w, zzddi, zzdbn, zzdiu {
    private final zzfir zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzfck zzh = null;

    public zzfck(zzfir zzfirVar) {
        this.zza = zzfirVar;
    }

    public static zzfck zzi(zzfck zzfckVar) {
        zzfck zzfckVar2 = new zzfck(zzfckVar.zza);
        zzfckVar2.zzh = zzfckVar;
        return zzfckVar2;
    }

    @Override // g9.w
    public final void zzbA() {
        zzfck zzfckVar = this.zzh;
        if (zzfckVar != null) {
            zzfckVar.zzbA();
            return;
        }
        zzfdr.zza(this.zzf, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfcj
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((w) obj).zzbA();
            }
        });
        zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfbw
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzbaq) obj).zzf();
            }
        });
        zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfbx
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzbaq) obj).zze();
            }
        });
    }

    @Override // g9.w
    public final void zzbC() {
        zzfck zzfckVar = this.zzh;
        if (zzfckVar != null) {
            zzfckVar.zzbC();
        } else {
            zzfdr.zza(this.zzf, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfci
                @Override // com.google.android.gms.internal.ads.zzfdq
                public final void zza(Object obj) {
                    ((w) obj).zzbC();
                }
            });
        }
    }

    @Override // g9.w
    public final void zzbD(final int i10) {
        zzfck zzfckVar = this.zzh;
        if (zzfckVar != null) {
            zzfckVar.zzbD(i10);
        } else {
            zzfdr.zza(this.zzf, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfce
                @Override // com.google.android.gms.internal.ads.zzfdq
                public final void zza(Object obj) {
                    ((w) obj).zzbD(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(final c3 c3Var) {
        zzfck zzfckVar = this.zzh;
        if (zzfckVar != null) {
            zzfckVar.zzbK(c3Var);
        } else {
            zzfdr.zza(this.zzb, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfcf
                @Override // com.google.android.gms.internal.ads.zzfdq
                public final void zza(Object obj) {
                    ((zzbam) obj).zzc(c3.this);
                }
            });
            zzfdr.zza(this.zzb, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfcg
                @Override // com.google.android.gms.internal.ads.zzfdq
                public final void zza(Object obj) {
                    ((zzbam) obj).zzb(c3.this.f8626a);
                }
            });
        }
    }

    @Override // g9.w
    public final void zzbP() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzbo() {
    }

    @Override // g9.w
    public final void zzbt() {
    }

    @Override // g9.w
    public final void zzbz() {
        zzfck zzfckVar = this.zzh;
        if (zzfckVar != null) {
            zzfckVar.zzbz();
        } else {
            zzfdr.zza(this.zzf, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfby
                @Override // com.google.android.gms.internal.ads.zzfdq
                public final void zza(Object obj) {
                    ((w) obj).zzbz();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzg() {
        zzfck zzfckVar = this.zzh;
        if (zzfckVar != null) {
            zzfckVar.zzg();
        } else {
            zzfdr.zza(this.zze, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfch
                @Override // com.google.android.gms.internal.ads.zzfdq
                public final void zza(Object obj) {
                    ((zzdcw) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zzh(final b5 b5Var) {
        zzfck zzfckVar = this.zzh;
        if (zzfckVar != null) {
            zzfckVar.zzh(b5Var);
        } else {
            zzfdr.zza(this.zzg, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfbv
                @Override // com.google.android.gms.internal.ads.zzfdq
                public final void zza(Object obj) {
                    ((i2) obj).x1(b5.this);
                }
            });
        }
    }

    public final void zzj() {
        zzfck zzfckVar = this.zzh;
        if (zzfckVar != null) {
            zzfckVar.zzj();
            return;
        }
        this.zza.zza();
        zzfdr.zza(this.zzc, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfcc
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzban) obj).zza();
            }
        });
        zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfcd
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzbaq) obj).zzc();
            }
        });
    }

    public final void zzk(final zzbaj zzbajVar) {
        zzfck zzfckVar = this.zzh;
        if (zzfckVar != null) {
            zzfckVar.zzk(zzbajVar);
        } else {
            zzfdr.zza(this.zzb, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfca
                @Override // com.google.android.gms.internal.ads.zzfdq
                public final void zza(Object obj) {
                    ((zzbam) obj).zzd(zzbaj.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfea
    public final void zzl(zzfea zzfeaVar) {
        this.zzh = (zzfck) zzfeaVar;
    }

    public final void zzm(w wVar) {
        this.zzf.set(wVar);
    }

    public final void zzn(i2 i2Var) {
        this.zzg.set(i2Var);
    }

    public final void zzo(zzbam zzbamVar) {
        this.zzb.set(zzbamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbn
    public final void zzp(final c3 c3Var) {
        zzfck zzfckVar = this.zzh;
        if (zzfckVar != null) {
            zzfckVar.zzp(c3Var);
        } else {
            zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfbz
                @Override // com.google.android.gms.internal.ads.zzfdq
                public final void zza(Object obj) {
                    ((zzbaq) obj).zzd(c3.this);
                }
            });
        }
    }

    public final void zzq(zzbaq zzbaqVar) {
        this.zzd.set(zzbaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() {
        zzfck zzfckVar = this.zzh;
        if (zzfckVar != null) {
            zzfckVar.zzs();
        } else {
            zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfcb
                @Override // com.google.android.gms.internal.ads.zzfdq
                public final void zza(Object obj) {
                    ((zzbaq) obj).zzb();
                }
            });
        }
    }
}
