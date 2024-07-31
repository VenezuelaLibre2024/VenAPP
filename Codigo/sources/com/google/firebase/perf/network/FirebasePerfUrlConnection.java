package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.util.n;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import se.h;
import we.k;

/* loaded from: classes.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    static Object a(n nVar, k kVar, l lVar) {
        lVar.g();
        long e10 = lVar.e();
        h c10 = h.c(kVar);
        try {
            URLConnection a10 = nVar.a();
            return a10 instanceof HttpsURLConnection ? new b((HttpsURLConnection) a10, lVar, c10).getContent() : a10 instanceof HttpURLConnection ? new a((HttpURLConnection) a10, lVar, c10).getContent() : a10.getContent();
        } catch (IOException e11) {
            c10.r(e10);
            c10.v(lVar.c());
            c10.x(nVar.toString());
            ue.d.d(c10);
            throw e11;
        }
    }

    static Object b(n nVar, Class[] clsArr, k kVar, l lVar) {
        lVar.g();
        long e10 = lVar.e();
        h c10 = h.c(kVar);
        try {
            URLConnection a10 = nVar.a();
            return a10 instanceof HttpsURLConnection ? new b((HttpsURLConnection) a10, lVar, c10).getContent(clsArr) : a10 instanceof HttpURLConnection ? new a((HttpURLConnection) a10, lVar, c10).getContent(clsArr) : a10.getContent(clsArr);
        } catch (IOException e11) {
            c10.r(e10);
            c10.v(lVar.c());
            c10.x(nVar.toString());
            ue.d.d(c10);
            throw e11;
        }
    }

    static InputStream c(n nVar, k kVar, l lVar) {
        lVar.g();
        long e10 = lVar.e();
        h c10 = h.c(kVar);
        try {
            URLConnection a10 = nVar.a();
            return a10 instanceof HttpsURLConnection ? new b((HttpsURLConnection) a10, lVar, c10).getInputStream() : a10 instanceof HttpURLConnection ? new a((HttpURLConnection) a10, lVar, c10).getInputStream() : a10.getInputStream();
        } catch (IOException e11) {
            c10.r(e10);
            c10.v(lVar.c());
            c10.x(nVar.toString());
            ue.d.d(c10);
            throw e11;
        }
    }

    @Keep
    public static Object getContent(URL url) {
        return a(new n(url), k.k(), new l());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return b(new n(url), clsArr, k.k(), new l());
    }

    @Keep
    public static Object instrument(Object obj) {
        return obj instanceof HttpsURLConnection ? new b((HttpsURLConnection) obj, new l(), h.c(k.k())) : obj instanceof HttpURLConnection ? new a((HttpURLConnection) obj, new l(), h.c(k.k())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        return c(new n(url), k.k(), new l());
    }
}
