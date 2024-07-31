package vi;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: vi.r */
/* loaded from: classes3.dex */
public class C11942r {

    /* renamed from: b */
    static final Logger f31631b = Logger.getLogger(C11942r.class.getName());

    /* renamed from: c */
    public static final C11942r f31632c = new C11942r();

    /* renamed from: a */
    final int f31633a = 0;

    /* renamed from: vi.r$a */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vi.r$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        static final c f31634a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f31634a = m38252a(atomicReference);
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                C11942r.f31631b.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
            }
        }

        /* renamed from: a */
        private static c m38252a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(c.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                atomicReference.set(e10);
                return new C11930l1();
            } catch (Exception e11) {
                throw new RuntimeException("Storage override failed to initialize", e11);
            }
        }
    }

    /* renamed from: vi.r$c */
    /* loaded from: classes3.dex */
    public static abstract class c {
        @Deprecated
        /* renamed from: a */
        public void m38253a(C11942r c11942r) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        /* renamed from: b */
        public abstract C11942r mo38203b();

        /* renamed from: c */
        public abstract void mo38204c(C11942r c11942r, C11942r c11942r2);

        /* renamed from: d */
        public C11942r mo38205d(C11942r c11942r) {
            C11942r mo38203b = mo38203b();
            m38253a(c11942r);
            return mo38203b;
        }
    }

    private C11942r() {
        m38244k(0);
    }

    /* renamed from: d */
    static <T> T m38241d(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: e */
    public static C11942r m38242e() {
        C11942r mo38203b = m38243j().mo38203b();
        return mo38203b == null ? f31632c : mo38203b;
    }

    /* renamed from: j */
    static c m38243j() {
        return b.f31634a;
    }

    /* renamed from: k */
    private static void m38244k(int i10) {
        if (i10 == 1000) {
            f31631b.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    /* renamed from: a */
    public void m38245a(a aVar, Executor executor) {
        m38241d(aVar, "cancellationListener");
        m38241d(executor, "executor");
    }

    /* renamed from: b */
    public C11942r m38246b() {
        C11942r mo38205d = m38243j().mo38205d(this);
        return mo38205d == null ? f31632c : mo38205d;
    }

    /* renamed from: c */
    public Throwable m38247c() {
        return null;
    }

    /* renamed from: f */
    public void m38248f(C11942r c11942r) {
        m38241d(c11942r, "toAttach");
        m38243j().mo38204c(this, c11942r);
    }

    /* renamed from: g */
    public C11946t m38249g() {
        return null;
    }

    /* renamed from: h */
    public boolean m38250h() {
        return false;
    }

    /* renamed from: i */
    public void m38251i(a aVar) {
    }
}
