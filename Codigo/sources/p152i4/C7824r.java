package p152i4;

import com.facebook.internal.C4633n;
import java.util.Random;
import kotlin.jvm.internal.C9315g;
import p023b5.C1661e;

/* renamed from: i4.r */
/* loaded from: classes.dex */
public class C7824r extends RuntimeException {

    /* renamed from: a */
    public static final a f18750a = new a(null);
    public static final long serialVersionUID = 1;

    /* renamed from: i4.r$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C7824r() {
    }

    public C7824r(final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !C7799e0.m23833F() || random.nextInt(100) <= 50) {
            return;
        }
        C4633n c4633n = C4633n.f8754a;
        C4633n.m11248a(C4633n.b.ErrorReport, new C4633n.a() { // from class: i4.q
            @Override // com.facebook.internal.C4633n.a
            /* renamed from: a */
            public final void mo10935a(boolean z10) {
                C7824r.m24084b(str, z10);
            }
        });
    }

    public C7824r(String str, Throwable th2) {
        super(str, th2);
    }

    public C7824r(Throwable th2) {
        super(th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m24084b(String str, boolean z10) {
        if (z10) {
            try {
                C1661e.m9128g(str);
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
