package p065df;

import android.content.ServiceConnection;
import android.os.Messenger;
import kotlin.jvm.internal.C9322n;
import p485zb.C12863c;
import p485zb.C12874n;

/* renamed from: df.g0 */
/* loaded from: classes2.dex */
public interface InterfaceC6916g0 {

    /* renamed from: a */
    public static final a f15419a = a.f15420a;

    /* renamed from: df.g0$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f15420a = new a();

        private a() {
        }

        /* renamed from: a */
        public final InterfaceC6916g0 m20033a() {
            Object m42629k = C12874n.m42641a(C12863c.f35064a).m42629k(InterfaceC6916g0.class);
            C9322n.m27780d(m42629k, "Firebase.app[SessionLife…erviceBinder::class.java]");
            return (InterfaceC6916g0) m42629k;
        }
    }

    /* renamed from: a */
    void mo20032a(Messenger messenger, ServiceConnection serviceConnection);
}
