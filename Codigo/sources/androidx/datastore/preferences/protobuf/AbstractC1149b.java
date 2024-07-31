package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InterfaceC1198r0;

/* renamed from: androidx.datastore.preferences.protobuf.b */
/* loaded from: classes.dex */
public abstract class AbstractC1149b<MessageType extends InterfaceC1198r0> implements InterfaceC1218z0<MessageType> {

    /* renamed from: a */
    private static final C1191p f4794a = C1191p.m6272b();

    /* renamed from: c */
    private MessageType m5659c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m5660d(messagetype).m6226a().m5674i(messagetype);
    }

    /* renamed from: d */
    private C1184m1 m5660d(MessageType messagetype) {
        return messagetype instanceof AbstractC1146a ? ((AbstractC1146a) messagetype).m5634m() : new C1184m1(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1218z0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType mo5661a(AbstractC1167h abstractC1167h, C1191p c1191p) {
        return m5659c(m5663f(abstractC1167h, c1191p));
    }

    /* renamed from: f */
    public MessageType m5663f(AbstractC1167h abstractC1167h, C1191p c1191p) {
        try {
            AbstractC1170i mo5818s = abstractC1167h.mo5818s();
            MessageType messagetype = (MessageType) mo6569b(mo5818s, c1191p);
            try {
                mo5818s.mo5854a(0);
                return messagetype;
            } catch (C1150b0 e10) {
                throw e10.m5674i(messagetype);
            }
        } catch (C1150b0 e11) {
            throw e11;
        }
    }
}
