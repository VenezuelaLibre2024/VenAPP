package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.storage.h0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class p implements Comparable<p> {

    /* renamed from: a */
    private final Uri f12719a;

    /* renamed from: b */
    private final f f12720b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ TaskCompletionSource f12721a;

        a(TaskCompletionSource taskCompletionSource) {
            this.f12721a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f12721a.setException(n.e(exc, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements OnSuccessListener<h0.d> {

        /* renamed from: a */
        final /* synthetic */ TaskCompletionSource f12723a;

        b(TaskCompletionSource taskCompletionSource) {
            this.f12723a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a */
        public void onSuccess(h0.d dVar) {
            if (this.f12723a.getTask().isComplete()) {
                return;
            }
            Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
            this.f12723a.setException(n.c(Status.f9294t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements h0.b {

        /* renamed from: a */
        final /* synthetic */ long f12725a;

        /* renamed from: b */
        final /* synthetic */ TaskCompletionSource f12726b;

        c(long j10, TaskCompletionSource taskCompletionSource) {
            this.f12725a = j10;
            this.f12726b = taskCompletionSource;
        }

        @Override // com.google.firebase.storage.h0.b
        public void a(h0.d dVar, InputStream inputStream) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                int i10 = 0;
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        byteArrayOutputStream.flush();
                        this.f12726b.setResult(byteArrayOutputStream.toByteArray());
                        return;
                    } else {
                        i10 += read;
                        if (i10 > this.f12725a) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements Continuation<j, Task<Void>> {

        /* renamed from: a */
        final /* synthetic */ List f12728a;

        /* renamed from: b */
        final /* synthetic */ List f12729b;

        /* renamed from: c */
        final /* synthetic */ Executor f12730c;

        /* renamed from: d */
        final /* synthetic */ TaskCompletionSource f12731d;

        d(List list, List list2, Executor executor, TaskCompletionSource taskCompletionSource) {
            this.f12728a = list;
            this.f12729b = list2;
            this.f12730c = executor;
            this.f12731d = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a */
        public Task<Void> then(Task<j> task) {
            if (task.isSuccessful()) {
                j result = task.getResult();
                this.f12728a.addAll(result.d());
                this.f12729b.addAll(result.b());
                if (result.c() != null) {
                    p.this.B(null, result.c()).continueWithTask(this.f12730c, this);
                } else {
                    this.f12731d.setResult(new j(this.f12728a, this.f12729b, null));
                }
            } else {
                this.f12731d.setException(task.getException());
            }
            return Tasks.forResult(null);
        }
    }

    public p(Uri uri, f fVar) {
        com.google.android.gms.common.internal.s.b(uri != null, "storageUri cannot be null");
        com.google.android.gms.common.internal.s.b(fVar != null, "FirebaseApp cannot be null");
        this.f12719a = uri;
        this.f12720b = fVar;
    }

    public Task<j> B(Integer num, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g0.b().f(new k(this, num, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<j> A() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Executor a10 = g0.b().a();
        B(null, null).continueWithTask(a10, new d(arrayList, arrayList2, a10, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public n0 C(byte[] bArr) {
        com.google.android.gms.common.internal.s.b(bArr != null, "bytes cannot be null");
        n0 n0Var = new n0(this, null, bArr);
        n0Var.b0();
        return n0Var;
    }

    public n0 D(byte[] bArr, o oVar) {
        com.google.android.gms.common.internal.s.b(bArr != null, "bytes cannot be null");
        com.google.android.gms.common.internal.s.b(oVar != null, "metadata cannot be null");
        n0 n0Var = new n0(this, oVar, bArr);
        n0Var.b0();
        return n0Var;
    }

    public n0 E(Uri uri) {
        com.google.android.gms.common.internal.s.b(uri != null, "uri cannot be null");
        n0 n0Var = new n0(this, null, uri, null);
        n0Var.b0();
        return n0Var;
    }

    public n0 F(Uri uri, o oVar) {
        com.google.android.gms.common.internal.s.b(uri != null, "uri cannot be null");
        com.google.android.gms.common.internal.s.b(oVar != null, "metadata cannot be null");
        n0 n0Var = new n0(this, oVar, uri, null);
        n0Var.b0();
        return n0Var;
    }

    public Task<o> G(o oVar) {
        com.google.android.gms.common.internal.s.j(oVar);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g0.b().f(new m0(this, taskCompletionSource, oVar));
        return taskCompletionSource.getTask();
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return ((p) obj).toString().equals(toString());
        }
        return false;
    }

    public p h(String str) {
        com.google.android.gms.common.internal.s.b(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        return new p(this.f12719a.buildUpon().appendEncodedPath(gf.d.b(gf.d.a(str))).build(), this.f12720b);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(p pVar) {
        return this.f12719a.compareTo(pVar.f12719a);
    }

    public Task<Void> l() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g0.b().f(new com.google.firebase.storage.d(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public zb.g m() {
        return w().a();
    }

    public String n() {
        return this.f12719a.getAuthority();
    }

    public Task<byte[]> o(long j10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h0 h0Var = new h0(this);
        h0Var.r0(new c(j10, taskCompletionSource)).addOnSuccessListener(new b(taskCompletionSource)).addOnFailureListener(new a(taskCompletionSource));
        h0Var.b0();
        return taskCompletionSource.getTask();
    }

    public Task<Uri> p() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g0.b().f(new h(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public e q(Uri uri) {
        e eVar = new e(this, uri);
        eVar.b0();
        return eVar;
    }

    public Task<o> r() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g0.b().f(new i(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public String s() {
        String path = this.f12719a.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    public p t() {
        String path = this.f12719a.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        if (path.equals("/")) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        return new p(this.f12719a.buildUpon().path(lastIndexOf != -1 ? path.substring(0, lastIndexOf) : "/").build(), this.f12720b);
    }

    public String toString() {
        return "gs://" + this.f12719a.getAuthority() + this.f12719a.getEncodedPath();
    }

    public String u() {
        return this.f12719a.getPath();
    }

    public p v() {
        return new p(this.f12719a.buildUpon().path("").build(), this.f12720b);
    }

    public f w() {
        return this.f12720b;
    }

    public gf.h x() {
        return new gf.h(this.f12719a, this.f12720b.e());
    }

    public Task<j> y(int i10) {
        com.google.android.gms.common.internal.s.b(i10 > 0, "maxResults must be greater than zero");
        com.google.android.gms.common.internal.s.b(i10 <= 1000, "maxResults must be at most 1000");
        return B(Integer.valueOf(i10), null);
    }

    public Task<j> z(int i10, String str) {
        com.google.android.gms.common.internal.s.b(i10 > 0, "maxResults must be greater than zero");
        com.google.android.gms.common.internal.s.b(i10 <= 1000, "maxResults must be at most 1000");
        com.google.android.gms.common.internal.s.b(str != null, "pageToken must be non-null to resume a previous list() operation");
        return B(Integer.valueOf(i10), str);
    }
}
