package ud;

import j3.q;
import qd.t;

/* loaded from: classes.dex */
public class j implements y3.h<Object> {

    /* renamed from: a, reason: collision with root package name */
    private de.i f27608a;

    /* renamed from: b, reason: collision with root package name */
    private t f27609b;

    @Override // y3.h
    public boolean c(Object obj, Object obj2, z3.d<Object> dVar, h3.a aVar, boolean z10) {
        m.a("Image Downloading  Success : " + obj);
        return false;
    }

    @Override // y3.h
    public boolean d(q qVar, Object obj, z3.d<Object> dVar, boolean z10) {
        t tVar;
        t.b bVar;
        m.a("Image Downloading  Error : " + qVar.getMessage() + ":" + qVar.getCause());
        if (this.f27608a == null || this.f27609b == null) {
            return false;
        }
        if (qVar.getLocalizedMessage().contains("Failed to decode")) {
            tVar = this.f27609b;
            bVar = t.b.IMAGE_UNSUPPORTED_FORMAT;
        } else {
            tVar = this.f27609b;
            bVar = t.b.UNSPECIFIED_RENDER_ERROR;
        }
        tVar.c(bVar);
        return false;
    }
}
