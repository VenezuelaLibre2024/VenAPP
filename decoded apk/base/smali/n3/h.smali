.class public Ln3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/f;


# instance fields
.field private final b:Ln3/i;

.field private final c:Ljava/net/URL;

.field private final d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/net/URL;

.field private volatile g:[B

.field private h:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ln3/i;->b:Ln3/i;

    invoke-direct {p0, p1, v0}, Ln3/h;-><init>(Ljava/lang/String;Ln3/i;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ln3/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ln3/h;->c:Ljava/net/URL;

    invoke-static {p1}, Lc4/k;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ln3/h;->d:Ljava/lang/String;

    invoke-static {p2}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln3/i;

    iput-object p1, p0, Ln3/h;->b:Ln3/i;

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;)V
    .locals 1

    sget-object v0, Ln3/i;->b:Ln3/i;

    invoke-direct {p0, p1, v0}, Ln3/h;-><init>(Ljava/net/URL;Ln3/i;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Ln3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/URL;

    iput-object p1, p0, Ln3/h;->c:Ljava/net/URL;

    const/4 p1, 0x0

    iput-object p1, p0, Ln3/h;->d:Ljava/lang/String;

    invoke-static {p2}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln3/i;

    iput-object p1, p0, Ln3/h;->b:Ln3/i;

    return-void
.end method

.method private d()[B
    .locals 2

    iget-object v0, p0, Ln3/h;->g:[B

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln3/h;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lh3/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Ln3/h;->g:[B

    :cond_0
    iget-object v0, p0, Ln3/h;->g:[B

    return-object v0
.end method

.method private f()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ln3/h;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ln3/h;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Ln3/h;->c:Ljava/net/URL;

    invoke-static {v0}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string v1, "@#&=*+-_.,:!?()/~\'%;$"

    invoke-static {v0, v1}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ln3/h;->e:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Ln3/h;->e:Ljava/lang/String;

    return-object v0
.end method

.method private g()Ljava/net/URL;
    .locals 2

    iget-object v0, p0, Ln3/h;->f:Ljava/net/URL;

    if-nez v0, :cond_0

    new-instance v0, Ljava/net/URL;

    invoke-direct {p0}, Ln3/h;->f()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ln3/h;->f:Ljava/net/URL;

    :cond_0
    iget-object v0, p0, Ln3/h;->f:Ljava/net/URL;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/security/MessageDigest;)V
    .locals 1

    invoke-direct {p0}, Ln3/h;->d()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln3/h;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln3/h;->c:Ljava/net/URL;

    invoke-static {v0}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln3/h;->b:Ln3/i;

    invoke-interface {v0}, Ln3/i;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ln3/h;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ln3/h;

    invoke-virtual {p0}, Ln3/h;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ln3/h;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln3/h;->b:Ln3/i;

    iget-object p1, p1, Ln3/h;->b:Ln3/i;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public h()Ljava/net/URL;
    .locals 1

    invoke-direct {p0}, Ln3/h;->g()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Ln3/h;->h:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln3/h;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iput v0, p0, Ln3/h;->h:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ln3/h;->b:Ln3/i;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Ln3/h;->h:I

    :cond_0
    iget v0, p0, Ln3/h;->h:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ln3/h;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
