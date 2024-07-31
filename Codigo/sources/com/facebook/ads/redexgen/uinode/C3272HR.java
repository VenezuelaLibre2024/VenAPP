package com.facebook.ads.redexgen.uinode;

import com.google.android.gms.common.api.C5101a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.HR */
/* loaded from: assets/audience_network.dex */
public final class C3272HR {
    public static byte[] A05;
    public static String[] A06 = {"j9EfDvchdu1KqySqOAnBSG3JWHZdS12U", "q23SQ5AypNqS8oaKOX4z", "zGl30nZzPzoLIdVG6oXXe73jwI6SvYzS", "XO0PMOb8qpQh9emdWW7Vnqfuo5cp8yJy", "hg0Ynef21ksm7drJYvbGXc6C6VdsLqYq", "sq8Z8cDX36Rb5yN4ZHuInHWL1DTNPmF7", "lpBmIRRiri9NKyd9o68rlNPCbyzvIw2I", "eicGPlwUgu"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C4148Vh A00 = C4148Vh.A04;
    public final TreeSet<C4146Vf> A04 = new TreeSet<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A06[6].charAt(21) != 'N') {
                throw new RuntimeException();
            }
            A06[6] = "ipIPz5SC6v0GmkIAozZhwN70MrudeMSU";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 100);
            i13++;
        }
    }

    public static void A02() {
        byte[] bArr = {-79, -9, -14, -6, -3, -10, -11, -65, -77, 7, 2, -77, 42, 61, 70, 57, 69, 65, 70, 63, -8, 71, 62, -8};
        String[] strArr = A06;
        if (strArr[4].charAt(2) != strArr[3].charAt(2)) {
            throw new RuntimeException();
        }
        A06[5] = "8leR2nWms8A7PmFgrtQ6nLfJYqb68GHr";
        A05 = bArr;
    }

    static {
        A02();
    }

    public C3272HR(int i10, String str) {
        this.A02 = i10;
        this.A03 = str;
    }

    public static C3272HR A00(int i10, DataInputStream dataInputStream) throws IOException {
        C3272HR c3272hr = new C3272HR(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i10 < 2) {
            long readLong = dataInputStream.readLong();
            C3277HW c3277hw = new C3277HW();
            AbstractC3276HV.A05(c3277hw, readLong);
            c3272hr.A0F(c3277hw);
        } else {
            c3272hr.A00 = C4148Vh.A00(dataInputStream);
        }
        return c3272hr;
    }

    public final int A03(int i10) {
        int result = this.A02;
        int i11 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i11 + result2;
        if (i10 < 2) {
            long A00 = AbstractC3276HV.A00(this.A00);
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j10, long j11) {
        C4146Vf A062 = A06(j10);
        if (A062.A01()) {
            return -Math.min(A062.A02() ? Long.MAX_VALUE : A062.A01, j11);
        }
        long j12 = j10 + j11;
        long j13 = A062.A02 + A062.A01;
        if (j13 < j12) {
            TreeSet<C4146Vf> treeSet = this.A04;
            if (A06[1].length() != 20) {
                throw new RuntimeException();
            }
            A06[1] = "RgZ5bXDLk5KqdLdfFSHI";
            for (C4146Vf c4146Vf : treeSet.tailSet(A062, false)) {
                if (c4146Vf.A02 > j13) {
                    break;
                }
                j13 = Math.max(j13, c4146Vf.A02 + c4146Vf.A01);
                if (j13 >= j12) {
                    break;
                }
            }
        }
        return Math.min(j13 - j10, j11);
    }

    public final C4148Vh A05() {
        return this.A00;
    }

    public final C4146Vf A06(long j10) {
        C4146Vf A01 = C4146Vf.A01(this.A03, j10);
        C4146Vf floor = this.A04.floor(A01);
        if (floor != null && floor.A02 + floor.A01 > j10) {
            return floor;
        }
        TreeSet<C4146Vf> treeSet = this.A04;
        String[] strArr = A06;
        if (strArr[2].charAt(22) != strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A06[6] = "nd2bgBSeUAsM9albd5et6NmdTACtd3AP";
        C4146Vf lookupSpan = treeSet.ceiling(A01);
        if (lookupSpan == null) {
            return C4146Vf.A02(this.A03, j10);
        }
        return C4146Vf.A03(this.A03, j10, lookupSpan.A02 - j10);
    }

    public final C4146Vf A07(C4146Vf c4146Vf) throws C3263HI {
        AbstractC3281Ha.A04(this.A04.remove(c4146Vf));
        C4146Vf A08 = c4146Vf.A08(this.A02);
        if (c4146Vf.A03.renameTo(A08.A03)) {
            this.A04.add(A08);
            return A08;
        }
        throw new C3263HI(A01(12, 12, 116) + c4146Vf.A03 + A01(8, 4, 47) + A08.A03 + A01(0, 8, 45));
    }

    public final TreeSet<C4146Vf> A08() {
        return this.A04;
    }

    public final void A09(C4146Vf c4146Vf) {
        this.A04.add(c4146Vf);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z10) {
        this.A01 = z10;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(C3269HO c3269ho) {
        if (this.A04.remove(c3269ho)) {
            c3269ho.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(C3277HW c3277hw) {
        C4148Vh c4148Vh = this.A00;
        C4148Vh oldMetadata = this.A00.A08(c3277hw);
        this.A00 = oldMetadata;
        return !oldMetadata.equals(c4148Vh);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3272HR c3272hr = (C3272HR) obj;
        if (this.A02 == c3272hr.A02 && this.A03.equals(c3272hr.A03) && this.A04.equals(c3272hr.A04) && this.A00.equals(c3272hr.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(C5101a.e.API_PRIORITY_OTHER);
        int i10 = result * 31;
        int result2 = this.A04.hashCode();
        return i10 + result2;
    }
}