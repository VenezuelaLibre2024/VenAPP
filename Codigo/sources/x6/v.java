package x6;

import android.os.Looper;
import com.facebook.ads.AdError;
import t6.u1;
import u6.m3;
import x6.n;
import x6.u;
import x6.v;

/* loaded from: classes.dex */
public interface v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f30571a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final v f30572b;

    /* loaded from: classes.dex */
    class a implements v {
        a() {
        }

        @Override // x6.v
        public void b(Looper looper, m3 m3Var) {
        }

        @Override // x6.v
        public n c(u.a aVar, u1 u1Var) {
            if (u1Var.f26520z == null) {
                return null;
            }
            return new a0(new n.a(new n0(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // x6.v
        public int d(u1 u1Var) {
            return u1Var.f26520z != null ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30573a = new b() { // from class: x6.w
            @Override // x6.v.b
            public final void release() {
                v.b.a();
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void a() {
        }

        void release();
    }

    static {
        a aVar = new a();
        f30571a = aVar;
        f30572b = aVar;
    }

    default void a() {
    }

    void b(Looper looper, m3 m3Var);

    n c(u.a aVar, u1 u1Var);

    int d(u1 u1Var);

    default b e(u.a aVar, u1 u1Var) {
        return b.f30573a;
    }

    default void release() {
    }
}
