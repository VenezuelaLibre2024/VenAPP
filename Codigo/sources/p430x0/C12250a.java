package p430x0;

import java.io.IOException;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: x0.a */
/* loaded from: classes.dex */
public final class C12250a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12250a(String message, Throwable th2) {
        super(message, th2);
        C9322n.m27781e(message, "message");
    }

    public /* synthetic */ C12250a(String str, Throwable th2, int i10, C9315g c9315g) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }
}
