.class public Lcom/it_nomads/fluttersecurestorage/ciphers/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/it_nomads/fluttersecurestorage/ciphers/i;


# instance fields
.field private final a:Ljavax/crypto/Cipher;

.field private final b:Ljava/security/SecureRandom;

.field private c:Ljava/security/Key;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/it_nomads/fluttersecurestorage/ciphers/a;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->b:Ljava/security/SecureRandom;

    invoke-virtual {p0}, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlutterSecureKeyStorage"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const/4 v3, 0x0

    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->d()Ljavax/crypto/Cipher;

    move-result-object v3

    iput-object v3, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->a:Ljavax/crypto/Cipher;

    const-string v3, "AES"

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    invoke-interface {p2, p1, v3}, Lcom/it_nomads/fluttersecurestorage/ciphers/a;->b([BLjava/lang/String;)Ljava/security/Key;

    move-result-object p1

    iput-object p1, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->c:Ljava/security/Key;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v4, "StorageCipher18Impl"

    const-string v5, "unwrap key failed"

    invoke-static {v4, v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/16 p1, 0x10

    new-array p1, p1, [B

    iget-object v4, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->b:Ljava/security/SecureRandom;

    invoke-virtual {v4, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v4, p1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v4, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->c:Ljava/security/Key;

    invoke-interface {p2, v4}, Lcom/it_nomads/fluttersecurestorage/ciphers/a;->a(Ljava/security/Key;)[B

    move-result-object p1

    invoke-static {p1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public a([B)[B
    .locals 6

    invoke-virtual {p0}, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->e()I

    move-result v0

    new-array v1, v0, [B

    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->b:Ljava/security/SecureRandom;

    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-virtual {p0, v1}, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->f([B)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v2

    iget-object v3, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->a:Ljavax/crypto/Cipher;

    const/4 v4, 0x1

    iget-object v5, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->c:Ljava/security/Key;

    invoke-virtual {v3, v4, v5, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->a:Ljavax/crypto/Cipher;

    invoke-virtual {v2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    array-length v2, p1

    add-int/2addr v2, v0

    new-array v2, v2, [B

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v1, p1

    invoke-static {p1, v3, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

.method public b([B)[B
    .locals 5

    invoke-virtual {p0}, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->e()I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-static {p1, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0, v1}, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->f([B)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v1

    array-length v3, p1

    invoke-virtual {p0}, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->e()I

    move-result v4

    sub-int/2addr v3, v4

    new-array v4, v3, [B

    invoke-static {p1, v0, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->a:Ljavax/crypto/Cipher;

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->c:Ljava/security/Key;

    invoke-virtual {p1, v0, v2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    iget-object p1, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/h;->a:Ljavax/crypto/Cipher;

    invoke-virtual {p1, v4}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    return-object p1
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    const-string v0, "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK"

    return-object v0
.end method

.method protected d()Ljavax/crypto/Cipher;
    .locals 1

    const-string v0, "AES/CBC/PKCS7Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    return-object v0
.end method

.method protected e()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method protected f([B)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 1

    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v0, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    return-object v0
.end method
