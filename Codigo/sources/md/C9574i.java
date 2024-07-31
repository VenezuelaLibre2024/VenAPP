package md;

import p181jd.C9038b;
import p181jd.C9039c;
import p181jd.InterfaceC9043g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: md.i */
/* loaded from: classes.dex */
public class C9574i implements InterfaceC9043g {

    /* renamed from: a */
    private boolean f23296a = false;

    /* renamed from: b */
    private boolean f23297b = false;

    /* renamed from: c */
    private C9039c f23298c;

    /* renamed from: d */
    private final C9571f f23299d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9574i(C9571f c9571f) {
        this.f23299d = c9571f;
    }

    /* renamed from: a */
    private void m28483a() {
        if (this.f23296a) {
            throw new C9038b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f23296a = true;
    }

    @Override // p181jd.InterfaceC9043g
    public InterfaceC9043g add(String str) {
        m28483a();
        this.f23299d.m28467d(this.f23298c, str, this.f23297b);
        return this;
    }

    @Override // p181jd.InterfaceC9043g
    public InterfaceC9043g add(boolean z10) {
        m28483a();
        this.f23299d.m28473j(this.f23298c, z10, this.f23297b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m28484b(C9039c c9039c, boolean z10) {
        this.f23296a = false;
        this.f23298c = c9039c;
        this.f23297b = z10;
    }
}
