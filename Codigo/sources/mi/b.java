package mi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.e;
import ck.h;
import ck.j;
import ck.v;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import dk.r;
import dk.z;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.x;
import mk.k;
import xk.p;
import xk.q;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21519a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f21520b;

    /* renamed from: c, reason: collision with root package name */
    private final d f21521c;

    /* renamed from: d, reason: collision with root package name */
    private final h f21522d;

    /* renamed from: e, reason: collision with root package name */
    private final h f21523e;

    /* loaded from: classes3.dex */
    static final class a extends o implements ok.a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f21524a = new a();

        a() {
            super(0);
        }

        @Override // ok.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return 67108864;
        }
    }

    /* renamed from: mi.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0347b extends o implements ok.a<String> {
        C0347b() {
            super(0);
        }

        @Override // ok.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return b.this.f().getPackageName() + ".flutter.share_provider";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends o implements ok.a<v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<String> f21526a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x<String> f21527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f21528c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<String> list, x<String> xVar, b bVar) {
            super(0);
            this.f21526a = list;
            this.f21527b = xVar;
            this.f21528c = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object] */
        public final void a() {
            Object G;
            int k10;
            ?? G2;
            int i10 = 1;
            if (this.f21526a.size() == 1) {
                x<String> xVar = this.f21527b;
                G2 = z.G(this.f21526a);
                xVar.f20759a = G2;
                return;
            }
            if (this.f21526a.size() > 1) {
                G = z.G(this.f21526a);
                T t10 = (String) G;
                k10 = r.k(this.f21526a);
                String str = t10;
                if (1 <= k10) {
                    while (true) {
                        boolean a10 = n.a(str, this.f21526a.get(i10));
                        t10 = str;
                        if (!a10) {
                            if (!n.a(this.f21528c.h(str), this.f21528c.h(this.f21526a.get(i10)))) {
                                t10 = "*/*";
                                break;
                            }
                            t10 = this.f21528c.h(this.f21526a.get(i10)) + "/*";
                        }
                        if (i10 == k10) {
                            break;
                        }
                        i10++;
                        str = t10;
                    }
                }
                this.f21527b.f20759a = t10;
            }
        }

        @Override // ok.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f7137a;
        }
    }

    public b(Context context, Activity activity, d manager) {
        h a10;
        h a11;
        n.e(context, "context");
        n.e(manager, "manager");
        this.f21519a = context;
        this.f21520b = activity;
        this.f21521c = manager;
        a10 = j.a(new C0347b());
        this.f21522d = a10;
        a11 = j.a(a.f21524a);
        this.f21523e = a11;
    }

    private final void c() {
        File j10 = j();
        File[] listFiles = j10.listFiles();
        if (j10.exists()) {
            int i10 = 0;
            boolean z10 = true;
            if (listFiles != null) {
                if (!(listFiles.length == 0)) {
                    z10 = false;
                }
            }
            if (z10) {
                return;
            }
            n.b(listFiles);
            int length = listFiles.length;
            while (i10 < length) {
                File file = listFiles[i10];
                i10++;
                file.delete();
            }
            j10.delete();
        }
    }

    private final File d(File file) {
        File j10 = j();
        if (!j10.exists()) {
            j10.mkdirs();
        }
        File file2 = new File(j10, file.getName());
        k.c(file, file2, true, 0, 4, null);
        return file2;
    }

    private final boolean e(File file) {
        boolean E;
        try {
            String canonicalPath = file.getCanonicalPath();
            n.b(canonicalPath);
            String canonicalPath2 = j().getCanonicalPath();
            n.d(canonicalPath2, "getCanonicalPath(...)");
            E = p.E(canonicalPath, canonicalPath2, false, 2, null);
            return E;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context f() {
        Activity activity = this.f21520b;
        if (activity == null) {
            return this.f21519a;
        }
        n.b(activity);
        return activity;
    }

    private final int g() {
        return ((Number) this.f21523e.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String h(String str) {
        boolean J;
        int U;
        if (str != null) {
            J = q.J(str, "/", false, 2, null);
            if (J) {
                U = q.U(str, "/", 0, false, 6, null);
                String substring = str.substring(0, U);
                n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return "*";
    }

    private final String i() {
        return (String) this.f21522d.getValue();
    }

    private final File j() {
        return new File(f().getCacheDir(), "share_plus");
    }

    private final ArrayList<Uri> k(List<String> list) {
        ArrayList<Uri> arrayList = new ArrayList<>(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (e(file)) {
                throw new IOException("Shared file can not be located in '" + j().getCanonicalPath() + '\'');
            }
            arrayList.add(e.getUriForFile(f(), i(), d(file)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String l(List<String> list) {
        x xVar = new x();
        xVar.f20759a = "*/*";
        if (list != null) {
            new c(list, xVar, this);
        }
        return (String) xVar.f20759a;
    }

    private final void p(Intent intent, boolean z10) {
        Activity activity = this.f21520b;
        if (activity == null) {
            intent.addFlags(268435456);
            if (z10) {
                this.f21521c.e();
            }
            this.f21519a.startActivity(intent);
            return;
        }
        n.b(activity);
        if (z10) {
            activity.startActivityForResult(intent, 17062003);
        } else {
            activity.startActivity(intent);
        }
    }

    public final void m(Activity activity) {
        this.f21520b = activity;
    }

    public final void n(String text, String str, boolean z10) {
        n.e(text, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", text);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str);
        Intent createChooser = z10 ? Intent.createChooser(intent, null, PendingIntent.getBroadcast(this.f21519a, 0, new Intent("dev.fluttercommunity.plus/share/success"), 134217728 | g()).getIntentSender()) : Intent.createChooser(intent, null);
        n.b(createChooser);
        p(createChooser, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(java.util.List<java.lang.String> r6, java.util.List<java.lang.String> r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r5 = this;
            java.lang.String r0 = "paths"
            kotlin.jvm.internal.n.e(r6, r0)
            r5.c()
            java.util.ArrayList r6 = r5.k(r6)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            boolean r1 = r6.isEmpty()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2b
            if (r8 == 0) goto L24
            boolean r1 = xk.g.t(r8)
            if (r1 == 0) goto L22
            goto L24
        L22:
            r1 = r2
            goto L25
        L24:
            r1 = r3
        L25:
            if (r1 != 0) goto L2b
            r5.n(r8, r9, r10)
            return
        L2b:
            int r1 = r6.size()
            java.lang.String r4 = "android.intent.extra.STREAM"
            if (r1 != r3) goto L5f
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L41
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3f
            goto L41
        L3f:
            r1 = r2
            goto L42
        L41:
            r1 = r3
        L42:
            if (r1 != 0) goto L4b
            java.lang.Object r7 = dk.p.G(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L4d
        L4b:
        */
        //  java.lang.String r7 = "*/*"
        /*
        L4d:
            java.lang.String r1 = "android.intent.action.SEND"
            r0.setAction(r1)
            r0.setType(r7)
            java.lang.Object r7 = dk.p.G(r6)
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            r0.putExtra(r4, r7)
            goto L6e
        L5f:
            java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
            r0.setAction(r1)
            java.lang.String r7 = r5.l(r7)
            r0.setType(r7)
            r0.putParcelableArrayListExtra(r4, r6)
        L6e:
            if (r8 == 0) goto L75
            java.lang.String r7 = "android.intent.extra.TEXT"
            r0.putExtra(r7, r8)
        L75:
            if (r9 == 0) goto L7c
            java.lang.String r7 = "android.intent.extra.SUBJECT"
            r0.putExtra(r7, r9)
        L7c:
            r0.addFlags(r3)
            r7 = 0
            if (r10 == 0) goto L9f
            android.content.Context r8 = r5.f21519a
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r1 = "dev.fluttercommunity.plus/share/success"
            r9.<init>(r1)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            int r3 = r5.g()
            r1 = r1 | r3
            android.app.PendingIntent r8 = android.app.PendingIntent.getBroadcast(r8, r2, r9, r1)
            android.content.IntentSender r8 = r8.getIntentSender()
            android.content.Intent r7 = android.content.Intent.createChooser(r0, r7, r8)
            goto La3
        L9f:
            android.content.Intent r7 = android.content.Intent.createChooser(r0, r7)
        La3:
            android.content.Context r8 = r5.f()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            r9 = 65536(0x10000, float:9.1835E-41)
            java.util.List r8 = r8.queryIntentActivities(r7, r9)
            java.lang.String r9 = "queryIntentActivities(...)"
            kotlin.jvm.internal.n.d(r8, r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        Lbc:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Le5
            java.lang.Object r9 = r8.next()
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9
            android.content.pm.ActivityInfo r9 = r9.activityInfo
            java.lang.String r9 = r9.packageName
            java.util.Iterator r0 = r6.iterator()
        Ld0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r0.next()
            android.net.Uri r1 = (android.net.Uri) r1
            android.content.Context r2 = r5.f()
            r3 = 3
            r2.grantUriPermission(r9, r1, r3)
            goto Ld0
        Le5:
            kotlin.jvm.internal.n.b(r7)
            r5.p(r7, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.b.o(java.util.List, java.util.List, java.lang.String, java.lang.String, boolean):void");
    }
}
