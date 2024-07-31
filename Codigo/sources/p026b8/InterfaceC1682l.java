package p026b8;

import android.net.Uri;
import java.io.IOException;
import p010a8.InterfaceC0049g;
import p351s8.InterfaceC10816d0;
import p397v7.InterfaceC11705h0;

/* renamed from: b8.l */
/* loaded from: classes.dex */
public interface InterfaceC1682l {

    /* renamed from: b8.l$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        InterfaceC1682l mo9167a(InterfaceC0049g interfaceC0049g, InterfaceC10816d0 interfaceC10816d0, InterfaceC1681k interfaceC1681k);
    }

    /* renamed from: b8.l$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        boolean mo244a(Uri uri, InterfaceC10816d0.c cVar, boolean z10);

        /* renamed from: d */
        void mo247d();
    }

    /* renamed from: b8.l$c */
    /* loaded from: classes.dex */
    public static final class c extends IOException {

        /* renamed from: a */
        public final Uri f7235a;

        public c(Uri uri) {
            this.f7235a = uri;
        }
    }

    /* renamed from: b8.l$d */
    /* loaded from: classes.dex */
    public static final class d extends IOException {

        /* renamed from: a */
        public final Uri f7236a;

        public d(Uri uri) {
            this.f7236a = uri;
        }
    }

    /* renamed from: b8.l$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: r */
        void mo9277r(C1677g c1677g);
    }

    /* renamed from: a */
    void mo9197a(b bVar);

    /* renamed from: b */
    void mo9198b(Uri uri);

    /* renamed from: c */
    long mo9199c();

    /* renamed from: d */
    void mo9200d(Uri uri, InterfaceC11705h0.a aVar, e eVar);

    /* renamed from: e */
    C1678h mo9201e();

    /* renamed from: f */
    void mo9202f(Uri uri);

    /* renamed from: g */
    boolean mo9203g(Uri uri);

    /* renamed from: j */
    boolean mo9204j();

    /* renamed from: k */
    boolean mo9205k(Uri uri, long j10);

    /* renamed from: l */
    void mo9206l();

    /* renamed from: n */
    void mo9207n(b bVar);

    /* renamed from: o */
    C1677g mo9208o(Uri uri, boolean z10);

    void stop();
}
