package p074e3;

import android.text.TextUtils;
import androidx.lifecycle.InterfaceC1321s;
import androidx.work.C1522b;
import com.google.gson.Gson;
import com.google.gson.reflect.C6503a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import p054d3.C6838s;
import p094f2.C7286s;

/* renamed from: e3.c */
/* loaded from: classes.dex */
public class C7121c implements InterfaceC1321s<List<C7286s>> {

    /* renamed from: a */
    private final WeakReference<InterfaceC7120b> f15841a;

    /* renamed from: b */
    private final Gson f15842b = new Gson();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e3.c$a */
    /* loaded from: classes.dex */
    public class a extends C6503a<Map<String, String>> {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e3.c$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f15844a;

        static {
            int[] iArr = new int[C7286s.a.values().length];
            f15844a = iArr;
            try {
                iArr[C7286s.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15844a[C7286s.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15844a[C7286s.a.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15844a[C7286s.a.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15844a[C7286s.a.SUCCEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C7121c(InterfaceC7120b interfaceC7120b) {
        this.f15841a = new WeakReference<>(interfaceC7120b);
    }

    /* renamed from: b */
    String m21010b(C1522b c1522b) {
        String m8535l = c1522b.m8535l("response");
        if (!TextUtils.isEmpty(m8535l)) {
            return m8535l;
        }
        String m8535l2 = c1522b.m8535l("response_file");
        if (TextUtils.isEmpty(m8535l2)) {
            return m8535l;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(m8535l2));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        String sb3 = sb2.toString();
                        bufferedReader.close();
                        return sb3;
                    }
                    sb2.append(readLine);
                } finally {
                }
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // androidx.lifecycle.InterfaceC1321s
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo2553a(List<C7286s> list) {
        InterfaceC7120b interfaceC7120b = this.f15841a.get();
        if (interfaceC7120b == null) {
            return;
        }
        for (C7286s c7286s : list) {
            String uuid = c7286s.m21789a().toString();
            int i10 = b.f15844a[c7286s.m21792d().ordinal()];
            if (i10 == 1) {
                interfaceC7120b.mo19719b(c7286s.m21789a().toString());
            } else if (i10 != 2) {
                if (i10 == 3) {
                    C1522b m21790b = c7286s.m21790b();
                    interfaceC7120b.mo19720c(uuid, m21790b.m8532i("status", C6838s.f15108d), m21790b.m8532i("statusCode", 500), m21790b.m8535l("errorCode"), m21790b.m8535l("errorMessage"), m21790b.m8536m("errorDetails"));
                } else if (i10 == 4) {
                    interfaceC7120b.mo19720c(uuid, C6838s.f15109e, 500, "flutter_upload_cancelled", null, null);
                } else if (i10 == 5) {
                    C1522b m21790b2 = c7286s.m21790b();
                    int m8532i = m21790b2.m8532i("status", C6838s.f15107c);
                    int m8532i2 = m21790b2.m8532i("statusCode", 500);
                    Type type = new a().getType();
                    String m8535l = m21790b2.m8535l("headers");
                    interfaceC7120b.mo19721d(uuid, m8532i, m8532i2, m21010b(m21790b2), m8535l != null ? (Map) this.f15842b.m18024i(m8535l, type) : null);
                }
            }
            C1522b m21791c = c7286s.m21791c();
            interfaceC7120b.mo19722e(c7286s.m21789a().toString(), m21791c.m8532i("status", -1), m21791c.m8532i("progress", -1));
        }
    }
}
