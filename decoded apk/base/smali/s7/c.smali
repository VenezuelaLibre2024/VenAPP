.class public final Ls7/c;
.super Ll7/g;
.source "SourceFile"


# instance fields
.field private final a:Lt8/e0;

.field private final b:Lt8/d0;

.field private c:Lt8/n0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ll7/g;-><init>()V

    new-instance v0, Lt8/e0;

    invoke-direct {v0}, Lt8/e0;-><init>()V

    iput-object v0, p0, Ls7/c;->a:Lt8/e0;

    new-instance v0, Lt8/d0;

    invoke-direct {v0}, Lt8/d0;-><init>()V

    iput-object v0, p0, Ls7/c;->b:Lt8/d0;

    return-void
.end method


# virtual methods
.method protected b(Ll7/d;Ljava/nio/ByteBuffer;)Ll7/a;
    .locals 5

    iget-object v0, p0, Ls7/c;->c:Lt8/n0;

    if-eqz v0, :cond_0

    iget-wide v1, p1, Ll7/d;->t:J

    invoke-virtual {v0}, Lt8/n0;->e()J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Lt8/n0;

    iget-wide v1, p1, Lw6/g;->e:J

    invoke-direct {v0, v1, v2}, Lt8/n0;-><init>(J)V

    iput-object v0, p0, Ls7/c;->c:Lt8/n0;

    iget-wide v1, p1, Lw6/g;->e:J

    iget-wide v3, p1, Ll7/d;->t:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lt8/n0;->a(J)J

    :cond_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result p2

    iget-object v0, p0, Ls7/c;->a:Lt8/e0;

    invoke-virtual {v0, p1, p2}, Lt8/e0;->S([BI)V

    iget-object v0, p0, Ls7/c;->b:Lt8/d0;

    invoke-virtual {v0, p1, p2}, Lt8/d0;->o([BI)V

    iget-object p1, p0, Ls7/c;->b:Lt8/d0;

    const/16 p2, 0x27

    invoke-virtual {p1, p2}, Lt8/d0;->r(I)V

    iget-object p1, p0, Ls7/c;->b:Lt8/d0;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lt8/d0;->h(I)I

    move-result p1

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    iget-object v2, p0, Ls7/c;->b:Lt8/d0;

    invoke-virtual {v2, p1}, Lt8/d0;->h(I)I

    move-result p1

    int-to-long v2, p1

    or-long/2addr v0, v2

    iget-object p1, p0, Ls7/c;->b:Lt8/d0;

    const/16 v2, 0x14

    invoke-virtual {p1, v2}, Lt8/d0;->r(I)V

    iget-object p1, p0, Ls7/c;->b:Lt8/d0;

    const/16 v2, 0xc

    invoke-virtual {p1, v2}, Lt8/d0;->h(I)I

    move-result p1

    iget-object v2, p0, Ls7/c;->b:Lt8/d0;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lt8/d0;->h(I)I

    move-result v2

    iget-object v3, p0, Ls7/c;->a:Lt8/e0;

    const/16 v4, 0xe

    invoke-virtual {v3, v4}, Lt8/e0;->V(I)V

    if-eqz v2, :cond_6

    const/16 v3, 0xff

    if-eq v2, v3, :cond_5

    const/4 p1, 0x4

    if-eq v2, p1, :cond_4

    const/4 p1, 0x5

    if-eq v2, p1, :cond_3

    const/4 p1, 0x6

    if-eq v2, p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ls7/c;->a:Lt8/e0;

    iget-object v2, p0, Ls7/c;->c:Lt8/n0;

    invoke-static {p1, v0, v1, v2}, Ls7/g;->a(Lt8/e0;JLt8/n0;)Ls7/g;

    move-result-object p1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Ls7/c;->a:Lt8/e0;

    iget-object v2, p0, Ls7/c;->c:Lt8/n0;

    invoke-static {p1, v0, v1, v2}, Ls7/d;->a(Lt8/e0;JLt8/n0;)Ls7/d;

    move-result-object p1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Ls7/c;->a:Lt8/e0;

    invoke-static {p1}, Ls7/f;->a(Lt8/e0;)Ls7/f;

    move-result-object p1

    goto :goto_0

    :cond_5
    iget-object v2, p0, Ls7/c;->a:Lt8/e0;

    invoke-static {v2, p1, v0, v1}, Ls7/a;->a(Lt8/e0;IJ)Ls7/a;

    move-result-object p1

    goto :goto_0

    :cond_6
    new-instance p1, Ls7/e;

    invoke-direct {p1}, Ls7/e;-><init>()V

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_7

    new-instance p1, Ll7/a;

    new-array p2, v0, [Ll7/a$b;

    invoke-direct {p1, p2}, Ll7/a;-><init>([Ll7/a$b;)V

    goto :goto_1

    :cond_7
    new-instance v1, Ll7/a;

    new-array p2, p2, [Ll7/a$b;

    aput-object p1, p2, v0

    invoke-direct {v1, p2}, Ll7/a;-><init>([Ll7/a$b;)V

    move-object p1, v1

    :goto_1
    return-object p1
.end method
