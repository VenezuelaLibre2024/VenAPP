package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.WY */
/* loaded from: assets/audience_network.dex */
public final class C4201WY extends DownloadAction {
    public static byte[] A01;
    public static String[] A02 = {"46KZlysh", "v5JbI1zn9NtFmtUSNw1LX8qgRoLlRTf2", "7hsTeREa3OQkhlUjYSFE7Yjn3OMopZtq", "bIH7uFzN8pwIBPvvAc6jvDp34yKHOPZU", "2wsaknzvnlzVc88IfTqAZxXmGFxrjXmK", "D0CHBscM", "uBnM1bOV2oDm3jLZQVjZSmaYperPVq3J", "bW98koNIZcc09K7QNnn8hDaxiQx7kOVn"};
    public static final DownloadAction.Deserializer A03;
    public final String A00;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].charAt(4) != strArr[4].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "QG69phFI";
            strArr2[0] = "e1bZ87VO";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 84);
            i13++;
        }
    }

    public static void A06() {
        A01 = new byte[]{20, 22, 11, 3, 22, 1, 23, 23, 13, 18, 1};
    }

    static {
        A06();
        A03 = new C4202WZ(A05(0, 11, 48), 0);
    }

    public C4201WY(Uri uri, boolean z10, byte[] bArr, String str) {
        super(A05(0, 11, 48), 0, uri, z10, bArr);
        this.A00 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C4200WX A07(C3084EL c3084el) {
        return new C4200WX(this.A01, this.A00, c3084el);
    }

    private String A04() {
        String str = this.A00;
        return str != null ? str : AbstractC3271HQ.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final void A08(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        boolean z10 = this.A00 != null;
        dataOutputStream.writeBoolean(z10);
        if (A02[2].charAt(20) == 'J') {
            throw new RuntimeException();
        }
        A02[6] = "acUvI36WXCZycPiwDJpirJRaYqE7nyij";
        if (z10) {
            dataOutputStream.writeUTF(this.A00);
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean A09(DownloadAction downloadAction) {
        return (downloadAction instanceof C4201WY) && A04().equals(((C4201WY) downloadAction).A04());
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return AbstractC3322IF.A0g(this.A00, ((C4201WY) obj).A00);
        }
        if (A02[6].charAt(28) == 'H') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[1] = "v5mwaZUoOiBJC9mXljSIGj8i3GxyffA1";
        strArr[3] = "RcK60WiDeUlnnWyZ6eoupL9HUr6ECWiO";
        return true;
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final int hashCode() {
        int result = super.hashCode();
        int i10 = result * 31;
        String str = this.A00;
        int result2 = str != null ? str.hashCode() : 0;
        return i10 + result2;
    }
}
