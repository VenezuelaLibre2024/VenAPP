package ua;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.maps.zzi;

/* renamed from: ua.c */
/* loaded from: classes2.dex */
public final class C11480c {

    /* renamed from: a */
    private static zzi f29806a;

    /* renamed from: a */
    public static C11478b m35920a() {
        try {
            return new C11478b(m35925f().zzd());
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: b */
    public static C11478b m35921b(float f10) {
        try {
            return new C11478b(m35925f().zze(f10));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: c */
    public static C11478b m35922c(String str) {
        C5276s.m13325k(str, "assetName must not be null");
        try {
            return new C11478b(m35925f().zzf(str));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: d */
    public static C11478b m35923d(Bitmap bitmap) {
        C5276s.m13325k(bitmap, "image must not be null");
        try {
            return new C11478b(m35925f().zzg(bitmap));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: e */
    public static void m35924e(zzi zziVar) {
        if (f29806a != null) {
            return;
        }
        f29806a = (zzi) C5276s.m13325k(zziVar, "delegate must not be null");
    }

    /* renamed from: f */
    private static zzi m35925f() {
        return (zzi) C5276s.m13325k(f29806a, "IBitmapDescriptorFactory is not initialized");
    }
}
