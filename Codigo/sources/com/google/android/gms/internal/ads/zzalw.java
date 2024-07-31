package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzalw implements zzakr {
    private final zzfp zza = new zzfp();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzalw(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzfy.zzA(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.zzg = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.zzb = z10;
        if (z10) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        StyleSpan styleSpan;
        Object underlineSpan;
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z10 = true;
            if (i16 == 0) {
                if (i17 != 0) {
                    styleSpan = new StyleSpan(2);
                    spannableStringBuilder.setSpan(styleSpan, i12, i13, i15);
                }
                z10 = false;
            } else if (i17 != 0) {
                styleSpan = new StyleSpan(3);
                spannableStringBuilder.setSpan(styleSpan, i12, i13, i15);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                underlineSpan = new UnderlineSpan();
            } else if (i16 != 0 || z10) {
                return;
            } else {
                underlineSpan = new StyleSpan(0);
            }
            spannableStringBuilder.setSpan(underlineSpan, i12, i13, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzep zzepVar) {
        String zzA;
        int i12;
        int i13;
        int i14;
        this.zza.zzI(bArr, i10 + i11);
        this.zza.zzK(i10);
        zzfp zzfpVar = this.zza;
        int i15 = 1;
        int i16 = 0;
        int i17 = 2;
        zzek.zzd(zzfpVar.zzb() >= 2);
        int zzq = zzfpVar.zzq();
        if (zzq == 0) {
            zzA = "";
        } else {
            int zzd = zzfpVar.zzd();
            Charset zzB = zzfpVar.zzB();
            int zzd2 = zzfpVar.zzd() - zzd;
            if (zzB == null) {
                zzB = zzfwq.zzc;
            }
            zzA = zzfpVar.zzA(zzq - zzd2, zzB);
        }
        if (zzA.isEmpty()) {
            zzepVar.zza(new zzakj(zzgaa.zzl(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzA);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f10 = this.zzf;
        while (true) {
            zzfp zzfpVar2 = this.zza;
            if (zzfpVar2.zzb() < 8) {
                zzea zzeaVar = new zzea();
                zzeaVar.zzl(spannableStringBuilder);
                zzeaVar.zze(f10, 0);
                zzeaVar.zzf(0);
                zzepVar.zza(new zzakj(zzgaa.zzm(zzeaVar.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int zzd3 = zzfpVar2.zzd();
            int zzg = zzfpVar2.zzg();
            int zzg2 = this.zza.zzg();
            if (zzg2 == 1937013100) {
                zzek.zzd(this.zza.zzb() >= i17 ? i15 : i16);
                int zzq2 = this.zza.zzq();
                int i18 = i16;
                while (i18 < zzq2) {
                    zzfp zzfpVar3 = this.zza;
                    zzek.zzd(zzfpVar3.zzb() >= 12 ? i15 : i16);
                    int zzq3 = zzfpVar3.zzq();
                    int zzq4 = zzfpVar3.zzq();
                    zzfpVar3.zzL(i17);
                    int zzm = zzfpVar3.zzm();
                    zzfpVar3.zzL(i15);
                    int zzg3 = zzfpVar3.zzg();
                    if (zzq4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        StringBuilder sb2 = new StringBuilder();
                        i13 = zzq2;
                        sb2.append("Truncating styl end (");
                        sb2.append(zzq4);
                        sb2.append(") to cueText.length() (");
                        sb2.append(length2);
                        sb2.append(").");
                        zzff.zzf("Tx3gParser", sb2.toString());
                        i14 = spannableStringBuilder.length();
                    } else {
                        i13 = zzq2;
                        i14 = zzq4;
                    }
                    if (zzq3 >= i14) {
                        zzff.zzf("Tx3gParser", "Ignoring styl with start (" + zzq3 + ") >= end (" + i14 + ").");
                    } else {
                        int i19 = i14;
                        zzc(spannableStringBuilder, zzm, this.zzc, zzq3, i19, 0);
                        zzb(spannableStringBuilder, zzg3, this.zzd, zzq3, i19, 0);
                    }
                    i18++;
                    zzq2 = i13;
                    i15 = 1;
                    i16 = 0;
                    i17 = 2;
                }
                i12 = i17;
            } else if (zzg2 == 1952608120 && this.zzb) {
                i12 = 2;
                zzek.zzd(this.zza.zzb() >= 2);
                f10 = Math.max(0.0f, Math.min(this.zza.zzq() / this.zzg, 0.95f));
            } else {
                i12 = 2;
            }
            this.zza.zzK(zzd3 + zzg);
            i17 = i12;
            i15 = 1;
            i16 = 0;
        }
    }
}
