package p112g0;

import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import androidx.core.util.InterfaceC0977a;
import java.util.Objects;
import java.util.concurrent.Executor;
import p407w.AbstractC12019k;
import p407w.C12008g0;
import p407w.InterfaceC12020k0;

/* renamed from: g0.z */
/* loaded from: classes.dex */
public class C7437z {

    /* renamed from: a */
    private final Executor f17278a;

    /* renamed from: b */
    private final InterfaceC12020k0 f17279b;

    /* renamed from: c */
    private final InterfaceC0977a<Throwable> f17280c;

    public C7437z(AbstractC12019k abstractC12019k) {
        C0984h.m4823a(abstractC12019k.m38628f() == 4);
        this.f17278a = abstractC12019k.m38625c();
        InterfaceC12020k0 m38626d = abstractC12019k.m38626d();
        Objects.requireNonNull(m38626d);
        this.f17279b = m38626d;
        this.f17280c = abstractC12019k.m38624b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m22434c(InterfaceC12020k0.a aVar, C0742c.a aVar2) {
        aVar2.m3756c(this.f17279b.m38629a(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m22435d(final InterfaceC12020k0.a aVar, final C0742c.a aVar2) {
        this.f17278a.execute(new Runnable() { // from class: g0.y
            @Override // java.lang.Runnable
            public final void run() {
                C7437z.this.m22434c(aVar, aVar2);
            }
        });
        return "InternalImageProcessor#process " + aVar.hashCode();
    }

    /* renamed from: e */
    public InterfaceC12020k0.b m22436e(final InterfaceC12020k0.a aVar) {
        try {
            return (InterfaceC12020k0.b) C0742c.m3752a(new C0742c.c() { // from class: g0.x
                @Override // androidx.concurrent.futures.C0742c.c
                /* renamed from: a */
                public final Object mo14a(C0742c.a aVar2) {
                    Object m22435d;
                    m22435d = C7437z.this.m22435d(aVar, aVar2);
                    return m22435d;
                }
            }).get();
        } catch (Exception e10) {
            e = e10;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new C12008g0(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
