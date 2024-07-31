package ue;

import com.google.firebase.perf.util.l;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import se.h;

/* loaded from: classes.dex */
public class c<T> implements ResponseHandler<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ResponseHandler<? extends T> f27664a;

    /* renamed from: b, reason: collision with root package name */
    private final l f27665b;

    /* renamed from: c, reason: collision with root package name */
    private final h f27666c;

    public c(ResponseHandler<? extends T> responseHandler, l lVar, h hVar) {
        this.f27664a = responseHandler;
        this.f27665b = lVar;
        this.f27666c = hVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) {
        this.f27666c.v(this.f27665b.c());
        this.f27666c.m(httpResponse.getStatusLine().getStatusCode());
        Long a10 = d.a(httpResponse);
        if (a10 != null) {
            this.f27666c.t(a10.longValue());
        }
        String b10 = d.b(httpResponse);
        if (b10 != null) {
            this.f27666c.s(b10);
        }
        this.f27666c.b();
        return this.f27664a.handleResponse(httpResponse);
    }
}
