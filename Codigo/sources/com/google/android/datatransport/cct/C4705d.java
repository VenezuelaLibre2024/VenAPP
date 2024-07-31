package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.ads.AdError;
import com.google.android.datatransport.cct.C4705d;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p098f6.C7298b;
import p118g6.AbstractC7449a;
import p118g6.AbstractC7458j;
import p118g6.AbstractC7459k;
import p118g6.AbstractC7460l;
import p118g6.AbstractC7461m;
import p118g6.AbstractC7462n;
import p118g6.AbstractC7463o;
import p118g6.EnumC7464p;
import p132h6.AbstractC7639i;
import p132h6.C7638h;
import p154i6.AbstractC7854f;
import p154i6.AbstractC7855g;
import p154i6.InterfaceC7861m;
import p181jd.C9038b;
import p181jd.InterfaceC9037a;
import p215l6.C9399a;
import p234m6.C9548b;
import p234m6.InterfaceC9547a;
import p234m6.InterfaceC9549c;
import p327r6.InterfaceC10625a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: classes.dex */
public final class C4705d implements InterfaceC7861m {

    /* renamed from: a */
    private final InterfaceC9037a f9100a;

    /* renamed from: b */
    private final ConnectivityManager f9101b;

    /* renamed from: c */
    private final Context f9102c;

    /* renamed from: d */
    final URL f9103d;

    /* renamed from: e */
    private final InterfaceC10625a f9104e;

    /* renamed from: f */
    private final InterfaceC10625a f9105f;

    /* renamed from: g */
    private final int f9106g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final URL f9107a;

        /* renamed from: b */
        final AbstractC7458j f9108b;

        /* renamed from: c */
        final String f9109c;

        a(URL url, AbstractC7458j abstractC7458j, String str) {
            this.f9107a = url;
            this.f9108b = abstractC7458j;
            this.f9109c = str;
        }

        /* renamed from: a */
        a m11803a(URL url) {
            return new a(url, this.f9108b, this.f9109c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f9110a;

        /* renamed from: b */
        final URL f9111b;

        /* renamed from: c */
        final long f9112c;

        b(int i10, URL url, long j10) {
            this.f9110a = i10;
            this.f9111b = url;
            this.f9112c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4705d(Context context, InterfaceC10625a interfaceC10625a, InterfaceC10625a interfaceC10625a2) {
        this(context, interfaceC10625a, interfaceC10625a2, 130000);
    }

    C4705d(Context context, InterfaceC10625a interfaceC10625a, InterfaceC10625a interfaceC10625a2, int i10) {
        this.f9100a = AbstractC7458j.m22575b();
        this.f9102c = context;
        this.f9101b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f9103d = m11800n(C4702a.f9091c);
        this.f9104e = interfaceC10625a2;
        this.f9105f = interfaceC10625a;
        this.f9106g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public b m11791e(a aVar) {
        C9399a.m27993f("CctTransportBackend", "Making request to: %s", aVar.f9107a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f9107a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f9106g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f9109c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f9100a.mo26545a(aVar.f9108b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    C9399a.m27993f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    C9399a.m27989b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    C9399a.m27989b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m11799m = m11799m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC7462n.m22584b(new BufferedReader(new InputStreamReader(m11799m))).mo22568c());
                            if (m11799m != null) {
                                m11799m.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
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
                } finally {
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (ConnectException e10) {
            e = e10;
            C9399a.m27991d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            C9399a.m27991d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            C9399a.m27991d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (C9038b e13) {
            e = e13;
            C9399a.m27991d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* renamed from: f */
    private static int m11792f(NetworkInfo networkInfo) {
        AbstractC7463o.b bVar;
        if (networkInfo == null) {
            bVar = AbstractC7463o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (AbstractC7463o.b.m22586b(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = AbstractC7463o.b.COMBINED;
        }
        return bVar.m22587h();
    }

    /* renamed from: g */
    private static int m11793g(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC7463o.c.NONE.m22589h() : networkInfo.getType();
    }

    /* renamed from: h */
    private static int m11794h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            C9399a.m27991d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    /* renamed from: i */
    private AbstractC7458j m11795i(AbstractC7854f abstractC7854f) {
        AbstractC7460l.a m22579j;
        HashMap hashMap = new HashMap();
        for (AbstractC7639i abstractC7639i : abstractC7854f.mo24144b()) {
            String mo23170j = abstractC7639i.mo23170j();
            if (hashMap.containsKey(mo23170j)) {
                ((List) hashMap.get(mo23170j)).add(abstractC7639i);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC7639i);
                hashMap.put(mo23170j, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC7639i abstractC7639i2 = (AbstractC7639i) ((List) entry.getValue()).get(0);
            AbstractC7461m.a mo22561b = AbstractC7461m.m22580a().mo22565f(EnumC7464p.DEFAULT).mo22566g(this.f9105f.mo32385a()).mo22567h(this.f9104e.mo32385a()).mo22561b(AbstractC7459k.m22576a().mo22537c(AbstractC7459k.b.ANDROID_FIREBASE).mo22536b(AbstractC7449a.m22500a().mo22525m(Integer.valueOf(abstractC7639i2.m23208g("sdk-version"))).mo22522j(abstractC7639i2.m23207b("model")).mo22518f(abstractC7639i2.m23207b("hardware")).mo22516d(abstractC7639i2.m23207b("device")).mo22524l(abstractC7639i2.m23207b("product")).mo22523k(abstractC7639i2.m23207b("os-uild")).mo22520h(abstractC7639i2.m23207b("manufacturer")).mo22517e(abstractC7639i2.m23207b("fingerprint")).mo22515c(abstractC7639i2.m23207b("country")).mo22519g(abstractC7639i2.m23207b("locale")).mo22521i(abstractC7639i2.m23207b("mcc_mnc")).mo22514b(abstractC7639i2.m23207b("application_build")).mo22513a()).mo22535a());
            try {
                mo22561b.m22581i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                mo22561b.m22582j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC7639i abstractC7639i3 : (List) entry.getValue()) {
                C7638h mo23168e = abstractC7639i3.mo23168e();
                C7298b m23205b = mo23168e.m23205b();
                if (m23205b.equals(C7298b.m21878b("proto"))) {
                    m22579j = AbstractC7460l.m22579j(mo23168e.m23204a());
                } else if (m23205b.equals(C7298b.m21878b("json"))) {
                    m22579j = AbstractC7460l.m22578i(new String(mo23168e.m23204a(), Charset.forName("UTF-8")));
                } else {
                    C9399a.m27994g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m23205b);
                }
                m22579j.mo22547c(abstractC7639i3.mo23169f()).mo22548d(abstractC7639i3.mo23171k()).mo22552h(abstractC7639i3.m23209h("tz-offset")).mo22549e(AbstractC7463o.m22585a().mo22573c(AbstractC7463o.c.m22588b(abstractC7639i3.m23208g("net-type"))).mo22572b(AbstractC7463o.b.m22586b(abstractC7639i3.m23208g("mobile-subtype"))).mo22571a());
                if (abstractC7639i3.mo23167d() != null) {
                    m22579j.mo22546b(abstractC7639i3.mo23167d());
                }
                arrayList3.add(m22579j.mo22545a());
            }
            mo22561b.mo22562c(arrayList3);
            arrayList2.add(mo22561b.mo22560a());
        }
        return AbstractC7458j.m22574a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m11796j(Context context) {
        return (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
    }

    /* renamed from: k */
    static long m11797k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / AdError.NETWORK_ERROR_CODE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ a m11798l(a aVar, b bVar) {
        URL url = bVar.f9111b;
        if (url == null) {
            return null;
        }
        C9399a.m27989b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m11803a(bVar.f9111b);
    }

    /* renamed from: m */
    private static InputStream m11799m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    private static URL m11800n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // p154i6.InterfaceC7861m
    /* renamed from: a */
    public AbstractC7639i mo11801a(AbstractC7639i abstractC7639i) {
        NetworkInfo activeNetworkInfo = this.f9101b.getActiveNetworkInfo();
        return abstractC7639i.m23211l().m23212a("sdk-version", Build.VERSION.SDK_INT).m23214c("model", Build.MODEL).m23214c("hardware", Build.HARDWARE).m23214c("device", Build.DEVICE).m23214c("product", Build.PRODUCT).m23214c("os-uild", Build.ID).m23214c("manufacturer", Build.MANUFACTURER).m23214c("fingerprint", Build.FINGERPRINT).m23213b("tz-offset", m11797k()).m23212a("net-type", m11793g(activeNetworkInfo)).m23212a("mobile-subtype", m11792f(activeNetworkInfo)).m23214c("country", Locale.getDefault().getCountry()).m23214c("locale", Locale.getDefault().getLanguage()).m23214c("mcc_mnc", m11796j(this.f9102c).getSimOperator()).m23214c("application_build", Integer.toString(m11794h(this.f9102c))).mo23172d();
    }

    @Override // p154i6.InterfaceC7861m
    /* renamed from: b */
    public AbstractC7855g mo11802b(AbstractC7854f abstractC7854f) {
        AbstractC7458j m11795i = m11795i(abstractC7854f);
        URL url = this.f9103d;
        if (abstractC7854f.mo24145c() != null) {
            try {
                C4702a m11783c = C4702a.m11783c(abstractC7854f.mo24145c());
                r3 = m11783c.m11786d() != null ? m11783c.m11786d() : null;
                if (m11783c.m11787e() != null) {
                    url = m11800n(m11783c.m11787e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC7855g.m24156a();
            }
        }
        try {
            b bVar = (b) C9548b.m28435a(5, new a(url, m11795i, r3), new InterfaceC9547a() { // from class: com.google.android.datatransport.cct.b
                @Override // p234m6.InterfaceC9547a
                public final Object apply(Object obj) {
                    C4705d.b m11791e;
                    m11791e = C4705d.this.m11791e((C4705d.a) obj);
                    return m11791e;
                }
            }, new InterfaceC9549c() { // from class: com.google.android.datatransport.cct.c
                @Override // p234m6.InterfaceC9549c
                /* renamed from: a */
                public final Object mo11788a(Object obj, Object obj2) {
                    C4705d.a m11798l;
                    m11798l = C4705d.m11798l((C4705d.a) obj, (C4705d.b) obj2);
                    return m11798l;
                }
            });
            int i10 = bVar.f9110a;
            if (i10 == 200) {
                return AbstractC7855g.m24158e(bVar.f9112c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? AbstractC7855g.m24157d() : AbstractC7855g.m24156a();
            }
            return AbstractC7855g.m24159f();
        } catch (IOException e10) {
            C9399a.m27991d("CctTransportBackend", "Could not make request to the backend", e10);
            return AbstractC7855g.m24159f();
        }
    }
}
