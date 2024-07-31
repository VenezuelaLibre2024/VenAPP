.class public final Lt6/y$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field A:Z

.field B:Landroid/os/Looper;

.field C:Z

.field final a:Landroid/content/Context;

.field b:Lt8/d;

.field c:J

.field d:Leb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/v<",
            "Lt6/t3;",
            ">;"
        }
    .end annotation
.end field

.field e:Leb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/v<",
            "Lv7/a0$a;",
            ">;"
        }
    .end annotation
.end field

.field f:Leb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/v<",
            "Lq8/a0;",
            ">;"
        }
    .end annotation
.end field

.field g:Leb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/v<",
            "Lt6/a2;",
            ">;"
        }
    .end annotation
.end field

.field h:Leb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/v<",
            "Ls8/e;",
            ">;"
        }
    .end annotation
.end field

.field i:Leb/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/g<",
            "Lt8/d;",
            "Lu6/a;",
            ">;"
        }
    .end annotation
.end field

.field j:Landroid/os/Looper;

.field k:Lt8/g0;

.field l:Lv6/e;

.field m:Z

.field n:I

.field o:Z

.field p:Z

.field q:I

.field r:I

.field s:Z

.field t:Lt6/u3;

.field u:J

.field v:J

.field w:Lt6/z1;

.field x:J

.field y:J

.field z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Lt6/z;

    invoke-direct {v0, p1}, Lt6/z;-><init>(Landroid/content/Context;)V

    new-instance v1, Lt6/a0;

    invoke-direct {v1, p1}, Lt6/a0;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, v0, v1}, Lt6/y$b;-><init>(Landroid/content/Context;Leb/v;Leb/v;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Leb/v;Leb/v;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Leb/v<",
            "Lt6/t3;",
            ">;",
            "Leb/v<",
            "Lv7/a0$a;",
            ">;)V"
        }
    .end annotation

    new-instance v4, Lt6/b0;

    invoke-direct {v4, p1}, Lt6/b0;-><init>(Landroid/content/Context;)V

    new-instance v5, Lt6/c0;

    invoke-direct {v5}, Lt6/c0;-><init>()V

    new-instance v6, Lt6/d0;

    invoke-direct {v6, p1}, Lt6/d0;-><init>(Landroid/content/Context;)V

    new-instance v7, Lt6/e0;

    invoke-direct {v7}, Lt6/e0;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, Lt6/y$b;-><init>(Landroid/content/Context;Leb/v;Leb/v;Leb/v;Leb/v;Leb/v;Leb/g;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Leb/v;Leb/v;Leb/v;Leb/v;Leb/v;Leb/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Leb/v<",
            "Lt6/t3;",
            ">;",
            "Leb/v<",
            "Lv7/a0$a;",
            ">;",
            "Leb/v<",
            "Lq8/a0;",
            ">;",
            "Leb/v<",
            "Lt6/a2;",
            ">;",
            "Leb/v<",
            "Ls8/e;",
            ">;",
            "Leb/g<",
            "Lt8/d;",
            "Lu6/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lt6/y$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lt6/y$b;->d:Leb/v;

    iput-object p3, p0, Lt6/y$b;->e:Leb/v;

    iput-object p4, p0, Lt6/y$b;->f:Leb/v;

    iput-object p5, p0, Lt6/y$b;->g:Leb/v;

    iput-object p6, p0, Lt6/y$b;->h:Leb/v;

    iput-object p7, p0, Lt6/y$b;->i:Leb/g;

    invoke-static {}, Lt8/r0;->Q()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Lt6/y$b;->j:Landroid/os/Looper;

    sget-object p1, Lv6/e;->r:Lv6/e;

    iput-object p1, p0, Lt6/y$b;->l:Lv6/e;

    const/4 p1, 0x0

    iput p1, p0, Lt6/y$b;->n:I

    const/4 p2, 0x1

    iput p2, p0, Lt6/y$b;->q:I

    iput p1, p0, Lt6/y$b;->r:I

    iput-boolean p2, p0, Lt6/y$b;->s:Z

    sget-object p1, Lt6/u3;->g:Lt6/u3;

    iput-object p1, p0, Lt6/y$b;->t:Lt6/u3;

    const-wide/16 p3, 0x1388

    iput-wide p3, p0, Lt6/y$b;->u:J

    const-wide/16 p3, 0x3a98

    iput-wide p3, p0, Lt6/y$b;->v:J

    new-instance p1, Lt6/q$b;

    invoke-direct {p1}, Lt6/q$b;-><init>()V

    invoke-virtual {p1}, Lt6/q$b;->a()Lt6/q;

    move-result-object p1

    iput-object p1, p0, Lt6/y$b;->w:Lt6/z1;

    sget-object p1, Lt8/d;->a:Lt8/d;

    iput-object p1, p0, Lt6/y$b;->b:Lt8/d;

    const-wide/16 p3, 0x1f4

    iput-wide p3, p0, Lt6/y$b;->x:J

    const-wide/16 p3, 0x7d0

    iput-wide p3, p0, Lt6/y$b;->y:J

    iput-boolean p2, p0, Lt6/y$b;->A:Z

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Ls8/e;
    .locals 0

    invoke-static {p0}, Lt6/y$b;->i(Landroid/content/Context;)Ls8/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)Lt6/t3;
    .locals 0

    invoke-static {p0}, Lt6/y$b;->f(Landroid/content/Context;)Lt6/t3;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;)Lq8/a0;
    .locals 0

    invoke-static {p0}, Lt6/y$b;->h(Landroid/content/Context;)Lq8/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;)Lv7/a0$a;
    .locals 0

    invoke-static {p0}, Lt6/y$b;->g(Landroid/content/Context;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic f(Landroid/content/Context;)Lt6/t3;
    .locals 1

    new-instance v0, Lt6/t;

    invoke-direct {v0, p0}, Lt6/t;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static synthetic g(Landroid/content/Context;)Lv7/a0$a;
    .locals 2

    new-instance v0, Lv7/q;

    new-instance v1, Ly6/h;

    invoke-direct {v1}, Ly6/h;-><init>()V

    invoke-direct {v0, p0, v1}, Lv7/q;-><init>(Landroid/content/Context;Ly6/p;)V

    return-object v0
.end method

.method private static synthetic h(Landroid/content/Context;)Lq8/a0;
    .locals 1

    new-instance v0, Lq8/m;

    invoke-direct {v0, p0}, Lq8/m;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static synthetic i(Landroid/content/Context;)Ls8/e;
    .locals 0

    invoke-static {p0}, Ls8/q;->n(Landroid/content/Context;)Ls8/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e()Lt6/y;
    .locals 2

    iget-boolean v0, p0, Lt6/y$b;->C:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iput-boolean v1, p0, Lt6/y$b;->C:Z

    new-instance v0, Lt6/d1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt6/d1;-><init>(Lt6/y$b;Lt6/j3;)V

    return-object v0
.end method
