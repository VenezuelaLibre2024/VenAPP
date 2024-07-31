package p475z0;

import androidx.datastore.preferences.protobuf.C1150b0;
import java.io.InputStream;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p430x0.C12250a;

/* renamed from: z0.d */
/* loaded from: classes.dex */
public final class C12757d {

    /* renamed from: a */
    public static final a f34798a = new a(null);

    /* renamed from: z0.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C12759f m42303a(InputStream input) {
            C9322n.m27781e(input, "input");
            try {
                C12759f m42310Q = C12759f.m42310Q(input);
                C9322n.m27780d(m42310Q, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return m42310Q;
            } catch (C1150b0 e10) {
                throw new C12250a("Unable to parse preferences proto.", e10);
            }
        }
    }
}
