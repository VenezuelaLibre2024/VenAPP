.class public final Lt6/d4$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/d4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field private static final u:Ljava/lang/String;

.field private static final v:Ljava/lang/String;

.field private static final w:Ljava/lang/String;

.field public static final x:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/d4$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:J

.field public e:J

.field public f:Z

.field private r:Lw7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$b;->s:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$b;->t:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$b;->u:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$b;->v:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$b;->w:Ljava/lang/String;

    new-instance v0, Lt6/e4;

    invoke-direct {v0}, Lt6/e4;-><init>()V

    sput-object v0, Lt6/d4$b;->x:Lt6/o$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lw7/c;->r:Lw7/c;

    iput-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lt6/d4$b;
    .locals 0

    invoke-static {p0}, Lt6/d4$b;->d(Landroid/os/Bundle;)Lt6/d4$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lt6/d4$b;)Lw7/c;
    .locals 0

    iget-object p0, p0, Lt6/d4$b;->r:Lw7/c;

    return-object p0
.end method

.method private static d(Landroid/os/Bundle;)Lt6/d4$b;
    .locals 12

    sget-object v0, Lt6/d4$b;->s:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    sget-object v0, Lt6/d4$b;->t:Ljava/lang/String;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {p0, v0, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    sget-object v0, Lt6/d4$b;->u:Ljava/lang/String;

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v0, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    sget-object v0, Lt6/d4$b;->v:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    sget-object v0, Lt6/d4$b;->w:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lw7/c;->x:Lt6/o$a;

    invoke-interface {v0, p0}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object p0

    check-cast p0, Lw7/c;

    goto :goto_0

    :cond_0
    sget-object p0, Lw7/c;->r:Lw7/c;

    :goto_0
    move-object v10, p0

    new-instance p0, Lt6/d4$b;

    invoke-direct {p0}, Lt6/d4$b;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-virtual/range {v2 .. v11}, Lt6/d4$b;->w(Ljava/lang/Object;Ljava/lang/Object;IJJLw7/c;Z)Lt6/d4$b;

    return-object p0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 5

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget v1, p0, Lt6/d4$b;->c:I

    if-eqz v1, :cond_0

    sget-object v2, Lt6/d4$b;->s:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    iget-wide v1, p0, Lt6/d4$b;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    sget-object v3, Lt6/d4$b;->t:Ljava/lang/String;

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_1
    iget-wide v1, p0, Lt6/d4$b;->e:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-eqz v3, :cond_2

    sget-object v3, Lt6/d4$b;->u:Ljava/lang/String;

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_2
    iget-boolean v1, p0, Lt6/d4$b;->f:Z

    if-eqz v1, :cond_3

    sget-object v2, Lt6/d4$b;->v:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-object v1, p0, Lt6/d4$b;->r:Lw7/c;

    sget-object v2, Lw7/c;->r:Lw7/c;

    invoke-virtual {v1, v2}, Lw7/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lt6/d4$b;->w:Ljava/lang/String;

    iget-object v2, p0, Lt6/d4$b;->r:Lw7/c;

    invoke-virtual {v2}, Lw7/c;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_4
    return-object v0
.end method

.method public e(I)I
    .locals 1

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    invoke-virtual {v0, p1}, Lw7/c;->d(I)Lw7/c$a;

    move-result-object p1

    iget p1, p1, Lw7/c$a;->b:I

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lt6/d4$b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lt6/d4$b;

    iget-object v2, p0, Lt6/d4$b;->a:Ljava/lang/Object;

    iget-object v3, p1, Lt6/d4$b;->a:Ljava/lang/Object;

    invoke-static {v2, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt6/d4$b;->b:Ljava/lang/Object;

    iget-object v3, p1, Lt6/d4$b;->b:Ljava/lang/Object;

    invoke-static {v2, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lt6/d4$b;->c:I

    iget v3, p1, Lt6/d4$b;->c:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lt6/d4$b;->d:J

    iget-wide v4, p1, Lt6/d4$b;->d:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lt6/d4$b;->e:J

    iget-wide v4, p1, Lt6/d4$b;->e:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lt6/d4$b;->f:Z

    iget-boolean v3, p1, Lt6/d4$b;->f:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lt6/d4$b;->r:Lw7/c;

    iget-object p1, p1, Lt6/d4$b;->r:Lw7/c;

    invoke-static {v2, p1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public f(II)J
    .locals 2

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    invoke-virtual {v0, p1}, Lw7/c;->d(I)Lw7/c$a;

    move-result-object p1

    iget v0, p1, Lw7/c$a;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object p1, p1, Lw7/c$a;->f:[J

    aget-wide v0, p1, p2

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    iget v0, v0, Lw7/c;->b:I

    return v0
.end method

.method public h(J)I
    .locals 3

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    iget-wide v1, p0, Lt6/d4$b;->d:J

    invoke-virtual {v0, p1, p2, v1, v2}, Lw7/c;->e(JJ)I

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lt6/d4$b;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0xd9

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lt6/d4$b;->b:Ljava/lang/Object;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget v0, p0, Lt6/d4$b;->c:I

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-wide v0, p0, Lt6/d4$b;->d:J

    const/16 v3, 0x20

    ushr-long v4, v0, v3

    xor-long/2addr v0, v4

    long-to-int v0, v0

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-wide v0, p0, Lt6/d4$b;->e:J

    ushr-long v3, v0, v3

    xor-long/2addr v0, v3

    long-to-int v0, v0

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-boolean v0, p0, Lt6/d4$b;->f:Z

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    invoke-virtual {v0}, Lw7/c;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    return v2
.end method

.method public i(J)I
    .locals 3

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    iget-wide v1, p0, Lt6/d4$b;->d:J

    invoke-virtual {v0, p1, p2, v1, v2}, Lw7/c;->f(JJ)I

    move-result p1

    return p1
.end method

.method public j(I)J
    .locals 2

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    invoke-virtual {v0, p1}, Lw7/c;->d(I)Lw7/c$a;

    move-result-object p1

    iget-wide v0, p1, Lw7/c$a;->a:J

    return-wide v0
.end method

.method public k()J
    .locals 2

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    iget-wide v0, v0, Lw7/c;->c:J

    return-wide v0
.end method

.method public l(II)I
    .locals 2

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    invoke-virtual {v0, p1}, Lw7/c;->d(I)Lw7/c$a;

    move-result-object p1

    iget v0, p1, Lw7/c$a;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object p1, p1, Lw7/c$a;->e:[I

    aget p1, p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public m(I)J
    .locals 2

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    invoke-virtual {v0, p1}, Lw7/c;->d(I)Lw7/c$a;

    move-result-object p1

    iget-wide v0, p1, Lw7/c$a;->r:J

    return-wide v0
.end method

.method public n()J
    .locals 2

    iget-wide v0, p0, Lt6/d4$b;->d:J

    return-wide v0
.end method

.method public o(I)I
    .locals 1

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    invoke-virtual {v0, p1}, Lw7/c;->d(I)Lw7/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lw7/c$a;->f()I

    move-result p1

    return p1
.end method

.method public p(II)I
    .locals 1

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    invoke-virtual {v0, p1}, Lw7/c;->d(I)Lw7/c$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lw7/c$a;->g(I)I

    move-result p1

    return p1
.end method

.method public q()J
    .locals 2

    iget-wide v0, p0, Lt6/d4$b;->e:J

    invoke-static {v0, v1}, Lt8/r0;->a1(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public r()J
    .locals 2

    iget-wide v0, p0, Lt6/d4$b;->e:J

    return-wide v0
.end method

.method public s()I
    .locals 1

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    iget v0, v0, Lw7/c;->e:I

    return v0
.end method

.method public t(I)Z
    .locals 1

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    invoke-virtual {v0, p1}, Lw7/c;->d(I)Lw7/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lw7/c$a;->h()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public u(I)Z
    .locals 1

    iget-object v0, p0, Lt6/d4$b;->r:Lw7/c;

    invoke-virtual {v0, p1}, Lw7/c;->d(I)Lw7/c$a;

    move-result-object p1

    iget-boolean p1, p1, Lw7/c$a;->s:Z

    return p1
.end method

.method public v(Ljava/lang/Object;Ljava/lang/Object;IJJ)Lt6/d4$b;
    .locals 10

    sget-object v8, Lw7/c;->r:Lw7/c;

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    move-wide/from16 v6, p6

    invoke-virtual/range {v0 .. v9}, Lt6/d4$b;->w(Ljava/lang/Object;Ljava/lang/Object;IJJLw7/c;Z)Lt6/d4$b;

    move-result-object v0

    return-object v0
.end method

.method public w(Ljava/lang/Object;Ljava/lang/Object;IJJLw7/c;Z)Lt6/d4$b;
    .locals 0

    iput-object p1, p0, Lt6/d4$b;->a:Ljava/lang/Object;

    iput-object p2, p0, Lt6/d4$b;->b:Ljava/lang/Object;

    iput p3, p0, Lt6/d4$b;->c:I

    iput-wide p4, p0, Lt6/d4$b;->d:J

    iput-wide p6, p0, Lt6/d4$b;->e:J

    iput-object p8, p0, Lt6/d4$b;->r:Lw7/c;

    iput-boolean p9, p0, Lt6/d4$b;->f:Z

    return-object p0
.end method
