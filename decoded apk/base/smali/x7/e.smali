.class public final Lx7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/m;
.implements Lx7/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx7/e$a;
    }
.end annotation


# static fields
.field public static final u:Lx7/g$a;

.field private static final v:Ly6/y;


# instance fields
.field private final a:Ly6/k;

.field private final b:I

.field private final c:Lt6/u1;

.field private final d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lx7/e$a;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:Lx7/g$b;

.field private r:J

.field private s:Ly6/z;

.field private t:[Lt6/u1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx7/d;

    invoke-direct {v0}, Lx7/d;-><init>()V

    sput-object v0, Lx7/e;->u:Lx7/g$a;

    new-instance v0, Ly6/y;

    invoke-direct {v0}, Ly6/y;-><init>()V

    sput-object v0, Lx7/e;->v:Ly6/y;

    return-void
.end method

.method public constructor <init>(Ly6/k;ILt6/u1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/e;->a:Ly6/k;

    iput p2, p0, Lx7/e;->b:I

    iput-object p3, p0, Lx7/e;->c:Lt6/u1;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lx7/e;->d:Landroid/util/SparseArray;

    return-void
.end method

.method public static synthetic f(ILt6/u1;ZLjava/util/List;Ly6/b0;Lu6/m3;)Lx7/g;
    .locals 0

    invoke-static/range {p0 .. p5}, Lx7/e;->g(ILt6/u1;ZLjava/util/List;Ly6/b0;Lu6/m3;)Lx7/g;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic g(ILt6/u1;ZLjava/util/List;Ly6/b0;Lu6/m3;)Lx7/g;
    .locals 6

    iget-object p5, p1, Lt6/u1;->v:Ljava/lang/String;

    invoke-static {p5}, Lt8/w;->r(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p5}, Lt8/w;->q(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_1

    new-instance p2, Le7/e;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Le7/e;-><init>(I)V

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_2

    const/4 p2, 0x4

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    move v1, p2

    new-instance p2, Lg7/g;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lg7/g;-><init>(ILt8/n0;Lg7/o;Ljava/util/List;Ly6/b0;)V

    :goto_1
    new-instance p3, Lx7/e;

    invoke-direct {p3, p2, p0, p1}, Lx7/e;-><init>(Ly6/k;ILt6/u1;)V

    return-object p3
.end method


# virtual methods
.method public a(Ly6/l;)Z
    .locals 3

    iget-object v0, p0, Lx7/e;->a:Ly6/k;

    sget-object v1, Lx7/e;->v:Ly6/y;

    invoke-interface {v0, p1, v1}, Ly6/k;->f(Ly6/l;Ly6/y;)I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-static {v2}, Lt8/a;->g(Z)V

    if-nez p1, :cond_1

    move v0, v1

    :cond_1
    return v0
.end method

.method public b()Ly6/c;
    .locals 2

    iget-object v0, p0, Lx7/e;->s:Ly6/z;

    instance-of v1, v0, Ly6/c;

    if-eqz v1, :cond_0

    check-cast v0, Ly6/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public c(Lx7/g$b;JJ)V
    .locals 5

    iput-object p1, p0, Lx7/e;->f:Lx7/g$b;

    iput-wide p4, p0, Lx7/e;->r:J

    iget-boolean v0, p0, Lx7/e;->e:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v3, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lx7/e;->a:Ly6/k;

    invoke-interface {p1, p0}, Ly6/k;->b(Ly6/m;)V

    cmp-long p1, p2, v1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lx7/e;->a:Ly6/k;

    invoke-interface {p1, v3, v4, p2, p3}, Ly6/k;->a(JJ)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lx7/e;->e:Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lx7/e;->a:Ly6/k;

    cmp-long v1, p2, v1

    if-nez v1, :cond_2

    move-wide p2, v3

    :cond_2
    invoke-interface {v0, v3, v4, p2, p3}, Ly6/k;->a(JJ)V

    const/4 p2, 0x0

    :goto_0
    iget-object p3, p0, Lx7/e;->d:Landroid/util/SparseArray;

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result p3

    if-ge p2, p3, :cond_3

    iget-object p3, p0, Lx7/e;->d:Landroid/util/SparseArray;

    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lx7/e$a;

    invoke-virtual {p3, p1, p4, p5}, Lx7/e$a;->g(Lx7/g$b;J)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public d(II)Ly6/b0;
    .locals 3

    iget-object v0, p0, Lx7/e;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/e$a;

    if-nez v0, :cond_2

    iget-object v0, p0, Lx7/e;->t:[Lt6/u1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    new-instance v0, Lx7/e$a;

    iget v1, p0, Lx7/e;->b:I

    if-ne p2, v1, :cond_1

    iget-object v1, p0, Lx7/e;->c:Lt6/u1;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-direct {v0, p1, p2, v1}, Lx7/e$a;-><init>(IILt6/u1;)V

    iget-object p2, p0, Lx7/e;->f:Lx7/g$b;

    iget-wide v1, p0, Lx7/e;->r:J

    invoke-virtual {v0, p2, v1, v2}, Lx7/e$a;->g(Lx7/g$b;J)V

    iget-object p2, p0, Lx7/e;->d:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_2
    return-object v0
.end method

.method public e()[Lt6/u1;
    .locals 1

    iget-object v0, p0, Lx7/e;->t:[Lt6/u1;

    return-object v0
.end method

.method public p(Ly6/z;)V
    .locals 0

    iput-object p1, p0, Lx7/e;->s:Ly6/z;

    return-void
.end method

.method public q()V
    .locals 3

    iget-object v0, p0, Lx7/e;->d:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    new-array v0, v0, [Lt6/u1;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lx7/e;->d:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lx7/e;->d:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx7/e$a;

    iget-object v2, v2, Lx7/e$a;->e:Lt6/u1;

    invoke-static {v2}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt6/u1;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lx7/e;->t:[Lt6/u1;

    return-void
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lx7/e;->a:Ly6/k;

    invoke-interface {v0}, Ly6/k;->release()V

    return-void
.end method
