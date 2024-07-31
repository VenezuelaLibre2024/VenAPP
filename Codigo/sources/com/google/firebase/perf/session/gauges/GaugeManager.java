package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import pc.w;
import xe.g;

@Keep
/* loaded from: classes.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private xe.d applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final w<c> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final w<ScheduledExecutorService> gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final w<l> memoryGaugeCollector;
    private String sessionId;
    private final we.k transportManager;
    private static final re.a logger = re.a.e();
    private static final GaugeManager instance = new GaugeManager();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12328a;

        static {
            int[] iArr = new int[xe.d.values().length];
            f12328a = iArr;
            try {
                iArr[xe.d.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12328a[xe.d.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private GaugeManager() {
        this(new w(new ee.b() { // from class: com.google.firebase.perf.session.gauges.f
            @Override // ee.b
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), we.k.k(), com.google.firebase.perf.config.a.g(), null, new w(new ee.b() { // from class: com.google.firebase.perf.session.gauges.g
            @Override // ee.b
            public final Object get() {
                c lambda$new$0;
                lambda$new$0 = GaugeManager.lambda$new$0();
                return lambda$new$0;
            }
        }), new w(new ee.b() { // from class: com.google.firebase.perf.session.gauges.h
            @Override // ee.b
            public final Object get() {
                l lambda$new$1;
                lambda$new$1 = GaugeManager.lambda$new$1();
                return lambda$new$1;
            }
        }));
    }

    GaugeManager(w<ScheduledExecutorService> wVar, we.k kVar, com.google.firebase.perf.config.a aVar, i iVar, w<c> wVar2, w<l> wVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = xe.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = wVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = wVar2;
        this.memoryGaugeCollector = wVar3;
    }

    private static void collectGaugeMetricOnce(c cVar, l lVar, com.google.firebase.perf.util.l lVar2) {
        cVar.c(lVar2);
        lVar.c(lVar2);
    }

    private long getCpuGaugeCollectionFrequencyMs(xe.d dVar) {
        int i10 = a.f12328a[dVar.ordinal()];
        long z10 = i10 != 1 ? i10 != 2 ? -1L : this.configResolver.z() : this.configResolver.y();
        return c.f(z10) ? INVALID_GAUGE_COLLECTION_FREQUENCY : z10;
    }

    private xe.f getGaugeMetadata() {
        return xe.f.h0().I(this.gaugeMetadataManager.a()).J(this.gaugeMetadataManager.b()).K(this.gaugeMetadataManager.c()).build();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(xe.d dVar) {
        int i10 = a.f12328a[dVar.ordinal()];
        long C = i10 != 1 ? i10 != 2 ? -1L : this.configResolver.C() : this.configResolver.B();
        return l.e(C) ? INVALID_GAUGE_COLLECTION_FREQUENCY : C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$new$0() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l lambda$new$1() {
        return new l();
    }

    private boolean startCollectingCpuMetrics(long j10, com.google.firebase.perf.util.l lVar) {
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().k(j10, lVar);
        return true;
    }

    private long startCollectingGauges(xe.d dVar, com.google.firebase.perf.util.l lVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, lVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(dVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, lVar) ? cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }

    private boolean startCollectingMemoryMetrics(long j10, com.google.firebase.perf.util.l lVar) {
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().j(j10, lVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, xe.d dVar) {
        g.b q02 = xe.g.q0();
        while (!this.cpuGaugeCollector.get().f12335a.isEmpty()) {
            q02.J(this.cpuGaugeCollector.get().f12335a.poll());
        }
        while (!this.memoryGaugeCollector.get().f12358b.isEmpty()) {
            q02.I(this.memoryGaugeCollector.get().f12358b.poll());
        }
        q02.L(str);
        this.transportManager.A(q02.build(), dVar);
    }

    public void collectGaugeMetricOnce(com.google.firebase.perf.util.l lVar) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), lVar);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String str, xe.d dVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.A(xe.g.q0().L(str).K(getGaugeMetadata()).build(), dVar);
        return true;
    }

    public void startCollectingGauges(ve.a aVar, final xe.d dVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(dVar, aVar.d());
        if (startCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String h10 = aVar.h();
        this.sessionId = h10;
        this.applicationProcessState = dVar;
        try {
            long j10 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.e
                @Override // java.lang.Runnable
                public final void run() {
                    GaugeManager.this.lambda$startCollectingGauges$2(h10, dVar);
                }
            }, j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.j("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final xe.d dVar = this.applicationProcessState;
        this.cpuGaugeCollector.get().l();
        this.memoryGaugeCollector.get().k();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.d
            @Override // java.lang.Runnable
            public final void run() {
                GaugeManager.this.lambda$stopCollectingGauges$3(str, dVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = xe.d.APPLICATION_PROCESS_STATE_UNKNOWN;
    }
}
