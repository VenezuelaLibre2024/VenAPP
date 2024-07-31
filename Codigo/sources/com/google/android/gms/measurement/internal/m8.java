package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcd;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f10406a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f10407b;

    /* renamed from: c, reason: collision with root package name */
    private final j8 f10408c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10409d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f10410e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ k8 f10411f;

    public m8(k8 k8Var, String str, URL url, byte[] bArr, Map<String, String> map, j8 j8Var) {
        this.f10411f = k8Var;
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(url);
        com.google.android.gms.common.internal.s.j(j8Var);
        this.f10406a = url;
        this.f10407b = null;
        this.f10408c = j8Var;
        this.f10409d = str;
        this.f10410e = null;
    }

    private final void b(final int i10, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f10411f.zzl().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.l8
            @Override // java.lang.Runnable
            public final void run() {
                m8.this.a(i10, exc, bArr, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f10408c.a(this.f10409d, i10, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] q10;
        this.f10411f.g();
        int i10 = 0;
        try {
            URLConnection zza = zzcd.zza().zza(this.f10406a, "client-measurement");
            if (!(zza instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) zza;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i10 = httpURLConnection.getResponseCode();
                map = httpURLConnection.getHeaderFields();
            } catch (IOException e10) {
                e = e10;
                map = null;
            } catch (Throwable th2) {
                th = th2;
                map = null;
            }
            try {
                k8 k8Var = this.f10411f;
                q10 = k8.q(httpURLConnection);
                httpURLConnection.disconnect();
                b(i10, null, q10, map);
            } catch (IOException e11) {
                e = e11;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                b(i10, e, null, map);
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                b(i10, null, null, map);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            map = null;
        }
    }
}
