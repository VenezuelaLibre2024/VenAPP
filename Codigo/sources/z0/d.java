package z0;

import androidx.datastore.preferences.protobuf.b0;
import java.io.InputStream;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32247a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final f a(InputStream input) {
            n.e(input, "input");
            try {
                f Q = f.Q(input);
                n.d(Q, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return Q;
            } catch (b0 e10) {
                throw new x0.a("Unable to parse preferences proto.", e10);
            }
        }
    }
}
