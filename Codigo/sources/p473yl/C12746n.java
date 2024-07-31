package p473yl;

import java.io.IOException;
import kotlin.jvm.internal.C9322n;

/* renamed from: yl.n */
/* loaded from: classes3.dex */
public final class C12746n extends IOException {

    /* renamed from: a */
    public final EnumC12734b f34760a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12746n(EnumC12734b errorCode) {
        super(C9322n.m27787k("stream was reset: ", errorCode));
        C9322n.m27781e(errorCode, "errorCode");
        this.f34760a = errorCode;
    }
}
