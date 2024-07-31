package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1016c;
import androidx.core.view.C1116x0;

/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
final class C0377v {

    /* renamed from: androidx.appcompat.widget.v$a */
    /* loaded from: classes.dex */
    private static final class a {
        /* renamed from: a */
        static boolean m2029a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C1116x0.m5251P(textView, new C1016c.a(dragEvent.getClipData(), 3).m4953a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th2) {
                textView.endBatchEdit();
                throw th2;
            }
        }

        /* renamed from: b */
        static boolean m2030b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C1116x0.m5251P(view, new C1016c.a(dragEvent.getClipData(), 3).m4953a());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m2026a(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C1116x0.m5299x(view) != null) {
            Activity m2028c = m2028c(view);
            if (m2028c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.m2029a(dragEvent, (TextView) view, m2028c) : a.m2030b(dragEvent, view, m2028c);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m2027b(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 31 || C1116x0.m5299x(textView) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C1116x0.m5251P(textView, new C1016c.a(primaryClip, 1).m4955c(i10 != 16908322 ? 1 : 0).m4953a());
        }
        return true;
    }

    /* renamed from: c */
    static Activity m2028c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
