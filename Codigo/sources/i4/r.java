package i4;

import com.facebook.internal.n;
import java.util.Random;

/* loaded from: classes.dex */
public class r extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17091a = new a(null);
    public static final long serialVersionUID = 1;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public r() {
    }

    public r(final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !e0.F() || random.nextInt(100) <= 50) {
            return;
        }
        com.facebook.internal.n nVar = com.facebook.internal.n.f7774a;
        com.facebook.internal.n.a(n.b.ErrorReport, new n.a() { // from class: i4.q
            @Override // com.facebook.internal.n.a
            public final void a(boolean z10) {
                r.b(str, z10);
            }
        });
    }

    public r(String str, Throwable th2) {
        super(str, th2);
    }

    public r(Throwable th2) {
        super(th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, boolean z10) {
        if (z10) {
            try {
                b5.e.g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }
}
