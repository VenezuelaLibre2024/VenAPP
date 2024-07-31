package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes.dex */
public class o extends h {
    public o(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.h
    protected String c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.h
    protected Cipher d() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.h
    protected int e() {
        return 12;
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.h
    protected AlgorithmParameterSpec f(byte[] bArr) {
        return new GCMParameterSpec(RecognitionOptions.ITF, bArr);
    }
}
