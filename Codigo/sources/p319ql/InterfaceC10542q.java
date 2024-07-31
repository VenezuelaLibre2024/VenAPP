package p319ql;

import dk.C7021m;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* renamed from: ql.q */
/* loaded from: classes3.dex */
public interface InterfaceC10542q {

    /* renamed from: a */
    public static final a f26440a = a.f26442a;

    /* renamed from: b */
    public static final InterfaceC10542q f26441b = new a.C13238a();

    /* renamed from: ql.q$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f26442a = new a();

        /* renamed from: ql.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C13238a implements InterfaceC10542q {
            @Override // p319ql.InterfaceC10542q
            /* renamed from: a */
            public List<InetAddress> mo31806a(String hostname) {
                List<InetAddress> m20478e0;
                C9322n.m27781e(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    C9322n.m27780d(allByName, "getAllByName(hostname)");
                    m20478e0 = C7021m.m20478e0(allByName);
                    return m20478e0;
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException(C9322n.m27787k("Broken system behaviour for dns lookup of ", hostname));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    /* renamed from: a */
    List<InetAddress> mo31806a(String str);
}
