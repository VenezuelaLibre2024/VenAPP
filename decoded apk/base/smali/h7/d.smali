.class public Lh7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/k;


# static fields
.field public static final d:Ly6/p;


# instance fields
.field private a:Ly6/m;

.field private b:Lh7/i;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh7/c;

    invoke-direct {v0}, Lh7/c;-><init>()V

    sput-object v0, Lh7/d;->d:Ly6/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c()[Ly6/k;
    .locals 1

    invoke-static {}, Lh7/d;->d()[Ly6/k;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic d()[Ly6/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ly6/k;

    new-instance v1, Lh7/d;

    invoke-direct {v1}, Lh7/d;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private static g(Lt8/e0;)Lt8/e0;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lt8/e0;->U(I)V

    return-object p0
.end method

.method private h(Ly6/l;)Z
    .locals 5

    new-instance v0, Lh7/f;

    invoke-direct {v0}, Lh7/f;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lh7/f;->a(Ly6/l;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget v2, v0, Lh7/f;->b:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eq v2, v4, :cond_0

    goto :goto_2

    :cond_0
    iget v0, v0, Lh7/f;->i:I

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v2, Lt8/e0;

    invoke-direct {v2, v0}, Lt8/e0;-><init>(I)V

    invoke-virtual {v2}, Lt8/e0;->e()[B

    move-result-object v4

    invoke-interface {p1, v4, v3, v0}, Ly6/l;->q([BII)V

    invoke-static {v2}, Lh7/d;->g(Lt8/e0;)Lt8/e0;

    move-result-object p1

    invoke-static {p1}, Lh7/b;->p(Lt8/e0;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lh7/b;

    invoke-direct {p1}, Lh7/b;-><init>()V

    :goto_0
    iput-object p1, p0, Lh7/d;->b:Lh7/i;

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lh7/d;->g(Lt8/e0;)Lt8/e0;

    move-result-object p1

    invoke-static {p1}, Lh7/j;->r(Lt8/e0;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lh7/j;

    invoke-direct {p1}, Lh7/j;-><init>()V

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lh7/d;->g(Lt8/e0;)Lt8/e0;

    move-result-object p1

    invoke-static {p1}, Lh7/h;->o(Lt8/e0;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lh7/h;

    invoke-direct {p1}, Lh7/h;-><init>()V

    goto :goto_0

    :goto_1
    return v1

    :cond_3
    :goto_2
    return v3
.end method


# virtual methods
.method public a(JJ)V
    .locals 1

    iget-object v0, p0, Lh7/d;->b:Lh7/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lh7/i;->m(JJ)V

    :cond_0
    return-void
.end method

.method public b(Ly6/m;)V
    .locals 0

    iput-object p1, p0, Lh7/d;->a:Ly6/m;

    return-void
.end method

.method public e(Ly6/l;)Z
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, Lh7/d;->h(Ly6/l;)Z

    move-result p1
    :try_end_0
    .catch Lt6/b3; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public f(Ly6/l;Ly6/y;)I
    .locals 4

    iget-object v0, p0, Lh7/d;->a:Ly6/m;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lh7/d;->b:Lh7/i;

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lh7/d;->h(Ly6/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ly6/l;->f()V

    goto :goto_0

    :cond_0
    const-string p1, "Failed to determine bitstream type"

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lt6/b3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lt6/b3;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lh7/d;->c:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lh7/d;->a:Ly6/m;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ly6/m;->d(II)Ly6/b0;

    move-result-object v0

    iget-object v1, p0, Lh7/d;->a:Ly6/m;

    invoke-interface {v1}, Ly6/m;->q()V

    iget-object v1, p0, Lh7/d;->b:Lh7/i;

    iget-object v3, p0, Lh7/d;->a:Ly6/m;

    invoke-virtual {v1, v3, v0}, Lh7/i;->d(Ly6/m;Ly6/b0;)V

    iput-boolean v2, p0, Lh7/d;->c:Z

    :cond_2
    iget-object v0, p0, Lh7/d;->b:Lh7/i;

    invoke-virtual {v0, p1, p2}, Lh7/i;->g(Ly6/l;Ly6/y;)I

    move-result p1

    return p1
.end method

.method public release()V
    .locals 0

    return-void
.end method
