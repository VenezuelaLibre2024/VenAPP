package com.google.android.recaptcha.internal;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
class zzea extends zzeb {
    final zzdw zzb;
    final Character zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzea(com.google.android.recaptcha.internal.zzdw r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.zzb = r4
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L17
            r5.charValue()
            r2 = 61
            boolean r4 = r4.zzd(r2)
            if (r4 != 0) goto L15
            goto L17
        L15:
            r4 = r0
            goto L18
        L17:
            r4 = r1
        L18:
            if (r4 == 0) goto L1d
            r3.zzc = r5
            return
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "Padding character %s was already in alphabet"
            java.lang.String r5 = com.google.android.recaptcha.internal.zzdl.zza(r5, r1)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzea.<init>(com.google.android.recaptcha.internal.zzdw, java.lang.Character):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzea(String str, String str2, Character ch2) {
        this(new zzdw(str, str2.toCharArray()), ch2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzea) {
            zzea zzeaVar = (zzea) obj;
            if (this.zzb.equals(zzeaVar.zzb)) {
                Character ch2 = this.zzc;
                Character ch3 = zzeaVar.zzc;
                if (ch2 == ch3) {
                    return true;
                }
                if (ch2 != null && ch2.equals(ch3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode();
        Character ch2 = this.zzc;
        return hashCode ^ (ch2 == null ? 0 : ch2.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                str = ".omitPadding()";
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                str = "')";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    int zza(byte[] bArr, CharSequence charSequence) {
        zzdw zzdwVar;
        bArr.getClass();
        CharSequence zze = zze(charSequence);
        if (!this.zzb.zzc(zze.length())) {
            throw new zzdz("Invalid input length " + zze.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < zze.length()) {
            long j10 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                zzdwVar = this.zzb;
                if (i12 >= zzdwVar.zzc) {
                    break;
                }
                j10 <<= zzdwVar.zzb;
                if (i10 + i12 < zze.length()) {
                    j10 |= this.zzb.zzb(zze.charAt(i13 + i10));
                    i13++;
                }
                i12++;
            }
            int i14 = zzdwVar.zzd;
            int i15 = i14 * 8;
            int i16 = i13 * zzdwVar.zzb;
            int i17 = (i14 - 1) * 8;
            while (i17 >= i15 - i16) {
                bArr[i11] = (byte) ((j10 >>> i17) & 255);
                i17 -= 8;
                i11++;
            }
            i10 += this.zzb.zzc;
        }
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzdi.zzd(0, i11, bArr.length);
        while (i12 < i11) {
            zzf(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    final int zzc(int i10) {
        return (int) (((this.zzb.zzb * i10) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    final int zzd(int i10) {
        zzdw zzdwVar = this.zzb;
        return zzdwVar.zzc * zzed.zza(i10, zzdwVar.zzd, RoundingMode.CEILING);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzeb
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        Character ch2 = this.zzc;
        if (ch2 == null) {
            return charSequence;
        }
        ch2.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(Appendable appendable, byte[] bArr, int i10, int i11) {
        zzdi.zzd(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzdi.zza(i11 <= this.zzb.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.zzb.zzb;
        while (i12 < i11 * 8) {
            zzdw zzdwVar = this.zzb;
            appendable.append(zzdwVar.zza(zzdwVar.zza & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }
}
