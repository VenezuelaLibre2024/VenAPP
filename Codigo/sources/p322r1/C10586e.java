package p322r1;

import kotlin.jvm.internal.C9322n;
import p391v1.InterfaceC11611j;

/* renamed from: r1.e */
/* loaded from: classes.dex */
public final class C10586e implements InterfaceC11611j.c {

    /* renamed from: a */
    private final InterfaceC11611j.c f26667a;

    /* renamed from: b */
    private final C10582c f26668b;

    public C10586e(InterfaceC11611j.c delegate, C10582c autoCloser) {
        C9322n.m27781e(delegate, "delegate");
        C9322n.m27781e(autoCloser, "autoCloser");
        this.f26667a = delegate;
        this.f26668b = autoCloser;
    }

    @Override // p391v1.InterfaceC11611j.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10584d mo8825a(InterfaceC11611j.b configuration) {
        C9322n.m27781e(configuration, "configuration");
        return new C10584d(this.f26667a.mo8825a(configuration), this.f26668b);
    }
}
