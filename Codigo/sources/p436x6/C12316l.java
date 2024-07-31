package p436x6;

import android.net.Uri;
import com.google.common.collect.AbstractC5877h1;
import java.util.Map;
import p137hb.C7690e;
import p351s8.C10841s;
import p351s8.InterfaceC10827j;
import p361t6.C11010c2;
import p363t8.C11137a;
import p363t8.C11172r0;
import p436x6.C12308h;

/* renamed from: x6.l */
/* loaded from: classes.dex */
public final class C12316l implements InterfaceC12332x {

    /* renamed from: a */
    private final Object f33044a = new Object();

    /* renamed from: b */
    private C11010c2.f f33045b;

    /* renamed from: c */
    private InterfaceC12330v f33046c;

    /* renamed from: d */
    private InterfaceC10827j.a f33047d;

    /* renamed from: e */
    private String f33048e;

    /* renamed from: b */
    private InterfaceC12330v m39834b(C11010c2.f fVar) {
        InterfaceC10827j.a aVar = this.f33047d;
        if (aVar == null) {
            aVar = new C10841s.b().m33077e(this.f33048e);
        }
        Uri uri = fVar.f28063c;
        C12313j0 c12313j0 = new C12313j0(uri == null ? null : uri.toString(), fVar.f28068h, aVar);
        AbstractC5877h1<Map.Entry<String, String>> it = fVar.f28065e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            c12313j0.m39833e(next.getKey(), next.getValue());
        }
        C12308h m39797a = new C12308h.b().m39801e(fVar.f28061a, C12311i0.f33033d).m39798b(fVar.f28066f).m39799c(fVar.f28067g).m39800d(C7690e.m23421l(fVar.f28070j)).m39797a(c12313j0);
        m39797a.m39791F(0, fVar.m33753c());
        return m39797a;
    }

    @Override // p436x6.InterfaceC12332x
    /* renamed from: a */
    public InterfaceC12330v mo39835a(C11010c2 c11010c2) {
        InterfaceC12330v interfaceC12330v;
        C11137a.m34603e(c11010c2.f28024b);
        C11010c2.f fVar = c11010c2.f28024b.f28099c;
        if (fVar == null || C11172r0.f29040a < 18) {
            return InterfaceC12330v.f33083a;
        }
        synchronized (this.f33044a) {
            if (!C11172r0.m34914c(fVar, this.f33045b)) {
                this.f33045b = fVar;
                this.f33046c = m39834b(fVar);
            }
            interfaceC12330v = (InterfaceC12330v) C11137a.m34603e(this.f33046c);
        }
        return interfaceC12330v;
    }
}
