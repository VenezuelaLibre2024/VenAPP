package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.m3;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzcec;
import e9.c;
import x8.a0;
import x8.s;
import x8.y;

/* loaded from: classes.dex */
public class MobileAds {
    private MobileAds() {
    }

    public static void a(Context context) {
        m3.h().m(context);
    }

    public static y b() {
        return m3.h().e();
    }

    public static a0 c() {
        m3.h();
        String[] split = TextUtils.split("23.0.0", "\\.");
        if (split.length != 3) {
            return new a0(0, 0, 0);
        }
        try {
            return new a0(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new a0(0, 0, 0);
        }
    }

    public static void d(Context context) {
        m3.h().n(context, null, null);
    }

    public static void e(Context context, c cVar) {
        m3.h().n(context, null, cVar);
    }

    public static void f(Context context, s sVar) {
        m3.h().q(context, sVar);
    }

    public static void g(Context context, String str) {
        m3.h().r(context, str);
    }

    public static void h(WebView webView) {
        m3.h();
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzcec.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzcct zza = zzbxk.zza(webView.getContext());
        if (zza == null) {
            zzcec.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            zza.zzj(d.h2(webView));
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    public static void i(boolean z10) {
        m3.h().s(z10);
    }

    public static void j(float f10) {
        m3.h().t(f10);
    }

    public static void k(y yVar) {
        m3.h().v(yVar);
    }

    private static void setPlugin(String str) {
        m3.h().u(str);
    }
}
