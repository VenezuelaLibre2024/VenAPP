package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.4q */
/* loaded from: assets/audience_network.dex */
public final class C25324q extends C2963C5 implements Comparable<C25324q> {
    public static String[] A01 = {"vLCiYmslEIO8pJY4aanHdZ7QImU9IQkS", "qKFqw4ir5U7ZeqBFISN4Zo", "jSoy0i9dh5CIlqD3dL3njwneSWVMxCrT", "BKJrnveI01f5DMln9XIqip", "hfsDVMr2hJ3AGnbNzVU4gQALPe", "leKVUsav6grkPqjsrOtcGAgCR95imu9O", "O7i9KhUKrr", "K8BeTV5Og7G1zujvrlQB8lJ7v8"};
    public long A00;

    public C25324q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C25324q c25324q) {
        if (A04() != c25324q.A04()) {
            return A04() ? 1 : -1;
        }
        long j10 = ((C4279Xr) this).A00 - ((C4279Xr) c25324q).A00;
        if (j10 == 0) {
            long j11 = this.A00;
            long j12 = c25324q.A00;
            if (A01[0].charAt(21) != 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "YA5mbgM7zSdIgspcc6jY8TfuEeXD2Ehe";
            strArr[2] = "tQeim9pVy3EkTEWbzOifosISYdgikQjr";
            j10 = j11 - j12;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
