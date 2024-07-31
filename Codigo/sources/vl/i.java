package vl;

import java.io.IOException;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class i extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final IOException f29394a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f29395b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IOException firstConnectException) {
        super(firstConnectException);
        n.e(firstConnectException, "firstConnectException");
        this.f29394a = firstConnectException;
        this.f29395b = firstConnectException;
    }

    public final void a(IOException e10) {
        n.e(e10, "e");
        ck.b.a(this.f29394a, e10);
        this.f29395b = e10;
    }

    public final IOException b() {
        return this.f29394a;
    }

    public final IOException c() {
        return this.f29395b;
    }
}
