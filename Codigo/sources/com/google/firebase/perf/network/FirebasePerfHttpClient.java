package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.l;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import se.h;
import we.k;

/* loaded from: classes.dex */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.x(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = ue.d.a(httpRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            lVar.g();
            c10.r(lVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new ue.c(responseHandler, lVar, c10));
        } catch (IOException e10) {
            c10.v(lVar.c());
            ue.d.d(c10);
            throw e10;
        }
    }

    static <T> T b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.x(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = ue.d.a(httpRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            lVar.g();
            c10.r(lVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new ue.c(responseHandler, lVar, c10), httpContext);
        } catch (IOException e10) {
            c10.v(lVar.c());
            ue.d.d(c10);
            throw e10;
        }
    }

    static <T> T c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.x(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = ue.d.a(httpUriRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            lVar.g();
            c10.r(lVar.e());
            return (T) httpClient.execute(httpUriRequest, new ue.c(responseHandler, lVar, c10));
        } catch (IOException e10) {
            c10.v(lVar.c());
            ue.d.d(c10);
            throw e10;
        }
    }

    static <T> T d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.x(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = ue.d.a(httpUriRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            lVar.g();
            c10.r(lVar.e());
            return (T) httpClient.execute(httpUriRequest, new ue.c(responseHandler, lVar, c10), httpContext);
        } catch (IOException e10) {
            c10.v(lVar.c());
            ue.d.d(c10);
            throw e10;
        }
    }

    static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.x(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = ue.d.a(httpRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            lVar.g();
            c10.r(lVar.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c10.v(lVar.c());
            c10.m(execute.getStatusLine().getStatusCode());
            Long a11 = ue.d.a(execute);
            if (a11 != null) {
                c10.t(a11.longValue());
            }
            String b10 = ue.d.b(execute);
            if (b10 != null) {
                c10.s(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.v(lVar.c());
            ue.d.d(c10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return (T) c(httpClient, httpUriRequest, responseHandler, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return (T) d(httpClient, httpUriRequest, responseHandler, httpContext, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return e(httpClient, httpHost, httpRequest, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return f(httpClient, httpHost, httpRequest, httpContext, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return g(httpClient, httpUriRequest, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return h(httpClient, httpUriRequest, httpContext, new l(), k.k());
    }

    static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.x(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = ue.d.a(httpRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            lVar.g();
            c10.r(lVar.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c10.v(lVar.c());
            c10.m(execute.getStatusLine().getStatusCode());
            Long a11 = ue.d.a(execute);
            if (a11 != null) {
                c10.t(a11.longValue());
            }
            String b10 = ue.d.b(execute);
            if (b10 != null) {
                c10.s(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.v(lVar.c());
            ue.d.d(c10);
            throw e10;
        }
    }

    static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.x(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = ue.d.a(httpUriRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            lVar.g();
            c10.r(lVar.e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c10.v(lVar.c());
            c10.m(execute.getStatusLine().getStatusCode());
            Long a11 = ue.d.a(execute);
            if (a11 != null) {
                c10.t(a11.longValue());
            }
            String b10 = ue.d.b(execute);
            if (b10 != null) {
                c10.s(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.v(lVar.c());
            ue.d.d(c10);
            throw e10;
        }
    }

    static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.x(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = ue.d.a(httpUriRequest);
            if (a10 != null) {
                c10.p(a10.longValue());
            }
            lVar.g();
            c10.r(lVar.e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c10.v(lVar.c());
            c10.m(execute.getStatusLine().getStatusCode());
            Long a11 = ue.d.a(execute);
            if (a11 != null) {
                c10.t(a11.longValue());
            }
            String b10 = ue.d.b(execute);
            if (b10 != null) {
                c10.s(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.v(lVar.c());
            ue.d.d(c10);
            throw e10;
        }
    }
}
