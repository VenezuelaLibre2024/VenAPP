package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.redexgen.X.Lz */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3547Lz {
    public static final int A00;
    public static final ExecutorService A01;
    public static volatile boolean A02;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        A00 = availableProcessors;
        A01 = Executors.newFixedThreadPool(availableProcessors);
        A02 = true;
    }
}
