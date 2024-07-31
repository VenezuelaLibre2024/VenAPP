package p383ue;

import com.google.firebase.perf.util.C6338l;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import se.C10909h;

/* renamed from: ue.c */
/* loaded from: classes.dex */
public class C11550c<T> implements ResponseHandler<T> {

    /* renamed from: a */
    private final ResponseHandler<? extends T> f29987a;

    /* renamed from: b */
    private final C6338l f29988b;

    /* renamed from: c */
    private final C10909h f29989c;

    public C11550c(ResponseHandler<? extends T> responseHandler, C6338l c6338l, C10909h c10909h) {
        this.f29987a = responseHandler;
        this.f29988b = c6338l;
        this.f29989c = c10909h;
    }

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) {
        this.f29989c.m33309v(this.f29988b.m17532c());
        this.f29989c.m33301m(httpResponse.getStatusLine().getStatusCode());
        Long m36203a = C11551d.m36203a(httpResponse);
        if (m36203a != null) {
            this.f29989c.m33307t(m36203a.longValue());
        }
        String m36204b = C11551d.m36204b(httpResponse);
        if (m36204b != null) {
            this.f29989c.m33306s(m36204b);
        }
        this.f29989c.m33294b();
        return this.f29987a.handleResponse(httpResponse);
    }
}
