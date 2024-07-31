package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.C0732b;
import androidx.core.util.C0984h;
import com.google.android.gms.common.api.C5101a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes.dex */
public class C1227e {

    /* renamed from: n */
    private static final Object f5054n = new Object();

    /* renamed from: o */
    private static final Object f5055o = new Object();

    /* renamed from: p */
    private static volatile C1227e f5056p;

    /* renamed from: b */
    private final Set<e> f5058b;

    /* renamed from: e */
    private final b f5061e;

    /* renamed from: f */
    final g f5062f;

    /* renamed from: g */
    final boolean f5063g;

    /* renamed from: h */
    final boolean f5064h;

    /* renamed from: i */
    final int[] f5065i;

    /* renamed from: j */
    private final boolean f5066j;

    /* renamed from: k */
    private final int f5067k;

    /* renamed from: l */
    private final int f5068l;

    /* renamed from: m */
    private final d f5069m;

    /* renamed from: a */
    private final ReadWriteLock f5057a = new ReentrantReadWriteLock();

    /* renamed from: c */
    private volatile int f5059c = 3;

    /* renamed from: d */
    private final Handler f5060d = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.emoji2.text.e$a */
    /* loaded from: classes.dex */
    private static final class a extends b {

        /* renamed from: b */
        private volatile C1230h f5070b;

        /* renamed from: c */
        private volatile C1235m f5071c;

        /* renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C13163a extends h {
            C13163a() {
            }

            @Override // androidx.emoji2.text.C1227e.h
            /* renamed from: a */
            public void mo6600a(Throwable th2) {
                a.this.f5073a.m6633m(th2);
            }

            @Override // androidx.emoji2.text.C1227e.h
            /* renamed from: b */
            public void mo6601b(C1235m c1235m) {
                a.this.m6645d(c1235m);
            }
        }

        a(C1227e c1227e) {
            super(c1227e);
        }

        @Override // androidx.emoji2.text.C1227e.b
        /* renamed from: a */
        void mo6642a() {
            try {
                this.f5073a.f5062f.mo6598a(new C13163a());
            } catch (Throwable th2) {
                this.f5073a.m6633m(th2);
            }
        }

        @Override // androidx.emoji2.text.C1227e.b
        /* renamed from: b */
        CharSequence mo6643b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f5070b.m6669h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.C1227e.b
        /* renamed from: c */
        void mo6644c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f5071c.m6703e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f5073a.f5063g);
        }

        /* renamed from: d */
        void m6645d(C1235m c1235m) {
            if (c1235m == null) {
                this.f5073a.m6633m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f5071c = c1235m;
            C1235m c1235m2 = this.f5071c;
            i iVar = new i();
            d dVar = this.f5073a.f5069m;
            C1227e c1227e = this.f5073a;
            this.f5070b = new C1230h(c1235m2, iVar, dVar, c1227e.f5064h, c1227e.f5065i);
            this.f5073a.m6634n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.e$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final C1227e f5073a;

        b(C1227e c1227e) {
            this.f5073a = c1227e;
        }

        /* renamed from: a */
        void mo6642a() {
            throw null;
        }

        /* renamed from: b */
        CharSequence mo6643b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        /* renamed from: c */
        void mo6644c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.e$c */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        final g f5074a;

        /* renamed from: b */
        boolean f5075b;

        /* renamed from: c */
        boolean f5076c;

        /* renamed from: d */
        int[] f5077d;

        /* renamed from: e */
        Set<e> f5078e;

        /* renamed from: f */
        boolean f5079f;

        /* renamed from: g */
        int f5080g = -16711936;

        /* renamed from: h */
        int f5081h = 0;

        /* renamed from: i */
        d f5082i = new C1226d();

        /* JADX INFO: Access modifiers changed from: protected */
        public c(g gVar) {
            C0984h.m4834l(gVar, "metadataLoader cannot be null.");
            this.f5074a = gVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public final g m6646a() {
            return this.f5074a;
        }

        /* renamed from: b */
        public c m6647b(int i10) {
            this.f5081h = i10;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.e$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        boolean mo6620a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.e$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        /* renamed from: a */
        public void m6648a(Throwable th2) {
        }

        /* renamed from: b */
        public void mo6649b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.e$f */
    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: a */
        private final List<e> f5083a;

        /* renamed from: b */
        private final Throwable f5084b;

        /* renamed from: c */
        private final int f5085c;

        f(e eVar, int i10) {
            this(Arrays.asList((e) C0984h.m4834l(eVar, "initCallback cannot be null")), i10, null);
        }

        f(Collection<e> collection, int i10) {
            this(collection, i10, null);
        }

        f(Collection<e> collection, int i10, Throwable th2) {
            C0984h.m4834l(collection, "initCallbacks cannot be null");
            this.f5083a = new ArrayList(collection);
            this.f5085c = i10;
            this.f5084b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f5083a.size();
            int i10 = 0;
            if (this.f5085c != 1) {
                while (i10 < size) {
                    this.f5083a.get(i10).m6648a(this.f5084b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f5083a.get(i10).mo6649b();
                    i10++;
                }
            }
        }
    }

    /* renamed from: androidx.emoji2.text.e$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        void mo6598a(h hVar);
    }

    /* renamed from: androidx.emoji2.text.e$h */
    /* loaded from: classes.dex */
    public static abstract class h {
        /* renamed from: a */
        public abstract void mo6600a(Throwable th2);

        /* renamed from: b */
        public abstract void mo6601b(C1235m c1235m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.e$i */
    /* loaded from: classes.dex */
    public static class i {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC1231i m6650a(C1229g c1229g) {
            return new C1237o(c1229g);
        }
    }

    private C1227e(c cVar) {
        this.f5063g = cVar.f5075b;
        this.f5064h = cVar.f5076c;
        this.f5065i = cVar.f5077d;
        this.f5066j = cVar.f5079f;
        this.f5067k = cVar.f5080g;
        this.f5062f = cVar.f5074a;
        this.f5068l = cVar.f5081h;
        this.f5069m = cVar.f5082i;
        C0732b c0732b = new C0732b();
        this.f5058b = c0732b;
        Set<e> set = cVar.f5078e;
        if (set != null && !set.isEmpty()) {
            c0732b.addAll(cVar.f5078e);
        }
        this.f5061e = new a(this);
        m6628l();
    }

    /* renamed from: b */
    public static C1227e m6622b() {
        C1227e c1227e;
        synchronized (f5054n) {
            c1227e = f5056p;
            C0984h.m4836n(c1227e != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c1227e;
    }

    /* renamed from: e */
    public static boolean m6623e(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return C1230h.m6664c(inputConnection, editable, i10, i11, z10);
    }

    /* renamed from: f */
    public static boolean m6624f(Editable editable, int i10, KeyEvent keyEvent) {
        return C1230h.m6665d(editable, i10, keyEvent);
    }

    /* renamed from: g */
    public static C1227e m6625g(c cVar) {
        C1227e c1227e = f5056p;
        if (c1227e == null) {
            synchronized (f5054n) {
                c1227e = f5056p;
                if (c1227e == null) {
                    c1227e = new C1227e(cVar);
                    f5056p = c1227e;
                }
            }
        }
        return c1227e;
    }

    /* renamed from: h */
    public static boolean m6626h() {
        return f5056p != null;
    }

    /* renamed from: j */
    private boolean m6627j() {
        return m6630d() == 1;
    }

    /* renamed from: l */
    private void m6628l() {
        this.f5057a.writeLock().lock();
        try {
            if (this.f5068l == 0) {
                this.f5059c = 0;
            }
            this.f5057a.writeLock().unlock();
            if (m6630d() == 0) {
                this.f5061e.mo6642a();
            }
        } catch (Throwable th2) {
            this.f5057a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: c */
    public int m6629c() {
        return this.f5067k;
    }

    /* renamed from: d */
    public int m6630d() {
        this.f5057a.readLock().lock();
        try {
            return this.f5059c;
        } finally {
            this.f5057a.readLock().unlock();
        }
    }

    /* renamed from: i */
    public boolean m6631i() {
        return this.f5066j;
    }

    /* renamed from: k */
    public void m6632k() {
        C0984h.m4836n(this.f5068l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m6627j()) {
            return;
        }
        this.f5057a.writeLock().lock();
        try {
            if (this.f5059c == 0) {
                return;
            }
            this.f5059c = 0;
            this.f5057a.writeLock().unlock();
            this.f5061e.mo6642a();
        } finally {
            this.f5057a.writeLock().unlock();
        }
    }

    /* renamed from: m */
    void m6633m(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f5057a.writeLock().lock();
        try {
            this.f5059c = 2;
            arrayList.addAll(this.f5058b);
            this.f5058b.clear();
            this.f5057a.writeLock().unlock();
            this.f5060d.post(new f(arrayList, this.f5059c, th2));
        } catch (Throwable th3) {
            this.f5057a.writeLock().unlock();
            throw th3;
        }
    }

    /* renamed from: n */
    void m6634n() {
        ArrayList arrayList = new ArrayList();
        this.f5057a.writeLock().lock();
        try {
            this.f5059c = 1;
            arrayList.addAll(this.f5058b);
            this.f5058b.clear();
            this.f5057a.writeLock().unlock();
            this.f5060d.post(new f(arrayList, this.f5059c));
        } catch (Throwable th2) {
            this.f5057a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: o */
    public CharSequence m6635o(CharSequence charSequence) {
        return m6636p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* renamed from: p */
    public CharSequence m6636p(CharSequence charSequence, int i10, int i11) {
        return m6637q(charSequence, i10, i11, C5101a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: q */
    public CharSequence m6637q(CharSequence charSequence, int i10, int i11, int i12) {
        return m6638r(charSequence, i10, i11, i12, 0);
    }

    /* renamed from: r */
    public CharSequence m6638r(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        C0984h.m4836n(m6627j(), "Not initialized yet");
        C0984h.m4831i(i10, "start cannot be negative");
        C0984h.m4831i(i11, "end cannot be negative");
        C0984h.m4831i(i12, "maxEmojiCount cannot be negative");
        C0984h.m4824b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        C0984h.m4824b(i10 <= charSequence.length(), "start should be < than charSequence length");
        C0984h.m4824b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f5063g : false;
        } else {
            z10 = true;
        }
        return this.f5061e.mo6643b(charSequence, i10, i11, i12, z10);
    }

    /* renamed from: s */
    public void m6639s(e eVar) {
        C0984h.m4834l(eVar, "initCallback cannot be null");
        this.f5057a.writeLock().lock();
        try {
            if (this.f5059c != 1 && this.f5059c != 2) {
                this.f5058b.add(eVar);
            }
            this.f5060d.post(new f(eVar, this.f5059c));
        } finally {
            this.f5057a.writeLock().unlock();
        }
    }

    /* renamed from: t */
    public void m6640t(e eVar) {
        C0984h.m4834l(eVar, "initCallback cannot be null");
        this.f5057a.writeLock().lock();
        try {
            this.f5058b.remove(eVar);
        } finally {
            this.f5057a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void m6641u(EditorInfo editorInfo) {
        if (!m6627j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f5061e.mo6644c(editorInfo);
    }
}
