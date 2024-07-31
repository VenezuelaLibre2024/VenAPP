package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Ka */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3462Ka {
    public static String[] A00 = {"XnOcKNlJJ8CDQQR", "VGhv6FkZrITxQRu9gbMUemqcetkh7B5f", "vVz2BTpV32jHfI", "d8hV", "Sy49NQqrKXgvTEWwSBtXX6HecYQBIBGU", "Db46iG0BOxvexN4G9aNEWNZ9mU0XJx13", "mKukGrwwCcIhJco4KmzrvmgYUSCtT5hL", "T8hiTRn5Amgadg81lccjSSIUWb1StHzV"};
    public static final AtomicReference<InterfaceC3461KZ> A01 = new AtomicReference<>(null);

    public static InterfaceC3461KZ A00() {
        InterfaceC3461KZ interfaceC3461KZ = A01.get();
        if (A00[5].charAt(26) != '0') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[7] = "JAkiPTeS8Sgp4wJmZ2cE1Xuhf0WoAHfE";
        strArr[4] = "TWyum6rZOmg61QmMcVNeRxvFtffIUfDC";
        if (interfaceC3461KZ == null) {
            InterfaceC3461KZ errorLogger = new C4092Un();
            return errorLogger;
        }
        return interfaceC3461KZ;
    }

    public static void A01(InterfaceC3461KZ interfaceC3461KZ) {
        A01.set(interfaceC3461KZ);
    }
}
