package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;

/* renamed from: com.google.crypto.tink.shaded.protobuf.b */
/* loaded from: classes2.dex */
public abstract class AbstractC5952b<MessageType extends InterfaceC6001r0> implements InterfaceC6021z0<MessageType> {

    /* renamed from: a */
    private static final C5994p f12555a = C5994p.m15932b();

    /* renamed from: c */
    private MessageType m15318c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m15319d(messagetype).m15885a().m15335k(messagetype);
    }

    /* renamed from: d */
    private C5987m1 m15319d(MessageType messagetype) {
        return messagetype instanceof AbstractC5949a ? ((AbstractC5949a) messagetype).m15296m() : new C5987m1(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6021z0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType mo15320b(AbstractC5970h abstractC5970h, C5994p c5994p) {
        return m15318c(m15322f(abstractC5970h, c5994p));
    }

    /* renamed from: f */
    public MessageType m15322f(AbstractC5970h abstractC5970h, C5994p c5994p) {
        try {
            AbstractC5973i mo15498s = abstractC5970h.mo15498s();
            MessageType messagetype = (MessageType) mo16263a(mo15498s, c5994p);
            try {
                mo15498s.mo15534a(0);
                return messagetype;
            } catch (C5953b0 e10) {
                throw e10.m15335k(messagetype);
            }
        } catch (C5953b0 e11) {
            throw e11;
        }
    }
}
