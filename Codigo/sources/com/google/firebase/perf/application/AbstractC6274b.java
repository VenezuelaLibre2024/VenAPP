package com.google.firebase.perf.application;

import com.google.firebase.perf.application.C6273a;
import java.lang.ref.WeakReference;
import p444xe.EnumC12471d;

/* renamed from: com.google.firebase.perf.application.b */
/* loaded from: classes.dex */
public abstract class AbstractC6274b implements C6273a.b {
    private final WeakReference<C6273a.b> appStateCallback;
    private final C6273a appStateMonitor;
    private EnumC12471d currentAppState;
    private boolean isRegisteredForAppState;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6274b() {
        this(C6273a.m17226b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6274b(C6273a c6273a) {
        this.isRegisteredForAppState = false;
        this.currentAppState = EnumC12471d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = c6273a;
        this.appStateCallback = new WeakReference<>(this);
    }

    public EnumC12471d getAppState() {
        return this.currentAppState;
    }

    public WeakReference<C6273a.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void incrementTsnsCount(int i10) {
        this.appStateMonitor.m17236e(i10);
    }

    @Override // com.google.firebase.perf.application.C6273a.b
    public void onUpdateAppState(EnumC12471d enumC12471d) {
        EnumC12471d enumC12471d2 = this.currentAppState;
        EnumC12471d enumC12471d3 = EnumC12471d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (enumC12471d2 != enumC12471d3) {
            if (enumC12471d2 == enumC12471d || enumC12471d == enumC12471d3) {
                return;
            } else {
                enumC12471d = EnumC12471d.FOREGROUND_BACKGROUND;
            }
        }
        this.currentAppState = enumC12471d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.m17234a();
        this.appStateMonitor.m17241k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.m17242p(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }
}
