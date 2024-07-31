package p064dd;

import java.util.HashMap;

/* renamed from: dd.c */
/* loaded from: classes.dex */
public class C6885c implements InterfaceC6886d {

    /* renamed from: a */
    private final int f15235a;

    public C6885c(int i10) {
        this.f15235a = i10;
    }

    /* renamed from: b */
    private static boolean m19867b(StackTraceElement[] stackTraceElementArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i11 + i12 > stackTraceElementArr.length) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!stackTraceElementArr[i10 + i13].equals(stackTraceElementArr[i11 + i13])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static StackTraceElement[] m19868c(StackTraceElement[] stackTraceElementArr, int i10) {
        int i11;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i12 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i12];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num == null || !m19867b(stackTraceElementArr, num.intValue(), i12)) {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i14 = 1;
                i11 = i12;
            } else {
                int intValue = i12 - num.intValue();
                if (i14 < i10) {
                    System.arraycopy(stackTraceElementArr, i12, stackTraceElementArr2, i13, intValue);
                    i13 += intValue;
                    i14++;
                }
                i11 = (intValue - 1) + i12;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i12));
            i12 = i11 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i13];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i13);
        return stackTraceElementArr3;
    }

    @Override // p064dd.InterfaceC6886d
    /* renamed from: a */
    public StackTraceElement[] mo19866a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] m19868c = m19868c(stackTraceElementArr, this.f15235a);
        return m19868c.length < stackTraceElementArr.length ? m19868c : stackTraceElementArr;
    }
}
