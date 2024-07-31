package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wf */
/* loaded from: assets/audience_network.dex */
public final class C4206Wf implements InterfaceC3039DW {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3039DW
    public final Metadata A51(C3066E3 c3066e3) {
        ByteBuffer byteBuffer = c3066e3.A01;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C3306Hz c3306Hz = new C3306Hz(array, limit);
        String A0Q = c3306Hz.A0Q();
        String A0Q2 = c3306Hz.A0Q();
        long A0M = c3306Hz.A0M();
        return new Metadata(new EventMessage(A0Q, A0Q2, AbstractC3322IF.A0F(c3306Hz.A0M(), 1000L, A0M), c3306Hz.A0M(), Arrays.copyOfRange(array, c3306Hz.A06(), limit), AbstractC3322IF.A0F(c3306Hz.A0M(), 1000000L, A0M)));
    }
}
