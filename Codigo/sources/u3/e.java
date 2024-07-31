package u3;

/* loaded from: classes.dex */
public class e extends s3.h<c> {
    public e(c cVar) {
        super(cVar);
    }

    @Override // s3.h, j3.r
    public void initialize() {
        ((c) this.f25125a).e().prepareToDraw();
    }

    @Override // j3.v
    public int p() {
        return ((c) this.f25125a).i();
    }

    @Override // j3.v
    public void q() {
        ((c) this.f25125a).stop();
        ((c) this.f25125a).k();
    }

    @Override // j3.v
    public Class<c> r() {
        return c.class;
    }
}
