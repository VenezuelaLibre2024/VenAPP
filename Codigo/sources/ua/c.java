package ua;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzi;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static zzi f27490a;

    public static b a() {
        try {
            return new b(f().zzd());
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public static b b(float f10) {
        try {
            return new b(f().zze(f10));
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public static b c(String str) {
        com.google.android.gms.common.internal.s.k(str, "assetName must not be null");
        try {
            return new b(f().zzf(str));
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public static b d(Bitmap bitmap) {
        com.google.android.gms.common.internal.s.k(bitmap, "image must not be null");
        try {
            return new b(f().zzg(bitmap));
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public static void e(zzi zziVar) {
        if (f27490a != null) {
            return;
        }
        f27490a = (zzi) com.google.android.gms.common.internal.s.k(zziVar, "delegate must not be null");
    }

    private static zzi f() {
        return (zzi) com.google.android.gms.common.internal.s.k(f27490a, "IBitmapDescriptorFactory is not initialized");
    }
}
