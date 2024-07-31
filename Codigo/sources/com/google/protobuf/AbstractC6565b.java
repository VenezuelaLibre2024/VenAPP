package com.google.protobuf;

import com.google.protobuf.InterfaceC6614r0;
import java.io.InputStream;

/* renamed from: com.google.protobuf.b */
/* loaded from: classes2.dex */
public abstract class AbstractC6565b<MessageType extends InterfaceC6614r0> implements InterfaceC6634z0<MessageType> {

    /* renamed from: a */
    private static final C6604o f14428a = C6604o.m18973b();

    /* renamed from: e */
    private MessageType m18386e(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m18387f(messagetype).m18947a().m18409k(messagetype);
    }

    /* renamed from: f */
    private C6600m1 m18387f(MessageType messagetype) {
        return messagetype instanceof AbstractC6562a ? ((AbstractC6562a) messagetype).m18378t() : new C6600m1(messagetype);
    }

    @Override // com.google.protobuf.InterfaceC6634z0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType mo18388a(AbstractC6580g abstractC6580g, C6604o c6604o) {
        return m18386e(m18395k(abstractC6580g, c6604o));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC6634z0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType mo18389b(AbstractC6583h abstractC6583h, C6604o c6604o) {
        return (MessageType) m18386e((InterfaceC6614r0) mo19323d(abstractC6583h, c6604o));
    }

    @Override // com.google.protobuf.InterfaceC6634z0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType mo18390c(InputStream inputStream) {
        return m18394j(inputStream, f14428a);
    }

    /* renamed from: j */
    public MessageType m18394j(InputStream inputStream, C6604o c6604o) {
        return m18386e(m18396l(inputStream, c6604o));
    }

    /* renamed from: k */
    public MessageType m18395k(AbstractC6580g abstractC6580g, C6604o c6604o) {
        try {
            AbstractC6583h mo18525s = abstractC6580g.mo18525s();
            MessageType messagetype = (MessageType) mo19323d(mo18525s, c6604o);
            try {
                mo18525s.mo18562a(0);
                return messagetype;
            } catch (C6566b0 e10) {
                throw e10.m18409k(messagetype);
            }
        } catch (C6566b0 e11) {
            throw e11;
        }
    }

    /* renamed from: l */
    public MessageType m18396l(InputStream inputStream, C6604o c6604o) {
        AbstractC6583h m18551f = AbstractC6583h.m18551f(inputStream);
        MessageType messagetype = (MessageType) mo19323d(m18551f, c6604o);
        try {
            m18551f.mo18562a(0);
            return messagetype;
        } catch (C6566b0 e10) {
            throw e10.m18409k(messagetype);
        }
    }
}
