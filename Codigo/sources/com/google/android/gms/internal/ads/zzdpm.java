package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.s0;
import com.google.android.gms.ads.internal.util.u1;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdpm {
    private final s0 zza;
    private final la.f zzb;
    private final Executor zzc;

    public zzdpm(s0 s0Var, la.f fVar, Executor executor) {
        this.zza = s0Var;
        this.zzb = fVar;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long b10 = this.zzb.b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b11 = this.zzb.b();
        if (decodeByteArray != null) {
            long j10 = b11 - b10;
            u1.a("Decoded image w: " + decodeByteArray.getWidth() + " h:" + decodeByteArray.getHeight() + " bytes: " + decodeByteArray.getAllocationByteCount() + " time: " + j10 + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return decodeByteArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Bitmap zza(double d10, boolean z10, zzapw zzapwVar) {
        byte[] bArr = zzapwVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) a0.c().zza(zzbgc.zzgg)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) a0.c().zza(zzbgc.zzgh)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final com.google.common.util.concurrent.f zzb(String str, final double d10, final boolean z10) {
        return zzgen.zzm(this.zza.a(str), new zzfws() { // from class: com.google.android.gms.internal.ads.zzdpl
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                return zzdpm.this.zza(d10, z10, (zzapw) obj);
            }
        }, this.zzc);
    }
}
