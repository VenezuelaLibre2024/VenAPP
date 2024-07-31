package defpackage;

import ck.h;
import ck.j;
import defpackage.g;
import dk.q;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public interface g {

    /* renamed from: g, reason: collision with root package name */
    public static final a f15258g = a.f15259a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f15259a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final h<h> f15260b;

        /* renamed from: g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0254a extends o implements ok.a<h> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0254a f15287a = new C0254a();

            C0254a() {
                super(0);
            }

            @Override // ok.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h invoke() {
                return h.f16345a;
            }
        }

        static {
            h<h> a10;
            a10 = j.a(C0254a.f15287a);
            f15260b = a10;
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(g gVar, Object obj, BasicMessageChannel.Reply reply) {
            List b10;
            n.e(reply, "reply");
            n.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            n.c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
            try {
                gVar.a((d) obj2);
                b10 = q.e(null);
            } catch (Throwable th2) {
                b10 = c.b(th2);
            }
            reply.reply(b10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(g gVar, Object obj, BasicMessageChannel.Reply reply) {
            List b10;
            n.e(reply, "reply");
            try {
                b10 = q.e(gVar.isEnabled());
            } catch (Throwable th2) {
                b10 = c.b(th2);
            }
            reply.reply(b10);
        }

        public final MessageCodec<Object> c() {
            return f15260b.getValue();
        }

        public final void d(BinaryMessenger binaryMessenger, final g gVar) {
            n.e(binaryMessenger, "binaryMessenger");
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WakelockPlusApi.toggle", c());
            if (gVar != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        g.a.e(g.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WakelockPlusApi.isEnabled", c());
            if (gVar != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        g.a.f(g.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    void a(d dVar);

    b isEnabled();
}
