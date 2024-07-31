.class public final Lkb/v$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/Integer;

.field private b:Lkb/v$c;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lkb/v$b;->a:Ljava/lang/Integer;

    sget-object v0, Lkb/v$c;->d:Lkb/v$c;

    iput-object v0, p0, Lkb/v$b;->b:Lkb/v$c;

    return-void
.end method

.method synthetic constructor <init>(Lkb/v$a;)V
    .locals 0

    invoke-direct {p0}, Lkb/v$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lkb/v;
    .locals 4

    iget-object v0, p0, Lkb/v$b;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lkb/v$b;->b:Lkb/v$c;

    if-eqz v1, :cond_0

    new-instance v1, Lkb/v;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lkb/v$b;->b:Lkb/v$c;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lkb/v;-><init>(ILkb/v$c;Lkb/v$a;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(I)Lkb/v$b;
    .locals 3

    const/16 v0, 0x10

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Invalid key size %d; only 16-byte and 32-byte AES keys are supported"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lkb/v$b;->a:Ljava/lang/Integer;

    return-object p0
.end method

.method public c(Lkb/v$c;)Lkb/v$b;
    .locals 0

    iput-object p1, p0, Lkb/v$b;->b:Lkb/v$c;

    return-object p0
.end method
