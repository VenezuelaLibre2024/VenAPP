package p129h3;

import java.io.IOException;

/* renamed from: h3.e */
/* loaded from: classes.dex */
public final class C7621e extends IOException {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final int f18005a;

    public C7621e(int i10) {
        this("Http request failed", i10);
    }

    public C7621e(String str, int i10) {
        this(str, i10, null);
    }

    public C7621e(String str, int i10, Throwable th2) {
        super(str + ", status code: " + i10, th2);
        this.f18005a = i10;
    }
}
