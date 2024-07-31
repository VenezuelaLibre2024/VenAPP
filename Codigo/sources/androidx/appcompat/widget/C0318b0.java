package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C0984h;

/* renamed from: androidx.appcompat.widget.b0 */
/* loaded from: classes.dex */
final class C0318b0 {

    /* renamed from: a */
    private TextView f1630a;

    /* renamed from: b */
    private TextClassifier f1631b;

    /* renamed from: androidx.appcompat.widget.b0$a */
    /* loaded from: classes.dex */
    private static final class a {
        /* renamed from: a */
        static TextClassifier m1612a(TextView textView) {
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
    public C0318b0(TextView textView) {
        this.f1630a = (TextView) C0984h.m4833k(textView);
    }

    /* renamed from: a */
    public TextClassifier m1610a() {
        TextClassifier textClassifier = this.f1631b;
        return textClassifier == null ? a.m1612a(this.f1630a) : textClassifier;
    }

    /* renamed from: b */
    public void m1611b(TextClassifier textClassifier) {
        this.f1631b = textClassifier;
    }
}
