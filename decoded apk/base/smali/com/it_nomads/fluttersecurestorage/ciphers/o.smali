.class public Lcom/it_nomads/fluttersecurestorage/ciphers/o;
.super Lcom/it_nomads/fluttersecurestorage/ciphers/h;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/it_nomads/fluttersecurestorage/ciphers/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/it_nomads/fluttersecurestorage/ciphers/h;-><init>(Landroid/content/Context;Lcom/it_nomads/fluttersecurestorage/ciphers/a;)V

    return-void
.end method


# virtual methods
.method protected c()Ljava/lang/String;
    .locals 1

    const-string v0, "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK"

    return-object v0
.end method

.method protected d()Ljavax/crypto/Cipher;
    .locals 1

    const-string v0, "AES/GCM/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    return-object v0
.end method

.method protected e()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method protected f([B)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    new-instance v0, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v1, 0x80

    invoke-direct {v0, v1, p1}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    return-object v0
.end method
