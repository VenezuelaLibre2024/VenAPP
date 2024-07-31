.class public final Ljb/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljb/n$b;
    }
.end annotation


# instance fields
.field private final a:Lvb/c0;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljb/n$b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ltb/a;


# direct methods
.method private constructor <init>(Lvb/c0;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvb/c0;",
            "Ljava/util/List<",
            "Ljb/n$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/n;->a:Lvb/c0;

    iput-object p2, p0, Ljb/n;->b:Ljava/util/List;

    sget-object p1, Ltb/a;->b:Ltb/a;

    iput-object p1, p0, Ljb/n;->c:Ltb/a;

    return-void
.end method

.method private static a(Lvb/t;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lvb/t;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static b(Lvb/c0;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lvb/c0;->b0()I

    move-result p0

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static c(Lvb/t;Ljb/a;[B)Lvb/c0;
    .locals 0

    :try_start_0
    invoke-virtual {p0}, Lvb/t;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->w()[B

    move-result-object p0

    invoke-interface {p1, p0, p2}, Ljb/a;->b([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object p1

    invoke-static {p0, p1}, Lvb/c0;->g0([BLcom/google/crypto/tink/shaded/protobuf/p;)Lvb/c0;

    move-result-object p0

    invoke-static {p0}, Ljb/n;->b(Lvb/c0;)V
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static d(Lvb/c0;Ljb/a;[B)Lvb/t;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->h()[B

    move-result-object v0

    invoke-interface {p1, v0, p2}, Ljb/a;->a([B[B)[B

    move-result-object v0

    :try_start_0
    invoke-interface {p1, v0, p2}, Ljb/a;->b([B[B)[B

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object p2

    invoke-static {p1, p2}, Lvb/c0;->g0([BLcom/google/crypto/tink/shaded/protobuf/p;)Lvb/c0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    invoke-static {}, Lvb/t;->Z()Lvb/t$b;

    move-result-object p1

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->k([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p2

    invoke-virtual {p1, p2}, Lvb/t$b;->A(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/t$b;

    move-result-object p1

    invoke-static {p0}, Ljb/z;->b(Lvb/c0;)Lvb/d0;

    move-result-object p0

    invoke-virtual {p1, p0}, Lvb/t$b;->B(Lvb/d0;)Lvb/t$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/t;

    return-object p0

    :cond_0
    :try_start_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "cannot encrypt keyset"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static final e(Lvb/c0;)Ljb/n;
    .locals 2

    invoke-static {p0}, Ljb/n;->b(Lvb/c0;)V

    invoke-static {p0}, Ljb/n;->f(Lvb/c0;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljb/n;

    invoke-direct {v1, p0, v0}, Ljb/n;-><init>(Lvb/c0;Ljava/util/List;)V

    return-object v1
.end method

.method private static f(Lvb/c0;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvb/c0;",
            ")",
            "Ljava/util/List<",
            "Ljb/n$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lvb/c0;->b0()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Lvb/c0;->c0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvb/c0$c;

    invoke-virtual {v2}, Lvb/c0$c;->b0()I

    move-result v6

    invoke-static {v2}, Ljb/n;->q(Lvb/c0$c;)Lcom/google/crypto/tink/internal/o;

    move-result-object v3

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/internal/i;->a()Lcom/google/crypto/tink/internal/i;

    move-result-object v4

    invoke-static {}, Ljb/f;->a()Ljb/y;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Lcom/google/crypto/tink/internal/i;->d(Lcom/google/crypto/tink/internal/o;Ljb/y;)Ljb/g;

    move-result-object v4

    new-instance v9, Ljb/n$b;

    invoke-virtual {v2}, Lvb/c0$c;->d0()Lvb/z;

    move-result-object v2

    invoke-static {v2}, Ljb/n;->m(Lvb/z;)Ljb/k;

    move-result-object v5

    invoke-virtual {p0}, Lvb/c0;->d0()I

    move-result v2

    if-ne v6, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    move v7, v2

    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Ljb/n$b;-><init>(Ljb/g;Ljb/k;IZLjb/n$a;)V

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private g(Ljb/g;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B:",
            "Ljava/lang/Object;",
            ">(",
            "Ljb/g;",
            "Ljava/lang/Class<",
            "TB;>;)TB;"
        }
    .end annotation

    :try_start_0
    invoke-static {p1, p2}, Ljb/x;->c(Ljb/g;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private static j(Lvb/c0$c;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B:",
            "Ljava/lang/Object;",
            ">(",
            "Lvb/c0$c;",
            "Ljava/lang/Class<",
            "TB;>;)TB;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lvb/c0$c;->a0()Lvb/y;

    move-result-object p0

    invoke-static {p0, p1}, Ljb/x;->g(Lvb/y;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "No key manager found for key type "

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, " not supported by key manager of type "

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    throw p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private l(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TP;>;",
            "Ljava/lang/Class<",
            "TB;>;)TP;"
        }
    .end annotation

    iget-object v0, p0, Ljb/n;->a:Lvb/c0;

    invoke-static {v0}, Ljb/z;->d(Lvb/c0;)V

    invoke-static {p2}, Ljb/v;->j(Ljava/lang/Class;)Ljb/v$b;

    move-result-object v0

    iget-object v1, p0, Ljb/n;->c:Ltb/a;

    invoke-virtual {v0, v1}, Ljb/v$b;->e(Ltb/a;)Ljb/v$b;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljb/n;->p()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Ljb/n;->a:Lvb/c0;

    invoke-virtual {v2, v1}, Lvb/c0;->a0(I)Lvb/c0$c;

    move-result-object v2

    invoke-virtual {v2}, Lvb/c0$c;->d0()Lvb/z;

    move-result-object v3

    sget-object v4, Lvb/z;->ENABLED:Lvb/z;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2, p2}, Ljb/n;->j(Lvb/c0$c;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Ljb/n;->b:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Ljb/n;->b:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljb/n$b;

    invoke-virtual {v4}, Ljb/n$b;->a()Ljb/g;

    move-result-object v4

    invoke-direct {p0, v4, p2}, Ljb/n;->g(Ljb/g;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v2}, Lvb/c0$c;->b0()I

    move-result v5

    iget-object v6, p0, Ljb/n;->a:Lvb/c0;

    invoke-virtual {v6}, Lvb/c0;->d0()I

    move-result v6

    if-ne v5, v6, :cond_1

    invoke-virtual {v0, v4, v3, v2}, Ljb/v$b;->b(Ljava/lang/Object;Ljava/lang/Object;Lvb/c0$c;)Ljb/v$b;

    goto :goto_2

    :cond_1
    invoke-virtual {v0, v4, v3, v2}, Ljb/v$b;->a(Ljava/lang/Object;Ljava/lang/Object;Lvb/c0$c;)Ljb/v$b;

    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljb/v$b;->d()Ljb/v;

    move-result-object p2

    invoke-static {p2, p1}, Ljb/x;->o(Ljb/v;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static m(Lvb/z;)Ljb/k;
    .locals 1

    sget-object v0, Ljb/n$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Ljb/k;->d:Ljb/k;

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Ljb/k;->c:Ljb/k;

    return-object p0

    :cond_2
    sget-object p0, Ljb/k;->b:Ljb/k;

    return-object p0
.end method

.method public static final n(Ljb/p;Ljb/a;)Ljb/n;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-static {p0, p1, v0}, Ljb/n;->o(Ljb/p;Ljb/a;[B)Ljb/n;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Ljb/p;Ljb/a;[B)Ljb/n;
    .locals 0

    invoke-interface {p0}, Ljb/p;->a()Lvb/t;

    move-result-object p0

    invoke-static {p0}, Ljb/n;->a(Lvb/t;)V

    invoke-static {p0, p1, p2}, Ljb/n;->c(Lvb/t;Ljb/a;[B)Lvb/c0;

    move-result-object p0

    invoke-static {p0}, Ljb/n;->e(Lvb/c0;)Ljb/n;

    move-result-object p0

    return-object p0
.end method

.method private static q(Lvb/c0$c;)Lcom/google/crypto/tink/internal/o;
    .locals 4

    invoke-virtual {p0}, Lvb/c0$c;->b0()I

    move-result v0

    invoke-virtual {p0}, Lvb/c0$c;->c0()Lvb/i0;

    move-result-object v1

    sget-object v2, Lvb/i0;->RAW:Lvb/i0;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lvb/c0$c;->a0()Lvb/y;

    move-result-object v1

    invoke-virtual {v1}, Lvb/y;->b0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lvb/c0$c;->a0()Lvb/y;

    move-result-object v2

    invoke-virtual {v2}, Lvb/y;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {p0}, Lvb/c0$c;->a0()Lvb/y;

    move-result-object v3

    invoke-virtual {v3}, Lvb/y;->a0()Lvb/y$c;

    move-result-object v3

    invoke-virtual {p0}, Lvb/c0$c;->c0()Lvb/i0;

    move-result-object p0

    invoke-static {v1, v2, v3, p0, v0}, Lcom/google/crypto/tink/internal/o;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lvb/y$c;Lvb/i0;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/o;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/crypto/tink/internal/s;

    const-string v1, "Creating a protokey serialization failed"

    invoke-direct {v0, v1, p0}, Lcom/google/crypto/tink/internal/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method h()Lvb/c0;
    .locals 1

    iget-object v0, p0, Ljb/n;->a:Lvb/c0;

    return-object v0
.end method

.method public i()Lvb/d0;
    .locals 1

    iget-object v0, p0, Ljb/n;->a:Lvb/c0;

    invoke-static {v0}, Ljb/z;->b(Lvb/c0;)Lvb/d0;

    move-result-object v0

    return-object v0
.end method

.method public k(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    invoke-static {p1}, Ljb/x;->d(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, v0}, Ljb/n;->l(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No wrapper found for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public p()I
    .locals 1

    iget-object v0, p0, Ljb/n;->a:Lvb/c0;

    invoke-virtual {v0}, Lvb/c0;->b0()I

    move-result v0

    return v0
.end method

.method public r(Ljb/q;Ljb/a;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-virtual {p0, p1, p2, v0}, Ljb/n;->s(Ljb/q;Ljb/a;[B)V

    return-void
.end method

.method public s(Ljb/q;Ljb/a;[B)V
    .locals 1

    iget-object v0, p0, Ljb/n;->a:Lvb/c0;

    invoke-static {v0, p2, p3}, Ljb/n;->d(Lvb/c0;Ljb/a;[B)Lvb/t;

    move-result-object p2

    invoke-interface {p1, p2}, Ljb/q;->a(Lvb/t;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljb/n;->i()Lvb/d0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
