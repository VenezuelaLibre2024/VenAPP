package df;

import android.content.ServiceConnection;
import android.os.Messenger;

/* loaded from: classes2.dex */
public interface g0 {

    /* renamed from: a */
    public static final a f14065a = a.f14066a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f14066a = new a();

        private a() {
        }

        public final g0 a() {
            Object k10 = zb.n.a(zb.c.f32513a).k(g0.class);
            kotlin.jvm.internal.n.d(k10, "Firebase.app[SessionLife…erviceBinder::class.java]");
            return (g0) k10;
        }
    }

    void a(Messenger messenger, ServiceConnection serviceConnection);
}
