package ql;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* loaded from: classes3.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24346a = a.f24348a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f24347b = new a.C0403a();

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f24348a = new a();

        /* renamed from: ql.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0403a implements q {
            @Override // ql.q
            public List<InetAddress> a(String hostname) {
                List<InetAddress> e02;
                kotlin.jvm.internal.n.e(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    kotlin.jvm.internal.n.d(allByName, "getAllByName(hostname)");
                    e02 = dk.m.e0(allByName);
                    return e02;
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException(kotlin.jvm.internal.n.k("Broken system behaviour for dns lookup of ", hostname));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    List<InetAddress> a(String str);
}
