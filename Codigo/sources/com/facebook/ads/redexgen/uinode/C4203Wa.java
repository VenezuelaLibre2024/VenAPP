package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.Wa */
/* loaded from: assets/audience_network.dex */
public final class C4203Wa implements InterfaceC3039DW {
    public C3318IB A00;
    public final C3306Hz A02 = new C3306Hz();
    public final C3305Hy A01 = new C3305Hy();

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3039DW
    public final Metadata A51(C3066E3 c3066e3) throws AbstractC3040DX {
        if (this.A00 == null || c3066e3.A00 != this.A00.A05()) {
            C3318IB c3318ib = new C3318IB(((C4279Xr) c3066e3).A00);
            this.A00 = c3318ib;
            c3318ib.A06(((C4279Xr) c3066e3).A00 - c3066e3.A00);
        }
        ByteBuffer buffer = c3066e3.A01;
        byte[] array = buffer.array();
        int limit = buffer.limit();
        this.A02.A0b(array, limit);
        this.A01.A0C(array, limit);
        this.A01.A08(39);
        long A04 = (this.A01.A04(1) << 32) | this.A01.A04(32);
        this.A01.A08(20);
        int spliceCommandType = this.A01.A04(12);
        long ptsAdjustment = this.A01.A04(8);
        Metadata.Entry entry = null;
        this.A02.A0Z(14);
        switch (ptsAdjustment) {
            case 0:
                entry = new SpliceNullCommand();
                break;
            case 4:
                entry = SpliceScheduleCommand.A00(this.A02);
                break;
            case 5:
                entry = SpliceInsertCommand.A00(this.A02, A04, this.A00);
                break;
            case 6:
                entry = TimeSignalCommand.A01(this.A02, A04, this.A00);
                break;
            case 255:
                entry = PrivateCommand.A00(this.A02, spliceCommandType, A04);
                break;
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}
