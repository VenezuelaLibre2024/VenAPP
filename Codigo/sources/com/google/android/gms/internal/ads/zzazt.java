package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzazt {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(RecognitionOptions.AZTEC);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    public final String toString() {
        String str;
        try {
            this.zzb.close();
        } catch (IOException e10) {
            zzcec.zzh("HashManager: Unable to convert to Base64.", e10);
        }
        try {
            try {
                this.zza.close();
                str = this.zza.toString();
            } catch (IOException e11) {
                zzcec.zzh("HashManager: Unable to convert to Base64.", e11);
                str = "";
            }
            return str;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
