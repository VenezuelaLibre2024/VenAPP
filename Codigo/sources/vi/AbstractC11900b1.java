package vi;

import p082eb.C7153i;

/* renamed from: vi.b1 */
/* loaded from: classes3.dex */
abstract class AbstractC11900b1<ReqT, RespT> extends AbstractC11913g<ReqT, RespT> {
    @Override // vi.AbstractC11913g
    /* renamed from: a */
    public void mo25522a(String str, Throwable th2) {
        mo25534f().mo25522a(str, th2);
    }

    @Override // vi.AbstractC11913g
    /* renamed from: b */
    public void mo25523b() {
        mo25534f().mo25523b();
    }

    @Override // vi.AbstractC11913g
    /* renamed from: c */
    public void mo25524c(int i10) {
        mo25534f().mo25524c(i10);
    }

    /* renamed from: f */
    protected abstract AbstractC11913g<?, ?> mo25534f();

    public String toString() {
        return C7153i.m21274c(this).m21284d("delegate", mo25534f()).toString();
    }
}
