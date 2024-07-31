.class public final Lrb/k;
.super Lcom/google/crypto/tink/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d<",
        "Lvb/v;",
        ">;"
    }
.end annotation


# static fields
.field private static final d:Lcom/google/crypto/tink/internal/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/internal/l<",
            "Lrb/i;",
            "Lrb/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrb/j;

    invoke-direct {v0}, Lrb/j;-><init>()V

    const-class v1, Lrb/i;

    const-class v2, Lrb/g;

    invoke-static {v0, v1, v2}, Lcom/google/crypto/tink/internal/l;->b(Lcom/google/crypto/tink/internal/l$b;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/crypto/tink/internal/l;

    move-result-object v0

    sput-object v0, Lrb/k;->d:Lcom/google/crypto/tink/internal/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lrb/k$a;

    const-class v2, Ljb/t;

    invoke-direct {v1, v2}, Lrb/k$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lvb/v;

    invoke-direct {p0, v1, v0}, Lcom/google/crypto/tink/internal/d;-><init>(Ljava/lang/Class;[Lcom/google/crypto/tink/internal/m;)V

    return-void
.end method

.method static synthetic k(Lvb/x;)V
    .locals 0

    invoke-static {p0}, Lrb/k;->r(Lvb/x;)V

    return-void
.end method

.method static synthetic l(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrb/k;->m(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static m(IILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lvb/u;",
            "Ljb/l$b;",
            ")",
            "Lcom/google/crypto/tink/internal/d$a$a<",
            "Lvb/w;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-static {}, Lvb/w;->b0()Lvb/w$b;

    move-result-object v1

    invoke-static {}, Lvb/x;->b0()Lvb/x$b;

    move-result-object v2

    invoke-virtual {v2, p2}, Lvb/x$b;->A(Lvb/u;)Lvb/x$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lvb/x$b;->B(I)Lvb/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/x;

    invoke-virtual {v1, p1}, Lvb/w$b;->B(Lvb/x;)Lvb/w$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lvb/w$b;->A(I)Lvb/w$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/w;

    invoke-direct {v0, p0, p3}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    return-object v0
.end method

.method public static p(Z)V
    .locals 1

    new-instance v0, Lrb/k;

    invoke-direct {v0}, Lrb/k;-><init>()V

    invoke-static {v0, p0}, Ljb/x;->l(Lcom/google/crypto/tink/internal/d;Z)V

    invoke-static {}, Lrb/n;->c()V

    invoke-static {}, Lcom/google/crypto/tink/internal/h;->c()Lcom/google/crypto/tink/internal/h;

    move-result-object p0

    sget-object v0, Lrb/k;->d:Lcom/google/crypto/tink/internal/l;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/internal/h;->d(Lcom/google/crypto/tink/internal/l;)V

    return-void
.end method

.method private static r(Lvb/x;)V
    .locals 3

    invoke-virtual {p0}, Lvb/x;->a0()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_a

    sget-object v0, Lrb/k$c;->a:[I

    invoke-virtual {p0}, Lvb/x;->Z()Lvb/u;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "tag size too big"

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lvb/x;->a0()I

    move-result p0

    const/16 v0, 0x40

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-virtual {p0}, Lvb/x;->a0()I

    move-result p0

    const/16 v0, 0x30

    if-gt p0, v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-virtual {p0}, Lvb/x;->a0()I

    move-result p0

    const/16 v0, 0x20

    if-gt p0, v0, :cond_5

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p0}, Lvb/x;->a0()I

    move-result p0

    const/16 v0, 0x1c

    if-gt p0, v0, :cond_7

    goto :goto_0

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    invoke-virtual {p0}, Lvb/x;->a0()I

    move-result p0

    const/16 v0, 0x14

    if-gt p0, v0, :cond_9

    :goto_0
    return-void

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too small"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Lob/b$b;
    .locals 1

    sget-object v0, Lob/b$b;->ALGORITHM_REQUIRES_BORINGCRYPTO:Lob/b$b;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    return-object v0
.end method

.method public f()Lcom/google/crypto/tink/internal/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/internal/d$a<",
            "Lvb/w;",
            "Lvb/v;",
            ">;"
        }
    .end annotation

    new-instance v0, Lrb/k$b;

    const-class v1, Lvb/w;

    invoke-direct {v0, p0, v1}, Lrb/k$b;-><init>(Lrb/k;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lvb/y$c;
    .locals 1

    sget-object v0, Lvb/y$c;->SYMMETRIC:Lvb/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lrb/k;->o(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/v;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/v;

    invoke-virtual {p0, p1}, Lrb/k;->q(Lvb/v;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/v;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/v;->e0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/v;

    move-result-object p1

    return-object p1
.end method

.method public q(Lvb/v;)V
    .locals 2

    invoke-virtual {p1}, Lvb/v;->c0()I

    move-result v0

    invoke-virtual {p0}, Lrb/k;->n()I

    move-result v1

    invoke-static {v0, v1}, Lwb/r;->c(II)V

    invoke-virtual {p1}, Lvb/v;->a0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lvb/v;->b0()Lvb/x;

    move-result-object p1

    invoke-static {p1}, Lrb/k;->r(Lvb/x;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
