package p212l3;

import androidx.core.util.InterfaceC0981e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p036c4.C1867h;
import p036c4.C1870k;
import p036c4.C1871l;
import p055d4.AbstractC6844c;
import p055d4.C6842a;
import p129h3.InterfaceC7622f;

/* renamed from: l3.j */
/* loaded from: classes.dex */
public class C9384j {

    /* renamed from: a */
    private final C1867h<InterfaceC7622f, String> f22734a = new C1867h<>(1000);

    /* renamed from: b */
    private final InterfaceC0981e<b> f22735b = C6842a.m19766d(10, new a());

    /* renamed from: l3.j$a */
    /* loaded from: classes.dex */
    class a implements C6842a.d<b> {
        a() {
        }

        @Override // p055d4.C6842a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo19770a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l3.j$b */
    /* loaded from: classes.dex */
    public static final class b implements C6842a.f {

        /* renamed from: a */
        final MessageDigest f22737a;

        /* renamed from: b */
        private final AbstractC6844c f22738b = AbstractC6844c.m19780a();

        b(MessageDigest messageDigest) {
            this.f22737a = messageDigest;
        }

        @Override // p055d4.C6842a.f
        /* renamed from: h */
        public AbstractC6844c mo19773h() {
            return this.f22738b;
        }
    }

    /* renamed from: a */
    private String m27918a(InterfaceC7622f interfaceC7622f) {
        b bVar = (b) C1870k.m9950d(this.f22735b.mo4821b());
        try {
            interfaceC7622f.mo9110b(bVar.f22737a);
            return C1871l.m9974w(bVar.f22737a.digest());
        } finally {
            this.f22735b.mo4820a(bVar);
        }
    }

    /* renamed from: b */
    public String m27919b(InterfaceC7622f interfaceC7622f) {
        String m9937g;
        synchronized (this.f22734a) {
            m9937g = this.f22734a.m9937g(interfaceC7622f);
        }
        if (m9937g == null) {
            m9937g = m27918a(interfaceC7622f);
        }
        synchronized (this.f22734a) {
            this.f22734a.m9941k(interfaceC7622f, m9937g);
        }
        return m9937g;
    }
}
