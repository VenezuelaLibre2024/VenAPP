package p240mi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.C0858e;
import ck.C2025j;
import ck.C2037v;
import ck.InterfaceC2023h;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import dk.C7031r;
import dk.C7042z;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9332x;
import mk.C9611k;
import p280ok.InterfaceC9987a;
import p450xk.C12524p;
import p450xk.C12525q;

/* renamed from: mi.b */
/* loaded from: classes3.dex */
public final class C9588b {

    /* renamed from: a */
    private final Context f23373a;

    /* renamed from: b */
    private Activity f23374b;

    /* renamed from: c */
    private final C9590d f23375c;

    /* renamed from: d */
    private final InterfaceC2023h f23376d;

    /* renamed from: e */
    private final InterfaceC2023h f23377e;

    /* renamed from: mi.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC9323o implements InterfaceC9987a<Integer> {

        /* renamed from: a */
        public static final a f23378a = new a();

        a() {
            super(0);
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return 67108864;
        }
    }

    /* renamed from: mi.b$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC9323o implements InterfaceC9987a<String> {
        b() {
            super(0);
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C9588b.this.m28567f().getPackageName() + ".flutter.share_provider";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mi.b$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC9323o implements InterfaceC9987a<C2037v> {

        /* renamed from: a */
        final /* synthetic */ List<String> f23380a;

        /* renamed from: b */
        final /* synthetic */ C9332x<String> f23381b;

        /* renamed from: c */
        final /* synthetic */ C9588b f23382c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<String> list, C9332x<String> c9332x, C9588b c9588b) {
            super(0);
            this.f23380a = list;
            this.f23381b = c9332x;
            this.f23382c = c9588b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object] */
        /* renamed from: a */
        public final void m28580a() {
            Object m20605G;
            int m20583k;
            ?? m20605G2;
            int i10 = 1;
            if (this.f23380a.size() == 1) {
                C9332x<String> c9332x = this.f23381b;
                m20605G2 = C7042z.m20605G(this.f23380a);
                c9332x.f22581a = m20605G2;
                return;
            }
            if (this.f23380a.size() > 1) {
                m20605G = C7042z.m20605G(this.f23380a);
                T t10 = (String) m20605G;
                m20583k = C7031r.m20583k(this.f23380a);
                String str = t10;
                if (1 <= m20583k) {
                    while (true) {
                        boolean m27777a = C9322n.m27777a(str, this.f23380a.get(i10));
                        t10 = str;
                        if (!m27777a) {
                            if (!C9322n.m27777a(this.f23382c.m28569h(str), this.f23382c.m28569h(this.f23380a.get(i10)))) {
                                t10 = "*/*";
                                break;
                            }
                            t10 = this.f23382c.m28569h(this.f23380a.get(i10)) + "/*";
                        }
                        if (i10 == m20583k) {
                            break;
                        }
                        i10++;
                        str = t10;
                    }
                }
                this.f23381b.f22581a = t10;
            }
        }

        @Override // p280ok.InterfaceC9987a
        public /* bridge */ /* synthetic */ C2037v invoke() {
            m28580a();
            return C2037v.f8089a;
        }
    }

    public C9588b(Context context, Activity activity, C9590d manager) {
        InterfaceC2023h m10334a;
        InterfaceC2023h m10334a2;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(manager, "manager");
        this.f23373a = context;
        this.f23374b = activity;
        this.f23375c = manager;
        m10334a = C2025j.m10334a(new b());
        this.f23376d = m10334a;
        m10334a2 = C2025j.m10334a(a.f23378a);
        this.f23377e = m10334a2;
    }

    /* renamed from: c */
    private final void m28564c() {
        File m28571j = m28571j();
        File[] listFiles = m28571j.listFiles();
        if (m28571j.exists()) {
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
            C9322n.m27778b(listFiles);
            int length = listFiles.length;
            while (i10 < length) {
                File file = listFiles[i10];
                i10++;
                file.delete();
            }
            m28571j.delete();
        }
    }

    /* renamed from: d */
    private final File m28565d(File file) {
        File m28571j = m28571j();
        if (!m28571j.exists()) {
            m28571j.mkdirs();
        }
        File file2 = new File(m28571j, file.getName());
        C9611k.m28603c(file, file2, true, 0, 4, null);
        return file2;
    }

    /* renamed from: e */
    private final boolean m28566e(File file) {
        boolean m41031E;
        try {
            String canonicalPath = file.getCanonicalPath();
            C9322n.m27778b(canonicalPath);
            String canonicalPath2 = m28571j().getCanonicalPath();
            C9322n.m27780d(canonicalPath2, "getCanonicalPath(...)");
            m41031E = C12524p.m41031E(canonicalPath, canonicalPath2, false, 2, null);
            return m41031E;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final Context m28567f() {
        Activity activity = this.f23374b;
        if (activity == null) {
            return this.f23373a;
        }
        C9322n.m27778b(activity);
        return activity;
    }

    /* renamed from: g */
    private final int m28568g() {
        return ((Number) this.f23377e.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final String m28569h(String str) {
        boolean m41059J;
        int m41072U;
        if (str != null) {
            m41059J = C12525q.m41059J(str, "/", false, 2, null);
            if (m41059J) {
                m41072U = C12525q.m41072U(str, "/", 0, false, 6, null);
                String substring = str.substring(0, m41072U);
                C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return "*";
    }

    /* renamed from: i */
    private final String m28570i() {
        return (String) this.f23376d.getValue();
    }

    /* renamed from: j */
    private final File m28571j() {
        return new File(m28567f().getCacheDir(), "share_plus");
    }

    /* renamed from: k */
    private final ArrayList<Uri> m28572k(List<String> list) {
        ArrayList<Uri> arrayList = new ArrayList<>(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (m28566e(file)) {
                throw new IOException("Shared file can not be located in '" + m28571j().getCanonicalPath() + '\'');
            }
            arrayList.add(C0858e.getUriForFile(m28567f(), m28570i(), m28565d(file)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    private final String m28573l(List<String> list) {
        C9332x c9332x = new C9332x();
        c9332x.f22581a = "*/*";
        if (list != null) {
            new c(list, c9332x, this);
        }
        return (String) c9332x.f22581a;
    }

    /* renamed from: p */
    private final void m28574p(Intent intent, boolean z10) {
        Activity activity = this.f23374b;
        if (activity == null) {
            intent.addFlags(268435456);
            if (z10) {
                this.f23375c.m28585e();
            }
            this.f23373a.startActivity(intent);
            return;
        }
        C9322n.m27778b(activity);
        if (z10) {
            activity.startActivityForResult(intent, 17062003);
        } else {
            activity.startActivity(intent);
        }
    }

    /* renamed from: m */
    public final void m28575m(Activity activity) {
        this.f23374b = activity;
    }

    /* renamed from: n */
    public final void m28576n(String text, String str, boolean z10) {
        C9322n.m27781e(text, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", text);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str);
        Intent createChooser = z10 ? Intent.createChooser(intent, null, PendingIntent.getBroadcast(this.f23373a, 0, new Intent("dev.fluttercommunity.plus/share/success"), 134217728 | m28568g()).getIntentSender()) : Intent.createChooser(intent, null);
        C9322n.m27778b(createChooser);
        m28574p(createChooser, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m28577o(java.util.List<java.lang.String> r6, java.util.List<java.lang.String> r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r5 = this;
            java.lang.String r0 = "paths"
            kotlin.jvm.internal.C9322n.m27781e(r6, r0)
            r5.m28564c()
            java.util.ArrayList r6 = r5.m28572k(r6)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            boolean r1 = r6.isEmpty()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2b
            if (r8 == 0) goto L24
            boolean r1 = p450xk.C12515g.m41007t(r8)
            if (r1 == 0) goto L22
            goto L24
        L22:
            r1 = r2
            goto L25
        L24:
            r1 = r3
        L25:
            if (r1 != 0) goto L2b
            r5.m28576n(r8, r9, r10)
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
            java.lang.Object r7 = dk.C7027p.m20518G(r7)
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
            java.lang.Object r7 = dk.C7027p.m20518G(r6)
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            r0.putExtra(r4, r7)
            goto L6e
        L5f:
            java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
            r0.setAction(r1)
            java.lang.String r7 = r5.m28573l(r7)
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
            android.content.Context r8 = r5.f23373a
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r1 = "dev.fluttercommunity.plus/share/success"
            r9.<init>(r1)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            int r3 = r5.m28568g()
            r1 = r1 | r3
            android.app.PendingIntent r8 = android.app.PendingIntent.getBroadcast(r8, r2, r9, r1)
            android.content.IntentSender r8 = r8.getIntentSender()
            android.content.Intent r7 = android.content.Intent.createChooser(r0, r7, r8)
            goto La3
        L9f:
            android.content.Intent r7 = android.content.Intent.createChooser(r0, r7)
        La3:
            android.content.Context r8 = r5.m28567f()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            r9 = 65536(0x10000, float:9.1835E-41)
            java.util.List r8 = r8.queryIntentActivities(r7, r9)
            java.lang.String r9 = "queryIntentActivities(...)"
            kotlin.jvm.internal.C9322n.m27780d(r8, r9)
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
            android.content.Context r2 = r5.m28567f()
            r3 = 3
            r2.grantUriPermission(r9, r1, r3)
            goto Ld0
        Le5:
            kotlin.jvm.internal.C9322n.m27778b(r7)
            r5.m28574p(r7, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p240mi.C9588b.m28577o(java.util.List, java.util.List, java.lang.String, java.lang.String, boolean):void");
    }
}
