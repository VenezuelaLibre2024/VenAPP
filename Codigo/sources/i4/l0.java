package i4;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class l0 extends AsyncTask<Void, Void, List<? extends n0>> {

    /* renamed from: d */
    public static final a f17058d = new a(null);

    /* renamed from: e */
    private static final String f17059e = l0.class.getCanonicalName();

    /* renamed from: a */
    private final HttpURLConnection f17060a;

    /* renamed from: b */
    private final m0 f17061b;

    /* renamed from: c */
    private Exception f17062c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(m0 requests) {
        this(null, requests);
        kotlin.jvm.internal.n.e(requests, "requests");
    }

    public l0(HttpURLConnection httpURLConnection, m0 requests) {
        kotlin.jvm.internal.n.e(requests, "requests");
        this.f17060a = httpURLConnection;
        this.f17061b = requests;
    }

    public List<n0> a(Void... params) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            if (a5.a.d(this)) {
                return null;
            }
            try {
                if (a5.a.d(this)) {
                    return null;
                }
                try {
                    kotlin.jvm.internal.n.e(params, "params");
                    try {
                        HttpURLConnection httpURLConnection = this.f17060a;
                        return httpURLConnection == null ? this.f17061b.k() : i0.f17005n.o(httpURLConnection, this.f17061b);
                    } catch (Exception e10) {
                        this.f17062c = e10;
                        return null;
                    }
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
                return null;
            }
        } catch (Throwable th4) {
            a5.a.b(th4, this);
            return null;
        }
    }

    protected void b(List<n0> result) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (a5.a.d(this)) {
                return;
            }
            try {
                if (a5.a.d(this)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.n.e(result, "result");
                    super.onPostExecute(result);
                    Exception exc = this.f17062c;
                    if (exc != null) {
                        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                        String str = f17059e;
                        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                        String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
                        com.facebook.internal.n0.k0(str, format);
                    }
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
            }
        } catch (Throwable th4) {
            a5.a.b(th4, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends n0> doInBackground(Void[] voidArr) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            if (a5.a.d(this)) {
                return null;
            }
            try {
                if (a5.a.d(this)) {
                    return null;
                }
                try {
                    return a(voidArr);
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
                return null;
            }
        } catch (Throwable th4) {
            a5.a.b(th4, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends n0> list) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (a5.a.d(this)) {
                return;
            }
            try {
                if (a5.a.d(this)) {
                    return;
                }
                try {
                    b(list);
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
            }
        } catch (Throwable th4) {
            a5.a.b(th4, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (a5.a.d(this)) {
                return;
            }
            try {
                if (a5.a.d(this)) {
                    return;
                }
                try {
                    super.onPreExecute();
                    if (e0.D()) {
                        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                        String str = f17059e;
                        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                        String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
                        com.facebook.internal.n0.k0(str, format);
                    }
                    if (this.f17061b.q() == null) {
                        this.f17061b.D(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
                    }
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
            }
        } catch (Throwable th4) {
            a5.a.b(th4, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f17060a + ", requests: " + this.f17061b + "}";
        kotlin.jvm.internal.n.d(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
