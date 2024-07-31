package com.google.firebase.perf.session;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import xe.d;

@Keep
/* loaded from: classes.dex */
public class SessionManager extends b {
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<ve.b>> clients;
    private final GaugeManager gaugeManager;
    private ve.a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), ve.a.c(UUID.randomUUID().toString()), a.b());
    }

    public SessionManager(GaugeManager gaugeManager, ve.a aVar, a aVar2) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = aVar;
        this.appStateMonitor = aVar2;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    public /* synthetic */ void lambda$setApplicationContext$0(Context context, ve.a aVar) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.e()) {
            this.gaugeManager.logGaugeMetadata(aVar.h(), d.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(d dVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), dVar);
        }
    }

    private void startOrStopCollectingGauges(d dVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, dVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        d dVar = d.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    @Override // com.google.firebase.perf.application.b, com.google.firebase.perf.application.a.b
    public void onUpdateAppState(d dVar) {
        super.onUpdateAppState(dVar);
        if (this.appStateMonitor.f()) {
            return;
        }
        if (dVar == d.FOREGROUND || this.perfSession.f()) {
            updatePerfSession(ve.a.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(dVar);
        }
    }

    public final ve.a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<ve.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: ve.c

            /* renamed from: b */
            public final /* synthetic */ Context f28999b;

            /* renamed from: c */
            public final /* synthetic */ a f29000c;

            public /* synthetic */ c(Context context2, a aVar) {
                r2 = context2;
                r3 = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.this.lambda$setApplicationContext$0(r2, r3);
            }
        });
    }

    public void setPerfSession(ve.a aVar) {
        this.perfSession = aVar;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<ve.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(ve.a aVar) {
        if (aVar.h() == this.perfSession.h()) {
            return;
        }
        this.perfSession = aVar;
        synchronized (this.clients) {
            Iterator<WeakReference<ve.b>> it = this.clients.iterator();
            while (it.hasNext()) {
                ve.b bVar = it.next().get();
                if (bVar != null) {
                    bVar.a(aVar);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.a());
        startOrStopCollectingGauges(this.appStateMonitor.a());
    }
}
