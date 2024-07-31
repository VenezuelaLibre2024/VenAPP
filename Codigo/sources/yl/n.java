package yl;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class n extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final b f32209a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b errorCode) {
        super(kotlin.jvm.internal.n.k("stream was reset: ", errorCode));
        kotlin.jvm.internal.n.e(errorCode, "errorCode");
        this.f32209a = errorCode;
    }
}
