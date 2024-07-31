.class public final Lrb/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrb/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/Integer;

.field private b:Ljava/lang/Integer;

.field private c:Lrb/l$c;

.field private d:Lrb/l$d;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lrb/l$b;->a:Ljava/lang/Integer;

    iput-object v0, p0, Lrb/l$b;->b:Ljava/lang/Integer;

    iput-object v0, p0, Lrb/l$b;->c:Lrb/l$c;

    sget-object v0, Lrb/l$d;->e:Lrb/l$d;

    iput-object v0, p0, Lrb/l$b;->d:Lrb/l$d;

    return-void
.end method

.method synthetic constructor <init>(Lrb/l$a;)V
    .locals 0

    invoke-direct {p0}, Lrb/l$b;-><init>()V

    return-void
.end method

.method private static f(ILrb/l$c;)V
    .locals 3

    const/16 v0, 0xa

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lt p0, v0, :cond_a

    sget-object v0, Lrb/l$c;->b:Lrb/l$c;

    if-ne p1, v0, :cond_1

    const/16 p1, 0x14

    if-gt p0, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object v0, Lrb/l$c;->c:Lrb/l$c;

    if-ne p1, v0, :cond_3

    const/16 p1, 0x1c

    if-gt p0, p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    sget-object v0, Lrb/l$c;->d:Lrb/l$c;

    if-ne p1, v0, :cond_5

    const/16 p1, 0x20

    if-gt p0, p1, :cond_4

    return-void

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    sget-object v0, Lrb/l$c;->e:Lrb/l$c;

    if-ne p1, v0, :cond_7

    const/16 p1, 0x30

    if-gt p0, p1, :cond_6

    return-void

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    sget-object v0, Lrb/l$c;->f:Lrb/l$c;

    if-ne p1, v0, :cond_9

    const/16 p1, 0x40

    if-gt p0, p1, :cond_8

    return-void

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "unknown hash type; must be SHA256, SHA384 or SHA512"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "Invalid tag size in bytes %d; must be at least 10 bytes"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lrb/l;
    .locals 8

    iget-object v0, p0, Lrb/l$b;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lrb/l$b;->b:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lrb/l$b;->c:Lrb/l$c;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lrb/l$b;->d:Lrb/l$d;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lrb/l$b;->b:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lrb/l$b;->c:Lrb/l$c;

    invoke-static {v0, v1}, Lrb/l$b;->f(ILrb/l$c;)V

    new-instance v0, Lrb/l;

    iget-object v1, p0, Lrb/l$b;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v1, p0, Lrb/l$b;->b:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, p0, Lrb/l$b;->d:Lrb/l$d;

    iget-object v6, p0, Lrb/l$b;->c:Lrb/l$c;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lrb/l;-><init>(IILrb/l$d;Lrb/l$c;Lrb/l$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lrb/l$b;->a:Ljava/lang/Integer;

    aput-object v3, v1, v2

    const-string v2, "Invalid key size in bytes %d; must be at least 16 bytes"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "tag size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lrb/l$c;)Lrb/l$b;
    .locals 0

    iput-object p1, p0, Lrb/l$b;->c:Lrb/l$c;

    return-object p0
.end method

.method public c(I)Lrb/l$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lrb/l$b;->a:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(I)Lrb/l$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lrb/l$b;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public e(Lrb/l$d;)Lrb/l$b;
    .locals 0

    iput-object p1, p0, Lrb/l$b;->d:Lrb/l$d;

    return-object p0
.end method
