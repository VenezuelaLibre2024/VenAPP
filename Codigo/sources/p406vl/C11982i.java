package p406vl;

import ck.C2017b;
import java.io.IOException;
import kotlin.jvm.internal.C9322n;

/* renamed from: vl.i */
/* loaded from: classes3.dex */
public final class C11982i extends RuntimeException {

    /* renamed from: a */
    private final IOException f31832a;

    /* renamed from: b */
    private IOException f31833b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11982i(IOException firstConnectException) {
        super(firstConnectException);
        C9322n.m27781e(firstConnectException, "firstConnectException");
        this.f31832a = firstConnectException;
        this.f31833b = firstConnectException;
    }

    /* renamed from: a */
    public final void m38504a(IOException e10) {
        C9322n.m27781e(e10, "e");
        C2017b.m10328a(this.f31832a, e10);
        this.f31833b = e10;
    }

    /* renamed from: b */
    public final IOException m38505b() {
        return this.f31832a;
    }

    /* renamed from: c */
    public final IOException m38506c() {
        return this.f31833b;
    }
}
