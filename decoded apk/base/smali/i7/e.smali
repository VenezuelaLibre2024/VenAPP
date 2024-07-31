.class public final Li7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/k;


# static fields
.field public static final d:Ly6/p;


# instance fields
.field private final a:Li7/f;

.field private final b:Lt8/e0;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li7/d;

    invoke-direct {v0}, Li7/d;-><init>()V

    sput-object v0, Li7/e;->d:Ly6/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li7/f;

    invoke-direct {v0}, Li7/f;-><init>()V

    iput-object v0, p0, Li7/e;->a:Li7/f;

    new-instance v0, Lt8/e0;

    const/16 v1, 0x4000

    invoke-direct {v0, v1}, Lt8/e0;-><init>(I)V

    iput-object v0, p0, Li7/e;->b:Lt8/e0;

    return-void
.end method

.method public static synthetic c()[Ly6/k;
    .locals 1

    invoke-static {}, Li7/e;->d()[Ly6/k;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic d()[Ly6/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ly6/k;

    new-instance v1, Li7/e;

    invoke-direct {v1}, Li7/e;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public a(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Li7/e;->c:Z

    iget-object p1, p0, Li7/e;->a:Li7/f;

    invoke-virtual {p1}, Li7/f;->c()V

    return-void
.end method

.method public b(Ly6/m;)V
    .locals 4

    iget-object v0, p0, Li7/e;->a:Li7/f;

    new-instance v1, Li7/i0$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Li7/i0$d;-><init>(II)V

    invoke-virtual {v0, p1, v1}, Li7/f;->d(Ly6/m;Li7/i0$d;)V

    invoke-interface {p1}, Ly6/m;->q()V

    new-instance v0, Ly6/z$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Ly6/z$b;-><init>(J)V

    invoke-interface {p1, v0}, Ly6/m;->p(Ly6/z;)V

    return-void
.end method

.method public e(Ly6/l;)Z
    .locals 8

    new-instance v0, Lt8/e0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lt8/e0;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v4

    invoke-interface {p1, v4, v2, v1}, Ly6/l;->q([BII)V

    invoke-virtual {v0, v2}, Lt8/e0;->U(I)V

    invoke-virtual {v0}, Lt8/e0;->K()I

    move-result v4

    const v5, 0x494433

    if-eq v4, v5, :cond_4

    invoke-interface {p1}, Ly6/l;->f()V

    invoke-interface {p1, v3}, Ly6/l;->k(I)V

    move v1, v2

    move v4, v3

    :goto_1
    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v5

    const/4 v6, 0x7

    invoke-interface {p1, v5, v2, v6}, Ly6/l;->q([BII)V

    invoke-virtual {v0, v2}, Lt8/e0;->U(I)V

    invoke-virtual {v0}, Lt8/e0;->N()I

    move-result v5

    const v6, 0xac40

    if-eq v5, v6, :cond_1

    const v6, 0xac41

    if-eq v5, v6, :cond_1

    invoke-interface {p1}, Ly6/l;->f()V

    add-int/lit8 v4, v4, 0x1

    sub-int v1, v4, v3

    const/16 v5, 0x2000

    if-lt v1, v5, :cond_0

    return v2

    :cond_0
    invoke-interface {p1, v4}, Ly6/l;->k(I)V

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v6, 0x1

    add-int/2addr v1, v6

    const/4 v7, 0x4

    if-lt v1, v7, :cond_2

    return v6

    :cond_2
    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v6

    invoke-static {v6, v5}, Lv6/c;->e([BI)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_3

    return v2

    :cond_3
    add-int/lit8 v5, v5, -0x7

    invoke-interface {p1, v5}, Ly6/l;->k(I)V

    goto :goto_1

    :cond_4
    const/4 v4, 0x3

    invoke-virtual {v0, v4}, Lt8/e0;->V(I)V

    invoke-virtual {v0}, Lt8/e0;->G()I

    move-result v4

    add-int/lit8 v5, v4, 0xa

    add-int/2addr v3, v5

    invoke-interface {p1, v4}, Ly6/l;->k(I)V

    goto :goto_0
.end method

.method public f(Ly6/l;Ly6/y;)I
    .locals 4

    iget-object p2, p0, Li7/e;->b:Lt8/e0;

    invoke-virtual {p2}, Lt8/e0;->e()[B

    move-result-object p2

    const/16 v0, 0x4000

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, Ly6/l;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-object p2, p0, Li7/e;->b:Lt8/e0;

    invoke-virtual {p2, v1}, Lt8/e0;->U(I)V

    iget-object p2, p0, Li7/e;->b:Lt8/e0;

    invoke-virtual {p2, p1}, Lt8/e0;->T(I)V

    iget-boolean p1, p0, Li7/e;->c:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Li7/e;->a:Li7/f;

    const-wide/16 v2, 0x0

    const/4 p2, 0x4

    invoke-virtual {p1, v2, v3, p2}, Li7/f;->f(JI)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Li7/e;->c:Z

    :cond_1
    iget-object p1, p0, Li7/e;->a:Li7/f;

    iget-object p2, p0, Li7/e;->b:Lt8/e0;

    invoke-virtual {p1, p2}, Li7/f;->b(Lt8/e0;)V

    return v1
.end method

.method public release()V
    .locals 0

    return-void
.end method
