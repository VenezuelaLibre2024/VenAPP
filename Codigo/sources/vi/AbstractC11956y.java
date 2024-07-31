package vi;

import vi.AbstractC11913g;

/* renamed from: vi.y */
/* loaded from: classes3.dex */
public abstract class AbstractC11956y<ReqT, RespT> extends AbstractC11900b1<ReqT, RespT> {

    /* renamed from: vi.y$a */
    /* loaded from: classes3.dex */
    public static abstract class a<ReqT, RespT> extends AbstractC11956y<ReqT, RespT> {

        /* renamed from: a */
        private final AbstractC11913g<ReqT, RespT> f31696a;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(AbstractC11913g<ReqT, RespT> abstractC11913g) {
            this.f31696a = abstractC11913g;
        }

        @Override // vi.AbstractC11956y, vi.AbstractC11900b1, vi.AbstractC11913g
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo25522a(String str, Throwable th2) {
            super.mo25522a(str, th2);
        }

        @Override // vi.AbstractC11956y, vi.AbstractC11900b1, vi.AbstractC11913g
        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo25523b() {
            super.mo25523b();
        }

        @Override // vi.AbstractC11956y, vi.AbstractC11900b1, vi.AbstractC11913g
        /* renamed from: c */
        public /* bridge */ /* synthetic */ void mo25524c(int i10) {
            super.mo25524c(i10);
        }

        @Override // vi.AbstractC11956y, vi.AbstractC11900b1
        /* renamed from: f */
        protected AbstractC11913g<ReqT, RespT> mo25534f() {
            return this.f31696a;
        }

        @Override // vi.AbstractC11956y, vi.AbstractC11900b1
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // vi.AbstractC11900b1, vi.AbstractC11913g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo25522a(String str, Throwable th2) {
        super.mo25522a(str, th2);
    }

    @Override // vi.AbstractC11900b1, vi.AbstractC11913g
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo25523b() {
        super.mo25523b();
    }

    @Override // vi.AbstractC11900b1, vi.AbstractC11913g
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo25524c(int i10) {
        super.mo25524c(i10);
    }

    @Override // vi.AbstractC11913g
    /* renamed from: d */
    public void mo25525d(ReqT reqt) {
        mo25534f().mo25525d(reqt);
    }

    @Override // vi.AbstractC11913g
    /* renamed from: e */
    public void mo603e(AbstractC11913g.a<RespT> aVar, C11953w0 c11953w0) {
        mo25534f().mo603e(aVar, c11953w0);
    }

    @Override // vi.AbstractC11900b1
    /* renamed from: f */
    protected abstract AbstractC11913g<ReqT, RespT> mo25534f();

    @Override // vi.AbstractC11900b1
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
