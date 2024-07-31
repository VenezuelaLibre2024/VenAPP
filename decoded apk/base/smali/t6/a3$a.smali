.class final Lt6/a3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/h0;
.implements Lx6/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/a3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Lt6/a3$c;

.field final synthetic b:Lt6/a3;


# direct methods
.method public constructor <init>(Lt6/a3;Lt6/a3$c;)V
    .locals 0

    iput-object p1, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt6/a3$a;->a:Lt6/a3$c;

    return-void
.end method

.method public static synthetic K(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lt6/a3$a;->g0(Landroid/util/Pair;Lv7/u;Lv7/x;)V

    return-void
.end method

.method public static synthetic L(Lt6/a3$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/a3$a;->c0(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic M(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lt6/a3$a;->e0(Landroid/util/Pair;Lv7/u;Lv7/x;)V

    return-void
.end method

.method public static synthetic N(Lt6/a3$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/a3$a;->X(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic O(Lt6/a3$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/a3$a;->Y(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic P(Lt6/a3$a;Landroid/util/Pair;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->h0(Landroid/util/Pair;Lv7/x;)V

    return-void
.end method

.method public static synthetic Q(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lt6/a3$a;->f0(Landroid/util/Pair;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    return-void
.end method

.method public static synthetic R(Lt6/a3$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/a3$a;->Z(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic S(Lt6/a3$a;Landroid/util/Pair;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->a0(Landroid/util/Pair;I)V

    return-void
.end method

.method public static synthetic T(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lt6/a3$a;->d0(Landroid/util/Pair;Lv7/u;Lv7/x;)V

    return-void
.end method

.method public static synthetic U(Lt6/a3$a;Landroid/util/Pair;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->b0(Landroid/util/Pair;Ljava/lang/Exception;)V

    return-void
.end method

.method private V(ILv7/a0$b;)Landroid/util/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv7/a0$b;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lv7/a0$b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    iget-object v1, p0, Lt6/a3$a;->a:Lt6/a3$c;

    invoke-static {v1, p2}, Lt6/a3;->c(Lt6/a3$c;Lv7/a0$b;)Lv7/a0$b;

    move-result-object p2

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    move-object v0, p2

    :cond_1
    iget-object p2, p0, Lt6/a3$a;->a:Lt6/a3$c;

    invoke-static {p2, p1}, Lt6/a3;->d(Lt6/a3$c;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method private synthetic W(Landroid/util/Pair;Lv7/x;)V
    .locals 2

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lv7/a0$b;

    invoke-interface {v0, v1, p1, p2}, Lv7/h0;->v(ILv7/a0$b;Lv7/x;)V

    return-void
.end method

.method private synthetic X(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lv7/a0$b;

    invoke-interface {v0, v1, p1}, Lx6/u;->u(ILv7/a0$b;)V

    return-void
.end method

.method private synthetic Y(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lv7/a0$b;

    invoke-interface {v0, v1, p1}, Lx6/u;->B(ILv7/a0$b;)V

    return-void
.end method

.method private synthetic Z(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lv7/a0$b;

    invoke-interface {v0, v1, p1}, Lx6/u;->C(ILv7/a0$b;)V

    return-void
.end method

.method private synthetic a0(Landroid/util/Pair;I)V
    .locals 2

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lv7/a0$b;

    invoke-interface {v0, v1, p1, p2}, Lx6/u;->J(ILv7/a0$b;I)V

    return-void
.end method

.method private synthetic b0(Landroid/util/Pair;Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lv7/a0$b;

    invoke-interface {v0, v1, p1, p2}, Lx6/u;->I(ILv7/a0$b;Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic c0(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lv7/a0$b;

    invoke-interface {v0, v1, p1}, Lx6/u;->y(ILv7/a0$b;)V

    return-void
.end method

.method private synthetic d0(Landroid/util/Pair;Lv7/u;Lv7/x;)V
    .locals 2

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lv7/a0$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lv7/h0;->D(ILv7/a0$b;Lv7/u;Lv7/x;)V

    return-void
.end method

.method private synthetic e0(Landroid/util/Pair;Lv7/u;Lv7/x;)V
    .locals 2

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lv7/a0$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lv7/h0;->x(ILv7/a0$b;Lv7/u;Lv7/x;)V

    return-void
.end method

.method private synthetic f0(Landroid/util/Pair;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 8

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v1

    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lv7/a0$b;

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-interface/range {v1 .. v7}, Lv7/h0;->F(ILv7/a0$b;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    return-void
.end method

.method private synthetic g0(Landroid/util/Pair;Lv7/u;Lv7/x;)V
    .locals 2

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lv7/a0$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lv7/h0;->G(ILv7/a0$b;Lv7/u;Lv7/x;)V

    return-void
.end method

.method private synthetic h0(Landroid/util/Pair;Lv7/x;)V
    .locals 2

    iget-object v0, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {v0}, Lt6/a3;->e(Lt6/a3;)Lu6/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lv7/a0$b;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/a0$b;

    invoke-interface {v0, v1, p1, p2}, Lv7/h0;->w(ILv7/a0$b;Lv7/x;)V

    return-void
.end method

.method public static synthetic s(Lt6/a3$a;Landroid/util/Pair;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->W(Landroid/util/Pair;Lv7/x;)V

    return-void
.end method


# virtual methods
.method public B(ILv7/a0$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p2}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p2

    new-instance v0, Lt6/z2;

    invoke-direct {v0, p0, p1}, Lt6/z2;-><init>(Lt6/a3$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public C(ILv7/a0$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p2}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p2

    new-instance v0, Lt6/q2;

    invoke-direct {v0, p0, p1}, Lt6/q2;-><init>(Lt6/a3$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public D(ILv7/a0$b;Lv7/u;Lv7/x;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p2}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p2

    new-instance v0, Lt6/t2;

    invoke-direct {v0, p0, p1, p3, p4}, Lt6/t2;-><init>(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;)V

    invoke-interface {p2, v0}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public F(ILv7/a0$b;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 7

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p1}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p1

    new-instance p2, Lt6/r2;

    move-object v0, p2

    move-object v1, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lt6/r2;-><init>(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    invoke-interface {p1, p2}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public G(ILv7/a0$b;Lv7/u;Lv7/x;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p2}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p2

    new-instance v0, Lt6/o2;

    invoke-direct {v0, p0, p1, p3, p4}, Lt6/o2;-><init>(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;)V

    invoke-interface {p2, v0}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public I(ILv7/a0$b;Ljava/lang/Exception;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p2}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p2

    new-instance v0, Lt6/x2;

    invoke-direct {v0, p0, p1, p3}, Lt6/x2;-><init>(Lt6/a3$a;Landroid/util/Pair;Ljava/lang/Exception;)V

    invoke-interface {p2, v0}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public J(ILv7/a0$b;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p2}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p2

    new-instance v0, Lt6/u2;

    invoke-direct {v0, p0, p1, p3}, Lt6/u2;-><init>(Lt6/a3$a;Landroid/util/Pair;I)V

    invoke-interface {p2, v0}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public u(ILv7/a0$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p2}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p2

    new-instance v0, Lt6/p2;

    invoke-direct {v0, p0, p1}, Lt6/p2;-><init>(Lt6/a3$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public v(ILv7/a0$b;Lv7/x;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p2}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p2

    new-instance v0, Lt6/s2;

    invoke-direct {v0, p0, p1, p3}, Lt6/s2;-><init>(Lt6/a3$a;Landroid/util/Pair;Lv7/x;)V

    invoke-interface {p2, v0}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public w(ILv7/a0$b;Lv7/x;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p2}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p2

    new-instance v0, Lt6/v2;

    invoke-direct {v0, p0, p1, p3}, Lt6/v2;-><init>(Lt6/a3$a;Landroid/util/Pair;Lv7/x;)V

    invoke-interface {p2, v0}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public x(ILv7/a0$b;Lv7/u;Lv7/x;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p2}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p2

    new-instance v0, Lt6/y2;

    invoke-direct {v0, p0, p1, p3, p4}, Lt6/y2;-><init>(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;)V

    invoke-interface {p2, v0}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public y(ILv7/a0$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lt6/a3$a;->V(ILv7/a0$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lt6/a3$a;->b:Lt6/a3;

    invoke-static {p2}, Lt6/a3;->b(Lt6/a3;)Lt8/o;

    move-result-object p2

    new-instance v0, Lt6/w2;

    invoke-direct {v0, p0, p1}, Lt6/w2;-><init>(Lt6/a3$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
