package p033c1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.C0984h;
import androidx.emoji2.text.C1227e;

/* renamed from: c1.f */
/* loaded from: classes.dex */
public final class C1833f {

    /* renamed from: a */
    private final b f7741a;

    /* renamed from: c1.f$a */
    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: a */
        private final TextView f7742a;

        /* renamed from: b */
        private final C1831d f7743b;

        /* renamed from: c */
        private boolean f7744c = true;

        a(TextView textView) {
            this.f7742a = textView;
            this.f7743b = new C1831d(textView);
        }

        /* renamed from: d */
        private InputFilter[] m9852d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f7743b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f7743b;
            return inputFilterArr2;
        }

        /* renamed from: e */
        private SparseArray<InputFilter> m9853e(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof C1831d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        /* renamed from: f */
        private InputFilter[] m9854f(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> m9853e = m9853e(inputFilterArr);
            if (m9853e.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - m9853e.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (m9853e.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: h */
        private TransformationMethod m9855h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C1835h ? ((C1835h) transformationMethod).m9869a() : transformationMethod;
        }

        /* renamed from: i */
        private void m9856i() {
            this.f7742a.setFilters(mo9858a(this.f7742a.getFilters()));
        }

        /* renamed from: k */
        private TransformationMethod m9857k(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C1835h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C1835h(transformationMethod);
        }

        @Override // p033c1.C1833f.b
        /* renamed from: a */
        InputFilter[] mo9858a(InputFilter[] inputFilterArr) {
            return !this.f7744c ? m9854f(inputFilterArr) : m9852d(inputFilterArr);
        }

        @Override // p033c1.C1833f.b
        /* renamed from: b */
        void mo9859b(boolean z10) {
            if (z10) {
                m9862j();
            }
        }

        @Override // p033c1.C1833f.b
        /* renamed from: c */
        void mo9860c(boolean z10) {
            this.f7744c = z10;
            m9862j();
            m9856i();
        }

        /* renamed from: g */
        void m9861g(boolean z10) {
            this.f7744c = z10;
        }

        /* renamed from: j */
        void m9862j() {
            this.f7742a.setTransformationMethod(m9863l(this.f7742a.getTransformationMethod()));
        }

        /* renamed from: l */
        TransformationMethod m9863l(TransformationMethod transformationMethod) {
            return this.f7744c ? m9857k(transformationMethod) : m9855h(transformationMethod);
        }
    }

    /* renamed from: c1.f$b */
    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        /* renamed from: a */
        InputFilter[] mo9858a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* renamed from: b */
        void mo9859b(boolean z10) {
            throw null;
        }

        /* renamed from: c */
        void mo9860c(boolean z10) {
            throw null;
        }
    }

    /* renamed from: c1.f$c */
    /* loaded from: classes.dex */
    private static class c extends b {

        /* renamed from: a */
        private final a f7745a;

        c(TextView textView) {
            this.f7745a = new a(textView);
        }

        /* renamed from: d */
        private boolean m9864d() {
            return !C1227e.m6626h();
        }

        @Override // p033c1.C1833f.b
        /* renamed from: a */
        InputFilter[] mo9858a(InputFilter[] inputFilterArr) {
            return m9864d() ? inputFilterArr : this.f7745a.mo9858a(inputFilterArr);
        }

        @Override // p033c1.C1833f.b
        /* renamed from: b */
        void mo9859b(boolean z10) {
            if (m9864d()) {
                return;
            }
            this.f7745a.mo9859b(z10);
        }

        @Override // p033c1.C1833f.b
        /* renamed from: c */
        void mo9860c(boolean z10) {
            if (m9864d()) {
                this.f7745a.m9861g(z10);
            } else {
                this.f7745a.mo9860c(z10);
            }
        }
    }

    public C1833f(TextView textView, boolean z10) {
        C0984h.m4834l(textView, "textView cannot be null");
        this.f7741a = !z10 ? new c(textView) : new a(textView);
    }

    /* renamed from: a */
    public InputFilter[] m9849a(InputFilter[] inputFilterArr) {
        return this.f7741a.mo9858a(inputFilterArr);
    }

    /* renamed from: b */
    public void m9850b(boolean z10) {
        this.f7741a.mo9859b(z10);
    }

    /* renamed from: c */
    public void m9851c(boolean z10) {
        this.f7741a.mo9860c(z10);
    }
}
