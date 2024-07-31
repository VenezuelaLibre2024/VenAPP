.class public final Ln7/b;
.super Ll7/g;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll7/g;-><init>()V

    return-void
.end method


# virtual methods
.method protected b(Ll7/d;Ljava/nio/ByteBuffer;)Ll7/a;
    .locals 3

    new-instance p1, Ll7/a;

    const/4 v0, 0x1

    new-array v0, v0, [Ll7/a$b;

    new-instance v1, Lt8/e0;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result p2

    invoke-direct {v1, v2, p2}, Lt8/e0;-><init>([BI)V

    invoke-virtual {p0, v1}, Ln7/b;->c(Lt8/e0;)Ln7/a;

    move-result-object p2

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-direct {p1, v0}, Ll7/a;-><init>([Ll7/a$b;)V

    return-object p1
.end method

.method public c(Lt8/e0;)Ln7/a;
    .locals 9

    invoke-virtual {p1}, Lt8/e0;->B()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, Lt8/e0;->B()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1}, Lt8/e0;->A()J

    move-result-wide v4

    invoke-virtual {p1}, Lt8/e0;->A()J

    move-result-wide v6

    invoke-virtual {p1}, Lt8/e0;->e()[B

    move-result-object v0

    invoke-virtual {p1}, Lt8/e0;->f()I

    move-result v1

    invoke-virtual {p1}, Lt8/e0;->g()I

    move-result p1

    invoke-static {v0, v1, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v8

    new-instance p1, Ln7/a;

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Ln7/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    return-object p1
.end method
