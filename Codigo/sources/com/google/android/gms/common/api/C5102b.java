package com.google.android.gms.common.api;

/* renamed from: com.google.android.gms.common.api.b */
/* loaded from: classes.dex */
public class C5102b extends Exception {

    @Deprecated
    protected final Status mStatus;

    public C5102b(Status status) {
        super(status.m12969v1() + ": " + (status.m12970w1() != null ? status.m12970w1() : ""));
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.m12969v1();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.m12970w1();
    }
}
