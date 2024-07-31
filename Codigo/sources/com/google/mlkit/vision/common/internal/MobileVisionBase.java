package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.f;
import androidx.lifecycle.j;
import androidx.lifecycle.t;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.sdkinternal.f;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, j {

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.android.gms.common.internal.j f13139f = new com.google.android.gms.common.internal.j("MobileVisionBase", "");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f13140r = 0;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f13141a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final f f13142b;

    /* renamed from: c, reason: collision with root package name */
    private final CancellationTokenSource f13143c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f13144d;

    /* renamed from: e, reason: collision with root package name */
    private final Task f13145e;

    public MobileVisionBase(f<DetectionResultT, ag.a> fVar, Executor executor) {
        this.f13142b = fVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f13143c = cancellationTokenSource;
        this.f13144d = executor;
        fVar.c();
        this.f13145e = fVar.a(executor, new Callable() { // from class: bg.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = MobileVisionBase.f13140r;
                return null;
            }
        }, cancellationTokenSource.getToken()).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.vision.common.internal.c
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                MobileVisionBase.f13139f.d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    public synchronized Task<DetectionResultT> b(final ag.a aVar) {
        s.k(aVar, "InputImage can not be null");
        if (this.f13141a.get()) {
            return Tasks.forException(new qf.a("This detector is already closed!", 14));
        }
        if (aVar.k() < 32 || aVar.g() < 32) {
            return Tasks.forException(new qf.a("InputImage width and height should be at least 32!", 3));
        }
        return this.f13142b.a(this.f13144d, new Callable() { // from class: com.google.mlkit.vision.common.internal.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return MobileVisionBase.this.e(aVar);
            }
        }, this.f13143c.getToken());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, vf.a
    @t(f.a.ON_DESTROY)
    public synchronized void close() {
        if (this.f13141a.getAndSet(true)) {
            return;
        }
        this.f13143c.cancel();
        this.f13142b.e(this.f13144d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object e(ag.a aVar) {
        zzlx zze = zzlx.zze("detectorTaskWithResource#run");
        zze.zzb();
        try {
            Object i10 = this.f13142b.i(aVar);
            zze.close();
            return i10;
        } catch (Throwable th2) {
            try {
                zze.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }
}
