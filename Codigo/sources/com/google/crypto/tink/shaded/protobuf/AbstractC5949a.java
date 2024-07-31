package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5949a;
import com.google.crypto.tink.shaded.protobuf.AbstractC5949a.a;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5949a<MessageType extends AbstractC5949a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC6001r0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a */
    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends AbstractC5949a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC6001r0.a {
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: l */
        public static C5987m1 m15298l(InterfaceC6001r0 interfaceC6001r0) {
            return new C5987m1(interfaceC6001r0);
        }

        /* renamed from: j */
        protected abstract BuilderType mo15300j(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public BuilderType mo15299Y0(InterfaceC6001r0 interfaceC6001r0) {
            if (mo16043e().getClass().isInstance(interfaceC6001r0)) {
                return (BuilderType) mo15300j((AbstractC5949a) interfaceC6001r0);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* renamed from: l */
    private String m15291l(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: b */
    public AbstractC5970h mo15292b() {
        try {
            AbstractC5970h.h m15489r = AbstractC5970h.m15489r(mo15968c());
            mo15971i(m15489r.m15511b());
            return m15489r.m15510a();
        } catch (IOException e10) {
            throw new RuntimeException(m15291l("ByteString"), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: h */
    public byte[] mo15293h() {
        try {
            byte[] bArr = new byte[mo15968c()];
            AbstractC5979k m15729c0 = AbstractC5979k.m15729c0(bArr);
            mo15971i(m15729c0);
            m15729c0.m15772c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(m15291l("byte array"), e10);
        }
    }

    /* renamed from: j */
    int mo15294j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo15295k(InterfaceC5969g1 interfaceC5969g1) {
        int mo15294j = mo15294j();
        if (mo15294j != -1) {
            return mo15294j;
        }
        int mo15473d = interfaceC5969g1.mo15473d(this);
        mo15297n(mo15473d);
        return mo15473d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C5987m1 m15296m() {
        return new C5987m1(this);
    }

    /* renamed from: n */
    void mo15297n(int i10) {
        throw new UnsupportedOperationException();
    }
}
