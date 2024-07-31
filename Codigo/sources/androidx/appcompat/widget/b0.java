package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private TextView f1380a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f1381b;

    /* loaded from: classes.dex */
    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassifier textClassifier;
            TextClassifier textClassifier2;
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                textClassifier2 = textClassificationManager.getTextClassifier();
                return textClassifier2;
            }
            textClassifier = TextClassifier.NO_OP;
            return textClassifier;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(TextView textView) {
        this.f1380a = (TextView) androidx.core.util.h.k(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1381b;
        return textClassifier == null ? a.a(this.f1380a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1381b = textClassifier;
    }
}
