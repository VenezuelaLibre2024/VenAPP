package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzcd;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m8 */
/* loaded from: classes2.dex */
public final class RunnableC5586m8 implements Runnable {

    /* renamed from: a */
    private final URL f11593a;

    /* renamed from: b */
    private final byte[] f11594b;

    /* renamed from: c */
    private final InterfaceC5547j8 f11595c;

    /* renamed from: d */
    private final String f11596d;

    /* renamed from: e */
    private final Map<String, String> f11597e;

    /* renamed from: f */
    private final /* synthetic */ C5560k8 f11598f;

    public RunnableC5586m8(C5560k8 c5560k8, String str, URL url, byte[] bArr, Map<String, String> map, InterfaceC5547j8 interfaceC5547j8) {
        this.f11598f = c5560k8;
        C5276s.m13320f(str);
        C5276s.m13324j(url);
        C5276s.m13324j(interfaceC5547j8);
        this.f11593a = url;
        this.f11594b = null;
        this.f11595c = interfaceC5547j8;
        this.f11596d = str;
        this.f11597e = null;
    }

    /* renamed from: b */
    private final void m14170b(final int i10, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f11598f.zzl().m14248y(new Runnable() { // from class: com.google.android.gms.measurement.internal.l8
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC5586m8.this.m14171a(i10, exc, bArr, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m14171a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f11595c.mo14056a(this.f11596d, i10, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] m14068q;
        this.f11598f.mo13683g();
        int i10 = 0;
        try {
            URLConnection zza = zzcd.zza().zza(this.f11593a, "client-measurement");
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
                C5560k8 c5560k8 = this.f11598f;
                m14068q = C5560k8.m14068q(httpURLConnection);
                httpURLConnection.disconnect();
                m14170b(i10, null, m14068q, map);
            } catch (IOException e11) {
                e = e11;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                m14170b(i10, e, null, map);
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                m14170b(i10, null, null, map);
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
