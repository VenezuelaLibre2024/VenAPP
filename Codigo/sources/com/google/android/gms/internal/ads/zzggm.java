package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzggm {
    private final zzgvg zza;
    private final List zzb;
    private final zzgrw zzc;

    private zzggm(zzgvg zzgvgVar, List list) {
        this.zza = zzgvgVar;
        this.zzb = list;
        this.zzc = zzgrw.zza;
    }

    private zzggm(zzgvg zzgvgVar, List list, zzgrw zzgrwVar) {
        this.zza = zzgvgVar;
        this.zzb = list;
        this.zzc = zzgrwVar;
    }

    public static final zzggm zza(zzgvg zzgvgVar) {
        zzi(zzgvgVar);
        return new zzggm(zzgvgVar, zzh(zzgvgVar));
    }

    public static final zzggm zzb(zzgvg zzgvgVar, zzgrw zzgrwVar) {
        zzi(zzgvgVar);
        return new zzggm(zzgvgVar, zzh(zzgvgVar), zzgrwVar);
    }

    public static final zzggm zzc(zzggq zzggqVar) {
        zzggj zzggjVar = new zzggj();
        zzggh zzgghVar = new zzggh(zzggqVar, null);
        zzgghVar.zze();
        zzgghVar.zzd();
        zzggjVar.zza(zzgghVar);
        return zzggjVar.zzb();
    }

    private static zzgox zzf(zzgvf zzgvfVar) {
        try {
            return zzgox.zza(zzgvfVar.zzc().zzg(), zzgvfVar.zzc().zzf(), zzgvfVar.zzc().zzc(), zzgvfVar.zzf(), zzgvfVar.zzf() == zzgvz.RAW ? null : Integer.valueOf(zzgvfVar.zza()));
        } catch (GeneralSecurityException e10) {
            throw new zzgpl("Creating a protokey serialization failed", e10);
        }
    }

    private static Object zzg(zzgnb zzgnbVar, zzgvf zzgvfVar, Class cls) {
        try {
            return zzghb.zzc(zzgvfVar.zzc(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    private static List zzh(zzgvg zzgvgVar) {
        zzgge zzggeVar;
        ArrayList arrayList = new ArrayList(zzgvgVar.zza());
        for (zzgvf zzgvfVar : zzgvgVar.zzh()) {
            int zza = zzgvfVar.zza();
            try {
                zzggc zzb = zzgoe.zzd().zzb(zzf(zzgvfVar), zzghc.zza());
                int zzk = zzgvfVar.zzk() - 2;
                if (zzk == 1) {
                    zzggeVar = zzgge.zza;
                } else if (zzk == 2) {
                    zzggeVar = zzgge.zzb;
                } else {
                    if (zzk != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                        break;
                    }
                    zzggeVar = zzgge.zzc;
                }
                arrayList.add(new zzggl(zzb, zzggeVar, zza, zza == zzgvgVar.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzi(zzgvg zzgvgVar) {
        if (zzgvgVar == null || zzgvgVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static final Object zzj(zzgnb zzgnbVar, zzggc zzggcVar, Class cls) {
        try {
            return zzgob.zza().zzc(zzggcVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        Charset charset = zzghf.zza;
        zzgvg zzgvgVar = this.zza;
        zzgvi zza = zzgvl.zza();
        zza.zzb(zzgvgVar.zzc());
        for (zzgvf zzgvfVar : zzgvgVar.zzh()) {
            zzgvj zza2 = zzgvk.zza();
            zza2.zzc(zzgvfVar.zzc().zzg());
            zza2.zzd(zzgvfVar.zzk());
            zza2.zzb(zzgvfVar.zzf());
            zza2.zza(zzgvfVar.zza());
            zza.zza((zzgvk) zza2.zzal());
        }
        return ((zzgvl) zza.zzal()).toString();
    }

    public final zzgvg zzd() {
        return this.zza;
    }

    public final Object zze(zzgfw zzgfwVar, Class cls) {
        Class zzb = zzghb.zzb(cls);
        if (zzb == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        zzgvg zzgvgVar = this.zza;
        Charset charset = zzghf.zza;
        int zzc = zzgvgVar.zzc();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzgvf zzgvfVar : zzgvgVar.zzh()) {
            if (zzgvfVar.zzk() == 3) {
                if (!zzgvfVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgvfVar.zza())));
                }
                if (zzgvfVar.zzf() == zzgvz.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgvfVar.zza())));
                }
                if (zzgvfVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgvfVar.zza())));
                }
                if (zzgvfVar.zza() == zzc) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z11 &= zzgvfVar.zzc().zzc() == zzgus.ASYMMETRIC_PUBLIC;
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzggs zzggsVar = new zzggs(zzb, null);
        zzggsVar.zzc(this.zzc);
        for (int i11 = 0; i11 < this.zza.zza(); i11++) {
            zzgvf zze = this.zza.zze(i11);
            if (zze.zzk() == 3) {
                zzgnb zzgnbVar = (zzgnb) zzgfwVar;
                Object zzg = zzg(zzgnbVar, zze, zzb);
                Object zzj = this.zzb.get(i11) != null ? zzj(zzgnbVar, ((zzggl) this.zzb.get(i11)).zza(), zzb) : null;
                if (zzj == null && zzg == null) {
                    throw new GeneralSecurityException("Unable to get primitive " + zzb.toString() + " for key of type " + zze.zzc().zzg());
                }
                if (zze.zza() == this.zza.zzc()) {
                    zzggsVar.zzb(zzj, zzg, zze);
                } else {
                    zzggsVar.zza(zzj, zzg, zze);
                }
            }
        }
        return zzgob.zza().zzd(zzggsVar.zzd(), cls);
    }
}
