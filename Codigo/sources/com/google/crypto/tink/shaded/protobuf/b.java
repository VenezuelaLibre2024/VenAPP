package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.r0;

/* loaded from: classes2.dex */
public abstract class b<MessageType extends r0> implements z0<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final p f11340a = p.b();

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private m1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).m() : new m1(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType b(h hVar, p pVar) {
        return c(f(hVar, pVar));
    }

    public MessageType f(h hVar, p pVar) {
        try {
            i s10 = hVar.s();
            MessageType messagetype = (MessageType) a(s10, pVar);
            try {
                s10.a(0);
                return messagetype;
            } catch (b0 e10) {
                throw e10.k(messagetype);
            }
        } catch (b0 e11) {
            throw e11;
        }
    }
}
