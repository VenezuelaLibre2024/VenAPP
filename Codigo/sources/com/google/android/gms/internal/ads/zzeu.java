package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;

/* loaded from: classes2.dex */
public final class zzeu {
    public static void zza() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new zzet(sb2.toString());
        }
    }

    public static void zzb(boolean z10, String str) {
        if (!z10) {
            throw new zzet(str);
        }
    }

    public static boolean zzc(Context context) {
        int i10 = zzfy.zza;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(zzfy.zzc) || "XT1650".equals(zzfy.zzd))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzes.zzk("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzd() {
        int i10 = zzfy.zza;
        return zzes.zzk("EGL_KHR_surfaceless_context");
    }
}
