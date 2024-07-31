.class final Lv7/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/y;
.implements Ly6/m;
.implements Ls8/e0$b;
.implements Ls8/e0$f;
.implements Lv7/u0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/p0$d;,
        Lv7/p0$e;,
        Lv7/p0$a;,
        Lv7/p0$c;,
        Lv7/p0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv7/y;",
        "Ly6/m;",
        "Ls8/e0$b<",
        "Lv7/p0$a;",
        ">;",
        "Ls8/e0$f;",
        "Lv7/u0$d;"
    }
.end annotation


# static fields
.field private static final X:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final Y:Lt6/u1;


# instance fields
.field private final A:Landroid/os/Handler;

.field private B:Lv7/y$a;

.field private C:Lp7/b;

.field private D:[Lv7/u0;

.field private E:[Lv7/p0$d;

.field private F:Z

.field private G:Z

.field private H:Z

.field private I:Lv7/p0$e;

.field private J:Ly6/z;

.field private K:J

.field private L:Z

.field private M:I

.field private N:Z

.field private O:Z

.field private P:I

.field private Q:Z

.field private R:J

.field private S:J

.field private T:Z

.field private U:I

.field private V:Z

.field private W:Z

.field private final a:Landroid/net/Uri;

.field private final b:Ls8/j;

.field private final c:Lx6/v;

.field private final d:Ls8/d0;

.field private final e:Lv7/h0$a;

.field private final f:Lx6/u$a;

.field private final r:Lv7/p0$b;

.field private final s:Ls8/b;

.field private final t:Ljava/lang/String;

.field private final u:J

.field private final v:Ls8/e0;

.field private final w:Lv7/k0;

.field private final x:Lt8/g;

.field private final y:Ljava/lang/Runnable;

.field private final z:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lv7/p0;->K()Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lv7/p0;->X:Ljava/util/Map;

    new-instance v0, Lt6/u1$b;

    invoke-direct {v0}, Lt6/u1$b;-><init>()V

    const-string v1, "icy"

    invoke-virtual {v0, v1}, Lt6/u1$b;->U(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v0

    const-string v1, "application/x-icy"

    invoke-virtual {v0, v1}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v0

    invoke-virtual {v0}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object v0

    sput-object v0, Lv7/p0;->Y:Lt6/u1;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Ls8/j;Lv7/k0;Lx6/v;Lx6/u$a;Ls8/d0;Lv7/h0$a;Lv7/p0$b;Ls8/b;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/p0;->a:Landroid/net/Uri;

    iput-object p2, p0, Lv7/p0;->b:Ls8/j;

    iput-object p4, p0, Lv7/p0;->c:Lx6/v;

    iput-object p5, p0, Lv7/p0;->f:Lx6/u$a;

    iput-object p6, p0, Lv7/p0;->d:Ls8/d0;

    iput-object p7, p0, Lv7/p0;->e:Lv7/h0$a;

    iput-object p8, p0, Lv7/p0;->r:Lv7/p0$b;

    iput-object p9, p0, Lv7/p0;->s:Ls8/b;

    iput-object p10, p0, Lv7/p0;->t:Ljava/lang/String;

    int-to-long p1, p11

    iput-wide p1, p0, Lv7/p0;->u:J

    new-instance p1, Ls8/e0;

    const-string p2, "ProgressiveMediaPeriod"

    invoke-direct {p1, p2}, Ls8/e0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lv7/p0;->v:Ls8/e0;

    iput-object p3, p0, Lv7/p0;->w:Lv7/k0;

    new-instance p1, Lt8/g;

    invoke-direct {p1}, Lt8/g;-><init>()V

    iput-object p1, p0, Lv7/p0;->x:Lt8/g;

    new-instance p1, Lv7/l0;

    invoke-direct {p1, p0}, Lv7/l0;-><init>(Lv7/p0;)V

    iput-object p1, p0, Lv7/p0;->y:Ljava/lang/Runnable;

    new-instance p1, Lv7/m0;

    invoke-direct {p1, p0}, Lv7/m0;-><init>(Lv7/p0;)V

    iput-object p1, p0, Lv7/p0;->z:Ljava/lang/Runnable;

    invoke-static {}, Lt8/r0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lv7/p0;->A:Landroid/os/Handler;

    const/4 p1, 0x0

    new-array p2, p1, [Lv7/p0$d;

    iput-object p2, p0, Lv7/p0;->E:[Lv7/p0$d;

    new-array p1, p1, [Lv7/u0;

    iput-object p1, p0, Lv7/p0;->D:[Lv7/u0;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lv7/p0;->S:J

    iput-wide p1, p0, Lv7/p0;->K:J

    const/4 p1, 0x1

    iput p1, p0, Lv7/p0;->M:I

    return-void
.end method

.method static synthetic A(Lv7/p0;Z)J
    .locals 0

    invoke-direct {p0, p1}, Lv7/p0;->M(Z)J

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic B()Ljava/util/Map;
    .locals 1

    sget-object v0, Lv7/p0;->X:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic C(Lv7/p0;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lv7/p0;->t:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic D(Lv7/p0;)V
    .locals 0

    invoke-direct {p0}, Lv7/p0;->Y()V

    return-void
.end method

.method static synthetic E(Lv7/p0;)Lp7/b;
    .locals 0

    iget-object p0, p0, Lv7/p0;->C:Lp7/b;

    return-object p0
.end method

.method static synthetic F(Lv7/p0;Lp7/b;)Lp7/b;
    .locals 0

    iput-object p1, p0, Lv7/p0;->C:Lp7/b;

    return-object p1
.end method

.method static synthetic G()Lt6/u1;
    .locals 1

    sget-object v0, Lv7/p0;->Y:Lt6/u1;

    return-object v0
.end method

.method static synthetic H(Lv7/p0;)J
    .locals 2

    iget-wide v0, p0, Lv7/p0;->u:J

    return-wide v0
.end method

.method private I()V
    .locals 1

    iget-boolean v0, p0, Lv7/p0;->G:Z

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lv7/p0;->I:Lv7/p0$e;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lv7/p0;->J:Ly6/z;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private J(Lv7/p0$a;I)Z
    .locals 6

    iget-boolean v0, p0, Lv7/p0;->Q:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lv7/p0;->J:Ly6/z;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ly6/z;->i()J

    move-result-wide v2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean p2, p0, Lv7/p0;->G:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lv7/p0;->j0()Z

    move-result p2

    if-nez p2, :cond_1

    iput-boolean v1, p0, Lv7/p0;->T:Z

    return v0

    :cond_1
    iget-boolean p2, p0, Lv7/p0;->G:Z

    iput-boolean p2, p0, Lv7/p0;->O:Z

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lv7/p0;->R:J

    iput v0, p0, Lv7/p0;->U:I

    iget-object p2, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v4, p2

    :goto_0
    if-ge v0, v4, :cond_2

    aget-object v5, p2, v0

    invoke-virtual {v5}, Lv7/u0;->V()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-static {p1, v2, v3, v2, v3}, Lv7/p0$a;->h(Lv7/p0$a;JJ)V

    return v1

    :cond_3
    :goto_1
    iput p2, p0, Lv7/p0;->U:I

    return v1
.end method

.method private static K()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Icy-MetaData"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private L()I
    .locals 5

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-virtual {v4}, Lv7/u0;->G()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method private M(Z)J
    .locals 5

    const-wide/high16 v0, -0x8000000000000000L

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v3, v3

    if-ge v2, v3, :cond_2

    if-nez p1, :cond_0

    iget-object v3, p0, Lv7/p0;->I:Lv7/p0$e;

    invoke-static {v3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv7/p0$e;

    iget-object v3, v3, Lv7/p0$e;->c:[Z

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_1

    :cond_0
    iget-object v3, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lv7/u0;->z()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-wide v0
.end method

.method private O()Z
    .locals 4

    iget-wide v0, p0, Lv7/p0;->S:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private synthetic Q()V
    .locals 1

    iget-boolean v0, p0, Lv7/p0;->W:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lv7/p0;->B:Lv7/y$a;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/y$a;

    invoke-interface {v0, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    :cond_0
    return-void
.end method

.method private synthetic R()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv7/p0;->Q:Z

    return-void
.end method

.method private synthetic S(Ly6/z;)V
    .locals 0

    invoke-direct {p0, p1}, Lv7/p0;->g0(Ly6/z;)V

    return-void
.end method

.method private T()V
    .locals 11

    iget-boolean v0, p0, Lv7/p0;->W:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lv7/p0;->G:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lv7/p0;->F:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lv7/p0;->J:Ly6/z;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lv7/u0;->F()Lt6/u1;

    move-result-object v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lv7/p0;->x:Lt8/g;

    invoke-virtual {v0}, Lt8/g;->c()Z

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v0, v0

    new-array v1, v0, [Lv7/d1;

    new-array v3, v0, [Z

    move v4, v2

    :goto_1
    const/4 v5, 0x1

    if-ge v4, v0, :cond_9

    iget-object v6, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object v6, v6, v4

    invoke-virtual {v6}, Lv7/u0;->F()Lt6/u1;

    move-result-object v6

    invoke-static {v6}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt6/u1;

    iget-object v7, v6, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {v7}, Lt8/w;->o(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-static {v7}, Lt8/w;->s(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    move v7, v2

    goto :goto_3

    :cond_4
    :goto_2
    move v7, v5

    :goto_3
    aput-boolean v7, v3, v4

    iget-boolean v9, p0, Lv7/p0;->H:Z

    or-int/2addr v7, v9

    iput-boolean v7, p0, Lv7/p0;->H:Z

    iget-object v7, p0, Lv7/p0;->C:Lp7/b;

    if-eqz v7, :cond_8

    if-nez v8, :cond_5

    iget-object v9, p0, Lv7/p0;->E:[Lv7/p0$d;

    aget-object v9, v9, v4

    iget-boolean v9, v9, Lv7/p0$d;->b:Z

    if-eqz v9, :cond_7

    :cond_5
    iget-object v9, v6, Lt6/u1;->u:Ll7/a;

    if-nez v9, :cond_6

    new-instance v9, Ll7/a;

    new-array v10, v5, [Ll7/a$b;

    aput-object v7, v10, v2

    invoke-direct {v9, v10}, Ll7/a;-><init>([Ll7/a$b;)V

    goto :goto_4

    :cond_6
    new-array v10, v5, [Ll7/a$b;

    aput-object v7, v10, v2

    invoke-virtual {v9, v10}, Ll7/a;->a([Ll7/a$b;)Ll7/a;

    move-result-object v9

    :goto_4
    invoke-virtual {v6}, Lt6/u1;->c()Lt6/u1$b;

    move-result-object v6

    invoke-virtual {v6, v9}, Lt6/u1$b;->Z(Ll7/a;)Lt6/u1$b;

    move-result-object v6

    invoke-virtual {v6}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object v6

    :cond_7
    if-eqz v8, :cond_8

    iget v8, v6, Lt6/u1;->f:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_8

    iget v8, v6, Lt6/u1;->r:I

    if-ne v8, v9, :cond_8

    iget v8, v7, Lp7/b;->a:I

    if-eq v8, v9, :cond_8

    invoke-virtual {v6}, Lt6/u1;->c()Lt6/u1$b;

    move-result-object v6

    iget v7, v7, Lp7/b;->a:I

    invoke-virtual {v6, v7}, Lt6/u1$b;->I(I)Lt6/u1$b;

    move-result-object v6

    invoke-virtual {v6}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object v6

    :cond_8
    iget-object v7, p0, Lv7/p0;->c:Lx6/v;

    invoke-interface {v7, v6}, Lx6/v;->d(Lt6/u1;)I

    move-result v7

    invoke-virtual {v6, v7}, Lt6/u1;->d(I)Lt6/u1;

    move-result-object v6

    new-instance v7, Lv7/d1;

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    new-array v5, v5, [Lt6/u1;

    aput-object v6, v5, v2

    invoke-direct {v7, v8, v5}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    aput-object v7, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_9
    new-instance v0, Lv7/p0$e;

    new-instance v2, Lv7/f1;

    invoke-direct {v2, v1}, Lv7/f1;-><init>([Lv7/d1;)V

    invoke-direct {v0, v2, v3}, Lv7/p0$e;-><init>(Lv7/f1;[Z)V

    iput-object v0, p0, Lv7/p0;->I:Lv7/p0$e;

    iput-boolean v5, p0, Lv7/p0;->G:Z

    iget-object v0, p0, Lv7/p0;->B:Lv7/y$a;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/y$a;

    invoke-interface {v0, p0}, Lv7/y$a;->h(Lv7/y;)V

    :cond_a
    :goto_5
    return-void
.end method

.method private U(I)V
    .locals 10

    invoke-direct {p0}, Lv7/p0;->I()V

    iget-object v0, p0, Lv7/p0;->I:Lv7/p0$e;

    iget-object v1, v0, Lv7/p0$e;->d:[Z

    aget-boolean v2, v1, p1

    if-nez v2, :cond_0

    iget-object v0, v0, Lv7/p0$e;->a:Lv7/f1;

    invoke-virtual {v0, p1}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object v5

    iget-object v3, p0, Lv7/p0;->e:Lv7/h0$a;

    iget-object v0, v5, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {v0}, Lt8/w;->k(Ljava/lang/String;)I

    move-result v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-wide v8, p0, Lv7/p0;->R:J

    invoke-virtual/range {v3 .. v9}, Lv7/h0$a;->i(ILt6/u1;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    aput-boolean v0, v1, p1

    :cond_0
    return-void
.end method

.method private V(I)V
    .locals 3

    invoke-direct {p0}, Lv7/p0;->I()V

    iget-object v0, p0, Lv7/p0;->I:Lv7/p0$e;

    iget-object v0, v0, Lv7/p0$e;->b:[Z

    iget-boolean v1, p0, Lv7/p0;->T:Z

    if-eqz v1, :cond_2

    aget-boolean v0, v0, p1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lv7/u0;->K(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lv7/p0;->S:J

    iput-boolean v0, p0, Lv7/p0;->T:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv7/p0;->O:Z

    iput-wide v1, p0, Lv7/p0;->R:J

    iput v0, p0, Lv7/p0;->U:I

    iget-object p1, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_1

    aget-object v2, p1, v0

    invoke-virtual {v2}, Lv7/u0;->V()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lv7/p0;->B:Lv7/y$a;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private Y()V
    .locals 2

    iget-object v0, p0, Lv7/p0;->A:Landroid/os/Handler;

    new-instance v1, Lv7/n0;

    invoke-direct {v1, p0}, Lv7/n0;-><init>(Lv7/p0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private c0(Lv7/p0$d;)Ly6/b0;
    .locals 4

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lv7/p0;->E:[Lv7/p0$d;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Lv7/p0$d;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object p1, p1, v1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lv7/p0;->s:Ls8/b;

    iget-object v2, p0, Lv7/p0;->c:Lx6/v;

    iget-object v3, p0, Lv7/p0;->f:Lx6/u$a;

    invoke-static {v1, v2, v3}, Lv7/u0;->k(Ls8/b;Lx6/v;Lx6/u$a;)Lv7/u0;

    move-result-object v1

    invoke-virtual {v1, p0}, Lv7/u0;->d0(Lv7/u0$d;)V

    iget-object v2, p0, Lv7/p0;->E:[Lv7/p0$d;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lv7/p0$d;

    aput-object p1, v2, v0

    invoke-static {v2}, Lt8/r0;->k([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lv7/p0$d;

    iput-object p1, p0, Lv7/p0;->E:[Lv7/p0$d;

    iget-object p1, p0, Lv7/p0;->D:[Lv7/u0;

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lv7/u0;

    aput-object v1, p1, v0

    invoke-static {p1}, Lt8/r0;->k([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lv7/u0;

    iput-object p1, p0, Lv7/p0;->D:[Lv7/u0;

    return-object v1
.end method

.method private f0([ZJ)Z
    .locals 4

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object v3, v3, v2

    invoke-virtual {v3, p2, p3, v1}, Lv7/u0;->Z(JZ)Z

    move-result v3

    if-nez v3, :cond_1

    aget-boolean v3, p1, v2

    if-nez v3, :cond_0

    iget-boolean v3, p0, Lv7/p0;->H:Z

    if-nez v3, :cond_1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private g0(Ly6/z;)V
    .locals 6

    iget-object v0, p0, Lv7/p0;->C:Lp7/b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ly6/z$b;

    invoke-direct {v0, v1, v2}, Ly6/z$b;-><init>(J)V

    :goto_0
    iput-object v0, p0, Lv7/p0;->J:Ly6/z;

    invoke-interface {p1}, Ly6/z;->i()J

    move-result-wide v3

    iput-wide v3, p0, Lv7/p0;->K:J

    iget-boolean v0, p0, Lv7/p0;->Q:Z

    const/4 v3, 0x1

    if-nez v0, :cond_1

    invoke-interface {p1}, Ly6/z;->i()J

    move-result-wide v4

    cmp-long v0, v4, v1

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lv7/p0;->L:Z

    if-eqz v0, :cond_2

    const/4 v3, 0x7

    :cond_2
    iput v3, p0, Lv7/p0;->M:I

    iget-object v0, p0, Lv7/p0;->r:Lv7/p0$b;

    iget-wide v1, p0, Lv7/p0;->K:J

    invoke-interface {p1}, Ly6/z;->h()Z

    move-result p1

    iget-boolean v3, p0, Lv7/p0;->L:Z

    invoke-interface {v0, v1, v2, p1, v3}, Lv7/p0$b;->k(JZZ)V

    iget-boolean p1, p0, Lv7/p0;->G:Z

    if-nez p1, :cond_3

    invoke-direct {p0}, Lv7/p0;->T()V

    :cond_3
    return-void
.end method

.method private i0()V
    .locals 26

    move-object/from16 v7, p0

    new-instance v8, Lv7/p0$a;

    iget-object v2, v7, Lv7/p0;->a:Landroid/net/Uri;

    iget-object v3, v7, Lv7/p0;->b:Ls8/j;

    iget-object v4, v7, Lv7/p0;->w:Lv7/k0;

    iget-object v6, v7, Lv7/p0;->x:Lt8/g;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v5, p0

    invoke-direct/range {v0 .. v6}, Lv7/p0$a;-><init>(Lv7/p0;Landroid/net/Uri;Ls8/j;Lv7/k0;Ly6/m;Lt8/g;)V

    iget-boolean v0, v7, Lv7/p0;->G:Z

    if-eqz v0, :cond_2

    invoke-direct/range {p0 .. p0}, Lv7/p0;->O()Z

    move-result v0

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-wide v0, v7, Lv7/p0;->K:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v4, v7, Lv7/p0;->S:J

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, v7, Lv7/p0;->V:Z

    iput-wide v2, v7, Lv7/p0;->S:J

    return-void

    :cond_0
    iget-object v0, v7, Lv7/p0;->J:Ly6/z;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly6/z;

    iget-wide v4, v7, Lv7/p0;->S:J

    invoke-interface {v0, v4, v5}, Ly6/z;->d(J)Ly6/z$a;

    move-result-object v0

    iget-object v0, v0, Ly6/z$a;->a:Ly6/a0;

    iget-wide v0, v0, Ly6/a0;->b:J

    iget-wide v4, v7, Lv7/p0;->S:J

    invoke-static {v8, v0, v1, v4, v5}, Lv7/p0$a;->h(Lv7/p0$a;JJ)V

    iget-object v0, v7, Lv7/p0;->D:[Lv7/u0;

    array-length v1, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    aget-object v5, v0, v4

    iget-wide v9, v7, Lv7/p0;->S:J

    invoke-virtual {v5, v9, v10}, Lv7/u0;->b0(J)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iput-wide v2, v7, Lv7/p0;->S:J

    :cond_2
    invoke-direct/range {p0 .. p0}, Lv7/p0;->L()I

    move-result v0

    iput v0, v7, Lv7/p0;->U:I

    iget-object v0, v7, Lv7/p0;->v:Ls8/e0;

    iget-object v1, v7, Lv7/p0;->d:Ls8/d0;

    iget v2, v7, Lv7/p0;->M:I

    invoke-interface {v1, v2}, Ls8/d0;->a(I)I

    move-result v1

    invoke-virtual {v0, v8, v7, v1}, Ls8/e0;->n(Ls8/e0$e;Ls8/e0$b;I)J

    move-result-wide v13

    invoke-static {v8}, Lv7/p0$a;->f(Lv7/p0$a;)Ls8/n;

    move-result-object v12

    iget-object v15, v7, Lv7/p0;->e:Lv7/h0$a;

    new-instance v16, Lv7/u;

    invoke-static {v8}, Lv7/p0$a;->e(Lv7/p0$a;)J

    move-result-wide v10

    move-object/from16 v9, v16

    invoke-direct/range {v9 .. v14}, Lv7/u;-><init>(JLs8/n;J)V

    const/16 v17, 0x1

    const/16 v18, -0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static {v8}, Lv7/p0$a;->g(Lv7/p0$a;)J

    move-result-wide v22

    iget-wide v0, v7, Lv7/p0;->K:J

    move-wide/from16 v24, v0

    invoke-virtual/range {v15 .. v25}, Lv7/h0$a;->A(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    return-void
.end method

.method private j0()Z
    .locals 1

    iget-boolean v0, p0, Lv7/p0;->O:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lv7/p0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static synthetic u(Lv7/p0;)V
    .locals 0

    invoke-direct {p0}, Lv7/p0;->T()V

    return-void
.end method

.method public static synthetic v(Lv7/p0;)V
    .locals 0

    invoke-direct {p0}, Lv7/p0;->R()V

    return-void
.end method

.method public static synthetic w(Lv7/p0;Ly6/z;)V
    .locals 0

    invoke-direct {p0, p1}, Lv7/p0;->S(Ly6/z;)V

    return-void
.end method

.method public static synthetic x(Lv7/p0;)V
    .locals 0

    invoke-direct {p0}, Lv7/p0;->Q()V

    return-void
.end method

.method static synthetic y(Lv7/p0;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lv7/p0;->z:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic z(Lv7/p0;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lv7/p0;->A:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method N()Ly6/b0;
    .locals 3

    new-instance v0, Lv7/p0$d;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lv7/p0$d;-><init>(IZ)V

    invoke-direct {p0, v0}, Lv7/p0;->c0(Lv7/p0$d;)Ly6/b0;

    move-result-object v0

    return-object v0
.end method

.method P(I)Z
    .locals 1

    invoke-direct {p0}, Lv7/p0;->j0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Lv7/p0;->V:Z

    invoke-virtual {p1, v0}, Lv7/u0;->K(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method W()V
    .locals 3

    iget-object v0, p0, Lv7/p0;->v:Ls8/e0;

    iget-object v1, p0, Lv7/p0;->d:Ls8/d0;

    iget v2, p0, Lv7/p0;->M:I

    invoke-interface {v1, v2}, Ls8/d0;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ls8/e0;->k(I)V

    return-void
.end method

.method X(I)V
    .locals 1

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lv7/u0;->N()V

    invoke-virtual {p0}, Lv7/p0;->W()V

    return-void
.end method

.method public Z(Lv7/p0$a;JJZ)V
    .locals 15

    move-object v0, p0

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->d(Lv7/p0$a;)Ls8/l0;

    move-result-object v1

    new-instance v14, Lv7/u;

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->e(Lv7/p0$a;)J

    move-result-wide v3

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->f(Lv7/p0$a;)Ls8/n;

    move-result-object v5

    invoke-virtual {v1}, Ls8/l0;->r()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v1}, Ls8/l0;->s()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v1}, Ls8/l0;->h()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v1, v0, Lv7/p0;->d:Ls8/d0;

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->e(Lv7/p0$a;)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Ls8/d0;->c(J)V

    iget-object v2, v0, Lv7/p0;->e:Lv7/h0$a;

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->g(Lv7/p0$a;)J

    move-result-wide v9

    iget-wide v11, v0, Lv7/p0;->K:J

    move-object v3, v14

    invoke-virtual/range {v2 .. v12}, Lv7/h0$a;->r(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_1

    iget-object v1, v0, Lv7/p0;->D:[Lv7/u0;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-virtual {v4}, Lv7/u0;->V()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget v1, v0, Lv7/p0;->P:I

    if-lez v1, :cond_1

    iget-object v1, v0, Lv7/p0;->B:Lv7/y$a;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/y$a;

    invoke-interface {v1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    :cond_1
    return-void
.end method

.method public a(Lt6/u1;)V
    .locals 1

    iget-object p1, p0, Lv7/p0;->A:Landroid/os/Handler;

    iget-object v0, p0, Lv7/p0;->y:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a0(Lv7/p0$a;JJ)V
    .locals 16

    move-object/from16 v0, p0

    iget-wide v1, v0, Lv7/p0;->K:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v1, v0, Lv7/p0;->J:Ly6/z;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ly6/z;->h()Z

    move-result v1

    invoke-direct {v0, v2}, Lv7/p0;->M(Z)J

    move-result-wide v3

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v5, v3, v5

    if-nez v5, :cond_0

    const-wide/16 v3, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x2710

    add-long/2addr v3, v5

    :goto_0
    iput-wide v3, v0, Lv7/p0;->K:J

    iget-object v5, v0, Lv7/p0;->r:Lv7/p0$b;

    iget-boolean v6, v0, Lv7/p0;->L:Z

    invoke-interface {v5, v3, v4, v1, v6}, Lv7/p0$b;->k(JZZ)V

    :cond_1
    invoke-static/range {p1 .. p1}, Lv7/p0$a;->d(Lv7/p0$a;)Ls8/l0;

    move-result-object v1

    new-instance v15, Lv7/u;

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->e(Lv7/p0$a;)J

    move-result-wide v4

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->f(Lv7/p0$a;)Ls8/n;

    move-result-object v6

    invoke-virtual {v1}, Ls8/l0;->r()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v1}, Ls8/l0;->s()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v1}, Ls8/l0;->h()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v1, v0, Lv7/p0;->d:Ls8/d0;

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->e(Lv7/p0$a;)J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Ls8/d0;->c(J)V

    iget-object v3, v0, Lv7/p0;->e:Lv7/h0$a;

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->g(Lv7/p0$a;)J

    move-result-wide v10

    iget-wide v12, v0, Lv7/p0;->K:J

    move-object v4, v15

    invoke-virtual/range {v3 .. v13}, Lv7/h0$a;->u(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    iput-boolean v2, v0, Lv7/p0;->V:Z

    iget-object v1, v0, Lv7/p0;->B:Lv7/y$a;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/y$a;

    invoke-interface {v1, v0}, Lv7/w0$a;->a(Lv7/w0;)V

    return-void
.end method

.method public b()J
    .locals 2

    invoke-virtual {p0}, Lv7/p0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public b0(Lv7/p0$a;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 25

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->d(Lv7/p0$a;)Ls8/l0;

    move-result-object v1

    new-instance v14, Lv7/u;

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->e(Lv7/p0$a;)J

    move-result-wide v3

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->f(Lv7/p0$a;)Ls8/n;

    move-result-object v5

    invoke-virtual {v1}, Ls8/l0;->r()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v1}, Ls8/l0;->s()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v1}, Ls8/l0;->h()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v1, Lv7/x;

    const/16 v16, 0x1

    const/16 v17, -0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->g(Lv7/p0$a;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lt8/r0;->a1(J)J

    move-result-wide v21

    iget-wide v2, v0, Lv7/p0;->K:J

    invoke-static {v2, v3}, Lt8/r0;->a1(J)J

    move-result-wide v23

    move-object v15, v1

    invoke-direct/range {v15 .. v24}, Lv7/x;-><init>(IILt6/u1;ILjava/lang/Object;JJ)V

    iget-object v2, v0, Lv7/p0;->d:Ls8/d0;

    new-instance v3, Ls8/d0$c;

    move-object/from16 v13, p6

    move/from16 v4, p7

    invoke-direct {v3, v14, v1, v13, v4}, Ls8/d0$c;-><init>(Lv7/u;Lv7/x;Ljava/io/IOException;I)V

    invoke-interface {v2, v3}, Ls8/d0;->d(Ls8/d0$c;)J

    move-result-wide v1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    const/4 v4, 0x1

    if-nez v3, :cond_0

    sget-object v1, Ls8/e0;->g:Ls8/e0$c;

    move-object/from16 v15, p1

    goto :goto_1

    :cond_0
    invoke-direct/range {p0 .. p0}, Lv7/p0;->L()I

    move-result v3

    iget v5, v0, Lv7/p0;->U:I

    if-le v3, v5, :cond_1

    move-object/from16 v15, p1

    move v5, v4

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    move-object/from16 v15, p1

    :goto_0
    invoke-direct {v0, v15, v3}, Lv7/p0;->J(Lv7/p0$a;I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v5, v1, v2}, Ls8/e0;->h(ZJ)Ls8/e0$c;

    move-result-object v1

    goto :goto_1

    :cond_2
    sget-object v1, Ls8/e0;->f:Ls8/e0$c;

    :goto_1
    invoke-virtual {v1}, Ls8/e0$c;->c()Z

    move-result v2

    xor-int/lit8 v16, v2, 0x1

    iget-object v2, v0, Lv7/p0;->e:Lv7/h0$a;

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->g(Lv7/p0$a;)J

    move-result-wide v9

    iget-wide v11, v0, Lv7/p0;->K:J

    move-object v3, v14

    move-object/from16 v13, p6

    move/from16 v14, v16

    invoke-virtual/range {v2 .. v14}, Lv7/h0$a;->w(Lv7/u;IILt6/u1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v16, :cond_3

    iget-object v2, v0, Lv7/p0;->d:Ls8/d0;

    invoke-static/range {p1 .. p1}, Lv7/p0$a;->e(Lv7/p0$a;)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Ls8/d0;->c(J)V

    :cond_3
    return-object v1
.end method

.method public c(JLt6/u3;)J
    .locals 9

    invoke-direct {p0}, Lv7/p0;->I()V

    iget-object v0, p0, Lv7/p0;->J:Ly6/z;

    invoke-interface {v0}, Ly6/z;->h()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    iget-object v0, p0, Lv7/p0;->J:Ly6/z;

    invoke-interface {v0, p1, p2}, Ly6/z;->d(J)Ly6/z$a;

    move-result-object v0

    iget-object v1, v0, Ly6/z$a;->a:Ly6/a0;

    iget-wide v5, v1, Ly6/a0;->a:J

    iget-object v0, v0, Ly6/z$a;->b:Ly6/a0;

    iget-wide v7, v0, Ly6/a0;->a:J

    move-object v2, p3

    move-wide v3, p1

    invoke-virtual/range {v2 .. v8}, Lt6/u3;->a(JJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(II)Ly6/b0;
    .locals 1

    new-instance p2, Lv7/p0$d;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lv7/p0$d;-><init>(IZ)V

    invoke-direct {p0, p2}, Lv7/p0;->c0(Lv7/p0$d;)Ly6/b0;

    move-result-object p1

    return-object p1
.end method

.method d0(ILt6/v1;Lw6/g;I)I
    .locals 3

    invoke-direct {p0}, Lv7/p0;->j0()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1}, Lv7/p0;->U(I)V

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object v0, v0, p1

    iget-boolean v2, p0, Lv7/p0;->V:Z

    invoke-virtual {v0, p2, p3, p4, v2}, Lv7/u0;->S(Lt6/v1;Lw6/g;IZ)I

    move-result p2

    if-ne p2, v1, :cond_1

    invoke-direct {p0, p1}, Lv7/p0;->V(I)V

    :cond_1
    return p2
.end method

.method public e(J)Z
    .locals 0

    iget-boolean p1, p0, Lv7/p0;->V:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lv7/p0;->v:Ls8/e0;

    invoke-virtual {p1}, Ls8/e0;->i()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lv7/p0;->T:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lv7/p0;->G:Z

    if-eqz p1, :cond_0

    iget p1, p0, Lv7/p0;->P:I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lv7/p0;->x:Lt8/g;

    invoke-virtual {p1}, Lt8/g;->e()Z

    move-result p1

    iget-object p2, p0, Lv7/p0;->v:Ls8/e0;

    invoke-virtual {p2}, Ls8/e0;->j()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-direct {p0}, Lv7/p0;->i0()V

    const/4 p1, 0x1

    :cond_1
    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public e0()V
    .locals 4

    iget-boolean v0, p0, Lv7/p0;->G:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lv7/u0;->R()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv7/p0;->v:Ls8/e0;

    invoke-virtual {v0, p0}, Ls8/e0;->m(Ls8/e0$f;)V

    iget-object v0, p0, Lv7/p0;->A:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lv7/p0;->B:Lv7/y$a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv7/p0;->W:Z

    return-void
.end method

.method public f()J
    .locals 11

    invoke-direct {p0}, Lv7/p0;->I()V

    iget-boolean v0, p0, Lv7/p0;->V:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-nez v0, :cond_7

    iget v0, p0, Lv7/p0;->P:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lv7/p0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lv7/p0;->S:J

    return-wide v0

    :cond_1
    iget-boolean v0, p0, Lv7/p0;->H:Z

    const/4 v3, 0x0

    const-wide v4, 0x7fffffffffffffffL

    if-eqz v0, :cond_3

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v0, v0

    move v6, v3

    move-wide v7, v4

    :goto_0
    if-ge v6, v0, :cond_4

    iget-object v9, p0, Lv7/p0;->I:Lv7/p0$e;

    iget-object v10, v9, Lv7/p0$e;->b:[Z

    aget-boolean v10, v10, v6

    if-eqz v10, :cond_2

    iget-object v9, v9, Lv7/p0$e;->c:[Z

    aget-boolean v9, v9, v6

    if-eqz v9, :cond_2

    iget-object v9, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object v9, v9, v6

    invoke-virtual {v9}, Lv7/u0;->J()Z

    move-result v9

    if-nez v9, :cond_2

    iget-object v9, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object v9, v9, v6

    invoke-virtual {v9}, Lv7/u0;->z()J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move-wide v7, v4

    :cond_4
    cmp-long v0, v7, v4

    if-nez v0, :cond_5

    invoke-direct {p0, v3}, Lv7/p0;->M(Z)J

    move-result-wide v7

    :cond_5
    cmp-long v0, v7, v1

    if-nez v0, :cond_6

    iget-wide v7, p0, Lv7/p0;->R:J

    :cond_6
    return-wide v7

    :cond_7
    :goto_1
    return-wide v1
.end method

.method public g(J)V
    .locals 0

    return-void
.end method

.method public bridge synthetic h(Ls8/e0$e;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 0

    check-cast p1, Lv7/p0$a;

    invoke-virtual/range {p0 .. p7}, Lv7/p0;->b0(Lv7/p0$a;JJLjava/io/IOException;I)Ls8/e0$c;

    move-result-object p1

    return-object p1
.end method

.method h0(IJ)I
    .locals 2

    invoke-direct {p0}, Lv7/p0;->j0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lv7/p0;->U(I)V

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object v0, v0, p1

    iget-boolean v1, p0, Lv7/p0;->V:Z

    invoke-virtual {v0, p2, p3, v1}, Lv7/u0;->E(JZ)I

    move-result p2

    invoke-virtual {v0, p2}, Lv7/u0;->e0(I)V

    if-nez p2, :cond_1

    invoke-direct {p0, p1}, Lv7/p0;->V(I)V

    :cond_1
    return p2
.end method

.method public bridge synthetic i(Ls8/e0$e;JJZ)V
    .locals 0

    check-cast p1, Lv7/p0$a;

    invoke-virtual/range {p0 .. p6}, Lv7/p0;->Z(Lv7/p0$a;JJZ)V

    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lv7/p0;->v:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv7/p0;->x:Lt8/g;

    invoke-virtual {v0}, Lt8/g;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(J)J
    .locals 4

    invoke-direct {p0}, Lv7/p0;->I()V

    iget-object v0, p0, Lv7/p0;->I:Lv7/p0$e;

    iget-object v0, v0, Lv7/p0$e;->b:[Z

    iget-object v1, p0, Lv7/p0;->J:Ly6/z;

    invoke-interface {v1}, Ly6/z;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lv7/p0;->O:Z

    iput-wide p1, p0, Lv7/p0;->R:J

    invoke-direct {p0}, Lv7/p0;->O()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-wide p1, p0, Lv7/p0;->S:J

    return-wide p1

    :cond_1
    iget v2, p0, Lv7/p0;->M:I

    const/4 v3, 0x7

    if-eq v2, v3, :cond_2

    invoke-direct {p0, v0, p1, p2}, Lv7/p0;->f0([ZJ)Z

    move-result v0

    if-eqz v0, :cond_2

    return-wide p1

    :cond_2
    iput-boolean v1, p0, Lv7/p0;->T:Z

    iput-wide p1, p0, Lv7/p0;->S:J

    iput-boolean v1, p0, Lv7/p0;->V:Z

    iget-object v0, p0, Lv7/p0;->v:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v2, v0

    :goto_1
    if-ge v1, v2, :cond_3

    aget-object v3, v0, v1

    invoke-virtual {v3}, Lv7/u0;->r()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lv7/p0;->v:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->f()V

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lv7/p0;->v:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->g()V

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v2, v0

    :goto_2
    if-ge v1, v2, :cond_5

    aget-object v3, v0, v1

    invoke-virtual {v3}, Lv7/u0;->V()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    return-wide p1
.end method

.method public k(Lv7/y$a;J)V
    .locals 0

    iput-object p1, p0, Lv7/p0;->B:Lv7/y$a;

    iget-object p1, p0, Lv7/p0;->x:Lt8/g;

    invoke-virtual {p1}, Lt8/g;->e()Z

    invoke-direct {p0}, Lv7/p0;->i0()V

    return-void
.end method

.method public l()J
    .locals 2

    iget-boolean v0, p0, Lv7/p0;->O:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lv7/p0;->V:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lv7/p0;->L()I

    move-result v0

    iget v1, p0, Lv7/p0;->U:I

    if-le v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lv7/p0;->O:Z

    iget-wide v0, p0, Lv7/p0;->R:J

    return-wide v0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public bridge synthetic m(Ls8/e0$e;JJ)V
    .locals 0

    check-cast p1, Lv7/p0$a;

    invoke-virtual/range {p0 .. p5}, Lv7/p0;->a0(Lv7/p0$a;JJ)V

    return-void
.end method

.method public n()V
    .locals 4

    iget-object v0, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lv7/u0;->T()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv7/p0;->w:Lv7/k0;

    invoke-interface {v0}, Lv7/k0;->release()V

    return-void
.end method

.method public o()V
    .locals 2

    invoke-virtual {p0}, Lv7/p0;->W()V

    iget-boolean v0, p0, Lv7/p0;->V:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lv7/p0;->G:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Loading finished before preparation is complete."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lt6/b3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lt6/b3;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public p(Ly6/z;)V
    .locals 2

    iget-object v0, p0, Lv7/p0;->A:Landroid/os/Handler;

    new-instance v1, Lv7/o0;

    invoke-direct {v1, p0, p1}, Lv7/o0;-><init>(Lv7/p0;Ly6/z;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public q()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv7/p0;->F:Z

    iget-object v0, p0, Lv7/p0;->A:Landroid/os/Handler;

    iget-object v1, p0, Lv7/p0;->y:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public r()Lv7/f1;
    .locals 1

    invoke-direct {p0}, Lv7/p0;->I()V

    iget-object v0, p0, Lv7/p0;->I:Lv7/p0$e;

    iget-object v0, v0, Lv7/p0$e;->a:Lv7/f1;

    return-object v0
.end method

.method public s(JZ)V
    .locals 5

    invoke-direct {p0}, Lv7/p0;->I()V

    invoke-direct {p0}, Lv7/p0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lv7/p0;->I:Lv7/p0$e;

    iget-object v0, v0, Lv7/p0$e;->c:[Z

    iget-object v1, p0, Lv7/p0;->D:[Lv7/u0;

    array-length v1, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v3, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object v3, v3, v2

    aget-boolean v4, v0, v2

    invoke-virtual {v3, p1, p2, p3, v4}, Lv7/u0;->q(JZZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public t([Lq8/r;[Z[Lv7/v0;[ZJ)J
    .locals 8

    invoke-direct {p0}, Lv7/p0;->I()V

    iget-object v0, p0, Lv7/p0;->I:Lv7/p0$e;

    iget-object v1, v0, Lv7/p0$e;->a:Lv7/f1;

    iget-object v0, v0, Lv7/p0$e;->c:[Z

    iget v2, p0, Lv7/p0;->P:I

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    array-length v5, p1

    const/4 v6, 0x1

    if-ge v4, v5, :cond_2

    aget-object v5, p3, v4

    if-eqz v5, :cond_1

    aget-object v7, p1, v4

    if-eqz v7, :cond_0

    aget-boolean v7, p2, v4

    if-nez v7, :cond_1

    :cond_0
    check-cast v5, Lv7/p0$c;

    invoke-static {v5}, Lv7/p0$c;->b(Lv7/p0$c;)I

    move-result v5

    aget-boolean v7, v0, v5

    invoke-static {v7}, Lt8/a;->g(Z)V

    iget v7, p0, Lv7/p0;->P:I

    sub-int/2addr v7, v6

    iput v7, p0, Lv7/p0;->P:I

    aput-boolean v3, v0, v5

    const/4 v5, 0x0

    aput-object v5, p3, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Lv7/p0;->N:Z

    if-eqz p2, :cond_3

    if-nez v2, :cond_4

    goto :goto_1

    :cond_3
    const-wide/16 v4, 0x0

    cmp-long p2, p5, v4

    if-eqz p2, :cond_4

    :goto_1
    move p2, v6

    goto :goto_2

    :cond_4
    move p2, v3

    :goto_2
    move v2, v3

    :goto_3
    array-length v4, p1

    if-ge v2, v4, :cond_9

    aget-object v4, p3, v2

    if-nez v4, :cond_8

    aget-object v4, p1, v2

    if-eqz v4, :cond_8

    invoke-interface {v4}, Lq8/u;->length()I

    move-result v5

    if-ne v5, v6, :cond_5

    move v5, v6

    goto :goto_4

    :cond_5
    move v5, v3

    :goto_4
    invoke-static {v5}, Lt8/a;->g(Z)V

    invoke-interface {v4, v3}, Lq8/u;->b(I)I

    move-result v5

    if-nez v5, :cond_6

    move v5, v6

    goto :goto_5

    :cond_6
    move v5, v3

    :goto_5
    invoke-static {v5}, Lt8/a;->g(Z)V

    invoke-interface {v4}, Lq8/u;->d()Lv7/d1;

    move-result-object v4

    invoke-virtual {v1, v4}, Lv7/f1;->d(Lv7/d1;)I

    move-result v4

    aget-boolean v5, v0, v4

    xor-int/2addr v5, v6

    invoke-static {v5}, Lt8/a;->g(Z)V

    iget v5, p0, Lv7/p0;->P:I

    add-int/2addr v5, v6

    iput v5, p0, Lv7/p0;->P:I

    aput-boolean v6, v0, v4

    new-instance v5, Lv7/p0$c;

    invoke-direct {v5, p0, v4}, Lv7/p0$c;-><init>(Lv7/p0;I)V

    aput-object v5, p3, v2

    aput-boolean v6, p4, v2

    if-nez p2, :cond_8

    iget-object p2, p0, Lv7/p0;->D:[Lv7/u0;

    aget-object p2, p2, v4

    invoke-virtual {p2, p5, p6, v6}, Lv7/u0;->Z(JZ)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {p2}, Lv7/u0;->C()I

    move-result p2

    if-eqz p2, :cond_7

    move p2, v6

    goto :goto_6

    :cond_7
    move p2, v3

    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    iget p1, p0, Lv7/p0;->P:I

    if-nez p1, :cond_c

    iput-boolean v3, p0, Lv7/p0;->T:Z

    iput-boolean v3, p0, Lv7/p0;->O:Z

    iget-object p1, p0, Lv7/p0;->v:Ls8/e0;

    invoke-virtual {p1}, Ls8/e0;->j()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lv7/p0;->D:[Lv7/u0;

    array-length p2, p1

    :goto_7
    if-ge v3, p2, :cond_a

    aget-object p3, p1, v3

    invoke-virtual {p3}, Lv7/u0;->r()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_a
    iget-object p1, p0, Lv7/p0;->v:Ls8/e0;

    invoke-virtual {p1}, Ls8/e0;->f()V

    goto :goto_a

    :cond_b
    iget-object p1, p0, Lv7/p0;->D:[Lv7/u0;

    array-length p2, p1

    :goto_8
    if-ge v3, p2, :cond_e

    aget-object p3, p1, v3

    invoke-virtual {p3}, Lv7/u0;->V()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_c
    if-eqz p2, :cond_e

    invoke-virtual {p0, p5, p6}, Lv7/p0;->j(J)J

    move-result-wide p5

    :goto_9
    array-length p1, p3

    if-ge v3, p1, :cond_e

    aget-object p1, p3, v3

    if-eqz p1, :cond_d

    aput-boolean v6, p4, v3

    :cond_d
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_e
    :goto_a
    iput-boolean v6, p0, Lv7/p0;->N:Z

    return-wide p5
.end method
