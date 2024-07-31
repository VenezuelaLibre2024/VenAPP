.class final La8/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/e0$b;
.implements Ls8/e0$f;
.implements Lv7/w0;
.implements Ly6/m;
.implements Lv7/u0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La8/p$c;,
        La8/p$d;,
        La8/p$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ls8/e0$b<",
        "Lx7/f;",
        ">;",
        "Ls8/e0$f;",
        "Lv7/w0;",
        "Ly6/m;",
        "Lv7/u0$d;"
    }
.end annotation


# static fields
.field private static final j0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final A:Ljava/lang/Runnable;

.field private final B:Ljava/lang/Runnable;

.field private final C:Landroid/os/Handler;

.field private final D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La8/l;",
            ">;"
        }
    .end annotation
.end field

.field private final E:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx6/m;",
            ">;"
        }
    .end annotation
.end field

.field private F:Lx7/f;

.field private G:[La8/p$d;

.field private H:[I

.field private I:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private J:Landroid/util/SparseIntArray;

.field private K:Ly6/b0;

.field private L:I

.field private M:I

.field private N:Z

.field private O:Z

.field private P:I

.field private Q:Lt6/u1;

.field private R:Lt6/u1;

.field private S:Z

.field private T:Lv7/f1;

.field private U:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lv7/d1;",
            ">;"
        }
    .end annotation
.end field

.field private V:[I

.field private W:I

.field private X:Z

.field private Y:[Z

.field private Z:[Z

.field private final a:Ljava/lang/String;

.field private a0:J

.field private final b:I

.field private b0:J

.field private final c:La8/p$b;

.field private c0:Z

.field private final d:La8/f;

.field private d0:Z

.field private final e:Ls8/b;

.field private e0:Z

.field private final f:Lt6/u1;

.field private f0:Z

.field private g0:J

.field private h0:Lx6/m;

.field private i0:La8/i;

.field private final r:Lx6/v;

.field private final s:Lx6/u$a;

.field private final t:Ls8/d0;

.field private final u:Ls8/e0;

.field private final v:Lv7/h0$a;

.field private final w:I

.field private final x:La8/f$b;

.field private final y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La8/i;",
            ">;"
        }
    .end annotation
.end field

.field private final z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La8/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, La8/p;->j0:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILa8/p$b;La8/f;Ljava/util/Map;Ls8/b;JLt6/u1;Lx6/v;Lx6/u$a;Ls8/d0;Lv7/h0$a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "La8/p$b;",
            "La8/f;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx6/m;",
            ">;",
            "Ls8/b;",
            "J",
            "Lt6/u1;",
            "Lx6/v;",
            "Lx6/u$a;",
            "Ls8/d0;",
            "Lv7/h0$a;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/p;->a:Ljava/lang/String;

    iput p2, p0, La8/p;->b:I

    iput-object p3, p0, La8/p;->c:La8/p$b;

    iput-object p4, p0, La8/p;->d:La8/f;

    iput-object p5, p0, La8/p;->E:Ljava/util/Map;

    iput-object p6, p0, La8/p;->e:Ls8/b;

    iput-object p9, p0, La8/p;->f:Lt6/u1;

    iput-object p10, p0, La8/p;->r:Lx6/v;

    iput-object p11, p0, La8/p;->s:Lx6/u$a;

    iput-object p12, p0, La8/p;->t:Ls8/d0;

    iput-object p13, p0, La8/p;->v:Lv7/h0$a;

    iput p14, p0, La8/p;->w:I

    new-instance p1, Ls8/e0;

    const-string p2, "Loader:HlsSampleStreamWrapper"

    invoke-direct {p1, p2}, Ls8/e0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, La8/p;->u:Ls8/e0;

    new-instance p1, La8/f$b;

    invoke-direct {p1}, La8/f$b;-><init>()V

    iput-object p1, p0, La8/p;->x:La8/f$b;

    const/4 p1, 0x0

    new-array p2, p1, [I

    iput-object p2, p0, La8/p;->H:[I

    new-instance p2, Ljava/util/HashSet;

    sget-object p3, La8/p;->j0:Ljava/util/Set;

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/HashSet;-><init>(I)V

    iput-object p2, p0, La8/p;->I:Ljava/util/Set;

    new-instance p2, Landroid/util/SparseIntArray;

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result p3

    invoke-direct {p2, p3}, Landroid/util/SparseIntArray;-><init>(I)V

    iput-object p2, p0, La8/p;->J:Landroid/util/SparseIntArray;

    new-array p2, p1, [La8/p$d;

    iput-object p2, p0, La8/p;->G:[La8/p$d;

    new-array p2, p1, [Z

    iput-object p2, p0, La8/p;->Z:[Z

    new-array p1, p1, [Z

    iput-object p1, p0, La8/p;->Y:[Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, La8/p;->z:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La8/p;->D:Ljava/util/ArrayList;

    new-instance p1, La8/n;

    invoke-direct {p1, p0}, La8/n;-><init>(La8/p;)V

    iput-object p1, p0, La8/p;->A:Ljava/lang/Runnable;

    new-instance p1, La8/o;

    invoke-direct {p1, p0}, La8/o;-><init>(La8/p;)V

    iput-object p1, p0, La8/p;->B:Ljava/lang/Runnable;

    invoke-static {}, Lt8/r0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, La8/p;->C:Landroid/os/Handler;

    iput-wide p7, p0, La8/p;->a0:J

    iput-wide p7, p0, La8/p;->b0:J

    return-void
.end method

.method private static B(II)Ly6/j;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unmapped track with id "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "HlsSampleStreamWrapper"

    invoke-static {p1, p0}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Ly6/j;

    invoke-direct {p0}, Ly6/j;-><init>()V

    return-object p0
.end method

.method private C(II)Lv7/u0;
    .locals 9

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    array-length v0, v0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    new-instance v8, La8/p$d;

    iget-object v3, p0, La8/p;->e:Ls8/b;

    iget-object v4, p0, La8/p;->r:Lx6/v;

    iget-object v5, p0, La8/p;->s:Lx6/u$a;

    iget-object v6, p0, La8/p;->E:Ljava/util/Map;

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, La8/p$d;-><init>(Ls8/b;Lx6/v;Lx6/u$a;Ljava/util/Map;La8/p$a;)V

    iget-wide v2, p0, La8/p;->a0:J

    invoke-virtual {v8, v2, v3}, Lv7/u0;->b0(J)V

    if-eqz v1, :cond_2

    iget-object v2, p0, La8/p;->h0:Lx6/m;

    invoke-virtual {v8, v2}, La8/p$d;->i0(Lx6/m;)V

    :cond_2
    iget-wide v2, p0, La8/p;->g0:J

    invoke-virtual {v8, v2, v3}, Lv7/u0;->a0(J)V

    iget-object v2, p0, La8/p;->i0:La8/i;

    if-eqz v2, :cond_3

    invoke-virtual {v8, v2}, La8/p$d;->j0(La8/i;)V

    :cond_3
    invoke-virtual {v8, p0}, Lv7/u0;->d0(Lv7/u0$d;)V

    iget-object v2, p0, La8/p;->H:[I

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, La8/p;->H:[I

    aput p1, v2, v0

    iget-object p1, p0, La8/p;->G:[La8/p$d;

    invoke-static {p1, v8}, Lt8/r0;->F0([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [La8/p$d;

    iput-object p1, p0, La8/p;->G:[La8/p$d;

    iget-object p1, p0, La8/p;->Z:[Z

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, La8/p;->Z:[Z

    aput-boolean v1, p1, v0

    iget-boolean p1, p0, La8/p;->X:Z

    or-int/2addr p1, v1

    iput-boolean p1, p0, La8/p;->X:Z

    iget-object p1, p0, La8/p;->I:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, La8/p;->J:Landroid/util/SparseIntArray;

    invoke-virtual {p1, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    invoke-static {p2}, La8/p;->L(I)I

    move-result p1

    iget v1, p0, La8/p;->L:I

    invoke-static {v1}, La8/p;->L(I)I

    move-result v1

    if-le p1, v1, :cond_4

    iput v0, p0, La8/p;->M:I

    iput p2, p0, La8/p;->L:I

    :cond_4
    iget-object p1, p0, La8/p;->Y:[Z

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, La8/p;->Y:[Z

    return-object v8
.end method

.method private D([Lv7/d1;)Lv7/f1;
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget-object v2, p1, v1

    iget v3, v2, Lv7/d1;->a:I

    new-array v3, v3, [Lt6/u1;

    move v4, v0

    :goto_1
    iget v5, v2, Lv7/d1;->a:I

    if-ge v4, v5, :cond_0

    invoke-virtual {v2, v4}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object v5

    iget-object v6, p0, La8/p;->r:Lx6/v;

    invoke-interface {v6, v5}, Lx6/v;->d(Lt6/u1;)I

    move-result v6

    invoke-virtual {v5, v6}, Lt6/u1;->d(I)Lt6/u1;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    new-instance v4, Lv7/d1;

    iget-object v2, v2, Lv7/d1;->b:Ljava/lang/String;

    invoke-direct {v4, v2, v3}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    aput-object v4, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lv7/f1;

    invoke-direct {v0, p1}, Lv7/f1;-><init>([Lv7/d1;)V

    return-object v0
.end method

.method private static E(Lt6/u1;Lt6/u1;Z)Lt6/u1;
    .locals 7

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p1, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {v0}, Lt8/w;->k(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lt6/u1;->t:Ljava/lang/String;

    invoke-static {v1, v0}, Lt8/r0;->K(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lt6/u1;->t:Ljava/lang/String;

    invoke-static {v1, v0}, Lt8/r0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lt8/w;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lt6/u1;->t:Ljava/lang/String;

    iget-object v3, p1, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lt8/w;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p1, Lt6/u1;->w:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1}, Lt6/u1;->c()Lt6/u1$b;

    move-result-object v4

    iget-object v5, p0, Lt6/u1;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lt6/u1$b;->U(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v4

    iget-object v5, p0, Lt6/u1;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lt6/u1$b;->W(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v4

    iget-object v5, p0, Lt6/u1;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lt6/u1$b;->X(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v4

    iget v5, p0, Lt6/u1;->d:I

    invoke-virtual {v4, v5}, Lt6/u1$b;->i0(I)Lt6/u1$b;

    move-result-object v4

    iget v5, p0, Lt6/u1;->e:I

    invoke-virtual {v4, v5}, Lt6/u1$b;->e0(I)Lt6/u1$b;

    move-result-object v4

    const/4 v5, -0x1

    if-eqz p2, :cond_2

    iget v6, p0, Lt6/u1;->f:I

    goto :goto_1

    :cond_2
    move v6, v5

    :goto_1
    invoke-virtual {v4, v6}, Lt6/u1$b;->I(I)Lt6/u1$b;

    move-result-object v4

    if-eqz p2, :cond_3

    iget p2, p0, Lt6/u1;->r:I

    goto :goto_2

    :cond_3
    move p2, v5

    :goto_2
    invoke-virtual {v4, p2}, Lt6/u1$b;->b0(I)Lt6/u1$b;

    move-result-object p2

    invoke-virtual {p2, v1}, Lt6/u1$b;->K(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget v1, p0, Lt6/u1;->B:I

    invoke-virtual {p2, v1}, Lt6/u1$b;->n0(I)Lt6/u1$b;

    move-result-object v1

    iget v4, p0, Lt6/u1;->C:I

    invoke-virtual {v1, v4}, Lt6/u1$b;->S(I)Lt6/u1$b;

    move-result-object v1

    iget v4, p0, Lt6/u1;->D:F

    invoke-virtual {v1, v4}, Lt6/u1$b;->R(F)Lt6/u1$b;

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {p2, v3}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    :cond_5
    iget v1, p0, Lt6/u1;->J:I

    if-eq v1, v5, :cond_6

    if-ne v0, v2, :cond_6

    invoke-virtual {p2, v1}, Lt6/u1$b;->J(I)Lt6/u1$b;

    :cond_6
    iget-object p0, p0, Lt6/u1;->u:Ll7/a;

    if-eqz p0, :cond_8

    iget-object p1, p1, Lt6/u1;->u:Ll7/a;

    if-eqz p1, :cond_7

    invoke-virtual {p1, p0}, Ll7/a;->b(Ll7/a;)Ll7/a;

    move-result-object p0

    :cond_7
    invoke-virtual {p2, p0}, Lt6/u1$b;->Z(Ll7/a;)Lt6/u1$b;

    :cond_8
    invoke-virtual {p2}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p0

    return-object p0
.end method

.method private F(I)V
    .locals 7

    iget-object v0, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lt8/a;->g(Z)V

    :goto_0
    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, -0x1

    if-ge p1, v0, :cond_1

    invoke-direct {p0, p1}, La8/p;->z(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_1
    if-ne p1, v1, :cond_2

    return-void

    :cond_2
    invoke-direct {p0}, La8/p;->J()La8/i;

    move-result-object v0

    iget-wide v5, v0, Lx7/f;->h:J

    invoke-direct {p0, p1}, La8/p;->G(I)La8/i;

    move-result-object p1

    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide v0, p0, La8/p;->a0:J

    iput-wide v0, p0, La8/p;->b0:J

    goto :goto_2

    :cond_3
    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/google/common/collect/e0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8/i;

    invoke-virtual {v0}, La8/i;->o()V

    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, La8/p;->e0:Z

    iget-object v1, p0, La8/p;->v:Lv7/h0$a;

    iget v2, p0, La8/p;->L:I

    iget-wide v3, p1, Lx7/f;->g:J

    invoke-virtual/range {v1 .. v6}, Lv7/h0$a;->D(IJJ)V

    return-void
.end method

.method private G(I)La8/i;
    .locals 3

    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8/i;

    iget-object v1, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, p1, v2}, Lt8/r0;->N0(Ljava/util/List;II)V

    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, La8/p;->G:[La8/p$d;

    array-length v1, v1

    if-ge p1, v1, :cond_0

    invoke-virtual {v0, p1}, La8/i;->m(I)I

    move-result v1

    iget-object v2, p0, La8/p;->G:[La8/p$d;

    aget-object v2, v2, p1

    invoke-virtual {v2, v1}, Lv7/u0;->u(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private H(La8/i;)Z
    .locals 4

    iget p1, p1, La8/i;->k:I

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, La8/p;->Y:[Z

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_0

    iget-object v3, p0, La8/p;->G:[La8/p$d;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lv7/u0;->Q()I

    move-result v3

    if-ne v3, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private static I(Lt6/u1;Lt6/u1;)Z
    .locals 6

    iget-object v0, p0, Lt6/u1;->w:Ljava/lang/String;

    iget-object v1, p1, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {v0}, Lt8/w;->k(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v2, v3, :cond_1

    invoke-static {v1}, Lt8/w;->k(Ljava/lang/String;)I

    move-result p0

    if-ne v2, p0, :cond_0

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    return v4

    :cond_1
    invoke-static {v0, v1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v5

    :cond_2
    const-string v1, "application/cea-608"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "application/cea-708"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    return v4

    :cond_4
    :goto_1
    iget p0, p0, Lt6/u1;->O:I

    iget p1, p1, Lt6/u1;->O:I

    if-ne p0, p1, :cond_5

    goto :goto_2

    :cond_5
    move v4, v5

    :goto_2
    return v4
.end method

.method private J()La8/i;
    .locals 2

    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8/i;

    return-object v0
.end method

.method private K(II)Ly6/b0;
    .locals 3

    sget-object v0, La8/p;->j0:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lt8/a;->a(Z)V

    iget-object v0, p0, La8/p;->J:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {v0, p2, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v0

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, La8/p;->I:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, La8/p;->H:[I

    aput p1, v1, v0

    :cond_1
    iget-object v1, p0, La8/p;->H:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_2

    iget-object p1, p0, La8/p;->G:[La8/p$d;

    aget-object p1, p1, v0

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, La8/p;->B(II)Ly6/j;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private static L(I)I
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x3

    if-eq p0, v0, :cond_1

    if-eq p0, v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v1

    :cond_1
    return v2

    :cond_2
    return v0
.end method

.method private M(La8/i;)V
    .locals 6

    iput-object p1, p0, La8/p;->i0:La8/i;

    iget-object v0, p1, Lx7/f;->d:Lt6/u1;

    iput-object v0, p0, La8/p;->Q:Lt6/u1;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, La8/p;->b0:J

    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/google/common/collect/w;->p()Lcom/google/common/collect/w$a;

    move-result-object v0

    iget-object v1, p0, La8/p;->G:[La8/p$d;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    invoke-virtual {v5}, Lv7/u0;->G()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/google/common/collect/w$a;->h(Ljava/lang/Object;)Lcom/google/common/collect/w$a;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/common/collect/w$a;->k()Lcom/google/common/collect/w;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, La8/i;->n(La8/p;Lcom/google/common/collect/w;)V

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    array-length v1, v0

    :goto_1
    if-ge v3, v1, :cond_2

    aget-object v2, v0, v3

    invoke-virtual {v2, p1}, La8/p$d;->j0(La8/i;)V

    iget-boolean v4, p1, La8/i;->n:Z

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Lv7/u0;->g0()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private static N(Lx7/f;)Z
    .locals 0

    instance-of p0, p0, La8/i;

    return p0
.end method

.method private O()Z
    .locals 4

    iget-wide v0, p0, La8/p;->b0:J

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

.method private R()V
    .locals 6

    iget-object v0, p0, La8/p;->T:Lv7/f1;

    iget v0, v0, Lv7/f1;->a:I

    new-array v1, v0, [I

    iput-object v1, p0, La8/p;->V:[I

    const/4 v2, -0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    move v3, v1

    :goto_1
    iget-object v4, p0, La8/p;->G:[La8/p$d;

    array-length v5, v4

    if-ge v3, v5, :cond_1

    aget-object v4, v4, v3

    invoke-virtual {v4}, Lv7/u0;->F()Lt6/u1;

    move-result-object v4

    invoke-static {v4}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt6/u1;

    iget-object v5, p0, La8/p;->T:Lv7/f1;

    invoke-virtual {v5, v2}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object v5

    invoke-virtual {v5, v1}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object v5

    invoke-static {v4, v5}, La8/p;->I(Lt6/u1;Lt6/u1;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, La8/p;->V:[I

    aput v3, v4, v2

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, La8/p;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La8/l;

    invoke-virtual {v1}, La8/l;->b()V

    goto :goto_3

    :cond_3
    return-void
.end method

.method private S()V
    .locals 4

    iget-boolean v0, p0, La8/p;->S:Z

    if-nez v0, :cond_4

    iget-object v0, p0, La8/p;->V:[I

    if-nez v0, :cond_4

    iget-boolean v0, p0, La8/p;->N:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, La8/p;->G:[La8/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lv7/u0;->F()Lt6/u1;

    move-result-object v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, La8/p;->T:Lv7/f1;

    if-eqz v0, :cond_3

    invoke-direct {p0}, La8/p;->R()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, La8/p;->y()V

    invoke-direct {p0}, La8/p;->k0()V

    iget-object v0, p0, La8/p;->c:La8/p$b;

    invoke-interface {v0}, La8/p$b;->onPrepared()V

    :cond_4
    :goto_1
    return-void
.end method

.method private b0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La8/p;->N:Z

    invoke-direct {p0}, La8/p;->S()V

    return-void
.end method

.method private f0()V
    .locals 6

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-boolean v5, p0, La8/p;->c0:Z

    invoke-virtual {v4, v5}, Lv7/u0;->W(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v2, p0, La8/p;->c0:Z

    return-void
.end method

.method private g0(J)Z
    .locals 4

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, La8/p;->G:[La8/p$d;

    aget-object v3, v3, v2

    invoke-virtual {v3, p1, p2, v1}, Lv7/u0;->Z(JZ)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, La8/p;->Z:[Z

    aget-boolean v3, v3, v2

    if-nez v3, :cond_0

    iget-boolean v3, p0, La8/p;->X:Z

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

.method private k0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La8/p;->O:Z

    return-void
.end method

.method private p0([Lv7/v0;)V
    .locals 4

    iget-object v0, p0, La8/p;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    iget-object v3, p0, La8/p;->D:Ljava/util/ArrayList;

    check-cast v2, La8/l;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic u(La8/p;)V
    .locals 0

    invoke-direct {p0}, La8/p;->b0()V

    return-void
.end method

.method public static synthetic v(La8/p;)V
    .locals 0

    invoke-direct {p0}, La8/p;->S()V

    return-void
.end method

.method private w()V
    .locals 1

    iget-boolean v0, p0, La8/p;->O:Z

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, La8/p;->T:Lv7/f1;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La8/p;->U:Ljava/util/Set;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private y()V
    .locals 15

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    array-length v0, v0

    const/4 v1, -0x2

    const/4 v2, -0x1

    const/4 v3, 0x0

    move v5, v1

    move v6, v2

    move v4, v3

    :goto_0
    const/4 v7, 0x2

    const/4 v8, 0x1

    if-ge v4, v0, :cond_5

    iget-object v9, p0, La8/p;->G:[La8/p$d;

    aget-object v9, v9, v4

    invoke-virtual {v9}, Lv7/u0;->F()Lt6/u1;

    move-result-object v9

    invoke-static {v9}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lt6/u1;

    iget-object v9, v9, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {v9}, Lt8/w;->s(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v9}, Lt8/w;->o(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v8

    goto :goto_1

    :cond_1
    invoke-static {v9}, Lt8/w;->r(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x3

    goto :goto_1

    :cond_2
    move v7, v1

    :goto_1
    invoke-static {v7}, La8/p;->L(I)I

    move-result v8

    invoke-static {v5}, La8/p;->L(I)I

    move-result v9

    if-le v8, v9, :cond_3

    move v6, v4

    move v5, v7

    goto :goto_2

    :cond_3
    if-ne v7, v5, :cond_4

    if-eq v6, v2, :cond_4

    move v6, v2

    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    iget-object v1, p0, La8/p;->d:La8/f;

    invoke-virtual {v1}, La8/f;->j()Lv7/d1;

    move-result-object v1

    iget v4, v1, Lv7/d1;->a:I

    iput v2, p0, La8/p;->W:I

    new-array v2, v0, [I

    iput-object v2, p0, La8/p;->V:[I

    move v2, v3

    :goto_3
    if-ge v2, v0, :cond_6

    iget-object v9, p0, La8/p;->V:[I

    aput v2, v9, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    new-array v2, v0, [Lv7/d1;

    move v9, v3

    :goto_4
    if-ge v9, v0, :cond_d

    iget-object v10, p0, La8/p;->G:[La8/p$d;

    aget-object v10, v10, v9

    invoke-virtual {v10}, Lv7/u0;->F()Lt6/u1;

    move-result-object v10

    invoke-static {v10}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lt6/u1;

    if-ne v9, v6, :cond_a

    new-array v11, v4, [Lt6/u1;

    move v12, v3

    :goto_5
    if-ge v12, v4, :cond_9

    invoke-virtual {v1, v12}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object v13

    if-ne v5, v8, :cond_7

    iget-object v14, p0, La8/p;->f:Lt6/u1;

    if-eqz v14, :cond_7

    invoke-virtual {v13, v14}, Lt6/u1;->l(Lt6/u1;)Lt6/u1;

    move-result-object v13

    :cond_7
    if-ne v4, v8, :cond_8

    invoke-virtual {v10, v13}, Lt6/u1;->l(Lt6/u1;)Lt6/u1;

    move-result-object v13

    goto :goto_6

    :cond_8
    invoke-static {v13, v10, v8}, La8/p;->E(Lt6/u1;Lt6/u1;Z)Lt6/u1;

    move-result-object v13

    :goto_6
    aput-object v13, v11, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_9
    new-instance v10, Lv7/d1;

    iget-object v12, p0, La8/p;->a:Ljava/lang/String;

    invoke-direct {v10, v12, v11}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    aput-object v10, v2, v9

    iput v9, p0, La8/p;->W:I

    goto :goto_9

    :cond_a
    if-ne v5, v7, :cond_b

    iget-object v11, v10, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {v11}, Lt8/w;->o(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_b

    iget-object v11, p0, La8/p;->f:Lt6/u1;

    goto :goto_7

    :cond_b
    const/4 v11, 0x0

    :goto_7
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, p0, La8/p;->a:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ":muxed:"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ge v9, v6, :cond_c

    move v13, v9

    goto :goto_8

    :cond_c
    add-int/lit8 v13, v9, -0x1

    :goto_8
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Lv7/d1;

    new-array v14, v8, [Lt6/u1;

    invoke-static {v11, v10, v3}, La8/p;->E(Lt6/u1;Lt6/u1;Z)Lt6/u1;

    move-result-object v10

    aput-object v10, v14, v3

    invoke-direct {v13, v12, v14}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    aput-object v13, v2, v9

    :goto_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_d
    invoke-direct {p0, v2}, La8/p;->D([Lv7/d1;)Lv7/f1;

    move-result-object v0

    iput-object v0, p0, La8/p;->T:Lv7/f1;

    iget-object v0, p0, La8/p;->U:Ljava/util/Set;

    if-nez v0, :cond_e

    move v3, v8

    :cond_e
    invoke-static {v3}, Lt8/a;->g(Z)V

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, La8/p;->U:Ljava/util/Set;

    return-void
.end method

.method private z(I)Z
    .locals 4

    move v0, p1

    :goto_0
    iget-object v1, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    iget-object v1, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La8/i;

    iget-boolean v1, v1, La8/i;->n:Z

    if-eqz v1, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La8/i;

    move v0, v2

    :goto_1
    iget-object v1, p0, La8/p;->G:[La8/p$d;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    invoke-virtual {p1, v0}, La8/i;->m(I)I

    move-result v1

    iget-object v3, p0, La8/p;->G:[La8/p$d;

    aget-object v3, v3, v0

    invoke-virtual {v3}, Lv7/u0;->C()I

    move-result v3

    if-le v3, v1, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public A()V
    .locals 2

    iget-boolean v0, p0, La8/p;->O:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, La8/p;->a0:J

    invoke-virtual {p0, v0, v1}, La8/p;->e(J)Z

    :cond_0
    return-void
.end method

.method public P(I)Z
    .locals 1

    invoke-direct {p0}, La8/p;->O()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    aget-object p1, v0, p1

    iget-boolean v0, p0, La8/p;->e0:Z

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

.method public Q()Z
    .locals 2

    iget v0, p0, La8/p;->L:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public T()V
    .locals 1

    iget-object v0, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->a()V

    iget-object v0, p0, La8/p;->d:La8/f;

    invoke-virtual {v0}, La8/f;->n()V

    return-void
.end method

.method public U(I)V
    .locals 1

    invoke-virtual {p0}, La8/p;->T()V

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lv7/u0;->N()V

    return-void
.end method

.method public V(Lx7/f;JJZ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, La8/p;->F:Lx7/f;

    new-instance v2, Lv7/u;

    iget-wide v4, v1, Lx7/f;->a:J

    iget-object v6, v1, Lx7/f;->b:Ls8/n;

    invoke-virtual/range {p1 .. p1}, Lx7/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lx7/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lx7/f;->a()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, La8/p;->t:Ls8/d0;

    iget-wide v4, v1, Lx7/f;->a:J

    invoke-interface {v3, v4, v5}, Ls8/d0;->c(J)V

    iget-object v3, v0, La8/p;->v:Lv7/h0$a;

    iget v5, v1, Lx7/f;->c:I

    iget v6, v0, La8/p;->b:I

    iget-object v7, v1, Lx7/f;->d:Lt6/u1;

    iget v8, v1, Lx7/f;->e:I

    iget-object v9, v1, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lx7/f;->g:J

    iget-wide v12, v1, Lx7/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lv7/h0$a;->r(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_2

    invoke-direct {p0}, La8/p;->O()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, v0, La8/p;->P:I

    if-nez v1, :cond_1

    :cond_0
    invoke-direct {p0}, La8/p;->f0()V

    :cond_1
    iget v1, v0, La8/p;->P:I

    if-lez v1, :cond_2

    iget-object v1, v0, La8/p;->c:La8/p$b;

    invoke-interface {v1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    :cond_2
    return-void
.end method

.method public W(Lx7/f;JJ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, La8/p;->F:Lx7/f;

    iget-object v2, v0, La8/p;->d:La8/f;

    invoke-virtual {v2, v1}, La8/f;->p(Lx7/f;)V

    new-instance v2, Lv7/u;

    iget-wide v4, v1, Lx7/f;->a:J

    iget-object v6, v1, Lx7/f;->b:Ls8/n;

    invoke-virtual/range {p1 .. p1}, Lx7/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lx7/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lx7/f;->a()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, La8/p;->t:Ls8/d0;

    iget-wide v4, v1, Lx7/f;->a:J

    invoke-interface {v3, v4, v5}, Ls8/d0;->c(J)V

    iget-object v3, v0, La8/p;->v:Lv7/h0$a;

    iget v5, v1, Lx7/f;->c:I

    iget v6, v0, La8/p;->b:I

    iget-object v7, v1, Lx7/f;->d:Lt6/u1;

    iget v8, v1, Lx7/f;->e:I

    iget-object v9, v1, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lx7/f;->g:J

    iget-wide v12, v1, Lx7/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lv7/h0$a;->u(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    iget-boolean v1, v0, La8/p;->O:Z

    if-nez v1, :cond_0

    iget-wide v1, v0, La8/p;->a0:J

    invoke-virtual {p0, v1, v2}, La8/p;->e(J)Z

    goto :goto_0

    :cond_0
    iget-object v1, v0, La8/p;->c:La8/p$b;

    invoke-interface {v1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    :goto_0
    return-void
.end method

.method public X(Lx7/f;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p6

    invoke-static/range {p1 .. p1}, La8/p;->N(Lx7/f;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v3, v1

    check-cast v3, La8/i;

    invoke-virtual {v3}, La8/i;->q()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v13, Ls8/a0;

    if-eqz v3, :cond_1

    move-object v3, v13

    check-cast v3, Ls8/a0;

    iget v3, v3, Ls8/a0;->d:I

    const/16 v4, 0x19a

    if-eq v3, v4, :cond_0

    const/16 v4, 0x194

    if-ne v3, v4, :cond_1

    :cond_0
    sget-object v1, Ls8/e0;->d:Ls8/e0$c;

    return-object v1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lx7/f;->a()J

    move-result-wide v3

    new-instance v5, Lv7/u;

    iget-wide v6, v1, Lx7/f;->a:J

    iget-object v8, v1, Lx7/f;->b:Ls8/n;

    invoke-virtual/range {p1 .. p1}, Lx7/f;->f()Landroid/net/Uri;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lx7/f;->e()Ljava/util/Map;

    move-result-object v19

    move-object v14, v5

    move-wide v15, v6

    move-object/from16 v17, v8

    move-wide/from16 v20, p2

    move-wide/from16 v22, p4

    move-wide/from16 v24, v3

    invoke-direct/range {v14 .. v25}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v6, Lv7/x;

    iget v7, v1, Lx7/f;->c:I

    iget v8, v0, La8/p;->b:I

    iget-object v9, v1, Lx7/f;->d:Lt6/u1;

    iget v10, v1, Lx7/f;->e:I

    iget-object v11, v1, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v14, v1, Lx7/f;->g:J

    invoke-static {v14, v15}, Lt8/r0;->a1(J)J

    move-result-wide v26

    iget-wide v14, v1, Lx7/f;->h:J

    invoke-static {v14, v15}, Lt8/r0;->a1(J)J

    move-result-wide v28

    move-object/from16 v20, v6

    move/from16 v21, v7

    move/from16 v22, v8

    move-object/from16 v23, v9

    move/from16 v24, v10

    move-object/from16 v25, v11

    invoke-direct/range {v20 .. v29}, Lv7/x;-><init>(IILt6/u1;ILjava/lang/Object;JJ)V

    new-instance v7, Ls8/d0$c;

    move/from16 v8, p7

    invoke-direct {v7, v5, v6, v13, v8}, Ls8/d0$c;-><init>(Lv7/u;Lv7/x;Ljava/io/IOException;I)V

    iget-object v6, v0, La8/p;->t:Ls8/d0;

    iget-object v8, v0, La8/p;->d:La8/f;

    invoke-virtual {v8}, La8/f;->k()Lq8/r;

    move-result-object v8

    invoke-static {v8}, Lq8/z;->c(Lq8/r;)Ls8/d0$a;

    move-result-object v8

    invoke-interface {v6, v8, v7}, Ls8/d0;->b(Ls8/d0$a;Ls8/d0$c;)Ls8/d0$b;

    move-result-object v6

    const/4 v8, 0x0

    if-eqz v6, :cond_2

    iget v9, v6, Ls8/d0$b;->a:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_2

    iget-object v9, v0, La8/p;->d:La8/f;

    iget-wide v10, v6, Ls8/d0$b;->b:J

    invoke-virtual {v9, v1, v10, v11}, La8/f;->m(Lx7/f;J)Z

    move-result v6

    move v15, v6

    goto :goto_0

    :cond_2
    move v15, v8

    :goto_0
    const/4 v6, 0x1

    if-eqz v15, :cond_6

    if-eqz v2, :cond_5

    const-wide/16 v9, 0x0

    cmp-long v2, v3, v9

    if-nez v2, :cond_5

    iget-object v2, v0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v6

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La8/i;

    if-ne v2, v1, :cond_3

    move v8, v6

    :cond_3
    invoke-static {v8}, Lt8/a;->g(Z)V

    iget-object v2, v0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-wide v2, v0, La8/p;->a0:J

    iput-wide v2, v0, La8/p;->b0:J

    goto :goto_1

    :cond_4
    iget-object v2, v0, La8/p;->y:Ljava/util/ArrayList;

    invoke-static {v2}, Lcom/google/common/collect/e0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La8/i;

    invoke-virtual {v2}, La8/i;->o()V

    :cond_5
    :goto_1
    sget-object v2, Ls8/e0;->f:Ls8/e0$c;

    :goto_2
    move-object/from16 v16, v2

    goto :goto_3

    :cond_6
    iget-object v2, v0, La8/p;->t:Ls8/d0;

    invoke-interface {v2, v7}, Ls8/d0;->d(Ls8/d0$c;)J

    move-result-wide v2

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v9

    if-eqz v4, :cond_7

    invoke-static {v8, v2, v3}, Ls8/e0;->h(ZJ)Ls8/e0$c;

    move-result-object v2

    goto :goto_2

    :cond_7
    sget-object v2, Ls8/e0;->g:Ls8/e0$c;

    goto :goto_2

    :goto_3
    invoke-virtual/range {v16 .. v16}, Ls8/e0$c;->c()Z

    move-result v2

    xor-int/lit8 v17, v2, 0x1

    iget-object v2, v0, La8/p;->v:Lv7/h0$a;

    iget v4, v1, Lx7/f;->c:I

    iget v6, v0, La8/p;->b:I

    iget-object v7, v1, Lx7/f;->d:Lt6/u1;

    iget v8, v1, Lx7/f;->e:I

    iget-object v9, v1, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lx7/f;->g:J

    iget-wide v12, v1, Lx7/f;->h:J

    move-object v3, v5

    move v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v9

    move-wide v9, v10

    move-wide v11, v12

    move-object/from16 v13, p6

    move/from16 v14, v17

    invoke-virtual/range {v2 .. v14}, Lv7/h0$a;->w(Lv7/u;IILt6/u1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v17, :cond_8

    const/4 v2, 0x0

    iput-object v2, v0, La8/p;->F:Lx7/f;

    iget-object v2, v0, La8/p;->t:Ls8/d0;

    iget-wide v3, v1, Lx7/f;->a:J

    invoke-interface {v2, v3, v4}, Ls8/d0;->c(J)V

    :cond_8
    if-eqz v15, :cond_a

    iget-boolean v1, v0, La8/p;->O:Z

    if-nez v1, :cond_9

    iget-wide v1, v0, La8/p;->a0:J

    invoke-virtual {v0, v1, v2}, La8/p;->e(J)Z

    goto :goto_4

    :cond_9
    iget-object v1, v0, La8/p;->c:La8/p$b;

    invoke-interface {v1, v0}, Lv7/w0$a;->a(Lv7/w0;)V

    :cond_a
    :goto_4
    return-object v16
.end method

.method public Y()V
    .locals 1

    iget-object v0, p0, La8/p;->I:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public Z(Landroid/net/Uri;Ls8/d0$c;Z)Z
    .locals 4

    iget-object v0, p0, La8/p;->d:La8/f;

    invoke-virtual {v0, p1}, La8/f;->o(Landroid/net/Uri;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-nez p3, :cond_1

    iget-object p3, p0, La8/p;->t:Ls8/d0;

    iget-object v0, p0, La8/p;->d:La8/f;

    invoke-virtual {v0}, La8/f;->k()Lq8/r;

    move-result-object v0

    invoke-static {v0}, Lq8/z;->c(Lq8/r;)Ls8/d0$a;

    move-result-object v0

    invoke-interface {p3, v0, p2}, Ls8/d0;->b(Ls8/d0$a;Ls8/d0$c;)Ls8/d0$b;

    move-result-object p2

    if-eqz p2, :cond_1

    iget p3, p2, Ls8/d0$b;->a:I

    const/4 v0, 0x2

    if-ne p3, v0, :cond_1

    iget-wide p2, p2, Ls8/d0$b;->b:J

    goto :goto_0

    :cond_1
    move-wide p2, v2

    :goto_0
    iget-object v0, p0, La8/p;->d:La8/f;

    invoke-virtual {v0, p1, p2, p3}, La8/f;->q(Landroid/net/Uri;J)Z

    move-result p1

    if-eqz p1, :cond_2

    cmp-long p1, p2, v2

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public a(Lt6/u1;)V
    .locals 1

    iget-object p1, p0, La8/p;->C:Landroid/os/Handler;

    iget-object v0, p0, La8/p;->A:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a0()V
    .locals 3

    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/google/common/collect/e0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8/i;

    iget-object v1, p0, La8/p;->d:La8/f;

    invoke-virtual {v1, v0}, La8/f;->c(La8/i;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, La8/i;->v()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    iget-boolean v0, p0, La8/p;->e0:Z

    if-nez v0, :cond_2

    iget-object v0, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->f()V

    :cond_2
    :goto_0
    return-void
.end method

.method public b()J
    .locals 2

    invoke-direct {p0}, La8/p;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, La8/p;->b0:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, La8/p;->e0:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_1
    invoke-direct {p0}, La8/p;->J()La8/i;

    move-result-object v0

    iget-wide v0, v0, Lx7/f;->h:J

    :goto_0
    return-wide v0
.end method

.method public c(JLt6/u3;)J
    .locals 1

    iget-object v0, p0, La8/p;->d:La8/f;

    invoke-virtual {v0, p1, p2, p3}, La8/f;->b(JLt6/u3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public varargs c0([Lv7/d1;I[I)V
    .locals 4

    invoke-direct {p0, p1}, La8/p;->D([Lv7/d1;)Lv7/f1;

    move-result-object p1

    iput-object p1, p0, La8/p;->T:Lv7/f1;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, La8/p;->U:Ljava/util/Set;

    array-length p1, p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    aget v1, p3, v0

    iget-object v2, p0, La8/p;->U:Ljava/util/Set;

    iget-object v3, p0, La8/p;->T:Lv7/f1;

    invoke-virtual {v3, v1}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iput p2, p0, La8/p;->W:I

    iget-object p1, p0, La8/p;->C:Landroid/os/Handler;

    iget-object p2, p0, La8/p;->c:La8/p$b;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, La8/m;

    invoke-direct {p3, p2}, La8/m;-><init>(La8/p$b;)V

    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0}, La8/p;->k0()V

    return-void
.end method

.method public d(II)Ly6/b0;
    .locals 3

    sget-object v0, La8/p;->j0:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, La8/p;->K(II)Ly6/b0;

    move-result-object v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, La8/p;->G:[La8/p$d;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    iget-object v2, p0, La8/p;->H:[I

    aget v2, v2, v0

    if-ne v2, p1, :cond_1

    aget-object v0, v1, v0

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_4

    iget-boolean v0, p0, La8/p;->f0:Z

    if-eqz v0, :cond_3

    invoke-static {p1, p2}, La8/p;->B(II)Ly6/j;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-direct {p0, p1, p2}, La8/p;->C(II)Lv7/u0;

    move-result-object v0

    :cond_4
    const/4 p1, 0x5

    if-ne p2, p1, :cond_6

    iget-object p1, p0, La8/p;->K:Ly6/b0;

    if-nez p1, :cond_5

    new-instance p1, La8/p$c;

    iget p2, p0, La8/p;->w:I

    invoke-direct {p1, v0, p2}, La8/p$c;-><init>(Ly6/b0;I)V

    iput-object p1, p0, La8/p;->K:Ly6/b0;

    :cond_5
    iget-object p1, p0, La8/p;->K:Ly6/b0;

    return-object p1

    :cond_6
    return-object v0
.end method

.method public d0(ILt6/v1;Lw6/g;I)I
    .locals 11

    invoke-direct {p0}, La8/p;->O()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_3

    move v0, v2

    :goto_0
    iget-object v3, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_1

    iget-object v3, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La8/i;

    invoke-direct {p0, v3}, La8/p;->H(La8/i;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-static {v3, v2, v0}, Lt8/r0;->N0(Ljava/util/List;II)V

    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8/i;

    iget-object v10, v0, Lx7/f;->d:Lt6/u1;

    iget-object v3, p0, La8/p;->R:Lt6/u1;

    invoke-virtual {v10, v3}, Lt6/u1;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p0, La8/p;->v:Lv7/h0$a;

    iget v4, p0, La8/p;->b:I

    iget v6, v0, Lx7/f;->e:I

    iget-object v7, v0, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v8, v0, Lx7/f;->g:J

    move-object v5, v10

    invoke-virtual/range {v3 .. v9}, Lv7/h0$a;->i(ILt6/u1;ILjava/lang/Object;J)V

    :cond_2
    iput-object v10, p0, La8/p;->R:Lt6/u1;

    :cond_3
    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8/i;

    invoke-virtual {v0}, La8/i;->q()Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, La8/p;->G:[La8/p$d;

    aget-object v0, v0, p1

    iget-boolean v1, p0, La8/p;->e0:Z

    invoke-virtual {v0, p2, p3, p4, v1}, Lv7/u0;->S(Lt6/v1;Lw6/g;IZ)I

    move-result p3

    const/4 p4, -0x5

    if-ne p3, p4, :cond_8

    iget-object p4, p2, Lt6/v1;->b:Lt6/u1;

    invoke-static {p4}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lt6/u1;

    iget v0, p0, La8/p;->M:I

    if-ne p1, v0, :cond_7

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lv7/u0;->Q()I

    move-result p1

    :goto_1
    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    iget-object v0, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8/i;

    iget v0, v0, La8/i;->k:I

    if-eq v0, p1, :cond_5

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    iget-object p1, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La8/i;

    iget-object p1, p1, Lx7/f;->d:Lt6/u1;

    goto :goto_2

    :cond_6
    iget-object p1, p0, La8/p;->Q:Lt6/u1;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/u1;

    :goto_2
    invoke-virtual {p4, p1}, Lt6/u1;->l(Lt6/u1;)Lt6/u1;

    move-result-object p4

    :cond_7
    iput-object p4, p2, Lt6/v1;->b:Lt6/u1;

    :cond_8
    return p3
.end method

.method public e(J)Z
    .locals 23

    move-object/from16 v0, p0

    iget-boolean v1, v0, La8/p;->e0:Z

    const/4 v2, 0x0

    if-nez v1, :cond_a

    iget-object v1, v0, La8/p;->u:Ls8/e0;

    invoke-virtual {v1}, Ls8/e0;->j()Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v0, La8/p;->u:Ls8/e0;

    invoke-virtual {v1}, Ls8/e0;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-direct/range {p0 .. p0}, La8/p;->O()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iget-wide v3, v0, La8/p;->b0:J

    iget-object v5, v0, La8/p;->G:[La8/p$d;

    array-length v6, v5

    move v7, v2

    :goto_0
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    iget-wide v9, v0, La8/p;->b0:J

    invoke-virtual {v8, v9, v10}, Lv7/u0;->b0(J)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v0, La8/p;->z:Ljava/util/List;

    invoke-direct/range {p0 .. p0}, La8/p;->J()La8/i;

    move-result-object v3

    invoke-virtual {v3}, La8/i;->h()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-wide v3, v3, Lx7/f;->h:J

    goto :goto_1

    :cond_2
    iget-wide v4, v0, La8/p;->a0:J

    iget-wide v6, v3, Lx7/f;->g:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :cond_3
    :goto_1
    move-object v10, v1

    move-wide v8, v3

    iget-object v1, v0, La8/p;->x:La8/f$b;

    invoke-virtual {v1}, La8/f$b;->a()V

    iget-object v5, v0, La8/p;->d:La8/f;

    iget-boolean v1, v0, La8/p;->O:Z

    const/4 v3, 0x1

    if-nez v1, :cond_5

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    move v11, v2

    goto :goto_3

    :cond_5
    :goto_2
    move v11, v3

    :goto_3
    iget-object v12, v0, La8/p;->x:La8/f$b;

    move-wide/from16 v6, p1

    invoke-virtual/range {v5 .. v12}, La8/f;->e(JJLjava/util/List;ZLa8/f$b;)V

    iget-object v1, v0, La8/p;->x:La8/f$b;

    iget-boolean v4, v1, La8/f$b;->b:Z

    iget-object v5, v1, La8/f$b;->a:Lx7/f;

    iget-object v1, v1, La8/f$b;->c:Landroid/net/Uri;

    if-eqz v4, :cond_6

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, v0, La8/p;->b0:J

    iput-boolean v3, v0, La8/p;->e0:Z

    return v3

    :cond_6
    if-nez v5, :cond_8

    if-eqz v1, :cond_7

    iget-object v3, v0, La8/p;->c:La8/p$b;

    invoke-interface {v3, v1}, La8/p$b;->i(Landroid/net/Uri;)V

    :cond_7
    return v2

    :cond_8
    invoke-static {v5}, La8/p;->N(Lx7/f;)Z

    move-result v1

    if-eqz v1, :cond_9

    move-object v1, v5

    check-cast v1, La8/i;

    invoke-direct {v0, v1}, La8/p;->M(La8/i;)V

    :cond_9
    iput-object v5, v0, La8/p;->F:Lx7/f;

    iget-object v1, v0, La8/p;->u:Ls8/e0;

    iget-object v2, v0, La8/p;->t:Ls8/d0;

    iget v4, v5, Lx7/f;->c:I

    invoke-interface {v2, v4}, Ls8/d0;->a(I)I

    move-result v2

    invoke-virtual {v1, v5, v0, v2}, Ls8/e0;->n(Ls8/e0$e;Ls8/e0$b;I)J

    move-result-wide v10

    iget-object v12, v0, La8/p;->v:Lv7/h0$a;

    new-instance v13, Lv7/u;

    iget-wide v7, v5, Lx7/f;->a:J

    iget-object v9, v5, Lx7/f;->b:Ls8/n;

    move-object v6, v13

    invoke-direct/range {v6 .. v11}, Lv7/u;-><init>(JLs8/n;J)V

    iget v14, v5, Lx7/f;->c:I

    iget v15, v0, La8/p;->b:I

    iget-object v1, v5, Lx7/f;->d:Lt6/u1;

    iget v2, v5, Lx7/f;->e:I

    iget-object v4, v5, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v6, v5, Lx7/f;->g:J

    iget-wide v8, v5, Lx7/f;->h:J

    move-object/from16 v16, v1

    move/from16 v17, v2

    move-object/from16 v18, v4

    move-wide/from16 v19, v6

    move-wide/from16 v21, v8

    invoke-virtual/range {v12 .. v22}, Lv7/h0$a;->A(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    return v3

    :cond_a
    :goto_4
    return v2
.end method

.method public e0()V
    .locals 4

    iget-boolean v0, p0, La8/p;->O:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lv7/u0;->R()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {v0, p0}, Ls8/e0;->m(Ls8/e0$f;)V

    iget-object v0, p0, La8/p;->C:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, La8/p;->S:Z

    iget-object v0, p0, La8/p;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public f()J
    .locals 7

    iget-boolean v0, p0, La8/p;->e0:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-direct {p0}, La8/p;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, La8/p;->b0:J

    return-wide v0

    :cond_1
    iget-wide v0, p0, La8/p;->a0:J

    invoke-direct {p0}, La8/p;->J()La8/i;

    move-result-object v2

    invoke-virtual {v2}, La8/i;->h()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_3

    iget-object v2, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La8/i;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    iget-wide v2, v2, Lx7/f;->h:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_4
    iget-boolean v2, p0, La8/p;->N:Z

    if-eqz v2, :cond_5

    iget-object v2, p0, La8/p;->G:[La8/p$d;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_5

    aget-object v5, v2, v4

    invoke-virtual {v5}, Lv7/u0;->z()J

    move-result-wide v5

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    return-wide v0
.end method

.method public g(J)V
    .locals 4

    iget-object v0, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->i()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0}, La8/p;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, La8/p;->F:Lx7/f;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La8/p;->d:La8/f;

    iget-object v1, p0, La8/p;->F:Lx7/f;

    iget-object v2, p0, La8/p;->z:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1, v2}, La8/f;->v(JLx7/f;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {p1}, Ls8/e0;->f()V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, La8/p;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-lez v0, :cond_3

    iget-object v1, p0, La8/p;->d:La8/f;

    iget-object v2, p0, La8/p;->z:Ljava/util/List;

    add-int/lit8 v3, v0, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La8/i;

    invoke-virtual {v1, v2}, La8/f;->c(La8/i;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, La8/p;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-direct {p0, v0}, La8/p;->F(I)V

    :cond_4
    iget-object v0, p0, La8/p;->d:La8/f;

    iget-object v1, p0, La8/p;->z:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1}, La8/f;->h(JLjava/util/List;)I

    move-result p1

    iget-object p2, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_5

    invoke-direct {p0, p1}, La8/p;->F(I)V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic h(Ls8/e0$e;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 0

    check-cast p1, Lx7/f;

    invoke-virtual/range {p0 .. p7}, La8/p;->X(Lx7/f;JJLjava/io/IOException;I)Ls8/e0$c;

    move-result-object p1

    return-object p1
.end method

.method public h0(JZ)Z
    .locals 3

    iput-wide p1, p0, La8/p;->a0:J

    invoke-direct {p0}, La8/p;->O()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-wide p1, p0, La8/p;->b0:J

    return v1

    :cond_0
    iget-boolean v0, p0, La8/p;->N:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez p3, :cond_1

    invoke-direct {p0, p1, p2}, La8/p;->g0(J)Z

    move-result p3

    if-eqz p3, :cond_1

    return v2

    :cond_1
    iput-wide p1, p0, La8/p;->b0:J

    iput-boolean v2, p0, La8/p;->e0:Z

    iget-object p1, p0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {p1}, Ls8/e0;->j()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, La8/p;->N:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, La8/p;->G:[La8/p$d;

    array-length p2, p1

    :goto_0
    if-ge v2, p2, :cond_2

    aget-object p3, p1, v2

    invoke-virtual {p3}, Lv7/u0;->r()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {p1}, Ls8/e0;->f()V

    goto :goto_1

    :cond_3
    iget-object p1, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {p1}, Ls8/e0;->g()V

    invoke-direct {p0}, La8/p;->f0()V

    :goto_1
    return v1
.end method

.method public bridge synthetic i(Ls8/e0$e;JJZ)V
    .locals 0

    check-cast p1, Lx7/f;

    invoke-virtual/range {p0 .. p6}, La8/p;->V(Lx7/f;JJZ)V

    return-void
.end method

.method public i0([Lq8/r;[Z[Lv7/v0;[ZJZ)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-wide/from16 v12, p5

    invoke-direct/range {p0 .. p0}, La8/p;->w()V

    iget v3, v0, La8/p;->P:I

    const/4 v14, 0x0

    move v4, v14

    :goto_0
    array-length v5, v1

    const/4 v6, 0x0

    const/4 v15, 0x1

    if-ge v4, v5, :cond_2

    aget-object v5, v2, v4

    check-cast v5, La8/l;

    if-eqz v5, :cond_1

    aget-object v7, v1, v4

    if-eqz v7, :cond_0

    aget-boolean v7, p2, v4

    if-nez v7, :cond_1

    :cond_0
    iget v7, v0, La8/p;->P:I

    sub-int/2addr v7, v15

    iput v7, v0, La8/p;->P:I

    invoke-virtual {v5}, La8/l;->e()V

    aput-object v6, v2, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-nez p7, :cond_5

    iget-boolean v4, v0, La8/p;->d0:Z

    if-eqz v4, :cond_3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_3
    iget-wide v3, v0, La8/p;->a0:J

    cmp-long v3, v12, v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    move v3, v14

    goto :goto_2

    :cond_5
    :goto_1
    move v3, v15

    :goto_2
    iget-object v4, v0, La8/p;->d:La8/f;

    invoke-virtual {v4}, La8/f;->k()Lq8/r;

    move-result-object v4

    move/from16 v16, v3

    move-object v11, v4

    move v3, v14

    :goto_3
    array-length v5, v1

    if-ge v3, v5, :cond_a

    aget-object v5, v1, v3

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    iget-object v7, v0, La8/p;->T:Lv7/f1;

    invoke-interface {v5}, Lq8/u;->d()Lv7/d1;

    move-result-object v8

    invoke-virtual {v7, v8}, Lv7/f1;->d(Lv7/d1;)I

    move-result v7

    iget v8, v0, La8/p;->W:I

    if-ne v7, v8, :cond_7

    iget-object v8, v0, La8/p;->d:La8/f;

    invoke-virtual {v8, v5}, La8/f;->u(Lq8/r;)V

    move-object v11, v5

    :cond_7
    aget-object v5, v2, v3

    if-nez v5, :cond_9

    iget v5, v0, La8/p;->P:I

    add-int/2addr v5, v15

    iput v5, v0, La8/p;->P:I

    new-instance v5, La8/l;

    invoke-direct {v5, v0, v7}, La8/l;-><init>(La8/p;I)V

    aput-object v5, v2, v3

    aput-boolean v15, p4, v3

    iget-object v8, v0, La8/p;->V:[I

    if-eqz v8, :cond_9

    invoke-virtual {v5}, La8/l;->b()V

    if-nez v16, :cond_9

    iget-object v5, v0, La8/p;->G:[La8/p$d;

    iget-object v8, v0, La8/p;->V:[I

    aget v7, v8, v7

    aget-object v5, v5, v7

    invoke-virtual {v5, v12, v13, v15}, Lv7/u0;->Z(JZ)Z

    move-result v7

    if-nez v7, :cond_8

    invoke-virtual {v5}, Lv7/u0;->C()I

    move-result v5

    if-eqz v5, :cond_8

    move v5, v15

    goto :goto_4

    :cond_8
    move v5, v14

    :goto_4
    move/from16 v16, v5

    :cond_9
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_a
    iget v1, v0, La8/p;->P:I

    if-nez v1, :cond_d

    iget-object v1, v0, La8/p;->d:La8/f;

    invoke-virtual {v1}, La8/f;->r()V

    iput-object v6, v0, La8/p;->R:Lt6/u1;

    iput-boolean v15, v0, La8/p;->c0:Z

    iget-object v1, v0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v0, La8/p;->u:Ls8/e0;

    invoke-virtual {v1}, Ls8/e0;->j()Z

    move-result v1

    if-eqz v1, :cond_c

    iget-boolean v1, v0, La8/p;->N:Z

    if-eqz v1, :cond_b

    iget-object v1, v0, La8/p;->G:[La8/p$d;

    array-length v3, v1

    :goto_6
    if-ge v14, v3, :cond_b

    aget-object v4, v1, v14

    invoke-virtual {v4}, Lv7/u0;->r()V

    add-int/lit8 v14, v14, 0x1

    goto :goto_6

    :cond_b
    iget-object v1, v0, La8/p;->u:Ls8/e0;

    invoke-virtual {v1}, Ls8/e0;->f()V

    goto/16 :goto_b

    :cond_c
    invoke-direct/range {p0 .. p0}, La8/p;->f0()V

    goto/16 :goto_b

    :cond_d
    iget-object v1, v0, La8/p;->y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-static {v11, v4}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    iget-boolean v1, v0, La8/p;->d0:Z

    if-nez v1, :cond_10

    const-wide/16 v3, 0x0

    cmp-long v1, v12, v3

    if-gez v1, :cond_e

    neg-long v3, v12

    :cond_e
    move-wide v6, v3

    invoke-direct/range {p0 .. p0}, La8/p;->J()La8/i;

    move-result-object v1

    iget-object v3, v0, La8/p;->d:La8/f;

    invoke-virtual {v3, v1, v12, v13}, La8/f;->a(La8/i;J)[Lx7/o;

    move-result-object v17

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v10, v0, La8/p;->z:Ljava/util/List;

    move-object v3, v11

    move-wide/from16 v4, p5

    move-object/from16 v18, v11

    move-object/from16 v11, v17

    invoke-interface/range {v3 .. v11}, Lq8/r;->g(JJJLjava/util/List;[Lx7/o;)V

    iget-object v3, v0, La8/p;->d:La8/f;

    invoke-virtual {v3}, La8/f;->j()Lv7/d1;

    move-result-object v3

    iget-object v1, v1, Lx7/f;->d:Lt6/u1;

    invoke-virtual {v3, v1}, Lv7/d1;->e(Lt6/u1;)I

    move-result v1

    invoke-interface/range {v18 .. v18}, Lq8/r;->r()I

    move-result v3

    if-eq v3, v1, :cond_f

    goto :goto_7

    :cond_f
    move v1, v14

    goto :goto_8

    :cond_10
    :goto_7
    move v1, v15

    :goto_8
    if-eqz v1, :cond_11

    iput-boolean v15, v0, La8/p;->c0:Z

    move v1, v15

    move/from16 v16, v1

    goto :goto_9

    :cond_11
    move/from16 v1, p7

    :goto_9
    if-eqz v16, :cond_13

    invoke-virtual {v0, v12, v13, v1}, La8/p;->h0(JZ)Z

    :goto_a
    array-length v1, v2

    if-ge v14, v1, :cond_13

    aget-object v1, v2, v14

    if-eqz v1, :cond_12

    aput-boolean v15, p4, v14

    :cond_12
    add-int/lit8 v14, v14, 0x1

    goto :goto_a

    :cond_13
    :goto_b
    invoke-direct {v0, v2}, La8/p;->p0([Lv7/v0;)V

    iput-boolean v15, v0, La8/p;->d0:Z

    return v16
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, La8/p;->u:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    return v0
.end method

.method public j0(Lx6/m;)V
    .locals 3

    iget-object v0, p0, La8/p;->h0:Lx6/m;

    invoke-static {v0, p1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, La8/p;->h0:Lx6/m;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, La8/p;->G:[La8/p$d;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    iget-object v2, p0, La8/p;->Z:[Z

    aget-boolean v2, v2, v0

    if-eqz v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, La8/p$d;->i0(Lx6/m;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public l0(Z)V
    .locals 1

    iget-object v0, p0, La8/p;->d:La8/f;

    invoke-virtual {v0, p1}, La8/f;->t(Z)V

    return-void
.end method

.method public bridge synthetic m(Ls8/e0$e;JJ)V
    .locals 0

    check-cast p1, Lx7/f;

    invoke-virtual/range {p0 .. p5}, La8/p;->W(Lx7/f;JJ)V

    return-void
.end method

.method public m0(J)V
    .locals 4

    iget-wide v0, p0, La8/p;->g0:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_0

    iput-wide p1, p0, La8/p;->g0:J

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lv7/u0;->a0(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public n()V
    .locals 4

    iget-object v0, p0, La8/p;->G:[La8/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lv7/u0;->T()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public n0(IJ)I
    .locals 2

    invoke-direct {p0}, La8/p;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, La8/p;->G:[La8/p$d;

    aget-object v0, v0, p1

    iget-boolean v1, p0, La8/p;->e0:Z

    invoke-virtual {v0, p2, p3, v1}, Lv7/u0;->E(JZ)I

    move-result p2

    iget-object p3, p0, La8/p;->y:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {p3, v1}, Lcom/google/common/collect/e0;->e(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, La8/i;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, La8/i;->q()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lv7/u0;->C()I

    move-result v1

    invoke-virtual {p3, p1}, La8/i;->m(I)I

    move-result p1

    sub-int/2addr p1, v1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_1
    invoke-virtual {v0, p2}, Lv7/u0;->e0(I)V

    return p2
.end method

.method public o()V
    .locals 2

    invoke-virtual {p0}, La8/p;->T()V

    iget-boolean v0, p0, La8/p;->e0:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, La8/p;->O:Z

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

.method public o0(I)V
    .locals 2

    invoke-direct {p0}, La8/p;->w()V

    iget-object v0, p0, La8/p;->V:[I

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La8/p;->V:[I

    aget p1, v0, p1

    iget-object v0, p0, La8/p;->Y:[Z

    aget-boolean v0, v0, p1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, La8/p;->Y:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, p1

    return-void
.end method

.method public p(Ly6/z;)V
    .locals 0

    return-void
.end method

.method public q()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, La8/p;->f0:Z

    iget-object v0, p0, La8/p;->C:Landroid/os/Handler;

    iget-object v1, p0, La8/p;->B:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public r()Lv7/f1;
    .locals 1

    invoke-direct {p0}, La8/p;->w()V

    iget-object v0, p0, La8/p;->T:Lv7/f1;

    return-object v0
.end method

.method public s(JZ)V
    .locals 4

    iget-boolean v0, p0, La8/p;->N:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, La8/p;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, La8/p;->G:[La8/p$d;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, La8/p;->G:[La8/p$d;

    aget-object v2, v2, v1

    iget-object v3, p0, La8/p;->Y:[Z

    aget-boolean v3, v3, v1

    invoke-virtual {v2, p1, p2, p3, v3}, Lv7/u0;->q(JZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public x(I)I
    .locals 3

    invoke-direct {p0}, La8/p;->w()V

    iget-object v0, p0, La8/p;->V:[I

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La8/p;->V:[I

    aget v0, v0, p1

    const/4 v1, -0x1

    const/4 v2, -0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, La8/p;->U:Ljava/util/Set;

    iget-object v1, p0, La8/p;->T:Lv7/f1;

    invoke-virtual {v1, p1}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v2, -0x3

    :cond_0
    return v2

    :cond_1
    iget-object p1, p0, La8/p;->Y:[Z

    aget-boolean v1, p1, v0

    if-eqz v1, :cond_2

    return v2

    :cond_2
    const/4 v1, 0x1

    aput-boolean v1, p1, v0

    return v0
.end method
