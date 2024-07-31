.class public Lz7/j$b;
.super Lz7/j;
.source "SourceFile"

# interfaces
.implements Ly7/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz7/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field final i:Lz7/k$a;


# direct methods
.method public constructor <init>(JLt6/u1;Ljava/util/List;Lz7/k$a;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lt6/u1;",
            "Ljava/util/List<",
            "Lz7/b;",
            ">;",
            "Lz7/k$a;",
            "Ljava/util/List<",
            "Lz7/e;",
            ">;",
            "Ljava/util/List<",
            "Lz7/e;",
            ">;",
            "Ljava/util/List<",
            "Lz7/e;",
            ">;)V"
        }
    .end annotation

    const/4 v9, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lz7/j;-><init>(JLt6/u1;Ljava/util/List;Lz7/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lz7/j$a;)V

    move-object v1, p5

    iput-object v1, v0, Lz7/j$b;->i:Lz7/k$a;

    return-void
.end method


# virtual methods
.method public a(JJ)J
    .locals 1

    iget-object v0, p0, Lz7/j$b;->i:Lz7/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lz7/k$a;->h(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(JJ)J
    .locals 1

    iget-object v0, p0, Lz7/j$b;->i:Lz7/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lz7/k$a;->d(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public c(J)J
    .locals 1

    iget-object v0, p0, Lz7/j$b;->i:Lz7/k$a;

    invoke-virtual {v0, p1, p2}, Lz7/k$a;->j(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(JJ)J
    .locals 1

    iget-object v0, p0, Lz7/j$b;->i:Lz7/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lz7/k$a;->f(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public e(J)Lz7/i;
    .locals 1

    iget-object v0, p0, Lz7/j$b;->i:Lz7/k$a;

    invoke-virtual {v0, p0, p1, p2}, Lz7/k$a;->k(Lz7/j;J)Lz7/i;

    move-result-object p1

    return-object p1
.end method

.method public f(JJ)J
    .locals 1

    iget-object v0, p0, Lz7/j$b;->i:Lz7/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lz7/k$a;->i(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public g(J)J
    .locals 1

    iget-object v0, p0, Lz7/j$b;->i:Lz7/k$a;

    invoke-virtual {v0, p1, p2}, Lz7/k$a;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lz7/j$b;->i:Lz7/k$a;

    invoke-virtual {v0}, Lz7/k$a;->l()Z

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    iget-object v0, p0, Lz7/j$b;->i:Lz7/k$a;

    invoke-virtual {v0}, Lz7/k$a;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public j(JJ)J
    .locals 1

    iget-object v0, p0, Lz7/j$b;->i:Lz7/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lz7/k$a;->c(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public k()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public l()Ly7/f;
    .locals 0

    return-object p0
.end method

.method public m()Lz7/i;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
