package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzacr {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, RecognitionOptions.ITF, 192, 224, RecognitionOptions.QR_CODE, 384, 448, RecognitionOptions.UPC_A, 640, 768, 896, RecognitionOptions.UPC_E, 1152, PlatformPlugin.DEFAULT_SYSTEM_UI, 1536, 1920, RecognitionOptions.PDF417, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecognitionOptions.AZTEC, 6144, 7680};

    public static zzam zza(byte[] bArr, String str, String str2, zzae zzaeVar) {
        zzfo zzfoVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzfoVar = new zzfo(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = copyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                    byte b11 = copyOf[i10];
                    int i11 = i10 + 1;
                    copyOf[i10] = copyOf[i11];
                    copyOf[i11] = b11;
                }
            }
            int length = copyOf.length;
            zzfoVar = new zzfo(copyOf, length);
            if (copyOf[0] == 31) {
                zzfo zzfoVar2 = new zzfo(copyOf, length);
                while (zzfoVar2.zza() >= 16) {
                    zzfoVar2.zzm(2);
                    zzfoVar.zzf(zzfoVar2.zzd(14), 14);
                }
            }
            zzfoVar.zzj(copyOf, copyOf.length);
        }
        zzfoVar.zzm(60);
        int i12 = zzb[zzfoVar.zzd(6)];
        int i13 = zzc[zzfoVar.zzd(4)];
        int zzd2 = zzfoVar.zzd(5);
        int i14 = zzd2 < 29 ? (zzd[zzd2] * AdError.NETWORK_ERROR_CODE) / 2 : -1;
        zzfoVar.zzm(10);
        int i15 = i12 + (zzfoVar.zzd(2) > 0 ? 1 : 0);
        zzak zzakVar = new zzak();
        zzakVar.zzK(str);
        zzakVar.zzW("audio/vnd.dts");
        zzakVar.zzx(i14);
        zzakVar.zzy(i15);
        zzakVar.zzX(i13);
        zzakVar.zzE(null);
        zzakVar.zzN(str2);
        return zzakVar.zzac();
    }
}
