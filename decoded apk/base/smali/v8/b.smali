.class public final Lv8/b;
.super Lt6/l;
.source "SourceFile"


# instance fields
.field private A:J

.field private B:Lv8/a;

.field private C:J

.field private final y:Lw6/g;

.field private final z:Lt8/e0;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lt6/l;-><init>(I)V

    new-instance v0, Lw6/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lw6/g;-><init>(I)V

    iput-object v0, p0, Lv8/b;->y:Lw6/g;

    new-instance v0, Lt8/e0;

    invoke-direct {v0}, Lt8/e0;-><init>()V

    iput-object v0, p0, Lv8/b;->z:Lt8/e0;

    return-void
.end method

.method private Y(Ljava/nio/ByteBuffer;)[F
    .locals 3

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lv8/b;->z:Lt8/e0;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lt8/e0;->S([BI)V

    iget-object v0, p0, Lv8/b;->z:Lt8/e0;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    add-int/lit8 p1, p1, 0x4

    invoke-virtual {v0, p1}, Lt8/e0;->U(I)V

    const/4 p1, 0x3

    new-array v0, p1, [F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    iget-object v2, p0, Lv8/b;->z:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->u()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private Z()V
    .locals 1

    iget-object v0, p0, Lv8/b;->B:Lv8/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lv8/a;->c()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected O()V
    .locals 0

    invoke-direct {p0}, Lv8/b;->Z()V

    return-void
.end method

.method protected Q(JZ)V
    .locals 0

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lv8/b;->C:J

    invoke-direct {p0}, Lv8/b;->Z()V

    return-void
.end method

.method protected U([Lt6/u1;JJ)V
    .locals 0

    iput-wide p4, p0, Lv8/b;->A:J

    return-void
.end method

.method public a(Lt6/u1;)I
    .locals 1

    const-string v0, "application/x-camera-motion"

    iget-object p1, p1, Lt6/u1;->w:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lt6/r3;->o(I)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e()Z
    .locals 1

    invoke-virtual {p0}, Lt6/l;->i()Z

    move-result v0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "CameraMotionRenderer"

    return-object v0
.end method

.method public p(ILjava/lang/Object;)V
    .locals 1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    check-cast p2, Lv8/a;

    iput-object p2, p0, Lv8/b;->B:Lv8/a;

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Lt6/l;->p(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public z(JJ)V
    .locals 4

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lt6/l;->i()Z

    move-result p3

    if-nez p3, :cond_4

    iget-wide p3, p0, Lv8/b;->C:J

    const-wide/32 v0, 0x186a0

    add-long/2addr v0, p1

    cmp-long p3, p3, v0

    if-gez p3, :cond_4

    iget-object p3, p0, Lv8/b;->y:Lw6/g;

    invoke-virtual {p3}, Lw6/g;->n()V

    invoke-virtual {p0}, Lt6/l;->J()Lt6/v1;

    move-result-object p3

    iget-object p4, p0, Lv8/b;->y:Lw6/g;

    const/4 v0, 0x0

    invoke-virtual {p0, p3, p4, v0}, Lt6/l;->V(Lt6/v1;Lw6/g;I)I

    move-result p3

    const/4 p4, -0x4

    if-ne p3, p4, :cond_4

    iget-object p3, p0, Lv8/b;->y:Lw6/g;

    invoke-virtual {p3}, Lw6/a;->s()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    iget-object p3, p0, Lv8/b;->y:Lw6/g;

    iget-wide v0, p3, Lw6/g;->e:J

    iput-wide v0, p0, Lv8/b;->C:J

    iget-object p4, p0, Lv8/b;->B:Lv8/a;

    if-eqz p4, :cond_0

    invoke-virtual {p3}, Lw6/a;->r()Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    iget-object p3, p0, Lv8/b;->y:Lw6/g;

    invoke-virtual {p3}, Lw6/g;->z()V

    iget-object p3, p0, Lv8/b;->y:Lw6/g;

    iget-object p3, p3, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-static {p3}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/nio/ByteBuffer;

    invoke-direct {p0, p3}, Lv8/b;->Y(Ljava/nio/ByteBuffer;)[F

    move-result-object p3

    if-nez p3, :cond_3

    goto :goto_0

    :cond_3
    iget-object p4, p0, Lv8/b;->B:Lv8/a;

    invoke-static {p4}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lv8/a;

    iget-wide v0, p0, Lv8/b;->C:J

    iget-wide v2, p0, Lv8/b;->A:J

    sub-long/2addr v0, v2

    invoke-interface {p4, v0, v1, p3}, Lv8/a;->b(J[F)V

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method
