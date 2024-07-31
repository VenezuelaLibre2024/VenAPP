package c1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f6792a;

    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f6793a;

        /* renamed from: b, reason: collision with root package name */
        private final d f6794b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6795c = true;

        a(TextView textView) {
            this.f6793a = textView;
            this.f6794b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f6794b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f6794b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> e(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> e10 = e(inputFilterArr);
            if (e10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - e10.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (e10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.f6793a.setFilters(a(this.f6793a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // c1.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f6795c ? f(inputFilterArr) : d(inputFilterArr);
        }

        @Override // c1.f.b
        void b(boolean z10) {
            if (z10) {
                j();
            }
        }

        @Override // c1.f.b
        void c(boolean z10) {
            this.f6795c = z10;
            j();
            i();
        }

        void g(boolean z10) {
            this.f6795c = z10;
        }

        void j() {
            this.f6793a.setTransformationMethod(l(this.f6793a.getTransformationMethod()));
        }

        TransformationMethod l(TransformationMethod transformationMethod) {
            return this.f6795c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        void b(boolean z10) {
            throw null;
        }

        void c(boolean z10) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f6796a;

        c(TextView textView) {
            this.f6796a = new a(textView);
        }

        private boolean d() {
            return !androidx.emoji2.text.e.h();
        }

        @Override // c1.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f6796a.a(inputFilterArr);
        }

        @Override // c1.f.b
        void b(boolean z10) {
            if (d()) {
                return;
            }
            this.f6796a.b(z10);
        }

        @Override // c1.f.b
        void c(boolean z10) {
            if (d()) {
                this.f6796a.g(z10);
            } else {
                this.f6796a.c(z10);
            }
        }
    }

    public f(TextView textView, boolean z10) {
        androidx.core.util.h.l(textView, "textView cannot be null");
        this.f6792a = !z10 ? new c(textView) : new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f6792a.a(inputFilterArr);
    }

    public void b(boolean z10) {
        this.f6792a.b(z10);
    }

    public void c(boolean z10) {
        this.f6792a.c(z10);
    }
}
