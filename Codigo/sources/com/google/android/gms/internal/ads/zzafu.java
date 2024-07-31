package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzafu {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzafu() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RecognitionOptions.UPC_A);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzaft zzaftVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzaftVar.zza);
            String str = zzaftVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzaftVar.zzc);
            this.zzb.writeLong(zzaftVar.zzd);
            this.zzb.write(zzaftVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
