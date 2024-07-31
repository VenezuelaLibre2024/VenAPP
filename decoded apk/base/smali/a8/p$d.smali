.class final La8/p$d;
.super Lv7/u0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final H:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx6/m;",
            ">;"
        }
    .end annotation
.end field

.field private I:Lx6/m;


# direct methods
.method private constructor <init>(Ls8/b;Lx6/v;Lx6/u$a;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls8/b;",
            "Lx6/v;",
            "Lx6/u$a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx6/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lv7/u0;-><init>(Ls8/b;Lx6/v;Lx6/u$a;)V

    iput-object p4, p0, La8/p$d;->H:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Ls8/b;Lx6/v;Lx6/u$a;Ljava/util/Map;La8/p$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, La8/p$d;-><init>(Ls8/b;Lx6/v;Lx6/u$a;Ljava/util/Map;)V

    return-void
.end method

.method private h0(Ll7/a;)Ll7/a;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Ll7/a;->e()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, -0x1

    if-ge v3, v1, :cond_2

    invoke-virtual {p1, v3}, Ll7/a;->d(I)Ll7/a$b;

    move-result-object v5

    instance-of v6, v5, Lq7/l;

    if-eqz v6, :cond_1

    check-cast v5, Lq7/l;

    const-string v6, "com.apple.streaming.transportStreamTimestamp"

    iget-object v5, v5, Lq7/l;->b:Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    move v3, v4

    :goto_1
    if-ne v3, v4, :cond_3

    return-object p1

    :cond_3
    const/4 v4, 0x1

    if-ne v1, v4, :cond_4

    return-object v0

    :cond_4
    add-int/lit8 v0, v1, -0x1

    new-array v0, v0, [Ll7/a$b;

    :goto_2
    if-ge v2, v1, :cond_7

    if-eq v2, v3, :cond_6

    if-ge v2, v3, :cond_5

    move v4, v2

    goto :goto_3

    :cond_5
    add-int/lit8 v4, v2, -0x1

    :goto_3
    invoke-virtual {p1, v2}, Ll7/a;->d(I)Ll7/a$b;

    move-result-object v5

    aput-object v5, v0, v4

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    new-instance p1, Ll7/a;

    invoke-direct {p1, v0}, Ll7/a;-><init>([Ll7/a$b;)V

    return-object p1
.end method


# virtual methods
.method public b(JIIILy6/b0$a;)V
    .locals 0

    invoke-super/range {p0 .. p6}, Lv7/u0;->b(JIIILy6/b0$a;)V

    return-void
.end method

.method public i0(Lx6/m;)V
    .locals 0

    iput-object p1, p0, La8/p$d;->I:Lx6/m;

    invoke-virtual {p0}, Lv7/u0;->I()V

    return-void
.end method

.method public j0(La8/i;)V
    .locals 0

    iget p1, p1, La8/i;->k:I

    invoke-virtual {p0, p1}, Lv7/u0;->f0(I)V

    return-void
.end method

.method public w(Lt6/u1;)Lt6/u1;
    .locals 3

    iget-object v0, p0, La8/p$d;->I:Lx6/m;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lt6/u1;->z:Lx6/m;

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, La8/p$d;->H:Ljava/util/Map;

    iget-object v2, v0, Lx6/m;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/m;

    if-eqz v1, :cond_1

    move-object v0, v1

    :cond_1
    iget-object v1, p1, Lt6/u1;->u:Ll7/a;

    invoke-direct {p0, v1}, La8/p$d;->h0(Ll7/a;)Ll7/a;

    move-result-object v1

    iget-object v2, p1, Lt6/u1;->z:Lx6/m;

    if-ne v0, v2, :cond_2

    iget-object v2, p1, Lt6/u1;->u:Ll7/a;

    if-eq v1, v2, :cond_3

    :cond_2
    invoke-virtual {p1}, Lt6/u1;->c()Lt6/u1$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lt6/u1$b;->O(Lx6/m;)Lt6/u1$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lt6/u1$b;->Z(Ll7/a;)Lt6/u1$b;

    move-result-object p1

    invoke-virtual {p1}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p1

    :cond_3
    invoke-super {p0, p1}, Lv7/u0;->w(Lt6/u1;)Lt6/u1;

    move-result-object p1

    return-object p1
.end method
