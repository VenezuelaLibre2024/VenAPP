package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wf */
/* loaded from: assets/audience_network.dex */
public final class C1340Wf implements DW {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.DW
    public final Metadata A51(E3 e32) {
        ByteBuffer byteBuffer = e32.A01;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C0980Hz c0980Hz = new C0980Hz(array, limit);
        String A0Q = c0980Hz.A0Q();
        String A0Q2 = c0980Hz.A0Q();
        long A0M = c0980Hz.A0M();
        return new Metadata(new EventMessage(A0Q, A0Q2, IF.A0F(c0980Hz.A0M(), 1000L, A0M), c0980Hz.A0M(), Arrays.copyOfRange(array, c0980Hz.A06(), limit), IF.A0F(c0980Hz.A0M(), 1000000L, A0M)));
    }
}
