package p355t0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.C0979c;
import androidx.core.util.C0984h;
import androidx.core.view.C1016c;
import androidx.core.view.C1116x0;

/* renamed from: t0.f */
/* loaded from: classes.dex */
public final class C10966f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0.f$a */
    /* loaded from: classes.dex */
    public class a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ c f27872a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f27872a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f27872a.mo33461a(C10971k.m33472f(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0.f$b */
    /* loaded from: classes.dex */
    public class b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ c f27873a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f27873a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C10966f.m33466e(str, bundle, this.f27873a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: t0.f$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        boolean mo33461a(C10971k c10971k, int i10, Bundle bundle);
    }

    /* renamed from: b */
    private static c m33463b(final View view) {
        C0984h.m4833k(view);
        return new c() { // from class: t0.e
            @Override // p355t0.C10966f.c
            /* renamed from: a */
            public final boolean mo33461a(C10971k c10971k, int i10, Bundle bundle) {
                boolean m33467f;
                m33467f = C10966f.m33467f(view, c10971k, i10, bundle);
                return m33467f;
            }
        };
    }

    /* renamed from: c */
    public static InputConnection m33464c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m33465d(inputConnection, editorInfo, m33463b(view));
    }

    @Deprecated
    /* renamed from: d */
    public static InputConnection m33465d(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        C0979c.m4815d(inputConnection, "inputConnection must be non-null");
        C0979c.m4815d(editorInfo, "editorInfo must be non-null");
        C0979c.m4815d(cVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, cVar) : C10964d.m33452a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: e */
    static boolean m33466e(String str, Bundle bundle, c cVar) {
        boolean z10;
        ResultReceiver resultReceiver;
        ?? r02 = 0;
        r02 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z10 = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z10 = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
            Uri uri2 = (Uri) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
            int i10 = bundle.getInt(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
            Bundle bundle2 = (Bundle) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
            if (uri != null && clipDescription != null) {
                r02 = cVar.mo33461a(new C10971k(uri, clipDescription, uri2), i10, bundle2);
            }
            if (resultReceiver != 0) {
                resultReceiver.send(r02, null);
            }
            return r02;
        } catch (Throwable th3) {
            th = th3;
            if (resultReceiver != 0) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ boolean m33467f(View view, C10971k c10971k, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                c10971k.m33476d();
                InputContentInfo inputContentInfo = (InputContentInfo) c10971k.m33477e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        return C1116x0.m5251P(view, new C1016c.a(new ClipData(c10971k.m33474b(), new ClipData.Item(c10971k.m33473a())), 2).m4956d(c10971k.m33475c()).m4954b(bundle).m4953a()) == null;
    }
}
