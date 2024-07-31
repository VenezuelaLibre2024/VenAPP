package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class WZ extends DownloadAction.Deserializer {
    public WZ(String str, int i10) {
        super(str, i10);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer
    /* renamed from: A00 */
    public final WY A01(int i10, DataInputStream dataInputStream) throws IOException {
        Uri parse = Uri.parse(dataInputStream.readUTF());
        boolean readBoolean = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        return new WY(parse, readBoolean, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
    }
}
