package yl;

import java.util.List;

/* loaded from: classes3.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32203a = a.f32205a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f32204b = new a.C0538a();

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f32205a = new a();

        /* renamed from: yl.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0538a implements l {
            @Override // yl.l
            public boolean a(int i10, dm.d source, int i11, boolean z10) {
                kotlin.jvm.internal.n.e(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // yl.l
            public void b(int i10, b errorCode) {
                kotlin.jvm.internal.n.e(errorCode, "errorCode");
            }

            @Override // yl.l
            public boolean c(int i10, List<c> requestHeaders) {
                kotlin.jvm.internal.n.e(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // yl.l
            public boolean d(int i10, List<c> responseHeaders, boolean z10) {
                kotlin.jvm.internal.n.e(responseHeaders, "responseHeaders");
                return true;
            }
        }

        private a() {
        }
    }

    boolean a(int i10, dm.d dVar, int i11, boolean z10);

    void b(int i10, b bVar);

    boolean c(int i10, List<c> list);

    boolean d(int i10, List<c> list, boolean z10);
}
