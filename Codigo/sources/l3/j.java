package l3;

import c4.k;
import c4.l;
import d4.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final c4.h<h3.f, String> f20912a = new c4.h<>(1000);

    /* renamed from: b, reason: collision with root package name */
    private final androidx.core.util.e<b> f20913b = d4.a.d(10, new a());

    /* loaded from: classes.dex */
    class a implements a.d<b> {
        a() {
        }

        @Override // d4.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        final MessageDigest f20915a;

        /* renamed from: b, reason: collision with root package name */
        private final d4.c f20916b = d4.c.a();

        b(MessageDigest messageDigest) {
            this.f20915a = messageDigest;
        }

        @Override // d4.a.f
        public d4.c h() {
            return this.f20916b;
        }
    }

    private String a(h3.f fVar) {
        b bVar = (b) k.d(this.f20913b.b());
        try {
            fVar.b(bVar.f20915a);
            return l.w(bVar.f20915a.digest());
        } finally {
            this.f20913b.a(bVar);
        }
    }

    public String b(h3.f fVar) {
        String g10;
        synchronized (this.f20912a) {
            g10 = this.f20912a.g(fVar);
        }
        if (g10 == null) {
            g10 = a(fVar);
        }
        synchronized (this.f20912a) {
            this.f20912a.k(fVar, g10);
        }
        return g10;
    }
}
