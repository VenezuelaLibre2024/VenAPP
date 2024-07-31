package x0;

import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message, Throwable th2) {
        super(message, th2);
        kotlin.jvm.internal.n.e(message, "message");
    }

    public /* synthetic */ a(String str, Throwable th2, int i10, kotlin.jvm.internal.g gVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }
}
