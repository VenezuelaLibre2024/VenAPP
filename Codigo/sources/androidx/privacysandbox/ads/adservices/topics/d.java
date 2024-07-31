package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import gk.Continuation;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5028a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final d a(Context context) {
            n.e(context, "context");
            l1.a aVar = l1.a.f20802a;
            if (aVar.a() >= 5) {
                return new f(context);
            }
            if (aVar.a() == 4) {
                return new e(context);
            }
            return null;
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.topics.a aVar, Continuation<? super b> continuation);
}
