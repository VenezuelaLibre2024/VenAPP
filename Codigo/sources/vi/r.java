package vi;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    static final Logger f29196b = Logger.getLogger(r.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final r f29197c = new r();

    /* renamed from: a, reason: collision with root package name */
    final int f29198a = 0;

    /* loaded from: classes3.dex */
    public interface a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final c f29199a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f29199a = a(atomicReference);
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                r.f29196b.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
            }
        }

        private static c a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(c.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                atomicReference.set(e10);
                return new l1();
            } catch (Exception e11) {
                throw new RuntimeException("Storage override failed to initialize", e11);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c {
        @Deprecated
        public void a(r rVar) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        public abstract r b();

        public abstract void c(r rVar, r rVar2);

        public r d(r rVar) {
            r b10 = b();
            a(rVar);
            return b10;
        }
    }

    private r() {
        k(0);
    }

    static <T> T d(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static r e() {
        r b10 = j().b();
        return b10 == null ? f29197c : b10;
    }

    static c j() {
        return b.f29199a;
    }

    private static void k(int i10) {
        if (i10 == 1000) {
            f29196b.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public void a(a aVar, Executor executor) {
        d(aVar, "cancellationListener");
        d(executor, "executor");
    }

    public r b() {
        r d10 = j().d(this);
        return d10 == null ? f29197c : d10;
    }

    public Throwable c() {
        return null;
    }

    public void f(r rVar) {
        d(rVar, "toAttach");
        j().c(this, rVar);
    }

    public t g() {
        return null;
    }

    public boolean h() {
        return false;
    }

    public void i(a aVar) {
    }
}
