.class public final Li7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/i0$c;


# instance fields
.field private final a:I

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt6/u1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Li7/j;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lt6/u1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li7/j;->a:I

    iput-object p2, p0, Li7/j;->b:Ljava/util/List;

    return-void
.end method

.method private c(Li7/i0$b;)Li7/d0;
    .locals 1

    new-instance v0, Li7/d0;

    invoke-direct {p0, p1}, Li7/j;->e(Li7/i0$b;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Li7/d0;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private d(Li7/i0$b;)Li7/k0;
    .locals 1

    new-instance v0, Li7/k0;

    invoke-direct {p0, p1}, Li7/j;->e(Li7/i0$b;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Li7/k0;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private e(Li7/i0$b;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/i0$b;",
            ")",
            "Ljava/util/List<",
            "Lt6/u1;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x20

    invoke-direct {p0, v0}, Li7/j;->f(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Li7/j;->b:Ljava/util/List;

    return-object p1

    :cond_0
    new-instance v0, Lt8/e0;

    iget-object p1, p1, Li7/i0$b;->d:[B

    invoke-direct {v0, p1}, Lt8/e0;-><init>([B)V

    iget-object p1, p0, Li7/j;->b:Ljava/util/List;

    :goto_0
    invoke-virtual {v0}, Lt8/e0;->a()I

    move-result v1

    if-lez v1, :cond_6

    invoke-virtual {v0}, Lt8/e0;->H()I

    move-result v1

    invoke-virtual {v0}, Lt8/e0;->H()I

    move-result v2

    invoke-virtual {v0}, Lt8/e0;->f()I

    move-result v3

    add-int/2addr v3, v2

    const/16 v2, 0x86

    if-ne v1, v2, :cond_5

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lt8/e0;->H()I

    move-result v1

    and-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x0

    move v4, v2

    :goto_1
    if-ge v4, v1, :cond_5

    const/4 v5, 0x3

    invoke-virtual {v0, v5}, Lt8/e0;->E(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lt8/e0;->H()I

    move-result v6

    and-int/lit16 v7, v6, 0x80

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    move v7, v8

    goto :goto_2

    :cond_1
    move v7, v2

    :goto_2
    if-eqz v7, :cond_2

    and-int/lit8 v6, v6, 0x3f

    const-string v9, "application/cea-708"

    goto :goto_3

    :cond_2
    const-string v9, "application/cea-608"

    move v6, v8

    :goto_3
    invoke-virtual {v0}, Lt8/e0;->H()I

    move-result v10

    int-to-byte v10, v10

    invoke-virtual {v0, v8}, Lt8/e0;->V(I)V

    if-eqz v7, :cond_4

    and-int/lit8 v7, v10, 0x40

    if-eqz v7, :cond_3

    goto :goto_4

    :cond_3
    move v8, v2

    :goto_4
    invoke-static {v8}, Lt8/e;->b(Z)Ljava/util/List;

    move-result-object v7

    goto :goto_5

    :cond_4
    const/4 v7, 0x0

    :goto_5
    new-instance v8, Lt6/u1$b;

    invoke-direct {v8}, Lt6/u1$b;-><init>()V

    invoke-virtual {v8, v9}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v8

    invoke-virtual {v8, v5}, Lt6/u1$b;->X(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v5

    invoke-virtual {v5, v6}, Lt6/u1$b;->H(I)Lt6/u1$b;

    move-result-object v5

    invoke-virtual {v5, v7}, Lt6/u1$b;->V(Ljava/util/List;)Lt6/u1$b;

    move-result-object v5

    invoke-virtual {v5}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v0, v3}, Lt8/e0;->U(I)V

    goto :goto_0

    :cond_6
    return-object p1
.end method

.method private f(I)Z
    .locals 1

    iget v0, p0, Li7/j;->a:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public a()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Li7/i0;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    return-object v0
.end method

.method public b(ILi7/i0$b;)Li7/i0;
    .locals 4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_e

    const/4 v1, 0x3

    if-eq p1, v1, :cond_d

    const/4 v1, 0x4

    if-eq p1, v1, :cond_d

    const/16 v2, 0x15

    if-eq p1, v2, :cond_c

    const/16 v2, 0x1b

    const/4 v3, 0x0

    if-eq p1, v2, :cond_a

    const/16 v1, 0x24

    if-eq p1, v1, :cond_9

    const/16 v1, 0x59

    if-eq p1, v1, :cond_8

    const/16 v1, 0x8a

    if-eq p1, v1, :cond_7

    const/16 v1, 0xac

    if-eq p1, v1, :cond_6

    const/16 v1, 0x101

    if-eq p1, v1, :cond_5

    const/16 v1, 0x86

    if-eq p1, v1, :cond_3

    const/16 v1, 0x87

    if-eq p1, v1, :cond_2

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    return-object v3

    :pswitch_0
    const/16 p1, 0x40

    invoke-direct {p0, p1}, Li7/j;->f(I)Z

    move-result p1

    if-nez p1, :cond_7

    return-object v3

    :pswitch_1
    invoke-direct {p0, v0}, Li7/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Li7/w;

    new-instance p1, Li7/s;

    iget-object p2, p2, Li7/i0$b;->b:Ljava/lang/String;

    invoke-direct {p1, p2}, Li7/s;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, p1}, Li7/w;-><init>(Li7/m;)V

    :goto_0
    return-object v3

    :pswitch_2
    new-instance p1, Li7/w;

    new-instance v0, Li7/o;

    invoke-direct {p0, p2}, Li7/j;->d(Li7/i0$b;)Li7/k0;

    move-result-object p2

    invoke-direct {v0, p2}, Li7/o;-><init>(Li7/k0;)V

    invoke-direct {p1, v0}, Li7/w;-><init>(Li7/m;)V

    return-object p1

    :pswitch_3
    invoke-direct {p0, v0}, Li7/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v3, Li7/w;

    new-instance p1, Li7/i;

    const/4 v0, 0x0

    iget-object p2, p2, Li7/i0$b;->b:Ljava/lang/String;

    invoke-direct {p1, v0, p2}, Li7/i;-><init>(ZLjava/lang/String;)V

    invoke-direct {v3, p1}, Li7/w;-><init>(Li7/m;)V

    :goto_1
    return-object v3

    :cond_2
    :pswitch_4
    new-instance p1, Li7/w;

    new-instance v0, Li7/c;

    iget-object p2, p2, Li7/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Li7/c;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Li7/w;-><init>(Li7/m;)V

    return-object p1

    :cond_3
    const/16 p1, 0x10

    invoke-direct {p0, p1}, Li7/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    new-instance v3, Li7/c0;

    new-instance p1, Li7/v;

    const-string p2, "application/x-scte35"

    invoke-direct {p1, p2}, Li7/v;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, p1}, Li7/c0;-><init>(Li7/b0;)V

    :goto_2
    return-object v3

    :cond_5
    new-instance p1, Li7/c0;

    new-instance p2, Li7/v;

    const-string v0, "application/vnd.dvb.ait"

    invoke-direct {p2, v0}, Li7/v;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Li7/c0;-><init>(Li7/b0;)V

    return-object p1

    :cond_6
    new-instance p1, Li7/w;

    new-instance v0, Li7/f;

    iget-object p2, p2, Li7/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Li7/f;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Li7/w;-><init>(Li7/m;)V

    return-object p1

    :cond_7
    new-instance p1, Li7/w;

    new-instance v0, Li7/k;

    iget-object p2, p2, Li7/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Li7/k;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Li7/w;-><init>(Li7/m;)V

    return-object p1

    :cond_8
    new-instance p1, Li7/w;

    new-instance v0, Li7/l;

    iget-object p2, p2, Li7/i0$b;->c:Ljava/util/List;

    invoke-direct {v0, p2}, Li7/l;-><init>(Ljava/util/List;)V

    invoke-direct {p1, v0}, Li7/w;-><init>(Li7/m;)V

    return-object p1

    :cond_9
    new-instance p1, Li7/w;

    new-instance v0, Li7/q;

    invoke-direct {p0, p2}, Li7/j;->c(Li7/i0$b;)Li7/d0;

    move-result-object p2

    invoke-direct {v0, p2}, Li7/q;-><init>(Li7/d0;)V

    invoke-direct {p1, v0}, Li7/w;-><init>(Li7/m;)V

    return-object p1

    :cond_a
    invoke-direct {p0, v1}, Li7/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_3

    :cond_b
    new-instance v3, Li7/w;

    new-instance p1, Li7/p;

    invoke-direct {p0, p2}, Li7/j;->c(Li7/i0$b;)Li7/d0;

    move-result-object p2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Li7/j;->f(I)Z

    move-result v0

    const/16 v1, 0x8

    invoke-direct {p0, v1}, Li7/j;->f(I)Z

    move-result v1

    invoke-direct {p1, p2, v0, v1}, Li7/p;-><init>(Li7/d0;ZZ)V

    invoke-direct {v3, p1}, Li7/w;-><init>(Li7/m;)V

    :goto_3
    return-object v3

    :cond_c
    new-instance p1, Li7/w;

    new-instance p2, Li7/r;

    invoke-direct {p2}, Li7/r;-><init>()V

    invoke-direct {p1, p2}, Li7/w;-><init>(Li7/m;)V

    return-object p1

    :cond_d
    new-instance p1, Li7/w;

    new-instance v0, Li7/t;

    iget-object p2, p2, Li7/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Li7/t;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Li7/w;-><init>(Li7/m;)V

    return-object p1

    :cond_e
    :pswitch_5
    new-instance p1, Li7/w;

    new-instance v0, Li7/n;

    invoke-direct {p0, p2}, Li7/j;->d(Li7/i0$b;)Li7/k0;

    move-result-object p2

    invoke-direct {v0, p2}, Li7/n;-><init>(Li7/k0;)V

    invoke-direct {p1, v0}, Li7/w;-><init>(Li7/m;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_5
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method
