package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzald implements zzakr {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzakw zzg;
    private final zzakv zzh;
    private final zzalc zzi;
    private Bitmap zzj;

    public zzald(List list) {
        zzfp zzfpVar = new zzfp((byte[]) list.get(0));
        int zzq = zzfpVar.zzq();
        int zzq2 = zzfpVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzakw(719, 575, 0, 719, 0, 575);
        this.zzh = new zzakv(0, zzg(), zzh(), zzi());
        this.zzi = new zzalc(zzq, zzq2);
    }

    private static int zzb(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static zzakv zzc(zzfo zzfoVar, int i10) {
        int zzd;
        int zzd2;
        int i11;
        int i12;
        int i13 = 8;
        int zzd3 = zzfoVar.zzd(8);
        zzfoVar.zzm(8);
        int[] zzg = zzg();
        int[] zzh = zzh();
        int[] zzi = zzi();
        int i14 = i10 - 2;
        while (i14 > 0) {
            int zzd4 = zzfoVar.zzd(i13);
            int zzd5 = zzfoVar.zzd(i13);
            int i15 = i14 - 2;
            int[] iArr = (zzd5 & RecognitionOptions.ITF) != 0 ? zzg : (zzd5 & 64) != 0 ? zzh : zzi;
            if ((zzd5 & 1) != 0) {
                i11 = zzfoVar.zzd(i13);
                i12 = zzfoVar.zzd(i13);
                zzd = zzfoVar.zzd(i13);
                zzd2 = zzfoVar.zzd(i13);
                i14 = i15 - 4;
            } else {
                int zzd6 = zzfoVar.zzd(6) << 2;
                int zzd7 = zzfoVar.zzd(4) << 4;
                i14 = i15 - 2;
                zzd = zzfoVar.zzd(4) << 4;
                zzd2 = zzfoVar.zzd(2) << 6;
                i11 = zzd6;
                i12 = zzd7;
            }
            if (i11 == 0) {
                zzd2 = 255;
            }
            if (i11 == 0) {
                zzd = 0;
            }
            if (i11 == 0) {
                i12 = 0;
            }
            double d10 = i11;
            double d11 = i12 - 128;
            double d12 = zzd - 128;
            iArr[zzd4] = zzb((byte) (255 - (zzd2 & 255)), Math.max(0, Math.min((int) (d10 + (1.402d * d11)), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), 255)));
            zzd3 = zzd3;
            i13 = 8;
        }
        return new zzakv(zzd3, zzg, zzh, zzi);
    }

    private static zzakx zzd(zzfo zzfoVar) {
        byte[] bArr;
        int zzd = zzfoVar.zzd(16);
        zzfoVar.zzm(4);
        int zzd2 = zzfoVar.zzd(2);
        boolean zzo = zzfoVar.zzo();
        zzfoVar.zzm(1);
        byte[] bArr2 = zzfy.zzf;
        if (zzd2 == 1) {
            zzfoVar.zzm(zzfoVar.zzd(8) * 16);
        } else if (zzd2 == 0) {
            int zzd3 = zzfoVar.zzd(16);
            int zzd4 = zzfoVar.zzd(16);
            if (zzd3 > 0) {
                bArr2 = new byte[zzd3];
                zzfoVar.zzh(bArr2, 0, zzd3);
            }
            if (zzd4 > 0) {
                bArr = new byte[zzd4];
                zzfoVar.zzh(bArr, 0, zzd4);
                return new zzakx(zzd, zzo, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzakx(zzd, zzo, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0220 A[LOOP:3: B:88:0x016a->B:101:0x0220, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zze(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzald.zze(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzf(int i10, int i11, zzfo zzfoVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zzfoVar.zzd(i11);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = zzb(255, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                iArr[i10] = zzb(255, 1 != i13 ? 0 : 127, i12 != 0 ? 127 : 0, i11 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int[] iArr = new int[RecognitionOptions.QR_CODE];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = zzb(63, 1 != (i10 & 1) ? 0 : 255, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = zzb(255, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = zzb(127, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = zzb(255, (1 != (i10 & 1) ? 0 : 43) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = zzb(255, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0052. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzep zzepVar) {
        zzakj zzakjVar;
        char c10;
        char c11;
        int i12;
        SparseArray sparseArray;
        int i13;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i14;
        zzala zzalaVar;
        int i15;
        int zzd;
        int zzd2;
        zzakv zzakvVar;
        zzala zzalaVar2;
        zzakx zzakxVar;
        int i16;
        int i17;
        int i18;
        int i19;
        zzfo zzfoVar = new zzfo(bArr, i10 + i11);
        zzfoVar.zzk(i10);
        while (zzfoVar.zza() >= 48 && zzfoVar.zzd(8) == 15) {
            zzalc zzalcVar = this.zzi;
            int zzd3 = zzfoVar.zzd(8);
            int zzd4 = zzfoVar.zzd(16);
            int zzd5 = zzfoVar.zzd(16);
            int zzb2 = zzfoVar.zzb() + zzd5;
            if (zzd5 * 8 > zzfoVar.zza()) {
                zzff.zzf("DvbParser", "Data field length exceeds limit");
                zzfoVar.zzm(zzfoVar.zza());
            } else {
                switch (zzd3) {
                    case 16:
                        if (zzd4 == zzalcVar.zza) {
                            zzaky zzakyVar = zzalcVar.zzi;
                            int zzd6 = zzfoVar.zzd(8);
                            int zzd7 = zzfoVar.zzd(4);
                            int zzd8 = zzfoVar.zzd(2);
                            zzfoVar.zzm(2);
                            SparseArray sparseArray4 = new SparseArray();
                            for (int i20 = zzd5 - 2; i20 > 0; i20 -= 6) {
                                int zzd9 = zzfoVar.zzd(8);
                                zzfoVar.zzm(8);
                                sparseArray4.put(zzd9, new zzakz(zzfoVar.zzd(16), zzfoVar.zzd(16)));
                            }
                            zzaky zzakyVar2 = new zzaky(zzd6, zzd7, zzd8, sparseArray4);
                            if (zzakyVar2.zzb != 0) {
                                zzalcVar.zzi = zzakyVar2;
                                zzalcVar.zzc.clear();
                                zzalcVar.zzd.clear();
                                zzalcVar.zze.clear();
                                break;
                            } else if (zzakyVar != null) {
                                if (zzakyVar.zza != zzakyVar2.zza) {
                                    zzalcVar.zzi = zzakyVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzaky zzakyVar3 = zzalcVar.zzi;
                        if (zzd4 == zzalcVar.zza && zzakyVar3 != null) {
                            int zzd10 = zzfoVar.zzd(8);
                            zzfoVar.zzm(4);
                            boolean zzo = zzfoVar.zzo();
                            zzfoVar.zzm(3);
                            int zzd11 = zzfoVar.zzd(16);
                            int zzd12 = zzfoVar.zzd(16);
                            int zzd13 = zzfoVar.zzd(3);
                            int zzd14 = zzfoVar.zzd(3);
                            zzfoVar.zzm(2);
                            int zzd15 = zzfoVar.zzd(8);
                            int zzd16 = zzfoVar.zzd(8);
                            int zzd17 = zzfoVar.zzd(4);
                            int zzd18 = zzfoVar.zzd(2);
                            zzfoVar.zzm(2);
                            int i21 = zzd5 - 10;
                            SparseArray sparseArray5 = new SparseArray();
                            while (i21 > 0) {
                                int zzd19 = zzfoVar.zzd(16);
                                int zzd20 = zzfoVar.zzd(2);
                                int zzd21 = zzfoVar.zzd(2);
                                int zzd22 = zzfoVar.zzd(12);
                                zzfoVar.zzm(4);
                                int zzd23 = zzfoVar.zzd(12);
                                i21 -= 6;
                                if (zzd20 != 1) {
                                    if (zzd20 == 2) {
                                        zzd20 = 2;
                                    } else {
                                        i15 = zzd20;
                                        zzd = 0;
                                        zzd2 = 0;
                                        sparseArray5.put(zzd19, new zzalb(i15, zzd21, zzd22, zzd23, zzd, zzd2));
                                    }
                                }
                                i21 -= 2;
                                i15 = zzd20;
                                zzd = zzfoVar.zzd(8);
                                zzd2 = zzfoVar.zzd(8);
                                sparseArray5.put(zzd19, new zzalb(i15, zzd21, zzd22, zzd23, zzd, zzd2));
                            }
                            zzala zzalaVar3 = new zzala(zzd10, zzo, zzd11, zzd12, zzd13, zzd14, zzd15, zzd16, zzd17, zzd18, sparseArray5);
                            if (zzakyVar3.zzb == 0 && (zzalaVar = (zzala) zzalcVar.zzc.get(zzalaVar3.zza)) != null) {
                                int i22 = 0;
                                while (true) {
                                    SparseArray sparseArray6 = zzalaVar.zzj;
                                    if (i22 < sparseArray6.size()) {
                                        zzalaVar3.zzj.put(sparseArray6.keyAt(i22), (zzalb) sparseArray6.valueAt(i22));
                                        i22++;
                                    }
                                }
                            }
                            sparseArray3 = zzalcVar.zzc;
                            i14 = zzalaVar3.zza;
                            zzalaVar2 = zzalaVar3;
                            sparseArray3.put(i14, zzalaVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (zzd4 == zzalcVar.zza) {
                            zzakv zzc2 = zzc(zzfoVar, zzd5);
                            sparseArray3 = zzalcVar.zzd;
                            zzakvVar = zzc2;
                        } else if (zzd4 == zzalcVar.zzb) {
                            zzakv zzc3 = zzc(zzfoVar, zzd5);
                            sparseArray3 = zzalcVar.zzf;
                            zzakvVar = zzc3;
                        }
                        i14 = zzakvVar.zza;
                        zzalaVar2 = zzakvVar;
                        sparseArray3.put(i14, zzalaVar2);
                        break;
                    case 19:
                        if (zzd4 == zzalcVar.zza) {
                            zzakx zzd24 = zzd(zzfoVar);
                            sparseArray3 = zzalcVar.zze;
                            zzakxVar = zzd24;
                        } else if (zzd4 == zzalcVar.zzb) {
                            zzakx zzd25 = zzd(zzfoVar);
                            sparseArray3 = zzalcVar.zzg;
                            zzakxVar = zzd25;
                        }
                        i14 = zzakxVar.zza;
                        zzalaVar2 = zzakxVar;
                        sparseArray3.put(i14, zzalaVar2);
                        break;
                    case 20:
                        if (zzd4 == zzalcVar.zza) {
                            zzfoVar.zzm(4);
                            boolean zzo2 = zzfoVar.zzo();
                            zzfoVar.zzm(3);
                            int zzd26 = zzfoVar.zzd(16);
                            int zzd27 = zzfoVar.zzd(16);
                            if (zzo2) {
                                int zzd28 = zzfoVar.zzd(16);
                                i16 = zzfoVar.zzd(16);
                                i19 = zzfoVar.zzd(16);
                                i17 = zzfoVar.zzd(16);
                                i18 = zzd28;
                            } else {
                                i16 = zzd26;
                                i17 = zzd27;
                                i18 = 0;
                                i19 = 0;
                            }
                            zzalcVar.zzh = new zzakw(zzd26, zzd27, i18, i16, i19, i17);
                            break;
                        }
                        break;
                }
                zzfoVar.zzn(zzb2 - zzfoVar.zzb());
            }
        }
        zzalc zzalcVar2 = this.zzi;
        zzaky zzakyVar4 = zzalcVar2.zzi;
        if (zzakyVar4 == null) {
            zzakjVar = new zzakj(zzgaa.zzl(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzakw zzakwVar = zzalcVar2.zzh;
            if (zzakwVar == null) {
                zzakwVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzakwVar.zza + 1 != bitmap.getWidth() || zzakwVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzakwVar.zza + 1, zzakwVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray7 = zzakyVar4.zzc;
            int i23 = 0;
            while (i23 < sparseArray7.size()) {
                this.zzf.save();
                zzakz zzakzVar = (zzakz) sparseArray7.valueAt(i23);
                zzala zzalaVar4 = (zzala) this.zzi.zzc.get(sparseArray7.keyAt(i23));
                int i24 = zzakzVar.zza + zzakwVar.zzc;
                int i25 = zzakzVar.zzb + zzakwVar.zze;
                this.zzf.clipRect(i24, i25, Math.min(zzalaVar4.zzc + i24, zzakwVar.zzd), Math.min(zzalaVar4.zzd + i25, zzakwVar.zzf));
                zzakv zzakvVar2 = (zzakv) this.zzi.zzd.get(zzalaVar4.zzf);
                if (zzakvVar2 == null) {
                    zzakvVar2 = (zzakv) this.zzi.zzf.get(zzalaVar4.zzf);
                    if (zzakvVar2 == null) {
                        zzakvVar2 = this.zzh;
                    }
                }
                SparseArray sparseArray8 = zzalaVar4.zzj;
                int i26 = 0;
                while (i26 < sparseArray8.size()) {
                    int keyAt = sparseArray8.keyAt(i26);
                    zzalb zzalbVar = (zzalb) sparseArray8.valueAt(i26);
                    zzakx zzakxVar2 = (zzakx) this.zzi.zze.get(keyAt);
                    if (zzakxVar2 == null) {
                        zzakxVar2 = (zzakx) this.zzi.zzg.get(keyAt);
                    }
                    if (zzakxVar2 != null) {
                        Paint paint = zzakxVar2.zzb ? null : this.zzd;
                        int i27 = zzalaVar4.zze;
                        int i28 = zzalbVar.zza + i24;
                        int i29 = zzalbVar.zzb + i25;
                        sparseArray = sparseArray7;
                        Canvas canvas = this.zzf;
                        sparseArray2 = sparseArray8;
                        i13 = i23;
                        int[] iArr = i27 == 3 ? zzakvVar2.zzd : i27 == 2 ? zzakvVar2.zzc : zzakvVar2.zzb;
                        Paint paint2 = paint;
                        zze(zzakxVar2.zzc, iArr, i27, i28, i29, paint2, canvas);
                        zze(zzakxVar2.zzd, iArr, i27, i28, i29 + 1, paint2, canvas);
                    } else {
                        sparseArray = sparseArray7;
                        i13 = i23;
                        sparseArray2 = sparseArray8;
                    }
                    i26++;
                    sparseArray7 = sparseArray;
                    sparseArray8 = sparseArray2;
                    i23 = i13;
                }
                SparseArray sparseArray9 = sparseArray7;
                int i30 = i23;
                float f10 = i25;
                float f11 = i24;
                if (zzalaVar4.zzb) {
                    int i31 = zzalaVar4.zze;
                    c10 = 3;
                    if (i31 == 3) {
                        i12 = zzakvVar2.zzd[zzalaVar4.zzg];
                        c11 = 2;
                    } else {
                        c11 = 2;
                        i12 = i31 == 2 ? zzakvVar2.zzc[zzalaVar4.zzh] : zzakvVar2.zzb[zzalaVar4.zzi];
                    }
                    this.zze.setColor(i12);
                    this.zzf.drawRect(f11, f10, zzalaVar4.zzc + i24, zzalaVar4.zzd + i25, this.zze);
                } else {
                    c10 = 3;
                    c11 = 2;
                }
                zzea zzeaVar = new zzea();
                zzeaVar.zzc(Bitmap.createBitmap(this.zzj, i24, i25, zzalaVar4.zzc, zzalaVar4.zzd));
                zzeaVar.zzh(f11 / zzakwVar.zza);
                zzeaVar.zzi(0);
                zzeaVar.zze(f10 / zzakwVar.zzb, 0);
                zzeaVar.zzf(0);
                zzeaVar.zzk(zzalaVar4.zzc / zzakwVar.zza);
                zzeaVar.zzd(zzalaVar4.zzd / zzakwVar.zzb);
                arrayList.add(zzeaVar.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i23 = i30 + 1;
                sparseArray7 = sparseArray9;
            }
            zzakjVar = new zzakj(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzepVar.zza(zzakjVar);
    }
}
