.class final Lb7/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Ly6/t;

.field private final b:I

.field private final c:Ly6/q$a;


# direct methods
.method private constructor <init>(Ly6/t;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/b$b;->a:Ly6/t;

    iput p2, p0, Lb7/b$b;->b:I

    new-instance p1, Ly6/q$a;

    invoke-direct {p1}, Ly6/q$a;-><init>()V

    iput-object p1, p0, Lb7/b$b;->c:Ly6/q$a;

    return-void
.end method

.method synthetic constructor <init>(Ly6/t;ILb7/b$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb7/b$b;-><init>(Ly6/t;I)V

    return-void
.end method

.method private c(Ly6/l;)J
    .locals 6

    :goto_0
    invoke-interface {p1}, Ly6/l;->i()J

    move-result-wide v0

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v2

    const-wide/16 v4, 0x6

    sub-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Lb7/b$b;->a:Ly6/t;

    iget v1, p0, Lb7/b$b;->b:I

    iget-object v2, p0, Lb7/b$b;->c:Ly6/q$a;

    invoke-static {p1, v0, v1, v2}, Ly6/q;->h(Ly6/l;Ly6/t;ILy6/q$a;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ly6/l;->k(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ly6/l;->i()J

    move-result-wide v0

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v2

    sub-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v0

    invoke-interface {p1}, Ly6/l;->i()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    invoke-interface {p1, v0}, Ly6/l;->k(I)V

    iget-object p1, p0, Lb7/b$b;->a:Ly6/t;

    iget-wide v0, p1, Ly6/t;->j:J

    return-wide v0

    :cond_1
    iget-object p1, p0, Lb7/b$b;->c:Ly6/q$a;

    iget-wide v0, p1, Ly6/q$a;->a:J

    return-wide v0
.end method


# virtual methods
.method public a(Ly6/l;J)Ly6/a$e;
    .locals 10

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v0

    invoke-direct {p0, p1}, Lb7/b$b;->c(Ly6/l;)J

    move-result-wide v2

    invoke-interface {p1}, Ly6/l;->i()J

    move-result-wide v4

    iget-object v6, p0, Lb7/b$b;->a:Ly6/t;

    iget v6, v6, Ly6/t;->c:I

    const/4 v7, 0x6

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-interface {p1, v6}, Ly6/l;->k(I)V

    invoke-direct {p0, p1}, Lb7/b$b;->c(Ly6/l;)J

    move-result-wide v6

    invoke-interface {p1}, Ly6/l;->i()J

    move-result-wide v8

    cmp-long p1, v2, p2

    if-gtz p1, :cond_0

    cmp-long p1, v6, p2

    if-lez p1, :cond_0

    invoke-static {v4, v5}, Ly6/a$e;->e(J)Ly6/a$e;

    move-result-object p1

    return-object p1

    :cond_0
    cmp-long p1, v6, p2

    if-gtz p1, :cond_1

    invoke-static {v6, v7, v8, v9}, Ly6/a$e;->f(JJ)Ly6/a$e;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {v2, v3, v0, v1}, Ly6/a$e;->d(JJ)Ly6/a$e;

    move-result-object p1

    return-object p1
.end method
