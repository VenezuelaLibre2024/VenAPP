package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.google.firebase.messaging.g0 */
/* loaded from: classes.dex */
public class C6227g0 implements Closeable {

    /* renamed from: a */
    private final URL f13325a;

    /* renamed from: b */
    private volatile Future<?> f13326b;

    /* renamed from: c */
    private Task<Bitmap> f13327c;

    private C6227g0(URL url) {
        this.f13325a = url;
    }

    /* renamed from: e */
    private byte[] m17023e() {
        URLConnection openConnection = this.f13325a.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] m16940d = C6211b.m16940d(C6211b.m16938b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + m16940d.length + " bytes from " + this.f13325a);
            }
            if (m16940d.length <= 1048576) {
                return m16940d;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* renamed from: f */
    public static C6227g0 m17024f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C6227g0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m17025i(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(m17026b());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* renamed from: b */
    public Bitmap m17026b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f13325a);
        }
        byte[] m17023e = m17023e();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m17023e, 0, m17023e.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f13325a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f13325a);
        }
        return decodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f13326b.cancel(true);
    }

    /* renamed from: g */
    public Task<Bitmap> m17027g() {
        return (Task) C5276s.m13324j(this.f13327c);
    }

    /* renamed from: j */
    public void m17028j(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13326b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.f0
            @Override // java.lang.Runnable
            public final void run() {
                C6227g0.this.m17025i(taskCompletionSource);
            }
        });
        this.f13327c = taskCompletionSource.getTask();
    }
}
