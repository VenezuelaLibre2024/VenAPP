package vi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p082eb.C7159o;
import vi.AbstractC11913g;

/* renamed from: vi.j */
/* loaded from: classes3.dex */
public class C11922j {

    /* renamed from: a */
    private static final AbstractC11913g<Object, Object> f31569a = new a();

    /* renamed from: vi.j$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC11913g<Object, Object> {
        a() {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: a */
        public void mo25522a(String str, Throwable th2) {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: b */
        public void mo25523b() {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: c */
        public void mo25524c(int i10) {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: d */
        public void mo25525d(Object obj) {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: e */
        public void mo603e(AbstractC11913g.a<Object> aVar, C11953w0 c11953w0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vi.j$b */
    /* loaded from: classes3.dex */
    public static class b extends AbstractC11904d {

        /* renamed from: a */
        private final AbstractC11904d f31570a;

        /* renamed from: b */
        private final InterfaceC11916h f31571b;

        private b(AbstractC11904d abstractC11904d, InterfaceC11916h interfaceC11916h) {
            this.f31570a = abstractC11904d;
            this.f31571b = (InterfaceC11916h) C7159o.m21313p(interfaceC11916h, "interceptor");
        }

        /* synthetic */ b(AbstractC11904d abstractC11904d, InterfaceC11916h interfaceC11916h, C11919i c11919i) {
            this(abstractC11904d, interfaceC11916h);
        }

        @Override // vi.AbstractC11904d
        /* renamed from: a */
        public String mo25517a() {
            return this.f31570a.mo25517a();
        }

        @Override // vi.AbstractC11904d
        /* renamed from: h */
        public <ReqT, RespT> AbstractC11913g<ReqT, RespT> mo25518h(C11955x0<ReqT, RespT> c11955x0, C11901c c11901c) {
            return this.f31571b.mo602a(c11955x0, c11901c, this.f31570a);
        }
    }

    /* renamed from: a */
    public static AbstractC11904d m38169a(AbstractC11904d abstractC11904d, List<? extends InterfaceC11916h> list) {
        C7159o.m21313p(abstractC11904d, "channel");
        Iterator<? extends InterfaceC11916h> it = list.iterator();
        while (it.hasNext()) {
            abstractC11904d = new b(abstractC11904d, it.next(), null);
        }
        return abstractC11904d;
    }

    /* renamed from: b */
    public static AbstractC11904d m38170b(AbstractC11904d abstractC11904d, InterfaceC11916h... interfaceC11916hArr) {
        return m38169a(abstractC11904d, Arrays.asList(interfaceC11916hArr));
    }
}
