package p152i4;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.C4634n0;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;

/* renamed from: i4.l0 */
/* loaded from: classes.dex */
public class AsyncTaskC7813l0 extends AsyncTask<Void, Void, List<? extends C7817n0>> {

    /* renamed from: d */
    public static final a f18717d = new a(null);

    /* renamed from: e */
    private static final String f18718e = AsyncTaskC7813l0.class.getCanonicalName();

    /* renamed from: a */
    private final HttpURLConnection f18719a;

    /* renamed from: b */
    private final C7815m0 f18720b;

    /* renamed from: c */
    private Exception f18721c;

    /* renamed from: i4.l0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC7813l0(C7815m0 requests) {
        this(null, requests);
        C9322n.m27781e(requests, "requests");
    }

    public AsyncTaskC7813l0(HttpURLConnection httpURLConnection, C7815m0 requests) {
        C9322n.m27781e(requests, "requests");
        this.f18719a = httpURLConnection;
        this.f18720b = requests;
    }

    /* renamed from: a */
    public List<C7817n0> m24033a(Void... params) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            if (C0033a.m107d(this)) {
                return null;
            }
            try {
                if (C0033a.m107d(this)) {
                    return null;
                }
                try {
                    C9322n.m27781e(params, "params");
                    try {
                        HttpURLConnection httpURLConnection = this.f18719a;
                        return httpURLConnection == null ? this.f18720b.m24045k() : C7807i0.f18658n.m24000o(httpURLConnection, this.f18720b);
                    } catch (Exception e10) {
                        this.f18721c = e10;
                        return null;
                    }
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
                return null;
            }
        } catch (Throwable th4) {
            C0033a.m105b(th4, this);
            return null;
        }
    }

    /* renamed from: b */
    protected void m24034b(List<C7817n0> result) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                if (C0033a.m107d(this)) {
                    return;
                }
                try {
                    C9322n.m27781e(result, "result");
                    super.onPostExecute(result);
                    Exception exc = this.f18721c;
                    if (exc != null) {
                        C4634n0 c4634n0 = C4634n0.f8760a;
                        String str = f18718e;
                        C9308a0 c9308a0 = C9308a0.f22565a;
                        String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
                        C4634n0.m11314k0(str, format);
                    }
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
            }
        } catch (Throwable th4) {
            C0033a.m105b(th4, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends C7817n0> doInBackground(Void[] voidArr) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            if (C0033a.m107d(this)) {
                return null;
            }
            try {
                if (C0033a.m107d(this)) {
                    return null;
                }
                try {
                    return m24033a(voidArr);
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
                return null;
            }
        } catch (Throwable th4) {
            C0033a.m105b(th4, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends C7817n0> list) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                if (C0033a.m107d(this)) {
                    return;
                }
                try {
                    m24034b(list);
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
            }
        } catch (Throwable th4) {
            C0033a.m105b(th4, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                if (C0033a.m107d(this)) {
                    return;
                }
                try {
                    super.onPreExecute();
                    if (C7799e0.m23831D()) {
                        C4634n0 c4634n0 = C4634n0.f8760a;
                        String str = f18718e;
                        C9308a0 c9308a0 = C9308a0.f22565a;
                        String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
                        C4634n0.m11314k0(str, format);
                    }
                    if (this.f18720b.m24049q() == null) {
                        this.f18720b.m24040D(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
                    }
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
            }
        } catch (Throwable th4) {
            C0033a.m105b(th4, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f18719a + ", requests: " + this.f18720b + "}";
        C9322n.m27780d(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
