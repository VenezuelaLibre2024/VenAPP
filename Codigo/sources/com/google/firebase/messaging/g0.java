package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
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

/* loaded from: classes.dex */
public class g0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f12110a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Future<?> f12111b;

    /* renamed from: c, reason: collision with root package name */
    private Task<Bitmap> f12112c;

    private g0(URL url) {
        this.f12110a = url;
    }

    private byte[] e() {
        URLConnection openConnection = this.f12110a.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] d10 = b.d(b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + d10.length + " bytes from " + this.f12110a);
            }
            if (d10.length <= 1048576) {
                return d10;
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

    public static g0 f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new g0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(b());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f12110a);
        }
        byte[] e10 = e();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(e10, 0, e10.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f12110a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f12110a);
        }
        return decodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12111b.cancel(true);
    }

    public Task<Bitmap> g() {
        return (Task) com.google.android.gms.common.internal.s.j(this.f12112c);
    }

    public void j(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12111b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.f0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.i(taskCompletionSource);
            }
        });
        this.f12112c = taskCompletionSource.getTask();
    }
}
