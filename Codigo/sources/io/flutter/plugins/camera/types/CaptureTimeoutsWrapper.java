package io.flutter.plugins.camera.types;

/* loaded from: classes3.dex */
public class CaptureTimeoutsWrapper {
    private Timeout preCaptureFocusing;
    private final long preCaptureFocusingTimeoutMs;
    private Timeout preCaptureMetering;
    private final long preCaptureMeteringTimeoutMs;

    public CaptureTimeoutsWrapper(long j10, long j11) {
        this.preCaptureFocusingTimeoutMs = j10;
        this.preCaptureMeteringTimeoutMs = j11;
        this.preCaptureFocusing = Timeout.create(j10);
        this.preCaptureMetering = Timeout.create(j11);
    }

    public Timeout getPreCaptureFocusing() {
        return this.preCaptureFocusing;
    }

    public Timeout getPreCaptureMetering() {
        return this.preCaptureMetering;
    }

    public void reset() {
        this.preCaptureFocusing = Timeout.create(this.preCaptureFocusingTimeoutMs);
        this.preCaptureMetering = Timeout.create(this.preCaptureMeteringTimeoutMs);
    }
}
