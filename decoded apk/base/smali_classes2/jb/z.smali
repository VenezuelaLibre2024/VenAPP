.class final Ljb/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ljb/z;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public static a(Lvb/c0$c;)Lvb/d0$c;
    .locals 2

    invoke-static {}, Lvb/d0$c;->b0()Lvb/d0$c$a;

    move-result-object v0

    invoke-virtual {p0}, Lvb/c0$c;->a0()Lvb/y;

    move-result-object v1

    invoke-virtual {v1}, Lvb/y;->b0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvb/d0$c$a;->D(Ljava/lang/String;)Lvb/d0$c$a;

    move-result-object v0

    invoke-virtual {p0}, Lvb/c0$c;->d0()Lvb/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvb/d0$c$a;->C(Lvb/z;)Lvb/d0$c$a;

    move-result-object v0

    invoke-virtual {p0}, Lvb/c0$c;->c0()Lvb/i0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvb/d0$c$a;->B(Lvb/i0;)Lvb/d0$c$a;

    move-result-object v0

    invoke-virtual {p0}, Lvb/c0$c;->b0()I

    move-result p0

    invoke-virtual {v0, p0}, Lvb/d0$c$a;->A(I)Lvb/d0$c$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/d0$c;

    return-object p0
.end method

.method public static b(Lvb/c0;)Lvb/d0;
    .locals 2

    invoke-static {}, Lvb/d0;->b0()Lvb/d0$b;

    move-result-object v0

    invoke-virtual {p0}, Lvb/c0;->d0()I

    move-result v1

    invoke-virtual {v0, v1}, Lvb/d0$b;->B(I)Lvb/d0$b;

    move-result-object v0

    invoke-virtual {p0}, Lvb/c0;->c0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvb/c0$c;

    invoke-static {v1}, Ljb/z;->a(Lvb/c0$c;)Lvb/d0$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvb/d0$b;->A(Lvb/d0$c;)Lvb/d0$b;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/d0;

    return-object p0
.end method

.method public static c(Lvb/c0$c;)V
    .locals 4

    invoke-virtual {p0}, Lvb/c0$c;->e0()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lvb/c0$c;->c0()Lvb/i0;

    move-result-object v0

    sget-object v3, Lvb/i0;->UNKNOWN_PREFIX:Lvb/i0;

    if-eq v0, v3, :cond_1

    invoke-virtual {p0}, Lvb/c0$c;->d0()Lvb/z;

    move-result-object v0

    sget-object v3, Lvb/z;->UNKNOWN_STATUS:Lvb/z;

    if-eq v0, v3, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lvb/c0$c;->b0()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v1

    const-string p0, "key %d has unknown status"

    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lvb/c0$c;->b0()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v1

    const-string p0, "key %d has unknown prefix"

    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lvb/c0$c;->b0()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v1

    const-string p0, "key %d has no key data"

    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Lvb/c0;)V
    .locals 9

    invoke-virtual {p0}, Lvb/c0;->d0()I

    move-result v0

    invoke-virtual {p0}, Lvb/c0;->c0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v1

    move v4, v3

    move v5, v2

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lvb/c0$c;

    invoke-virtual {v6}, Lvb/c0$c;->d0()Lvb/z;

    move-result-object v7

    sget-object v8, Lvb/z;->ENABLED:Lvb/z;

    if-eq v7, v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v6}, Ljb/z;->c(Lvb/c0$c;)V

    invoke-virtual {v6}, Lvb/c0$c;->b0()I

    move-result v7

    if-ne v7, v0, :cond_2

    if-nez v4, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset contains multiple primary keys"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_1
    invoke-virtual {v6}, Lvb/c0$c;->a0()Lvb/y;

    move-result-object v6

    invoke-virtual {v6}, Lvb/y;->a0()Lvb/y$c;

    move-result-object v6

    sget-object v7, Lvb/y$c;->ASYMMETRIC_PUBLIC:Lvb/y$c;

    if-eq v6, v7, :cond_3

    move v5, v1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    if-eqz v3, :cond_7

    if-nez v4, :cond_6

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset doesn\'t contain a valid primary key"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_2
    return-void

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset must contain at least one ENABLED key"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
