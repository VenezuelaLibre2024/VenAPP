package ql;

import java.util.List;

/* loaded from: classes3.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24335a = a.f24337a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f24336b = new a.C0402a();

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f24337a = new a();

        /* renamed from: ql.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0402a implements n {
            @Override // ql.n
            public List<m> a(u url) {
                List<m> j10;
                kotlin.jvm.internal.n.e(url, "url");
                j10 = dk.r.j();
                return j10;
            }

            @Override // ql.n
            public void b(u url, List<m> cookies) {
                kotlin.jvm.internal.n.e(url, "url");
                kotlin.jvm.internal.n.e(cookies, "cookies");
            }
        }

        private a() {
        }
    }

    List<m> a(u uVar);

    void b(u uVar, List<m> list);
}
