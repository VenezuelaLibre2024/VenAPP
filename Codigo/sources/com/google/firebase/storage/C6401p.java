package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.storage.C6387h0;
import gf.C7562d;
import gf.C7566h;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p485zb.C12867g;

/* renamed from: com.google.firebase.storage.p */
/* loaded from: classes2.dex */
public class C6401p implements Comparable<C6401p> {

    /* renamed from: a */
    private final Uri f13958a;

    /* renamed from: b */
    private final C6382f f13959b;

    /* renamed from: com.google.firebase.storage.p$a */
    /* loaded from: classes2.dex */
    class a implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ TaskCompletionSource f13960a;

        a(TaskCompletionSource taskCompletionSource) {
            this.f13960a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f13960a.setException(C6398n.m17920e(exc, 0));
        }
    }

    /* renamed from: com.google.firebase.storage.p$b */
    /* loaded from: classes2.dex */
    class b implements OnSuccessListener<C6387h0.d> {

        /* renamed from: a */
        final /* synthetic */ TaskCompletionSource f13962a;

        b(TaskCompletionSource taskCompletionSource) {
            this.f13962a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C6387h0.d dVar) {
            if (this.f13962a.getTask().isComplete()) {
                return;
            }
            Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
            this.f13962a.setException(C6398n.m17918c(Status.f10402t));
        }
    }

    /* renamed from: com.google.firebase.storage.p$c */
    /* loaded from: classes2.dex */
    class c implements C6387h0.b {

        /* renamed from: a */
        final /* synthetic */ long f13964a;

        /* renamed from: b */
        final /* synthetic */ TaskCompletionSource f13965b;

        c(long j10, TaskCompletionSource taskCompletionSource) {
            this.f13964a = j10;
            this.f13965b = taskCompletionSource;
        }

        @Override // com.google.firebase.storage.C6387h0.b
        /* renamed from: a */
        public void mo17896a(C6387h0.d dVar, InputStream inputStream) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                int i10 = 0;
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        byteArrayOutputStream.flush();
                        this.f13965b.setResult(byteArrayOutputStream.toByteArray());
                        return;
                    } else {
                        i10 += read;
                        if (i10 > this.f13964a) {
                            Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                            throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: com.google.firebase.storage.p$d */
    /* loaded from: classes2.dex */
    class d implements Continuation<C6390j, Task<Void>> {

        /* renamed from: a */
        final /* synthetic */ List f13967a;

        /* renamed from: b */
        final /* synthetic */ List f13968b;

        /* renamed from: c */
        final /* synthetic */ Executor f13969c;

        /* renamed from: d */
        final /* synthetic */ TaskCompletionSource f13970d;

        d(List list, List list2, Executor executor, TaskCompletionSource taskCompletionSource) {
            this.f13967a = list;
            this.f13968b = list2;
            this.f13969c = executor;
            this.f13970d = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Task<C6390j> task) {
            if (task.isSuccessful()) {
                C6390j result = task.getResult();
                this.f13967a.addAll(result.m17904d());
                this.f13968b.addAll(result.m17902b());
                if (result.m17903c() != null) {
                    C6401p.this.m17988B(null, result.m17903c()).continueWithTask(this.f13969c, this);
                } else {
                    this.f13970d.setResult(new C6390j(this.f13967a, this.f13968b, null));
                }
            } else {
                this.f13970d.setException(task.getException());
            }
            return Tasks.forResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6401p(Uri uri, C6382f c6382f) {
        C5276s.m13316b(uri != null, "storageUri cannot be null");
        C5276s.m13316b(c6382f != null, "FirebaseApp cannot be null");
        this.f13958a = uri;
        this.f13959b = c6382f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public Task<C6390j> m17988B(Integer num, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C6385g0.m17878b().m17883f(new RunnableC6392k(this, num, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: A */
    public Task<C6390j> m17990A() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Executor m17880a = C6385g0.m17878b().m17880a();
        m17988B(null, null).continueWithTask(m17880a, new d(arrayList, arrayList2, m17880a, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: C */
    public C6399n0 m17991C(byte[] bArr) {
        C5276s.m13316b(bArr != null, "bytes cannot be null");
        C6399n0 c6399n0 = new C6399n0(this, null, bArr);
        c6399n0.m17831b0();
        return c6399n0;
    }

    /* renamed from: D */
    public C6399n0 m17992D(byte[] bArr, C6400o c6400o) {
        C5276s.m13316b(bArr != null, "bytes cannot be null");
        C5276s.m13316b(c6400o != null, "metadata cannot be null");
        C6399n0 c6399n0 = new C6399n0(this, c6400o, bArr);
        c6399n0.m17831b0();
        return c6399n0;
    }

    /* renamed from: E */
    public C6399n0 m17993E(Uri uri) {
        C5276s.m13316b(uri != null, "uri cannot be null");
        C6399n0 c6399n0 = new C6399n0(this, null, uri, null);
        c6399n0.m17831b0();
        return c6399n0;
    }

    /* renamed from: F */
    public C6399n0 m17994F(Uri uri, C6400o c6400o) {
        C5276s.m13316b(uri != null, "uri cannot be null");
        C5276s.m13316b(c6400o != null, "metadata cannot be null");
        C6399n0 c6399n0 = new C6399n0(this, c6400o, uri, null);
        c6399n0.m17831b0();
        return c6399n0;
    }

    /* renamed from: G */
    public Task<C6400o> m17995G(C6400o c6400o) {
        C5276s.m13324j(c6400o);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C6385g0.m17878b().m17883f(new RunnableC6397m0(this, taskCompletionSource, c6400o));
        return taskCompletionSource.getTask();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6401p) {
            return ((C6401p) obj).toString().equals(toString());
        }
        return false;
    }

    /* renamed from: h */
    public C6401p m17996h(String str) {
        C5276s.m13316b(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        return new C6401p(this.f13958a.buildUpon().appendEncodedPath(C7562d.m22962b(C7562d.m22961a(str))).build(), this.f13959b);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(C6401p c6401p) {
        return this.f13958a.compareTo(c6401p.f13958a);
    }

    /* renamed from: l */
    public Task<Void> m17998l() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C6385g0.m17878b().m17883f(new RunnableC6378d(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C12867g m17999m() {
        return m18009w().m17859a();
    }

    /* renamed from: n */
    public String m18000n() {
        return this.f13958a.getAuthority();
    }

    /* renamed from: o */
    public Task<byte[]> m18001o(long j10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C6387h0 c6387h0 = new C6387h0(this);
        c6387h0.m17893r0(new c(j10, taskCompletionSource)).addOnSuccessListener(new b(taskCompletionSource)).addOnFailureListener(new a(taskCompletionSource));
        c6387h0.m17831b0();
        return taskCompletionSource.getTask();
    }

    /* renamed from: p */
    public Task<Uri> m18002p() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C6385g0.m17878b().m17883f(new RunnableC6386h(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: q */
    public C6380e m18003q(Uri uri) {
        C6380e c6380e = new C6380e(this, uri);
        c6380e.m17831b0();
        return c6380e;
    }

    /* renamed from: r */
    public Task<C6400o> m18004r() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C6385g0.m17878b().m17883f(new RunnableC6388i(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: s */
    public String m18005s() {
        String path = this.f13958a.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    /* renamed from: t */
    public C6401p m18006t() {
        String path = this.f13958a.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        if (path.equals("/")) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        return new C6401p(this.f13958a.buildUpon().path(lastIndexOf != -1 ? path.substring(0, lastIndexOf) : "/").build(), this.f13959b);
    }

    public String toString() {
        return "gs://" + this.f13958a.getAuthority() + this.f13958a.getEncodedPath();
    }

    /* renamed from: u */
    public String m18007u() {
        return this.f13958a.getPath();
    }

    /* renamed from: v */
    public C6401p m18008v() {
        return new C6401p(this.f13958a.buildUpon().path("").build(), this.f13959b);
    }

    /* renamed from: w */
    public C6382f m18009w() {
        return this.f13959b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public C7566h m18010x() {
        return new C7566h(this.f13958a, this.f13959b.m17862e());
    }

    /* renamed from: y */
    public Task<C6390j> m18011y(int i10) {
        C5276s.m13316b(i10 > 0, "maxResults must be greater than zero");
        C5276s.m13316b(i10 <= 1000, "maxResults must be at most 1000");
        return m17988B(Integer.valueOf(i10), null);
    }

    /* renamed from: z */
    public Task<C6390j> m18012z(int i10, String str) {
        C5276s.m13316b(i10 > 0, "maxResults must be greater than zero");
        C5276s.m13316b(i10 <= 1000, "maxResults must be at most 1000");
        C5276s.m13316b(str != null, "pageToken must be non-null to resume a previous list() operation");
        return m17988B(Integer.valueOf(i10), str);
    }
}
