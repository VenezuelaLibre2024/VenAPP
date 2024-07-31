package p000;

import ck.C2025j;
import ck.InterfaceC2023h;
import dk.C7029q;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p000.InterfaceC7376g;
import p280ok.InterfaceC9987a;

/* renamed from: g */
/* loaded from: classes2.dex */
public interface InterfaceC7376g {

    /* renamed from: g */
    public static final a f16681g = a.f16682a;

    /* renamed from: g$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f16682a = new a();

        /* renamed from: b */
        private static final InterfaceC2023h<C7604h> f16683b;

        /* renamed from: g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C13208a extends AbstractC9323o implements InterfaceC9987a<C7604h> {

            /* renamed from: a */
            public static final C13208a f16723a = new C13208a();

            C13208a() {
                super(0);
            }

            @Override // p280ok.InterfaceC9987a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C7604h invoke() {
                return C7604h.f17982a;
            }
        }

        static {
            InterfaceC2023h<C7604h> m10334a;
            m10334a = C2025j.m10334a(C13208a.f16723a);
            f16683b = m10334a;
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m22255e(InterfaceC7376g interfaceC7376g, Object obj, BasicMessageChannel.Reply reply) {
            List m9823b;
            C9322n.m27781e(reply, "reply");
            C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            C9322n.m27779c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
            try {
                interfaceC7376g.mo22252a((C6803d) obj2);
                m9823b = C7029q.m20572e(null);
            } catch (Throwable th2) {
                m9823b = C1824c.m9823b(th2);
            }
            reply.reply(m9823b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m22256f(InterfaceC7376g interfaceC7376g, Object obj, BasicMessageChannel.Reply reply) {
            List m9823b;
            C9322n.m27781e(reply, "reply");
            try {
                m9823b = C7029q.m20572e(interfaceC7376g.isEnabled());
            } catch (Throwable th2) {
                m9823b = C1824c.m9823b(th2);
            }
            reply.reply(m9823b);
        }

        /* renamed from: c */
        public final MessageCodec<Object> m22257c() {
            return f16683b.getValue();
        }

        /* renamed from: d */
        public final void m22258d(BinaryMessenger binaryMessenger, final InterfaceC7376g interfaceC7376g) {
            C9322n.m27781e(binaryMessenger, "binaryMessenger");
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WakelockPlusApi.toggle", m22257c());
            if (interfaceC7376g != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InterfaceC7376g.a.m22255e(InterfaceC7376g.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WakelockPlusApi.isEnabled", m22257c());
            if (interfaceC7376g != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InterfaceC7376g.a.m22256f(InterfaceC7376g.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    /* renamed from: a */
    void mo22252a(C6803d c6803d);

    C1589b isEnabled();
}
