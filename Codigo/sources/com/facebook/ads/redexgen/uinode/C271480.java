package com.facebook.ads.redexgen.uinode;

import android.os.Process;
import android.text.TextUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.80 */
/* loaded from: assets/audience_network.dex */
public final class C271480 implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C4336Ym A00;
    public final InterfaceC272187 A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, 28, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, 11, 7, 5, 70, 14, 9, 11, 13, 10, 7, 7, 3, 70, 9, 12, 27, 71, 86, 69, 87, 76, 20, 18, 5, 19, 30, 23, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public C271480(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C4336Ym c4336Ym, InterfaceC27137z interfaceC27137z) {
        this(uncaughtExceptionHandler, c4336Ym, interfaceC27137z, AbstractC272288.A00());
    }

    public C271480(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C4336Ym c4336Ym, InterfaceC27137z interfaceC27137z, InterfaceC272187 interfaceC272187) {
        this.A02 = uncaughtExceptionHandler;
        if (c4336Ym != null) {
            this.A00 = c4336Ym;
            this.A03 = interfaceC27137z.A7z(c4336Ym);
            this.A01 = interfaceC272187;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            String A03 = AbstractC3518LW.A03(this.A00, th2);
            if (!TextUtils.isEmpty(A03)) {
                String stackTraceString = A00(17, 16, 41);
                if (A03.contains(stackTraceString)) {
                    Map<String, String> A02 = new C27127y(A03, this.A03).A02();
                    String A00 = A00(38, 7, 38);
                    String stackTraceString2 = A00(33, 5, 101);
                    A02.put(A00, stackTraceString2);
                    Throwable A002 = AbstractRunnableC3442KG.A00();
                    String A003 = A00(45, 12, 98);
                    if (A002 == th2) {
                        String stackTraceString3 = A00(1, 1, 108);
                        A02.put(A003, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(0, 1, 91);
                        A02.put(A003, stackTraceString4);
                    }
                    this.A01.AHF(new C27288E(this.A00.A08().A01(), this.A00.A08().A02(), A02), this.A00);
                    if (C3348Ih.A1h(this.A00)) {
                        C3348Ih.A0a(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th2);
    }
}
