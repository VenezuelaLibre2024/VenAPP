package p319ql;

import dk.C7031r;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* renamed from: ql.n */
/* loaded from: classes3.dex */
public interface InterfaceC10539n {

    /* renamed from: a */
    public static final a f26429a = a.f26431a;

    /* renamed from: b */
    public static final InterfaceC10539n f26430b = new a.C13237a();

    /* renamed from: ql.n$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f26431a = new a();

        /* renamed from: ql.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C13237a implements InterfaceC10539n {
            @Override // p319ql.InterfaceC10539n
            /* renamed from: a */
            public List<C10538m> mo31790a(C10546u url) {
                List<C10538m> m20582j;
                C9322n.m27781e(url, "url");
                m20582j = C7031r.m20582j();
                return m20582j;
            }

            @Override // p319ql.InterfaceC10539n
            /* renamed from: b */
            public void mo31791b(C10546u url, List<C10538m> cookies) {
                C9322n.m27781e(url, "url");
                C9322n.m27781e(cookies, "cookies");
            }
        }

        private a() {
        }
    }

    /* renamed from: a */
    List<C10538m> mo31790a(C10546u c10546u);

    /* renamed from: b */
    void mo31791b(C10546u c10546u, List<C10538m> list);
}
