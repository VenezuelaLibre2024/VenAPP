package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfg implements zzik {
    private final zzff zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzfg(zzff zzffVar) {
        byte[] bArr = zzgw.zzd;
        this.zza = zzffVar;
        zzffVar.zzc = this;
    }

    private final void zzP(Object obj, zzil zzilVar, zzfz zzfzVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzilVar.zzh(obj, this, zzfzVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzgy.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzil zzilVar, zzfz zzfzVar) {
        int zzn = this.zza.zzn();
        zzff zzffVar = this.zza;
        if (zzffVar.zza >= zzffVar.zzb) {
            throw new zzgy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zze = zzffVar.zze(zzn);
        this.zza.zza++;
        zzilVar.zzh(obj, this, zzfzVar);
        this.zza.zzz(0);
        r5.zza--;
        this.zza.zzA(zze);
    }

    private final void zzR(int i10) {
        if (this.zza.zzd() != i10) {
            throw zzgy.zzj();
        }
    }

    private final void zzS(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzgy.zza();
        }
    }

    private static final void zzT(int i10) {
        if ((i10 & 3) != 0) {
            throw zzgy.zzg();
        }
    }

    private static final void zzU(int i10) {
        if ((i10 & 7) != 0) {
            throw zzgy.zzg();
        }
    }

    public static zzfg zzq(zzff zzffVar) {
        zzfg zzfgVar = zzffVar.zzc;
        return zzfgVar != null ? zzfgVar : new zzfg(zzffVar);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzA(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzhn)) {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzgy.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzhn zzhnVar = (zzhn) list;
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw zzgy.zza();
            }
            int zzn2 = this.zza.zzn();
            zzU(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzhnVar.zzf(this.zza.zzo());
            } while (this.zza.zzd() < zzd2);
            return;
        }
        do {
            zzhnVar.zzf(this.zza.zzo());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzB(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgg)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i10 != 5) {
                throw zzgy.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzgg zzggVar = (zzgg) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzggVar.zze(this.zza.zzc());
            } while (this.zza.zzd() < zzd2);
            return;
        }
        if (i11 != 5) {
            throw zzgy.zza();
        }
        do {
            zzggVar.zze(this.zza.zzc());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    @Deprecated
    public final void zzC(List list, zzil zzilVar, zzfz zzfzVar) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzgy.zza();
        }
        do {
            Object zze = zzilVar.zze();
            zzP(zze, zzilVar, zzfzVar);
            zzilVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzD(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgp)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgy.zza();
                }
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzgy.zza();
            }
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                zzgpVar.zzg(this.zza.zzh());
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
            return;
        }
        do {
            zzgpVar.zzg(this.zza.zzh());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzE(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzhn)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgy.zza();
                }
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzhn zzhnVar = (zzhn) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzgy.zza();
            }
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                zzhnVar.zzf(this.zza.zzp());
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
            return;
        }
        do {
            zzhnVar.zzf(this.zza.zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzF(List list, zzil zzilVar, zzfz zzfzVar) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzgy.zza();
        }
        do {
            Object zze = zzilVar.zze();
            zzQ(zze, zzilVar, zzfzVar);
            zzilVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzG(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgp)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i10 != 5) {
                throw zzgy.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzgpVar.zzg(this.zza.zzk());
            } while (this.zza.zzd() < zzd2);
            return;
        }
        if (i11 != 5) {
            throw zzgy.zza();
        }
        do {
            zzgpVar.zzg(this.zza.zzk());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzH(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzhn)) {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzgy.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzhn zzhnVar = (zzhn) list;
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw zzgy.zza();
            }
            int zzn2 = this.zza.zzn();
            zzU(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzhnVar.zzf(this.zza.zzt());
            } while (this.zza.zzd() < zzd2);
            return;
        }
        do {
            zzhnVar.zzf(this.zza.zzt());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzI(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgp)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgy.zza();
                }
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzgy.zza();
            }
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                zzgpVar.zzg(this.zza.zzl());
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
            return;
        }
        do {
            zzgpVar.zzg(this.zza.zzl());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzJ(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzhn)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgy.zza();
                }
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzhn zzhnVar = (zzhn) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzgy.zza();
            }
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                zzhnVar.zzf(this.zza.zzu());
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
            return;
        }
        do {
            zzhnVar.zzf(this.zza.zzu());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    public final void zzK(List list, boolean z10) {
        int zzm;
        int zzm2;
        if ((this.zzb & 7) != 2) {
            throw zzgy.zza();
        }
        if (!(list instanceof zzhg) || z10) {
            do {
                list.add(z10 ? zzs() : zzr());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzhg zzhgVar = (zzhg) list;
        do {
            zzhgVar.zzi(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzL(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgp)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgy.zza();
                }
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzgy.zza();
            }
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                zzgpVar.zzg(this.zza.zzn());
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
            return;
        }
        do {
            zzgpVar.zzg(this.zza.zzn());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzM(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzhn)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgy.zza();
                }
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzhn zzhnVar = (zzhn) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzgy.zza();
            }
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                zzhnVar.zzf(this.zza.zzv());
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
            return;
        }
        do {
            zzhnVar.zzf(this.zza.zzv());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final boolean zzN() {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final boolean zzO() {
        int i10;
        if (this.zza.zzC() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final double zza() {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final float zzb() {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzm();
            this.zzb = i10;
        }
        return (i10 == 0 || i10 == this.zzc) ? a.e.API_PRIORITY_OTHER : i10 >>> 3;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zze() {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzf() {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzg() {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzh() {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzi() {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final int zzj() {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzk() {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzl() {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzm() {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzn() {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final long zzo() {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final zzez zzp() {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final String zzr() {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final String zzs() {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzt(Object obj, zzil zzilVar, zzfz zzfzVar) {
        zzS(3);
        zzP(obj, zzilVar, zzfzVar);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzu(Object obj, zzil zzilVar, zzfz zzfzVar) {
        zzS(2);
        zzQ(obj, zzilVar, zzfzVar);
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzv(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzeo)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgy.zza();
                }
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzeo zzeoVar = (zzeo) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzgy.zza();
            }
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                zzeoVar.zze(this.zza.zzD());
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
            return;
        }
        do {
            zzeoVar.zze(this.zza.zzD());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzw(List list) {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzgy.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzx(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzft)) {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzgy.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzft zzftVar = (zzft) list;
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 != 2) {
                throw zzgy.zza();
            }
            int zzn2 = this.zza.zzn();
            zzU(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzftVar.zze(this.zza.zzb());
            } while (this.zza.zzd() < zzd2);
            return;
        }
        do {
            zzftVar.zze(this.zza.zzb());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzy(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgp)) {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgy.zza();
                }
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 != 2) {
                throw zzgy.zza();
            }
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                zzgpVar.zzg(this.zza.zzf());
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
            return;
        }
        do {
            zzgpVar.zzg(this.zza.zzf());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zzz(List list) {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgp)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i10 != 5) {
                throw zzgy.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzgpVar.zzg(this.zza.zzg());
            } while (this.zza.zzd() < zzd2);
            return;
        }
        if (i11 != 5) {
            throw zzgy.zza();
        }
        do {
            zzgpVar.zzg(this.zza.zzg());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }
}
