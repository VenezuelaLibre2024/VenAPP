package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.AbstractC0171a;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0171a<MessageType, BuilderType>> implements r0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0171a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0171a<MessageType, BuilderType>> implements r0.a {
        public static m1 l(r0 r0Var) {
            return new m1(r0Var);
        }

        protected abstract BuilderType j(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.r0.a
        /* renamed from: k */
        public BuilderType Y0(r0 r0Var) {
            if (e().getClass().isInstance(r0Var)) {
                return (BuilderType) j((a) r0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String l(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public h b() {
        try {
            h.C0172h r10 = h.r(c());
            i(r10.b());
            return r10.a();
        } catch (IOException e10) {
            throw new RuntimeException(l("ByteString"), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public byte[] h() {
        try {
            byte[] bArr = new byte[c()];
            k c02 = k.c0(bArr);
            i(c02);
            c02.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(l("byte array"), e10);
        }
    }

    int j() {
        throw new UnsupportedOperationException();
    }

    public int k(g1 g1Var) {
        int j10 = j();
        if (j10 != -1) {
            return j10;
        }
        int d10 = g1Var.d(this);
        n(d10);
        return d10;
    }

    public m1 m() {
        return new m1(this);
    }

    void n(int i10) {
        throw new UnsupportedOperationException();
    }
}
