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
import androidx.core.view.c;

/* loaded from: classes.dex */
final class v {

    /* loaded from: classes.dex */
    private static final class a {
        static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                androidx.core.view.x0.P(textView, new c.a(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th2) {
                textView.endBatchEdit();
                throw th2;
            }
        }

        static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            androidx.core.view.x0.P(view, new c.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && androidx.core.view.x0.x(view) != null) {
            Activity c10 = c(view);
            if (c10 == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.a(dragEvent, (TextView) view, c10) : a.b(dragEvent, view, c10);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 31 || androidx.core.view.x0.x(textView) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            androidx.core.view.x0.P(textView, new c.a(primaryClip, 1).c(i10 != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    static Activity c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
