package e3;

import android.text.TextUtils;
import androidx.lifecycle.s;
import com.google.gson.Gson;
import f2.s;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements s<List<f2.s>> {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<e3.b> f14469a;

    /* renamed from: b, reason: collision with root package name */
    private final Gson f14470b = new Gson();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends com.google.gson.reflect.a<Map<String, String>> {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14472a;

        static {
            int[] iArr = new int[s.a.values().length];
            f14472a = iArr;
            try {
                iArr[s.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14472a[s.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14472a[s.a.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14472a[s.a.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14472a[s.a.SUCCEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public c(e3.b bVar) {
        this.f14469a = new WeakReference<>(bVar);
    }

    String b(androidx.work.b bVar) {
        String l10 = bVar.l("response");
        if (!TextUtils.isEmpty(l10)) {
            return l10;
        }
        String l11 = bVar.l("response_file");
        if (TextUtils.isEmpty(l11)) {
            return l10;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(l11));
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

    @Override // androidx.lifecycle.s
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(List<f2.s> list) {
        e3.b bVar = this.f14469a.get();
        if (bVar == null) {
            return;
        }
        for (f2.s sVar : list) {
            String uuid = sVar.a().toString();
            int i10 = b.f14472a[sVar.d().ordinal()];
            if (i10 == 1) {
                bVar.b(sVar.a().toString());
            } else if (i10 != 2) {
                if (i10 == 3) {
                    androidx.work.b b10 = sVar.b();
                    bVar.c(uuid, b10.i("status", d3.s.f13754d), b10.i("statusCode", 500), b10.l("errorCode"), b10.l("errorMessage"), b10.m("errorDetails"));
                } else if (i10 == 4) {
                    bVar.c(uuid, d3.s.f13755e, 500, "flutter_upload_cancelled", null, null);
                } else if (i10 == 5) {
                    androidx.work.b b11 = sVar.b();
                    int i11 = b11.i("status", d3.s.f13753c);
                    int i12 = b11.i("statusCode", 500);
                    Type type = new a().getType();
                    String l10 = b11.l("headers");
                    bVar.d(uuid, i11, i12, b(b11), l10 != null ? (Map) this.f14470b.i(l10, type) : null);
                }
            }
            androidx.work.b c10 = sVar.c();
            bVar.e(sVar.a().toString(), c10.i("status", -1), c10.i("progress", -1));
        }
    }
}
