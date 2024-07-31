package p322r1;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C9322n;
import p391v1.InterfaceC11611j;

/* renamed from: r1.c0 */
/* loaded from: classes.dex */
public final class C10583c0 implements InterfaceC11611j.c {

    /* renamed from: a */
    private final String f26633a;

    /* renamed from: b */
    private final File f26634b;

    /* renamed from: c */
    private final Callable<InputStream> f26635c;

    /* renamed from: d */
    private final InterfaceC11611j.c f26636d;

    public C10583c0(String str, File file, Callable<InputStream> callable, InterfaceC11611j.c mDelegate) {
        C9322n.m27781e(mDelegate, "mDelegate");
        this.f26633a = str;
        this.f26634b = file;
        this.f26635c = callable;
        this.f26636d = mDelegate;
    }

    @Override // p391v1.InterfaceC11611j.c
    /* renamed from: a */
    public InterfaceC11611j mo8825a(InterfaceC11611j.b configuration) {
        C9322n.m27781e(configuration, "configuration");
        return new C10581b0(configuration.f30190a, this.f26633a, this.f26634b, this.f26635c, configuration.f30192c.f30188a, this.f26636d.mo8825a(configuration));
    }
}
