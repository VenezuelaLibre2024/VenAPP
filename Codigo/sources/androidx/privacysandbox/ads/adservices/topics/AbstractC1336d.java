package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;
import p210l1.C9343a;

/* renamed from: androidx.privacysandbox.ads.adservices.topics.d */
/* loaded from: classes.dex */
public abstract class AbstractC1336d {

    /* renamed from: a */
    public static final a f5782a = new a(null);

    /* renamed from: androidx.privacysandbox.ads.adservices.topics.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC1336d m7458a(Context context) {
            C9322n.m27781e(context, "context");
            C9343a c9343a = C9343a.f22624a;
            if (c9343a.m27833a() >= 5) {
                return new C1338f(context);
            }
            if (c9343a.m27833a() == 4) {
                return new C1337e(context);
            }
            return null;
        }
    }

    /* renamed from: a */
    public abstract Object mo7457a(C1333a c1333a, Continuation<? super C1334b> continuation);
}
