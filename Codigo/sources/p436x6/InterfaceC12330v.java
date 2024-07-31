package p436x6;

import android.os.Looper;
import com.facebook.ads.AdError;
import p361t6.C11108u1;
import p376u6.C11391m3;
import p436x6.InterfaceC12320n;
import p436x6.InterfaceC12329u;
import p436x6.InterfaceC12330v;

/* renamed from: x6.v */
/* loaded from: classes.dex */
public interface InterfaceC12330v {

    /* renamed from: a */
    public static final InterfaceC12330v f33083a;

    /* renamed from: b */
    @Deprecated
    public static final InterfaceC12330v f33084b;

    /* renamed from: x6.v$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC12330v {
        a() {
        }

        @Override // p436x6.InterfaceC12330v
        /* renamed from: b */
        public void mo39793b(Looper looper, C11391m3 c11391m3) {
        }

        @Override // p436x6.InterfaceC12330v
        /* renamed from: c */
        public InterfaceC12320n mo39794c(InterfaceC12329u.a aVar, C11108u1 c11108u1) {
            if (c11108u1.f28800z == null) {
                return null;
            }
            return new C12295a0(new InterfaceC12320n.a(new C12321n0(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // p436x6.InterfaceC12330v
        /* renamed from: d */
        public int mo39795d(C11108u1 c11108u1) {
            return c11108u1.f28800z != null ? 1 : 0;
        }
    }

    /* renamed from: x6.v$b */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a */
        public static final b f33085a = new b() { // from class: x6.w
            @Override // p436x6.InterfaceC12330v.b
            public final void release() {
                InterfaceC12330v.b.m39875a();
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        static /* synthetic */ void m39875a() {
        }

        void release();
    }

    static {
        a aVar = new a();
        f33083a = aVar;
        f33084b = aVar;
    }

    /* renamed from: a */
    default void mo39792a() {
    }

    /* renamed from: b */
    void mo39793b(Looper looper, C11391m3 c11391m3);

    /* renamed from: c */
    InterfaceC12320n mo39794c(InterfaceC12329u.a aVar, C11108u1 c11108u1);

    /* renamed from: d */
    int mo39795d(C11108u1 c11108u1);

    /* renamed from: e */
    default b mo39796e(InterfaceC12329u.a aVar, C11108u1 c11108u1) {
        return b.f33085a;
    }

    default void release() {
    }
}
