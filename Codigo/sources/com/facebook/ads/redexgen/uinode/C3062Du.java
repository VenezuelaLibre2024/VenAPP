package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Du */
/* loaded from: assets/audience_network.dex */
public final class C3062Du {
    public static String[] A0B = {"WSNeg6N0n7AIShfXSzX5HQmTc8kFkZEc", "6rZRvoV62oNyzf", "F27AMpNiqyccCa5EB6sKY7eKfEMSqhrd", "FVKbL9f5FAHwz7hiZMN0u1v1YdCbdeYK", "vVfLkZocD1NxPHhP9fXAXrt0GsgaX4xN", "cFmUa63iy9OAJJOa0jT7jB1cdvdJ4hQa", "2QFrNOOxadMtahUuhILPt16xKsmCtJsL", "J"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C3061Dt> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3062Du A02(C3306Hz c3306Hz) {
        long A0M = c3306Hz.A0M();
        boolean z10 = (c3306Hz.A0E() & RecognitionOptions.ITF) != 0;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z13 = false;
        long j10 = -9223372036854775807L;
        if (!z10) {
            int A0E = c3306Hz.A0E();
            z11 = (A0E & RecognitionOptions.ITF) != 0;
            z12 = (A0E & 64) != 0;
            if (A0B[7].length() != 1) {
                throw new RuntimeException();
            }
            A0B[1] = "02B3CRg7kTq01s";
            boolean z14 = (A0E & 32) != 0;
            r14 = z12 ? c3306Hz.A0M() : -9223372036854775807L;
            if (!z12) {
                int A0E2 = c3306Hz.A0E();
                arrayList = new ArrayList(A0E2);
                for (int i13 = 0; i13 < A0E2; i13++) {
                    arrayList.add(new C3061Dt(c3306Hz.A0E(), c3306Hz.A0M(), null));
                }
                String[] strArr = A0B;
                if (strArr[0].charAt(5) == strArr[5].charAt(5)) {
                    A0B[1] = "Wfp3iGqyia9VmI";
                }
            }
            if (z14) {
                long A0E3 = c3306Hz.A0E();
                z13 = (128 & A0E3) != 0;
                j10 = (1000 * (((1 & A0E3) << 32) | c3306Hz.A0M())) / 90;
            }
            i10 = c3306Hz.A0I();
            i11 = c3306Hz.A0E();
            i12 = c3306Hz.A0E();
        }
        return new C3062Du(A0M, z10, z11, z12, arrayList, r14, z13, j10, i10, i11, i12);
    }

    public C3062Du(long j10, boolean z10, boolean z11, boolean z12, List<C3061Dt> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.A04 = j10;
        this.A0A = z10;
        this.A08 = z11;
        this.A09 = z12;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j11;
        this.A07 = z13;
        this.A03 = j12;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public C3062Du(Parcel parcel) {
        C3061Dt A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            A00 = C3061Dt.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static C3062Du A00(Parcel parcel) {
        return new C3062Du(parcel);
    }

    public static /* synthetic */ C3062Du A01(Parcel parcel) {
        return A00(parcel);
    }

    public static /* synthetic */ C3062Du A03(C3306Hz c3306Hz) {
        return A02(c3306Hz);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A02(parcel);
        }
        parcel.writeLong(this.A05);
        byte b10 = this.A07 ? (byte) 1 : (byte) 0;
        if (A0B[1].length() != 14) {
            throw new RuntimeException();
        }
        A0B[1] = "FoD8YYsiaA11j5";
        parcel.writeByte(b10);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public static /* synthetic */ void A05(C3062Du c3062Du, Parcel parcel) {
        c3062Du.A04(parcel);
    }
}
