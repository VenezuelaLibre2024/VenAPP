package com.google.protobuf;

import com.google.protobuf.r0;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class b<MessageType extends r0> implements z0<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final o f13154a = o.b();

    private MessageType e(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw f(messagetype).a().k(messagetype);
    }

    private m1 f(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).t() : new m1(messagetype);
    }

    @Override // com.google.protobuf.z0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType a(g gVar, o oVar) {
        return e(k(gVar, oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.z0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType b(h hVar, o oVar) {
        return (MessageType) e((r0) d(hVar, oVar));
    }

    @Override // com.google.protobuf.z0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType c(InputStream inputStream) {
        return j(inputStream, f13154a);
    }

    public MessageType j(InputStream inputStream, o oVar) {
        return e(l(inputStream, oVar));
    }

    public MessageType k(g gVar, o oVar) {
        try {
            h s10 = gVar.s();
            MessageType messagetype = (MessageType) d(s10, oVar);
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

    public MessageType l(InputStream inputStream, o oVar) {
        h f10 = h.f(inputStream);
        MessageType messagetype = (MessageType) d(f10, oVar);
        try {
            f10.a(0);
            return messagetype;
        } catch (b0 e10) {
            throw e10.k(messagetype);
        }
    }
}
