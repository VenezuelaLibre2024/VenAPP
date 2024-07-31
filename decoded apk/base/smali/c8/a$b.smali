.class public final Lc8/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:B

.field private d:I

.field private e:J

.field private f:I

.field private g:[B

.field private h:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lc8/a;->a()[B

    move-result-object v0

    iput-object v0, p0, Lc8/a$b;->g:[B

    invoke-static {}, Lc8/a;->a()[B

    move-result-object v0

    iput-object v0, p0, Lc8/a$b;->h:[B

    return-void
.end method

.method static synthetic a(Lc8/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lc8/a$b;->a:Z

    return p0
.end method

.method static synthetic b(Lc8/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lc8/a$b;->b:Z

    return p0
.end method

.method static synthetic c(Lc8/a$b;)B
    .locals 0

    iget-byte p0, p0, Lc8/a$b;->c:B

    return p0
.end method

.method static synthetic d(Lc8/a$b;)I
    .locals 0

    iget p0, p0, Lc8/a$b;->d:I

    return p0
.end method

.method static synthetic e(Lc8/a$b;)J
    .locals 2

    iget-wide v0, p0, Lc8/a$b;->e:J

    return-wide v0
.end method

.method static synthetic f(Lc8/a$b;)I
    .locals 0

    iget p0, p0, Lc8/a$b;->f:I

    return p0
.end method

.method static synthetic g(Lc8/a$b;)[B
    .locals 0

    iget-object p0, p0, Lc8/a$b;->g:[B

    return-object p0
.end method

.method static synthetic h(Lc8/a$b;)[B
    .locals 0

    iget-object p0, p0, Lc8/a$b;->h:[B

    return-object p0
.end method


# virtual methods
.method public i()Lc8/a;
    .locals 2

    new-instance v0, Lc8/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc8/a;-><init>(Lc8/a$b;Lc8/a$a;)V

    return-object v0
.end method

.method public j([B)Lc8/a$b;
    .locals 0

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lc8/a$b;->g:[B

    return-object p0
.end method

.method public k(Z)Lc8/a$b;
    .locals 0

    iput-boolean p1, p0, Lc8/a$b;->b:Z

    return-object p0
.end method

.method public l(Z)Lc8/a$b;
    .locals 0

    iput-boolean p1, p0, Lc8/a$b;->a:Z

    return-object p0
.end method

.method public m([B)Lc8/a$b;
    .locals 0

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lc8/a$b;->h:[B

    return-object p0
.end method

.method public n(B)Lc8/a$b;
    .locals 0

    iput-byte p1, p0, Lc8/a$b;->c:B

    return-object p0
.end method

.method public o(I)Lc8/a$b;
    .locals 2

    const v0, 0xffff

    if-ltz p1, :cond_0

    if-gt p1, v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lt8/a;->a(Z)V

    and-int/2addr p1, v0

    iput p1, p0, Lc8/a$b;->d:I

    return-object p0
.end method

.method public p(I)Lc8/a$b;
    .locals 0

    iput p1, p0, Lc8/a$b;->f:I

    return-object p0
.end method

.method public q(J)Lc8/a$b;
    .locals 0

    iput-wide p1, p0, Lc8/a$b;->e:J

    return-object p0
.end method
